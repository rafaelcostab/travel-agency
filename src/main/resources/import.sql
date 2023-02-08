--toda vez que a aplicacao iniciar irá criar dados fictícios para teste
insert into Client(id, name) values (nextval('hibernate_sequence'), 'João');
insert into Client(id, name) values (nextval('hibernate_sequence'), 'Maria');
insert into Client(id, name) values (nextval('hibernate_sequence'), 'José');
insert into Client(id, name) values (nextval('hibernate_sequence'), 'Ana');