# ProblemAdd
Capture oj problem data and save in PostgreSQL
postgreSQL设置带有自增字段的表
假设id是自增的主键，先建立不带自增的表，id为int4，然后通过命令:
onlinejudge=# CREATE SEQUENCE tablename_id_seq 
    START WITH 1 
    INCREMENT BY 1 
    NO MINVALUE 
    NO MAXVALUE 
    CACHE 1; 
    
alter table tablename alter column id set default nextval('tablename_id_seq'); 
就可以使得id自增
