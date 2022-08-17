INSERT INTO tb_curso(codigocurso, nomedocurso, duracaodocurso, datapublicacao) VALUES (1, 'ADS','150 horas', '10/03/2022');
INSERT INTO tb_curso(nomedocurso, duracaodocurso, datapublicacao) VALUES ('Administração', '300 horas', '10/03/2000');

INSERT INTO tb_aluno(matricula, nome, dtnascimento, telefone, bairro, cep, fk_codigocurso) VALUES (000, 'Maria', '02/04/1990', '123456', 'Luzia', '741258', 1);
INSERT INTO tb_aluno(matricula, nome, dtnascimento, telefone, bairro, cep, fk_codigocurso) VALUES (111, 'José', '01/10/1930', '58741', 'São José', '57441', 2);
INSERT INTO tb_aluno(matricula, nome, dtnascimento, telefone, bairro, cep, fk_codigocurso) VALUES (222, 'Jorge', '02/11/1995', '7458741', 'Ponto Novo', '96574', 1);