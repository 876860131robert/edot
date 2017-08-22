-- 功能表
create table ED_FEATURE
(
  id        VARCHAR2(15) not null,
  name      VARCHAR2(50),
  url       VARCHAR2(200),
  icon      VARCHAR2(200),
  type      CHAR(1),
  content   VARCHAR2(1000),
  param     VARCHAR2(200),
  status    CHAR(1),
  order_no  NUMBER(3),
  describe  VARCHAR2(200),
  parent_id VARCHAR2(15)
)