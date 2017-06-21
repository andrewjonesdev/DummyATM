create schema dummyATM;
use dummyATM;

create table TransactionATM(
    
    tranBalance double,
    tranAmount double,
    tranReason varChar (255),
    tranAcc integer,
    tranID integer auto_increment,
    primary key (tranID)
);

show create table TransactionATM;

select* from TransactionATM;

describe TransactionATM;