-- begin TESTNESTEDLIST_CLIENT
create table TESTNESTEDLIST_CLIENT (
    ID bigint not null,
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end TESTNESTEDLIST_CLIENT
-- begin TESTNESTEDLIST_PROJECT
create table TESTNESTEDLIST_PROJECT (
    ID bigint not null,
    --
    CODE varchar(255),
    CLIENT_ID bigint,
    --
    primary key (ID)
)^
-- end TESTNESTEDLIST_PROJECT
