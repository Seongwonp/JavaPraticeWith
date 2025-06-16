create table students
(
    studentId varchar(4)  not null
        primary key,
    name      varchar(10) not null,
    grade     int(1)      not null
);

create table score
(
    studentId VARCHAR(4)    not null,
    Korean    int           not null,
    English   int           not null,
    Math      int           not null,
    avg       DECIMAL(5, 2),

    constraint s_score
        foreign key (studentId) references students (studentId)
);

