DROP TABLE IF EXISTS chat_messages;
DROP TABLE IF EXISTS chats;
DROP TABLE IF EXISTS page_progresses;
DROP TABLE IF EXISTS quest_progresses;
DROP TABLE IF EXISTS course_progresses;
DROP TABLE IF EXISTS answers;
DROP TABLE IF EXISTS questions;
DROP SEQUENCE IF EXISTS question_seq;
DROP TABLE IF EXISTS pages;
DROP SEQUENCE IF EXISTS page_seq;
DROP TABLE IF EXISTS quests;
DROP SEQUENCE IF EXISTS quest_seq;
DROP TABLE IF EXISTS course_positions;
DROP TABLE IF EXISTS courses;
DROP TABLE IF EXISTS photos;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS profiles;
DROP TABLE IF EXISTS work_schedules;
DROP TABLE IF EXISTS positions;
DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE global_seq START WITH 100000;

CREATE TABLE positions
(
    id        INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    name      VARCHAR NOT NULL
);

CREATE TABLE work_schedules
(
    id INTEGER PRIMARY KEY DEFAULT nextval('global_seq')
);

CREATE TABLE profiles
(
    id               INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    name             VARCHAR                     NOT NULL,
    entry_date       DATE    DEFAULT date(now()) NOT NULL,
    email            VARCHAR                     NOT NULL,
    work_schedule_id INTEGER,
    position_id      INTEGER                     NOT NULL,
    FOREIGN KEY (work_schedule_id) REFERENCES work_schedules (id) ON DELETE SET NULL,
    FOREIGN KEY (position_id)      REFERENCES positions      (id) ON DELETE CASCADE,
    CONSTRAINT profiles_unique_email_idx UNIQUE (email)
);

CREATE TABLE users
(
    id                 INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    name               VARCHAR                 NOT NULL,
    link               TEXT                    NOT NULL,
    registered         TIMESTAMP DEFAULT now() NOT NULL,
    profile_id         INTEGER                 NOT NULL,
    CONSTRAINT users_unique_profile_idx UNIQUE (profile_id),
    CONSTRAINT users_unique_link_idx    UNIQUE (link)
);

CREATE TABLE photos
(
    id         INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    profile_id INTEGER NOT NULL,
    title      TEXT,
    value      TEXT    NOT NULL,
    FOREIGN KEY (profile_id) REFERENCES profiles (id) ON DELETE CASCADE,
    CONSTRAINT photos_unique_profile_idx UNIQUE (profile_id)
);

CREATE TABLE courses
(
    id          INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    name        VARCHAR NOT NULL,
    description TEXT    NOT NULL
);

CREATE TABLE course_positions
(
    course_id   INTEGER NOT NULL,
    position_id INTEGER NOT NULL,
    FOREIGN KEY (course_id)   REFERENCES courses   (id) ON DELETE CASCADE,
    FOREIGN KEY (position_id) REFERENCES positions (id) ON DELETE CASCADE,
    CONSTRAINT course_positions_unique_position_idx UNIQUE (position_id)
);

CREATE SEQUENCE quest_seq START WITH 1;
CREATE TABLE quests
(
    id          INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    course_id   INTEGER NOT NULL,
    name        VARCHAR NOT NULL,
    description TEXT    NOT NULL,
    "order"     INTEGER NOT NULL DEFAULT nextval('quest_seq'),
    FOREIGN KEY (course_id) REFERENCES courses (id) ON DELETE CASCADE
);

CREATE SEQUENCE page_seq START WITH 1;
CREATE TABLE pages
(
    id       INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    quest_id INTEGER NOT NULL,
    title    VARCHAR NOT NULL,
    text     TEXT    NOT NULL,
    "order"  INTEGER NOT NULL DEFAULT nextval('page_seq'),
    FOREIGN KEY (quest_id) REFERENCES quests (id) ON DELETE CASCADE
);

CREATE SEQUENCE question_seq START WITH 1;
CREATE TABLE questions
(
    id       INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    quest_id INTEGER NOT NULL,
    text     TEXT    NOT NULL,
    "order"  INTEGER NOT NULL DEFAULT nextval('question_seq'),
    FOREIGN KEY (quest_id) REFERENCES quests (id) ON DELETE CASCADE
);

CREATE TABLE answers
(
    id          INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    question_id INTEGER            NOT NULL,
    text        TEXT               NOT NULL,
    correct     BOOL DEFAULT FALSE NOT NULL,
    FOREIGN KEY (question_id) REFERENCES questions (id)
);

CREATE TABLE course_progresses
(
    id               INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    user_id          INTEGER            NOT NULL,
    course_id        INTEGER            NOT NULL,
    current_quest_id INTEGER,
    value            SMALLINT DEFAULT 0 NOT NULL CHECK ( value >= 0 AND value <= 100 ),
    FOREIGN KEY (user_id)          REFERENCES users   (id) ON DELETE CASCADE,
    FOREIGN KEY (course_id)        REFERENCES courses (id) ON DELETE CASCADE,
    FOREIGN KEY (current_quest_id)    REFERENCES quests  (id) ON DELETE SET NULL,
    CONSTRAINT course_progresses_unique_user_idx UNIQUE (user_id)
);

CREATE TABLE quest_progresses
(
    id                  INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    course_progress_id  INTEGER            NOT NULL,
    quest_id            INTEGER            NOT NULL,
    finished            BOOL DEFAULT FALSE NOT NULL,
    FOREIGN KEY (quest_id)           REFERENCES quests            (id) ON DELETE CASCADE,
    FOREIGN KEY (course_progress_id) REFERENCES course_progresses (id) ON DELETE CASCADE,
    CONSTRAINT quest_progresses_unique_idx UNIQUE (course_progress_id, quest_id)
);

CREATE TABLE page_progresses
(
    id                  INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    quest_progress_id   INTEGER            NOT NULL,
    page_id             INTEGER            NOT NULL,
    finished            BOOL DEFAULT FALSE NOT NULL,
    FOREIGN KEY (page_id)            REFERENCES pages             (id) ON DELETE CASCADE,
    FOREIGN KEY (quest_progress_id)  REFERENCES quest_progresses  (id) ON DELETE CASCADE,
    CONSTRAINT page_progresses_unique_idx UNIQUE (quest_progress_id, page_id)
);

CREATE TABLE chats
(
    id      INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    user_id INTEGER NOT NULL,
    FOREIGN KEY (user_id)  REFERENCES users (id) ON DELETE CASCADE,
    CONSTRAINT chats_unique_user_idx UNIQUE (user_id)
);

CREATE TABLE chat_messages
(
    id           INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    receiver_id  INTEGER                 NOT NULL,
    message      TEXT                    NOT NULL,
    date_time    TIMESTAMP DEFAULT now() NOT NULL,
    FOREIGN KEY (receiver_id) REFERENCES chats (id) ON DELETE CASCADE,
    CONSTRAINT chat_messages_unique_idx UNIQUE (receiver_id, date_time)
);



