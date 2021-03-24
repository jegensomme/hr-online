--DELETE FROM chat_messages;
--DELETE FROM chats;
DELETE FROM page_progresses;
DELETE FROM quest_progresses;
DELETE FROM course_progresses;
DELETE FROM answers;
DELETE FROM questions;
ALTER SEQUENCE question_seq RESTART WITH 1;
DELETE FROM pages;
ALTER SEQUENCE page_seq RESTART WITH 1;
DELETE FROM quests;
ALTER SEQUENCE quest_seq RESTART WITH 1;
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
INSERT INTO positions (name) VALUES ('Директор');
/*id=100001*/
INSERT INTO positions (name) VALUES ('Главный бухгалтер');
/*id=100002*/
INSERT INTO positions (name) VALUES ('Главный конструктор');
/*id=100003*/
INSERT INTO positions (name) VALUES ('Главный механик');

/********************
/Positions
*********************/

/********************
Profiles
*********************/

/*id=100004*/
INSERT INTO profiles (name, email, position_id)
    VALUES ('Глущенко&Артем', 'artem@gmail.com', 100000);
/*id=100005*/
INSERT INTO profiles (name, email, position_id)
    VALUES ('Корнилова&Анастасия', 'anastasiya@gmail.com', 100001);
/*id=100006*/
INSERT INTO profiles (name, email, position_id)
    VALUES ('Кублицкий&Витовт', 'vitovt@gmail.com', 100002);
/*id=100007*/
INSERT INTO profiles (name, email, position_id)
    VALUES ('Когогин&Виталий', 'vitaliy@gmail.com', 100003);

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

/*id=100008*/
INSERT INTO users (name, link, profile_id)
    VALUES ('artem', '/100007', 100004);
/*id=100009*/
INSERT INTO users (name, link, profile_id)
    VALUES ('anastasiya', '/100010', 100005);
/*id=100010*/
INSERT INTO users (name, link, profile_id)
    VALUES ('vitovt', '/100008', 100006);
/*id=100011*/
INSERT INTO users (name, link, profile_id)
    VALUES ('vitaliy', '/100009', 100007);

/********************
/Users
*********************/

/********************
Courses
*********************/

/*id=100012*/
INSERT INTO courses (name, description) VALUES ('Вводный курс', '');

/********************
/Courses
*********************/

/********************
CoursePositions
*********************/

INSERT INTO course_positions (course_id, position_id) VALUES (100012, 100000);
INSERT INTO course_positions (course_id, position_id) VALUES (100012, 100001);
INSERT INTO course_positions (course_id, position_id) VALUES (100012, 100002);
INSERT INTO course_positions (course_id, position_id) VALUES (100012, 100003);

/********************
/CoursePositions
*********************/

/********************
Quests
*********************/

/*id=100013*/
INSERT INTO quests (course_id, name, description)
    VALUES (100012, 'История компании', '');
/*id=100014*/
INSERT INTO quests (course_id, name, description)
    VALUES (100012, '«Росатом» сегодня', '');
/*id=100015*/
INSERT INTO quests (course_id, name, description)
    VALUES (100012, 'Деятельность компании', '');
/*id=100016*/
INSERT INTO quests (course_id, name, description)
    VALUES (100012, 'Миссия и ценности компании', '');
/*id=100017*/
INSERT INTO quests (course_id, name, description)
    VALUES (100012, 'Корпоративная жизнь', '');
/*id=100018*/
INSERT INTO quests (course_id, name, description)
    VALUES (100012, 'Правила внутреннего распорядка', '');

/********************
/Quests
*********************/

/********************
Questions
*********************/

/*id=100019*/
INSERT INTO questions (quest_id, text)
    VALUES (100013, 'Вопрос об истории компании');
/*id=100020*/
INSERT INTO questions (quest_id, text)
    VALUES (100014, 'Вопрос о компании ');
/*id=100021*/
INSERT INTO questions (quest_id, text)
    VALUES (100015, 'Вопрос о деятельности компании');
/*id=100022*/
INSERT INTO questions (quest_id, text)
    VALUES (100016, 'Вопрос о миссии и ценностях компании');
/*id=100023*/
INSERT INTO questions (quest_id, text)
    VALUES (100017, 'Вопрос о корпоративной жизни');
/*id=100024*/
INSERT INTO questions (quest_id, text)
    VALUES (100018, 'Вопрос о правилах внутреннего распорядка');

/********************
/Questions
*********************/

/********************
Answers
*********************/

/*id=100025*/
INSERT INTO answers (question_id, text, correct)
    VALUES (100019, 'Не правильный ответ', false);
/*id=100026*/
INSERT INTO answers (question_id, text, correct)
    VALUES (100019, 'Правильный ответ', true);

