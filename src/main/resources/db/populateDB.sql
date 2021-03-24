--DELETE FROM chat_messages;
--DELETE FROM chats;
DELETE FROM page_progresses;
DELETE FROM quest_progresses;
DELETE FROM course_progresses;
DELETE FROM answers;
DELETE FROM questions;
DELETE FROM pages;
DELETE FROM quests;
DELETE FROM course_positions;
DELETE FROM courses;
DELETE FROM photos;
DELETE FROM users;
DELETE FROM profiles;
DELETE FROM work_schedules;
DELETE FROM positions;
ALTER SEQUENCE global_seq RESTART WITH 100000;

/********************
Positions
*********************/

/*id=100000*/
INSERT INTO positions (name) VALUES ('FrontEnd Developer');
/*id=100001*/
INSERT INTO positions (name) VALUES ('BackEnd Developer');
/*id=100002*/
INSERT INTO positions (name) VALUES ('Economist');

/********************
/Positions
*********************/

/********************
Profiles
*********************/

/*id=100003*/
INSERT INTO profiles (name, email, position_id)
    VALUES ('Глущенко&Артем', 'artem@gmail.com', 100001);
/*id=100004*/
INSERT INTO profiles (name, email, position_id)
    VALUES ('Кублицкий&Витовт', 'vitovt@gmail.com', 100000);
/*id=100005*/
INSERT INTO profiles (name, email, position_id)
    VALUES ('Когогин&Виталий', 'vitaliy@gmail.com', 100001);
/*id=100006*/
INSERT INTO profiles (name, email, position_id)
    VALUES ('Корнилова&Анастасия', 'anastasiya@gmail.com', 100002);

/********************
/Profiles
*********************/

/********************
Photos
*********************/
/*
INSERT INTO photos (profile_id, title, value) VALUES ();
*/
/********************
/Photos
*********************/

/********************
Users
*********************/

/*id=100007*/
INSERT INTO users (name, link, profile_id)
    VALUES ('artem', '/100007', 100003);
/*id=100008*/
INSERT INTO users (name, link, profile_id)
    VALUES ('vitovt', '/100008', 100004);
/*id=100009*/
INSERT INTO users (name, link, profile_id)
    VALUES ('vitaliy', '/100009', 100005);
/*id=100010*/
INSERT INTO users (name, link, profile_id)
    VALUES ('anastasiya', '/100010', 100006);
/*
/********************
/Users
*********************/

/********************
Courses
*********************/

INSERT INTO courses (name, description) VALUES ();

/********************
/Courses
*********************/

/********************
CoursePositions
*********************/

INSERT INTO course_positions (course_id, position_id) VALUES ();

/********************
/CoursePositions
*********************/

/********************
Quests
*********************/

INSERT INTO quests (course_id, name, description, "order") VALUES ();

/********************
/Quests
*********************/

/********************
Questions
*********************/

INSERT INTO questions (quest_id, "order") VALUES ();

/********************
/Questions
*********************/

/********************
Answers
*********************/

INSERT INTO answers (question_id, text, correct) VALUES ();

/********************
/Answers
*********************/

/********************
Pages
*********************/

INSERT INTO pages (quest_id, title, text, "order") VALUES ();

/********************
/Pages
*********************/

/********************
CourseProgresses
*********************/

INSERT INTO course_progresses (user_id, course_id, current_quest_id, value) VALUES ();

/********************
/CourseProgresses
*********************/

/********************
QuestProgresses
*********************/

INSERT INTO quest_progresses (course_progress_id, quest_id, finished, enabled) VALUES ();

/********************
/QuestProgresses
*********************/

/********************
QuestProgresses
*********************/

INSERT INTO page_progresses (quest_progress_id, page_id, finished, enabled) VALUES ();

/********************
/QuestProgresses
*********************/
*/



