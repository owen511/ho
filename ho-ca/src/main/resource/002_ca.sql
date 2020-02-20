-- Create table T_HO_CAUSER
create table T_HO_CAUSER
(
  userid     NUMBER(9) not null,
  version    NUMBER(9) not null,
  code       VARCHAR2(32) not null,
  name       VARCHAR2(32) not null,
  type       NUMBER(1) not null,
  state      NUMBER(1) not null,
  cardno     VARCHAR2(18),
  createdate VARCHAR2(20),
  updatedate VARCHAR2(20),
  govid      VARCHAR2(10),
  --govyear    NUMBER(9),
  uuid       VARCHAR2(32),
  remark     VARCHAR2(255)
);
-- Create/Recreate primary, unique and foreign key constraints 
alter table T_HO_CAUSER
  add constraint PK_T_HO_CAUSER primary key (USERID);
alter table T_HO_CAUSER
  add constraint UK_T_HO_CAUSER_01 unique (CODE);
alter table T_HO_CAUSER
  add constraint UK_T_HO_CAUSER_02 unique (UUID);
--Add comments to the columns 
comment on column T_HO_CAUSER.userid
  is '用户ID';
comment on column T_HO_CAUSER.version
  is '版本';
comment on column T_HO_CAUSER.code
  is '编码';
comment on column T_HO_CAUSER.name
  is '名称';
comment on column T_HO_CAUSER.type
  is '类型';
comment on column T_HO_CAUSER.state
  is '状态';
comment on column T_HO_CAUSER.cardno
  is '证件号';
comment on column T_HO_CAUSER.createdate
  is '新增日期';
comment on column T_HO_CAUSER.updatedate
  is '修改日期';
-- Create sequence 
create sequence S_HO_CAUSER
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20
order;
-- Create table T_HO_MENU
create table T_HO_MENU
(
  menuid  NUMBER(9) not null,
  version NUMBER(9) not null,
  code    VARCHAR2(32) not null,
  name    VARCHAR2(32) not null,
  url     VARCHAR2(200) not null,
  levelno NUMBER(9) not null,
  isleaf  NUMBER(9) not null,
  superid NUMBER(9) not null,
  govid   VARCHAR2(10),
  --govyear NUMBER(9),
  uuid    VARCHAR2(32),
  remark  VARCHAR2(255)
);
-- Create/Recreate primary, unique and foreign key constraints 
alter table T_HO_MENU
  add constraint PK_T_HO_MENU primary key (menuid);
--Add comments to the columns
comment on column T_HO_MENU.menuid
  is '菜单ID PK';
comment on column T_HO_MENU.version
  is '版本';
comment on column T_HO_MENU.code
  is '编码';
comment on column T_HO_MENU.name
  is '名称';
comment on column T_HO_MENU.url
  is '请求路径';
comment on column T_HO_MENU.levelno
  is '层级';
comment on column T_HO_MENU.isleaf
  is '是否末级';
comment on column T_HO_MENU.superid
  is '上级菜单ID';
comment on column T_HO_MENU.govid
  is '区划';
comment on column T_HO_MENU.govyear
  is '年度';
comment on column T_HO_MENU.uuid
  is '全库唯一';
comment on column T_HO_MENU.remark
  is '备注';
-- Create sequence 
create sequence S_HO_MENU
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20
order;