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
  startdatecolumn VARCHAR2(20),
  enddatecolumn   VARCHAR2(20),
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
alter table T_HO_DICTABLE
  add constraint UK_T_HO_DICTABLE_02 unique (UUID);
alter table T_HO_DICTABLE 
  add constraint CK_T_HO_DICTABLE_01 check(TABLECODE between 'A' and 'Z');
-- Add comments to the columns 
comment on column T_HO_DICTABLE.tableid
  is '表PK，唯一';
comment on column T_HO_DICTABLE.version
  is '版本号';
comment on column T_HO_DICTABLE.tablecode
  is '表编码';
comment on column T_HO_DICTABLE.name
  is '表名称';
comment on column T_HO_DICTABLE.tabletype
  is '表类型：物理表（P）、逻辑表（L）、模板表（T）、枚举表（E）';
comment on column T_HO_DICTABLE.keycolumn
  is '关键字段列';
comment on column T_HO_DICTABLE.codecolumn
  is '编码字段列';
comment on column T_HO_DICTABLE.namecolumn
  is '名称字段列';
comment on column T_HO_DICTABLE.statuscolumn
  is '状态字段列';
comment on column T_HO_DICTABLE.levelnocolumn
  is '级次字段列';
comment on column T_HO_DICTABLE.isleafcolumn
  is '叶子字段列';
comment on column T_HO_DICTABLE.supercolumn
  is '上级字段列';
comment on column T_HO_DICTABLE.startdatecolumn
  is '开启日期字段列';
comment on column T_HO_DICTABLE.enddatecolumn
  is '结束字段列';
comment on column T_HO_DICTABLE.govid
  is '区划';
comment on column T_HO_DICTABLE.govyear
  is '年度';
comment on column T_HO_DICTABLE.uuid
  is '全库唯一字段';
comment on column T_HO_DICTABLE.remark
  is '备注';
  
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
  add constraint UK_T_HO_DICCOLUMN_02 unique (UUID);
alter table T_HO_DICCOLUMN
  add constraint FK_T_HO_DICCOLUMN_DICTABLE foreign key (TABLEID)
  references T_HO_DICTABLE (TABLEID);