/*id=100027*/
INSERT INTO answers (question_id, text, correct)
    VALUES (100020, 'Не правильный ответ', false);
/*id=100028*/
INSERT INTO answers (question_id, text, correct)
    VALUES (100020, 'Правильный ответ', true);

/*id=100029*/
INSERT INTO answers (question_id, text, correct)
    VALUES (100021, 'Не правильный ответ', false);
/*id=100030*/
INSERT INTO answers (question_id, text, correct)
    VALUES (100021, 'Правильный ответ', true);

/*id=100031*/
INSERT INTO answers (question_id, text, correct)
    VALUES (100022, 'Не правильный ответ', false);
/*id=100032*/
INSERT INTO answers (question_id, text, correct)
    VALUES (100022, 'Правильный ответ', true);

/*id=100033*/
INSERT INTO answers (question_id, text, correct)
    VALUES (100023, 'Не правильный ответ', false);
/*id=100034*/
INSERT INTO answers (question_id, text, correct)
    VALUES (100023, 'Правильный ответ', true);

/*id=100035*/
INSERT INTO answers (question_id, text, correct)
    VALUES (100024, 'Не правильный ответ', false);
/*id=100036*/
INSERT INTO answers (question_id, text, correct)
    VALUES (100024, 'Правильный ответ', true);

/********************
/Answers
*********************/

/********************
Pages
*********************/

/*id=100037*/
INSERT INTO pages (quest_id, title, text)
    VALUES (100013, 'История компании часть 1', '');
/*id=100038*/
INSERT INTO pages (quest_id, title, text)
    VALUES (100013, 'История компании часть 2', '');

/*id=100039*/
INSERT INTO pages (quest_id, title, text)
    VALUES (100014, '«Росатом» сегодня часть 1', '');
/*id=100040*/
INSERT INTO pages (quest_id, title, text)
    VALUES (100014, '«Росатом» сегодня часть 2', '');

/*id=100041*/
INSERT INTO pages (quest_id, title, text)
    VALUES (100015, 'Деятельность компании часть 1', '');
/*id=100042*/
INSERT INTO pages (quest_id, title, text)
    VALUES (100015, 'Деятельность компании часть 2', '');

/*id=100043*/
INSERT INTO pages (quest_id, title, text)
    VALUES (100016, 'Миссия и ценности компании часть 1', '');
/*id=100044*/
INSERT INTO pages (quest_id, title, text)
    VALUES (100016, 'Миссия и ценности компании часть 2', '');

/*id=100045*/
INSERT INTO pages (quest_id, title, text)
    VALUES (100017, 'Корпоративная жизнь часть 1', '');
/*id=100046*/
INSERT INTO pages (quest_id, title, text)
    VALUES (100017, 'Корпоративная жизнь часть 2', '');

/*id=100047*/
INSERT INTO pages (quest_id, title, text)
    VALUES (100018, 'Правила внутреннего распорядка часть 1', '');
/*id=100048*/
INSERT INTO pages (quest_id, title, text)
    VALUES (100018, 'Правила внутреннего распорядка часть 2', '');

/********************
/Pages
*********************/

/********************
CourseProgresses
*********************/

/*id=100049*/
INSERT INTO course_progresses (user_id, course_id, current_quest_id)
    VALUES (100008, 100012, 100013);
/*id=100050*/
INSERT INTO course_progresses (user_id, course_id, current_quest_id)
    VALUES (100009, 100012, 100013);
/*id=100051*/
INSERT INTO course_progresses (user_id, course_id, current_quest_id)
    VALUES (100010, 100012, 100013);
/*id=100052*/
INSERT INTO course_progresses (user_id, course_id, current_quest_id)
    VALUES (100011, 100012, 100013);

/********************
/CourseProgresses
*********************/

/********************
QuestProgresses
*********************/

/*id=100053*/
INSERT INTO quest_progresses (course_progress_id, quest_id)
    VALUES (100049, 100013);
/*id=100054*/
INSERT INTO quest_progresses (course_progress_id, quest_id)
    VALUES (100050, 100013);
/*id=100055*/
INSERT INTO quest_progresses (course_progress_id, quest_id)
    VALUES (100051, 100013);
/*id=100056*/
INSERT INTO quest_progresses (course_progress_id, quest_id)
    VALUES (100052, 100013);

/********************
/QuestProgresses
*********************/

/********************
PageProgresses
*********************/

INSERT INTO page_progresses (quest_progress_id, page_id)
    VALUES (100053, 100037);

INSERT INTO page_progresses (quest_progress_id, page_id)
    VALUES (100054, 100037);

INSERT INTO page_progresses (quest_progress_id, page_id)
    VALUES (100055, 100037);

INSERT INTO page_progresses (quest_progress_id, page_id)
    VALUES (100056, 100037);

/********************
/PageProgresses
*********************/




