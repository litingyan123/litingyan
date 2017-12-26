prompt Importing table USERS...
set feedback off
set define off
insert into USERS (ID, USERNAME, BIRTHDAY, SEX, ADDRESS, PASSWORD)
values (3, 'jack', to_date('21-12-1995', 'dd-mm-yyyy'), '1', '铁西', '123');

insert into USERS (ID, USERNAME, BIRTHDAY, SEX, ADDRESS, PASSWORD)
values (4, 'Bill', to_date('16-12-1993', 'dd-mm-yyyy'), '1', '皇姑', '123');

insert into USERS (ID, USERNAME, BIRTHDAY, SEX, ADDRESS, PASSWORD)
values (1, 'Alice', to_date('03-12-1996', 'dd-mm-yyyy'), '2', '和平', '123');

insert into USERS (ID, USERNAME, BIRTHDAY, SEX, ADDRESS, PASSWORD)
values (2, 'Tom', to_date('12-12-2017', 'dd-mm-yyyy'), '1', '沈河', '123');

prompt Done.
