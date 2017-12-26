prompt Importing table ORDERS...
set feedback off
set define off
insert into ORDERS (ID, USER_ID, SNO, CREATETIME, NOTE)
values (3, 3, '65321', to_date('12-10-2016', 'dd-mm-yyyy'), null);

insert into ORDERS (ID, USER_ID, SNO, CREATETIME, NOTE)
values (4, 4, '65432', to_date('29-12-2017', 'dd-mm-yyyy'), null);

insert into ORDERS (ID, USER_ID, SNO, CREATETIME, NOTE)
values (1, 1, '10010', to_date('13-12-2017', 'dd-mm-yyyy'), null);

insert into ORDERS (ID, USER_ID, SNO, CREATETIME, NOTE)
values (2, 2, '10086', to_date('05-12-2017', 'dd-mm-yyyy'), null);

prompt Done.
