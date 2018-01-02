# MySQL

Resumo da linguagem SQL e do banco MySQL

---

## Init

```
$ mysql -uroot -p
```

# Create

```
$ create database foo;
$ use foo;
$ create table bar (id int auto_increment primary key, valor double, data date, recebido boolean, info varchar(255));
$ desc bar;
```

# Insert

```
$ insert into bar (valor, data, recebido, info) values (150.20, '2017-12-01', 1, 'Random info');
```

# Select

```
$ select * from bar;
$ select valor, data from bar;
$ select valor * 3, data from bar;
$ select * from bar where valor > 15; // >, <, =, <> (diferente)
$ select * from bar where valor > 15 and data < '2017-01-01';
$ select * from bar where valor > 15 or data < '2017-01-01';
$ select * from bar where info like 'Ran%'; // % é o coringa
```