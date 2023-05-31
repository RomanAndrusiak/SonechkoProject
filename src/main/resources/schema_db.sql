create table person
(
    id       int generated by default as identity primary key,
    username varchar(30) unique not null,
    name     varchar(20)        not null,
    sex      varchar            not null,
    password varchar            not null,
    role     varchar            not null
)