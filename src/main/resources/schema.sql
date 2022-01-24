-- drop  table  bank cascade;
create table bank
(
    id UUID primary key,
    name varchar(255)
);

-- drop table bank_client cascade;
create table client
(
    id             uuid primary key,
    fio            varchar(255) not null,
    email          varchar(255) not null,
    passportNumber varchar(64)  not null
);

create table bank_client
(
    id     uuid primary key,
    bank   uuid foreign key references bank,
    client uuid foreign key references client,
    constraint bank_client_u unique (bank, client)
);

-- drop table bank_credit cascade;
create table credit
(
    id      uuid primary key,
    bank    uuid foreign key references bank,
    limit   decimal          not null,
    percent double precision not null
);
create table bank_credit
(
    id     uuid primary key,
    credit uuid foreign key references credit,
    bank   uuid foreign key references bank,
    constraint bank_credit_u unique (bank, credit)
);


create table payment_schedule
(
    id                     uuid primary key,
    credit_sum             decimal not null,
    payment_credit_body    decimal not null,
    payment_credit_percent decimal not null,
    payment_date           date    not null,
    payment_sum            decimal not null
);

create table loanOffer
(
    id                  uuid primary key,
    client_id           uuid foreign key references client,
    credit_id           uuid foreign key references credit,
    payment_schedule_id uuid foreign key references payment_schedule
);