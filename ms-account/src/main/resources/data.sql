DROP table if exists customer;
drop table if exists accounts;

create table `customer` (
    `customer_id` int auto_increment primary key,
    `name` varchar(100) not null,
    `email` varchar(100) not null,
    `mobile_number` varchar(100) not null,
    `create_dt` date DEFAULT NULL
);

create table `accounts` (
    `customer_id` int not null ,
    `account_number` int auto_increment primary key,
    `account_type` varchar(100) not null,
    `branch_address` varchar(100) not null,
    `create_dt` date DEFAULT NULL
);

insert into `customer` (`name`, `email`, `mobile_number`, `create_dt`)
    values ('jcb826','tutor@jcb826','9876548337',CURRENT_DATE());

insert into `accounts` (`customer_id`, `account_number`, `account_type`, `branch_address`, `create_dt`)
    values (1, 186576453, 'Savings', '123 Main Street, New York',CURRENT_DATE());