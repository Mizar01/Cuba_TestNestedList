-- begin TESTNESTEDLIST_CLIENT
create unique index IDX_TESTNESTEDLIST_CLIENT_UNIQ_NAME on TESTNESTEDLIST_CLIENT (NAME) ^
-- end TESTNESTEDLIST_CLIENT
-- begin TESTNESTEDLIST_PROJECT
alter table TESTNESTEDLIST_PROJECT add constraint FK_TESTNESTEDLIST_PROJECT_ON_CLIENT foreign key (CLIENT_ID) references TESTNESTEDLIST_CLIENT(ID)^
create unique index IDX_TESTNESTEDLIST_PROJECT_UNIQ_CODE on TESTNESTEDLIST_PROJECT (CODE) ^
create index IDX_TESTNESTEDLIST_PROJECT_ON_CLIENT on TESTNESTEDLIST_PROJECT (CLIENT_ID)^
-- end TESTNESTEDLIST_PROJECT