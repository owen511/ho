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
-- Add comments to the columns 
comment on column T_HO_DICCOLUMN.columnid
  is '字段PK';
comment on column T_HO_DICCOLUMN.version
  is '版本';
comment on column T_HO_DICCOLUMN.tableid
  is 'FK 表ID';
comment on column T_HO_DICCOLUMN.columncode
  is '字段编码';
comment on column T_HO_DICCOLUMN.name
  is '字段名称';
comment on column T_HO_DICCOLUMN.datatype
  is '字段类型';
comment on column T_HO_DICCOLUMN.datalength
  is '字段长度';
comment on column T_HO_DICCOLUMN.scale
  is '精度';
-- Create table
create table T_HO_DICELEMENT
(
  elementid   NUMBER(10) not null,
  version     NUMBER(10) not null,
  tableid     NUMBER(10),
  elementcode VARCHAR2(32 CHAR) not null,
  name        VARCHAR2(32 CHAR) not null,
  datatype    CHAR(1 CHAR),
  datalength  NUMBER(10),
  scale       NUMBER(5),
  codetype    CHAR(1 CHAR),
  codeformat  VARCHAR2(20 CHAR),
  status      NUMBER(5),
  govid       VARCHAR2(10 CHAR),
  govyear     NUMBER(10),
  uuid        VARCHAR2(32 CHAR),
  remark      VARCHAR2(255 CHAR)
);
-- Create/Recreate primary, unique and foreign key constraints 
alter table T_HO_DICELEMENT
  add constraint PK_T_HO_DICELEMENT primary key (ELEMENTID);
alter table T_HO_DICELEMENT
  add constraint UK_T_HO_DICELEMENT_01 unique (NAME);
alter table T_HO_DICELEMENT
  add constraint UK_T_HO_DICELEMENT_02 unique (ELEMENTCODE);
alter table T_HO_DICELEMENT
  add constraint FK_T_HO_DICELEMENT_DICTABLE foreign key (TABLEID) 
  references T_HO_DICTABLE (TABLEID);;
-- Add comments to the columns 
comment on column T_HO_DICELEMENT.elementid
  is '要素PK';
comment on column T_HO_DICELEMENT.version
  is '版本';
comment on column T_HO_DICELEMENT.tableid
  is 'FK 注册表ID';
comment on column T_HO_DICELEMENT.elementcode
  is '要素编码';
comment on column T_HO_DICELEMENT.name
  is '要素名称';
comment on column T_HO_DICELEMENT.datatype
  is '数据类型';
comment on column T_HO_DICELEMENT.datalength
  is '数据长度';
comment on column T_HO_DICELEMENT.scale
  is '精度 对整型数据';
comment on column T_HO_DICELEMENT.codetype
  is '编码类型';
comment on column T_HO_DICELEMENT.codeformat
  is '编码格式';
comment on column T_HO_DICELEMENT.status
  is '状态';
comment on column T_HO_DICELEMENT.govid
  is '区划';
comment on column T_HO_DICELEMENT.govyear
  is '年度';
comment on column T_HO_DICELEMENT.uuid
  is '全库唯一';
comment on column T_HO_DICELEMENT.remark
  is '备注';