drop table if exists loans;
create table `loans`(
    `loan_number` int not null auto_increment,
    `customer_id` int not null,
    `start_dt` DATE not null,
    `loan_type` varchar(100) not null,
    `total_loan` int not null,
    `amount_paid` int not null,
    `outstanding_amount` int not null,
    `create_dt` DATE not null,
    primary key (`loan_number`)
);

insert into `loans` (`customer_id`, `start_dt`, `loan_type`, `total_loan`, `amount_paid`, `outstanding_amount`, `create_dt`)
    VALUES (1,current_date()-250,'Home',200000,50000,150000,current_date()-250);

insert into `loans` (`customer_id`, `start_dt`, `loan_type`, `total_loan`, `amount_paid`, `outstanding_amount`, `create_dt`)
    VALUES (1,current_date()-376,'Vehicle',40000,10000,30000,current_date()-376);

insert into `loans` (`customer_id`, `start_dt`, `loan_type`, `total_loan`, `amount_paid`, `outstanding_amount`, `create_dt`)
    VALUES (1,current_date()-549,'Home',50000,10000,40000,current_date()-549);

insert into `loans` (`customer_id`, `start_dt`, `loan_type`, `total_loan`, `amount_paid`, `outstanding_amount`, `create_dt`)
    VALUES (1,current_date()-122,'Personal',10000,3500,6500,current_date()-122);