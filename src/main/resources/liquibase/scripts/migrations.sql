-- liquibase formatted sql

-- changeset alexTuraev:1
create table "checkpoint"(
    "id" BIGINT primary key,
    "name" varchar(255)
);

create table "notification"
(
    "id" bigint primary key,
    "sender" varchar(255),
    "recipient" varchar(255),
    "date_cargo" timestamp,
    "date_notice" timestamp,
    "status" varchar(255),
    "product" varchar(255),
    "additional_details" varchar(255),

    "checkpoint_id" bigint,
    foreign key ("checkpoint_id") references "checkpoint"
);

create table "measure_unit"(
    "id" BIGINT primary key,
    "measure_name" varchar(255)
);

create table "product"(
    "id" bigint primary key,
    "product_name" varchar(255),
    "volume" real,
    "measure_unit_id" bigint,
    foreign key ("measure_unit_id") references "measure_unit"
);