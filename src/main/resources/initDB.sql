DROP TABLE IF EXISTS answers;
DROP TABLE IF EXISTS questions;
DROP TABLE IF EXISTS dialogs;
DROP TABLE IF EXISTS page_elements;
DROP TABLE IF EXISTS quest_progresses;
DROP TABLE IF EXISTS course_progresses;
DROP TABLE IF EXISTS pages;
DROP TABLE IF EXISTS course_quests;
DROP TABLE IF EXISTS user_positions;
DROP TABLE IF EXISTS photos;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS profiles;
DROP TABLE IF EXISTS positions;
DROP TABLE IF EXISTS courses;
DROP TABLE IF EXISTS quests;
DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE global_seq START WITH 100000;

CREATE TABLE courses
(
    id          INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    name        VARCHAR NOT NULL,
    description TEXT    NOT NULL
);

CREATE TABLE positions
(
    id        INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    name      VARCHAR NOT NULL,
    course_id INTEGER NOT NULL,
    FOREIGN KEY (course_id) REFERENCES courses (id) ON DELETE CASCADE
);

CREATE TABLE users
(
    id          INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    name        VARCHAR                 NOT NULL,
    email       VARCHAR                 NOT NULL,
    link        TEXT                    NOT NULL,
    registered  TIMESTAMP DEFAULT now() NOT NULL,
    CONSTRAINT users_unique_email_idx UNIQUE (email),
    CONSTRAINT users_unique_link_idx UNIQUE (link)
);

CREATE TABLE photos
(
    id      INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    title   TEXT,
    value   BYTEA NOT NULL,
    FOREIGN KEY (id) REFERENCES users (id) ON DELETE CASCADE
);

CREATE TABLE user_positions
(
    user_id     INTEGER NOT NULL,
    position_id INTEGER NOT NULL,
    FOREIGN KEY (user_id)     REFERENCES users (id),
    FOREIGN KEY (position_id) REFERENCES positions  (id),
    CONSTRAINT user_positions_unique_idx UNIQUE (user_id, position_id)
);

CREATE TABLE quests
(
    id          INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    name        VARCHAR NOT NULL,
    description TEXT    NOT NULL
);

CREATE TABLE pages
(
    id       INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    quest_id INTEGER NOT NULL,
    name     VARCHAR NOT NULL,
    "order"  INTEGER DEFAULT 0 NOT NULL,
    FOREIGN KEY (quest_id) REFERENCES quests (id) ON DELETE CASCADE
);

CREATE TABLE page_elements
(
    id      INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    page_id INTEGER NOT NULL,
    text    TEXT    NOT NULL,
    FOREIGN KEY (page_id) REFERENCES pages (id) ON DELETE CASCADE
);

CREATE TABLE dialogs
(
    id              INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    with_action     BOOL    DEFAULT FALSE NOT NULL,
    "order"         INTEGER DEFAULT 0     NOT NULL,
    FOREIGN KEY (id) REFERENCES page_elements (id) ON DELETE CASCADE
);

CREATE TABLE questions
(
    id              INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    FOREIGN KEY (id) REFERENCES page_elements (id) ON DELETE CASCADE
);

CREATE TABLE answers
(
    id          INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    question_id INTEGER            NOT NULL,
    text        TEXT               NOT NULL,
    correct     BOOL DEFAULT FALSE NOT NULL,
    FOREIGN KEY (question_id) REFERENCES questions (id)
);

CREATE TABLE course_quests
(
    course_id INTEGER           NOT NULL,
    quest_id  INTEGER           NOT NULL,
    "order"   INTEGER DEFAULT 0 NOT NULL,
    FOREIGN KEY (course_id) REFERENCES courses (id),
    FOREIGN KEY (quest_id)  REFERENCES quests  (id),
    CONSTRAINT course_quests_unique_idx UNIQUE (course_id, quest_id)
);

CREATE TABLE course_progresses
(
    id               INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    user_id          INTEGER            NOT NULL,
    course_id        INTEGER            NOT NULL,
    current_quest_id INTEGER,
    value            SMALLINT DEFAULT 0 NOT NULL CHECK ( value >= 0 AND value <= 100 ),
    FOREIGN KEY (course_id)        REFERENCES courses (id) ON DELETE CASCADE,
    FOREIGN KEY (course_id)        REFERENCES courses (id) ON DELETE CASCADE,
    FOREIGN KEY (current_quest_id) REFERENCES quests  (id) ON DELETE SET NULL,
    CONSTRAINT progresses_unique_idx UNIQUE (user_id, course_id)
);

CREATE TABLE quest_progresses
(
    id              INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    course_progress_id     INTEGER         NOT NULL,
    quest_id        INTEGER         NOT NULL,
    current_page_id INTEGER,
    value           SMALLINT DEFAULT 0 NOT NULL CHECK ( value >= 0 AND value <= 100 ),
    FOREIGN KEY (course_progress_id)     REFERENCES course_progresses (id) ON DELETE CASCADE,
    FOREIGN KEY (quest_id)        REFERENCES quests     (id) ON DELETE CASCADE,
    FOREIGN KEY (current_page_id) REFERENCES pages      (id) ON DELETE SET NULL,
    CONSTRAINT quest_progresses_unique_idx UNIQUE (course_progress_id, quest_id)
);


