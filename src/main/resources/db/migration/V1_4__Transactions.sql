CREATE TABLE transactions (
    id integer primary key auto_increment,
    user_id integer not null,
    transaction_value decimal(10,2) not null,
    foreign key (user_id) references green_user(id)
)