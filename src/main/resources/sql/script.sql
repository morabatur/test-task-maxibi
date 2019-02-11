CREATE TABLE Roman.Clients(
                            id nvarchar(255) NOT NULL PRIMARY KEY,
                            name nvarchar(255) NOT NULL UNIQUE
)

CREATE TABLE Roman.Orders(
                           id nvarchar(255) NOT NULL PRIMARY KEY,
                           name nvarchar(255)  NOT NULL,
                           description nvarchar(255) NULL,
                           moment smalldatetime NOT NULL,
                           sum decimal NOT NULL,
                           counterparty_uuid nvarchar(255) NOT NULL FOREIGN KEY REFERENCES Roman.Clients(id)
)

