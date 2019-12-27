-- Create table T_HO_DICTABLE
create table T_HO_DICTABLE
(
  tableid         NUMBER(9) not null,
  version         NUMBER(10) not null,
  tablecode       VARCHAR2(32) not null,
  name            VARCHAR2(32) not null,
  tabletype       CHAR(1) not null,
  keycolumn       VARCHAR2(32),
  codecolumn      VARCHAR2(32),
  namecolumn      VARCHAR2(32),
  statuscolumn    VARCHAR2(32),
  levelnocolumn   VARCHAR2(32),
  isleafcolumn    VARCHAR2(32),
  supercolumn     VARCHAR2(32),
  startdatecolumn VARCHAR2(32),
  enddatecolumn   VARCHAR2(32),
  govid           VARCHAR2(10),
  govyear         NUMBER(10),
  uuid            VARCHAR2(32) not null,
  remark          VARCHAR2(255)
);
-- Create/Recreate primary, unique and foreign key constraints 
alter table T_HO_DICTABLE
  add constraint PK_T_HO_DICTABLE primary key (TABLEID);
alter table T_HO_DICTABLE
  add constraint UK_T_HO_DICTABLE_01 unique (TABLECODE);
  
-- Create table
create table T_HO_DICCOLUMN
(
  columnid     NUMBER(9) not null,
  version      NUMBER(10) not null,
  tableid      NUMBER(9) not null,
  columncode   VARCHAR2(32) not null,
  name         VARCHAR2(32) not null,
  datatype     CHAR(1) not null,
  datalength   NUMBER(10),
  scale        NUMBER(6),
  codeformat   VARCHAR2(20),
  filter       VARCHAR2(255),
  nullable     NUMBER(5),
  defaultvalue VARCHAR2(255),
  govid        VARCHAR2(10),
  govyear      NUMBER(10),
  uuid         VARCHAR2(32) not null,
  remark       VARCHAR2(255)
);
-- Create/Recreate primary, unique and foreign key constraints 
alter table T_HO_DICCOLUMN
  add constraint PK_T_HO_DICCOLUMN primary key (COLUMNID);
alter table T_HO_DICCOLUMN
  add constraint UK_T_HO_DICCOLUMN_01 unique (COLUMNCODE);
alter table T_HO_DICCOLUMN
  add constraint FK_T_HO_DICCOLUMN_DICTABLE foreign key (TABLEID)
  references T_HO_DICTABLE (TABLEID);

