use dummyATM;

#DROP TABLE users;

CREATE TABLE users (
  username varChar (50) not null,
  password varChar (50) not null,
  enabled boolean not null default true,
  primary key (username)
);

INSERT INTO users (username,password) VALUES (1000,"aj1000the1000god"),(1001,"aj1001the1001god"),(1002,"aj1002the1002god"),(1003,"aj1003the1003god"),(1004,"aj1004the1004god"),(1005,"aj1005the1005god"),(1006,"aj1006the1006god"),(1007,"aj1007the1007god"),(1008,"aj1008the1008god"),(1009,"aj1009the1009god"),(1010,"aj1010the1010god"),(1011,"aj1011the1011god"),(1012,"aj1012the1012god"),(1013,"aj1013the1013god"),(1014,"aj1014the1014god"),(1015,"aj1015the1015god"),(1016,"aj1016the1016god"),(1017,"aj1017the1017god"),(1018,"aj1018the1018god"),(1019,"aj1019the1019god"),(1020,"aj1020the1020god"),(1021,"aj1021the1021god"),(1022,"aj1022the1022god"),(1023,"aj1023the1023god"),(1024,"aj1024the1024god"),(1025,"aj1025the1025god"),(1026,"aj1026the1026god"),(1027,"aj1027the1027god"),(1028,"aj1028the1028god"),(1029,"aj1029the1029god"),(1030,"aj1030the1030god"),(1031,"aj1031the1031god"),(1032,"aj1032the1032god"),(1033,"aj1033the1033god"),(1034,"aj1034the1034god"),(1035,"aj1035the1035god"),(1036,"aj1036the1036god"),(1037,"aj1037the1037god"),(1038,"aj1038the1038god"),(1039,"aj1039the1039god"),(1040,"aj1040the1040god"),(1041,"aj1041the1041god"),(1042,"aj1042the1042god"),(1043,"aj1043the1043god"),(1044,"aj1044the1044god"),(1045,"aj1045the1045god"),(1046,"aj1046the1046god"),(1047,"aj1047the1047god"),(1048,"aj1048the1048god"),(1049,"aj1049the1049god"),(1050,"aj1050the1050god"),(1051,"aj1051the1051god"),(1052,"aj1052the1052god"),(1053,"aj1053the1053god"),(1054,"aj1054the1054god"),(1055,"aj1055the1055god"),(1056,"aj1056the1056god"),(1057,"aj1057the1057god"),(1058,"aj1058the1058god"),(1059,"aj1059the1059god"),(1060,"aj1060the1060god"),(1061,"aj1061the1061god"),(1062,"aj1062the1062god"),(1063,"aj1063the1063god"),(1064,"aj1064the1064god"),(1065,"aj1065the1065god"),(1066,"aj1066the1066god"),(1067,"aj1067the1067god"),(1068,"aj1068the1068god"),(1069,"aj1069the1069god"),(1070,"aj1070the1070god"),(1071,"aj1071the1071god"),(1072,"aj1072the1072god"),(1073,"aj1073the1073god"),(1074,"aj1074the1074god"),(1075,"aj1075the1075god"),(1076,"aj1076the1076god"),(1077,"aj1077the1077god"),(1078,"aj1078the1078god"),(1079,"aj1079the1079god"),(1080,"aj1080the1080god"),(1081,"aj1081the1081god"),(1082,"aj1082the1082god"),(1083,"aj1083the1083god"),(1084,"aj1084the1084god"),(1085,"aj1085the1085god"),(1086,"aj1086the1086god"),(1087,"aj1087the1087god"),(1088,"aj1088the1088god"),(1089,"aj1089the1089god"),(1090,"aj1090the1090god"),(1091,"aj1091the1091god"),(1092,"aj1092the1092god"),(1093,"aj1093the1093god"),(1094,"aj1094the1094god"),(1095,"aj1095the1095god"),(1096,"aj1096the1096god"),(1097,"aj1097the1097god"),(1098,"aj1098the1098god"),(1099,"aj1099the1099god");

#DROP TABLE authorities;

CREATE TABLE authorities (
  username varChar (50) not null,
  authority varChar (50) not null,
  constraint fk_authorities_users foreign key(username) references users(username)
);

create unique index ix_auth_username on authorities (username,authority);

INSERT INTO authorities (username,authority) VALUES (1000,"admin"),(1001,"admin"),(1002,"admin"),(1003,"admin"),(1004,"admin"),(1005,"admin"),(1006,"admin"),(1007,"admin"),(1008,"admin"),(1009,"admin"),(1010,"admin"),(1011,"admin"),(1012,"admin"),(1013,"admin"),(1014,"admin"),(1015,"admin"),(1016,"admin"),(1017,"admin"),(1018,"admin"),(1019,"admin"),(1020,"admin"),(1021,"admin"),(1022,"admin"),(1023,"admin"),(1024,"admin"),(1025,"admin"),(1026,"admin"),(1027,"admin"),(1028,"admin"),(1029,"admin"),(1030,"admin"),(1031,"admin"),(1032,"admin"),(1033,"admin"),(1034,"admin"),(1035,"admin"),(1036,"admin"),(1037,"admin"),(1038,"admin"),(1039,"admin"),(1040,"admin"),(1041,"admin"),(1042,"admin"),(1043,"admin"),(1044,"admin"),(1045,"admin"),(1046,"admin"),(1047,"admin"),(1048,"admin"),(1049,"admin"),(1050,"admin"),(1051,"admin"),(1052,"admin"),(1053,"admin"),(1054,"admin"),(1055,"admin"),(1056,"admin"),(1057,"admin"),(1058,"admin"),(1059,"admin"),(1060,"admin"),(1061,"admin"),(1062,"admin"),(1063,"admin"),(1064,"admin"),(1065,"admin"),(1066,"admin"),(1067,"admin"),(1068,"admin"),(1069,"admin"),(1070,"admin"),(1071,"admin"),(1072,"admin"),(1073,"admin"),(1074,"admin"),(1075,"admin"),(1076,"admin"),(1077,"admin"),(1078,"admin"),(1079,"admin"),(1080,"admin"),(1081,"admin"),(1082,"admin"),(1083,"admin"),(1084,"admin"),(1085,"admin"),(1086,"admin"),(1087,"admin"),(1088,"admin"),(1089,"admin"),(1090,"admin"),(1091,"admin"),(1092,"admin"),(1093,"admin"),(1094,"admin"),(1095,"admin"),(1096,"admin"),(1097,"admin"),(1098,"admin"),(1099,"admin");

show create table users;

desc account;

select* from users;

describe users;

show create table authorities;

select* from authorities;

describe authorities;