
/*==============================================================*/
/* Table: T_HO_CACLS                                            */
/*==============================================================*/
create table T_HO_CACLS 
(
   CLSID                NUMBER(9)            not null,
   CODE                 VARCHAR(20)          not null,
   NAME                 VARCHAR(20)          not null,
   TYPE                 NUMBER(1)            not null,
   SUPERID              NUMBER(9)            default 0,
   LEVELNO              NUMBER(1)            default 0 not null,
   ISLEAF               NUMBER(1)            default 0 not null,
   CREATEDATE           VARCHAR(20)          not null,
   UPDATEDATE           VARCHAR(20),
   UUID                 VARCHAR(32)          not null,
   REMARK               VARCHAR(255),
   constraint PK_T_HO_CACLS primary key (CLSID),
   constraint UK_T_HO_CACLS_01 unique (CODE),
   constraint UK_T_HO_CACLS_02 unique (UUID)
)
/

comment on table T_HO_CACLS is
'类别表'
/

comment on column T_HO_CACLS.CLSID is
'流程ID PK'
/

comment on column T_HO_CACLS.CODE is
'编码'
/

comment on column T_HO_CACLS.NAME is
'名称'
/

comment on column T_HO_CACLS.TYPE is
'类型'
/

comment on column T_HO_CACLS.SUPERID is
'上级流水ID'
/

comment on column T_HO_CACLS.LEVELNO is
'级次'
/

comment on column T_HO_CACLS.ISLEAF is
'是否末级'
/

comment on column T_HO_CACLS.CREATEDATE is
'创建时间'
/

comment on column T_HO_CACLS.UPDATEDATE is
'修改时间'
/

comment on column T_HO_CACLS.UUID is
'UUID'
/

comment on column T_HO_CACLS.REMARK is
'备注'
/

create sequence S_HO_CACLS
increment by 1
start with 1
 maxvalue 999999999
 minvalue 1
 cache 20
/
/*==============================================================*/
/* Table: T_HO_CAUSER                                           */
/*==============================================================*/
create table T_HO_CAUSER 
(
   USERID               NUMBER(9)            not null,
   CLSID                NUMBER(9),
   CODE                 VARCHAR2(20)         not null,
   NAME                 VARCHAR2(30)         not null,
   PASSWORD             VARCHAR2(32)         not null,
   TYPE                 INT                  not null,
   STATE                INT                  not null,
   CARDNO               VARCHAR2(18),
   CREATEDATE           VARCHAR2(20)         not null,
   UPDATEDATE           VARCHAR2(20),
   VERSION              NUMBER(9)            not null,
   REMARK               VARCHAR(255),
   constraint PK_T_HO_CAUSER primary key (USERID),
   constraint UK_T_HO_CAUSER_01 unique (CODE)
)
/

comment on table T_HO_CAUSER is
'用户表'
/

comment on column T_HO_CAUSER.USERID is
'用户ID'
/

comment on column T_HO_CAUSER.CLSID is
'类别ID，外键'
/

comment on column T_HO_CAUSER.CODE is
'编码'
/

comment on column T_HO_CAUSER.NAME is
'名称'
/

comment on column T_HO_CAUSER.PASSWORD is
'密码'
/

comment on column T_HO_CAUSER.TYPE is
'类型'
/

comment on column T_HO_CAUSER.STATE is
'状态'
/

comment on column T_HO_CAUSER.CARDNO is
'身份证号'
/

comment on column T_HO_CAUSER.CREATEDATE is
'创建日期'
/

comment on column T_HO_CAUSER.UPDATEDATE is
'修改日期'
/

comment on column T_HO_CAUSER.VERSION is
'版本号'
/

comment on column T_HO_CAUSER.REMARK is
'备注'
/
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


-- Create sequence 
create sequence S_HO_CACLS
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20
order;

/*==============================================================*/
/* Table: T_HO_CAROLE                                           */
/*==============================================================*/
create table T_HO_CAROLE 
(
   ROLEID               NUMBER(9)            not null,
   CLSID                NUMBER(9)            not null,
   CODE                 VARCHAR(20)          not null,
   NAME                 VARCHAR(20)          not null,
   STATE                INT                  not null,
   CREATEDATE           VARCHAR(20)          not null,
   UPDATEDATE           VARCHAR(20),
   VERSION              NUMBER(9)            not null,
   UUID                 VARCHAR(32)          not null,
   GOVID                VARCHAR(10),
   GOVYEAR              NUMBER(4),
   REMARK               VARCHAR(255),
   constraint PK_T_HO_CAROLE primary key (ROLEID)
)
/

comment on table T_HO_CAROLE is
'角色表'
/

alter table T_HO_CAROLE
   add constraint FK_T_HO_CAR_REFERENCE_T_HO_CAC foreign key (CLSID)
      references T_HO_CACLS (CLSID)
/

alter table T_HO_CAROLE
  add constraint UK_T_HO_CAROLE_01 unique (CODE);
alter table T_HO_CAROLE
  add constraint UK_T_HO_CAROLE_02 unique (UUID);
--Add comments to the columns 

-- Create sequence 
create sequence S_HO_CAROLE
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20
order;