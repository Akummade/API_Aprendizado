create table Products(
    ID          int auto_increment primary key,
    name        varchar(255) not null,
    description varchar(300) not null,
    price     decimal(18, 2) not null
);