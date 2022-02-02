

drop table if exists produit;
create table produit (
                     id int8 not null,
                     date_publication timestamp,
                     desription varchar(255),
                     prix_achat int4,
                      prix_vente int4,
                     nom varchar(255),
                     primary key (id))