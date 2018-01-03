# MySQL

Resumo da linguagem SQL e do banco MySQL

---

## Init

```
$ mysql -uroot -p
```

# Create

```
$ create database controle_compras;
$ use controle_compras;
$ create table compras (id int auto_increment primary key, valor double, data date, recebido boolean, info varchar(255));
```

# Modify table

```
$ alter table compras add column forma_pagt enum('boleto','dinheiro');
$ alter table compras modify valor double not null;
$ alter table compras modify recebido boolean default '0';
```

# Show

```
$ show tables;
$ desc compras;
```

# Insert

```
$ insert into compras (valor, data, recebido, info) values (150.20, '2017-12-01', 1, 'Random info');
```

# Select

```
$ select * from compras;
$ select valor, data from compras;
$ select valor * 3, data from compras;

$ select * from compras where valor > 15; // >, <, =, <> (diferente)
$ select * from compras where valor > 15 and data < '2017-01-01';
$ select * from compras where valor > 15 or data < '2017-01-01';
$ select * from compras where valor between 400 and 500;
$ select * from compras where info like 'Ran%'; // % é o coringa

$ select * from compras where valor is not null;
$ select * from compras where data is null;

$ select * from compras order by valor;

$ select avg(valor) from compras where data < '2010-01-01';
$ select avg(valor) as 'Media dos precos' from compras;
$ select forma_pagt, sum(valor) from compras group by forma_pagt;
$ select forma_pagt, count(id) from compras group by forma_pagt;
```

# Update

```
$ update compras set valor = 500 where id = 20;
$ update compras set valor = 200, observacoes = 'Random Info' where valor < 200;
```

# Delete

```
$ delete from compras where id = 20;
$ delete from compras where valor < 500;
```
