create table bank
(
    id UUID primary key
);

create table client
(
    id              uuid primary key,
    fio             varchar(255) not null,
    phone           varchar(255) not null,
    email           varchar(255) not null,
    passport_number varchar(255) not null
);

create table bank_client
(
    id     uuid primary key,
    bank   uuid foreign key references bank,
    client uuid foreign key references client,
    constraint bank_client_u unique (bank, client)
);

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
    payment_credit_body    decimal not null,
    payment_credit_percent decimal not null,
    payment_date           date    not null,
    payment_sum            decimal not null
);

create table loan_offer
(
    id               uuid primary key,
    client_id        uuid foreign key references client,
    credit_id        uuid foreign key references credit,
    payment_schedule uuid foreign key references payment_schedule,
    credit_sum       decimal not null
);