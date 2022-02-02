drop table if exists magasin;
create table magasin (
                     id int8 not null,
                     nom varchar(255),
                      adresse varchar(255),
                      id_Produit int8 ,
                     primary key (id))