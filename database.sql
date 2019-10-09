drop database if exists yiluwiki;
create database  yiluwiki;
use yiluwiki;
create table yw_forum_post(
                              yfp_id int not null auto_increment,
                              yfp_abstract varchar(255) default null,
                              yfp_title varchar(255) default null ,
                              yfp_create_time timestamp not null,
                              yfp_update_time timestamp not null,
                              yu_id int,
                              primary key (yfp_id)
)default charset = utf8;
create table  yw_forum_reply(
                                yfr_id int not null auto_increment,
                                yfr_floor int not null,
                                yfr_content varchar(255) default null,
                                yfr_reply_to int not null,
                                yfr_id int not null ,
                                yu_id int,
                                yfr_create_time timestamp,
                                yfr_update_time timestamp,
                                primary key (yfr_id)
)default charset =utf8;
create table yw_page(
                        yp_id int not null auto_increment,
                        yp_type varchar(255),
                        yp_name varchar(255),
                        yp_abstract varchar(255),
                        yp_content varchar(255),
                        primary key (yp_id)
)default charset =utf8;
create table yw_user(
                        yu_id int not null auto_increment,
                        yu_login varchar(255),
                        yu_node_id varchar(255),
                        yu_avatar_url varchar(255),
                        yu_html_url varchar(255),
                        yu_name varchar(8),
                        yu_bio varchar(255),
                        yu_password varchar(255),
                        yu_github_id int,
                        primary key (yu_id)
)default charset =utf8;