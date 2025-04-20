create table if not exists stock(
    id serial primary key,
    ticker varchar(10) not null unique,
    name varchar(100) not null,
    exchange_market varchar(10) not null,
    shares_issued bigint not null,
    created_datetime timestamp not null default now()
);