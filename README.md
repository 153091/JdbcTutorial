# JdbcTutorial
jdbc h2db/entity/DAO/Service

JDBC and H2 database application
The application describes work with JDBC and H2 database. The application divided on 3 layers: entity, dao and service.

Database structure
https://cloud.githubusercontent.com/assets/5372875/22624532/4cbef472-eb87-11e6-98eb-7a35541d2a49.jpg

Create tables SQL script
CREATE TABLE "ADDRESS" ( "ID" bigint NOT NULL, "COUNTRY" varchar(255) NOT NULL, "CITY" varchar(255) NOT NULL, "STREET" varchar(255) NOT NULL, "POST_CODE" varchar(10) NOT NULL, CONSTRAINT "ID" PRIMARY KEY ("ID") )

CREATE TABLE "EMPLOYEE" ( "ID" bigint NOT NULL, "FIRST_NAME" varchar(255) NOT NULL, "LAST_NAME" varchar(255) NOT NULL, "BIRTHDAY" date NOT NULL, "ADDRESS_ID" bigint NOT NULL, CONSTRAINT "EMPLOYEE_pkey" PRIMARY KEY ("ID"), CONSTRAINT "EMPLOYEE_ID_fkey" FOREIGN KEY ("ID") references ADDRESS (ID) )

CREATE TABLE "PROJECT" ( "ID" bigint NOT NULL, "TITLE" varchar(255) NOT NULL, CONSTRAINT "PROJECT_pkey" PRIMARY KEY ("ID") )

CREATE TABLE "EMPL_PROJ" ( "EMPLOYEE_ID" bigint NOT NULL, "PROJECT_ID" bigint NOT NULL, CONSTRAINT "EMPL_PROJ_EMPLOYEE_ID_fkey" FOREIGN KEY ("EMPLOYEE_ID") REFERENCES "EMPLOYEE" ("ID"), CONSTRAINT "EMPL_PROJ_PROJECT_ID_fkey" FOREIGN KEY ("PROJECT_ID") REFERENCES "PROJECT" ("ID") )
