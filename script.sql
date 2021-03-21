create table casein.post
(
    id   serial not null
        constraint post_pk
            primary key,
    name text   not null
);

alter table casein.post
    owner to postgres;

create table casein.employment
(
    id   serial not null
        constraint employment_pk
            primary key,
    name text   not null
);

alter table casein.employment
    owner to postgres;

create table casein.profile
(
    id         serial not null
        constraint profile_pk
            primary key,
    surname    text   not null,
    name       text   not null,
    patronymic text,
    entry_date date,
    post       integer
        constraint profile_post_fk
            references casein.post,
    email      text,
    employment integer
        constraint profile_employment_fk
            references casein.employment
);

alter table casein.profile
    owner to postgres;

create table casein.track
(
    id serial not null
        constraint track_pk
            primary key
);

alter table casein.track
    owner to postgres;

create table casein."user"
(
    id       integer,
    name     text,
    avatar   text,
    progress integer default 0 not null,
    password text              not null,
    profile  integer
        constraint user_profile_fk
            references casein.profile
            on update cascade on delete cascade,
    track    integer
        constraint user_track_fk
            references casein.track
);

alter table casein."user"
    owner to postgres;

create table casein.quest
(
    id serial not null
        constraint quest_pk
            primary key
);

alter table casein.quest
    owner to postgres;


