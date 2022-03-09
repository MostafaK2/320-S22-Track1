create table BUSINESS_PROCESS_T
(
  business_process           VARCHAR(128) not null,
  publishing_business_domain VARCHAR(64) not null,
  key1_app_context_name      VARCHAR(128),
  key2_app_context_name      VARCHAR(128)
)
;

create table LOG_DETAILS_T
(
  global_instance_id VARCHAR(64) not null,
  business_domain    VARCHAR(64),
  business_subdomain VARCHAR(64),
  version            VARCHAR(16),
  local_instance_id  VARCHAR(128),
  eai_transaction_id VARCHAR(128),
  eai_domain         VARCHAR(128),
  hostname           VARCHAR(256),
  application        VARCHAR(256),
  event_context      VARCHAR(64),
  component          VARCHAR(128),
  severity           NUMERIC,
  priority           NUMERIC,
  creation_time      TIMESTAMP(6),
  reasoning_scope    VARCHAR(16),
  process_id         VARCHAR(32),
  category_name      VARCHAR(32),
  activity           VARCHAR(256),
  msg                VARCHAR(1024)
)
;

create table LOG_APP_CONTEXT_T
(
  global_instance_id VARCHAR(64) not null,
  app_context_name   VARCHAR(128) not null,
  app_context_value  VARCHAR(256)
)
;

create table BUSINESS_PROCESS_LOG_T
(
  eai_transaction_id          VARCHAR(128) not null,
  eai_domain                  VARCHAR(128),
  publishing_business_domain  VARCHAR(64) not null,
  business_process            VARCHAR(128) not null,
  eai_transaction_create_time TIMESTAMP(6) not null,
  key1_app_context_name       VARCHAR(128),
  key1_app_context_value      VARCHAR(256),
  key2_app_context_name       VARCHAR(128),
  key2_app_context_value      VARCHAR(256),
  global_instance_id          VARCHAR(64) not null,
  business_domain             VARCHAR(64),
  application                 VARCHAR(256),
  activity                    VARCHAR(256)
)
;
