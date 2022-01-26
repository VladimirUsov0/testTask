create table if not exists bank
(
    id UUID primary key
);

create table if not exists client
(
    id              uuid primary key,
    fio             varchar(255) not null,
    phone           varchar(255) not null,
    email           varchar(255) not null,
    passport_number varchar(255) not null unique
);

create table if not exists bank_client
(
--     id     uuid primary key,
    bank   uuid foreign key references bank,
    client uuid foreign key references client,
    constraint bank_client_u unique (bank, client)
);

create table if not exists credit
(
    id      uuid primary key,
    limit   decimal          not null,
    percent double precision not null
);
create table if not exists bank_credit
(
--     id     uuid primary key,
    credit uuid foreign key references credit on delete cascade,
    bank   uuid foreign key references bank on delete cascade,
    constraint bank_credit_u unique (bank, credit)
);

create table if not exists loan_offer
(
    id            uuid primary key,
    client_id     uuid foreign key references client,
    credit_id     uuid foreign key references credit,
    total_sum     decimal not null,
    date_of_issue date,
    first_pay     decimal,
    period_months integer
);
create table if not exists payment_schedule
(
    id                     uuid primary key,
    payment_credit_body    decimal not null,
    payment_credit_percent decimal not null,
    payment_date           date    not null,
    payment_sum            decimal not null,
    loan_offer             uuid foreign key references loan_offer
);

