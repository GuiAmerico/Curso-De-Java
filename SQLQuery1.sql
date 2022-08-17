-- Criando a tabela estado
CREATE TABLE estados(
	id INT NOT NULL IDENTITY(1,1),
	nome VARCHAR(45) NOT NULL,
	sigla VARCHAR(2) NOT NULL,
	regiao VARCHAR(15) CHECK( regiao IN('Norte','Nordeste', 'Centro-Oeste', 'Sudeste', 'Sul')) NOT NULL,
	populacao DECIMAL(5,2) NOT NULL,
	PRIMARY KEY(id),
	UNIQUE(nome),
	UNIQUE(sigla),

);

-- Inserindo estados
INSERT INTO estados(nome, sigla, regiao, populacao)
VALUES('Acre', 'AC', 'Norte', 0.83),
('Alagoas', 'AL', 'Nordeste', 3.38),
('Amazonas', 'AM', 'Norte', 4.06);
-- Inserindo estados restantes
INSERT INTO estados(nome, sigla, regiao, populacao)
VALUES
('Bahia', 'BA', 'Nordeste', 15.34),
('Ceará', 'CE', 'Nordeste', 9.02),
('Distrito Federal', 'DF', 'Centro-Oeste', 3.04),
('Espírito Santo', 'ES', 'Sudeste', 4.02),
('Goiás', 'GO', 'Centro-Oeste', 6.78),
('Maranhao', 'MA', 'Nordeste', 7.00),
('Mato Grosso', 'MT', 'Centro-Oeste', 3.34),
('Mato Grosso do Sul', 'MS', 'Centro-Oeste', 2.71),
('Minas Gerais', 'MG', 'Sudeste', 21.12),
('Pará', 'PA', 'Norte', 8.36),
('Paraíba', 'PB', 'Nordeste', 4.03),
('Parana', 'PR', 'Sul', 11.22),
('Pernambuco', 'PE', 'Nordeste', 9.47),
('Piauí', 'PI', 'Nordeste', 3.22),
('Rio de Janeiro', 'RJ', 'Sudeste', 16.72),
('Rio Grande do Norte', 'RN', 'Nordeste', 3.51),
('Rio Grande do Sul', 'RS', 'Sul', 11.32),
('Rondônia', 'RO', 'Norte', 1.81),
('Roraima', 'RR', 'Norte', 0.52),
('Santa Catarina', 'SC', 'Sul', 7.01),
('São Paulo', 'SP', 'Sudeste', 45.10),
('Sergipe', 'SE', 'Nordeste', 2.29),
('Tocantins', 'TO', 'Norte', 1.55);


-- Consultando estados
SELECT * FROM estados

SELECT nome, sigla FROM estados


SELECT nome, sigla FROM estados WHERE regiao = 'Sul'


SELECT nome, sigla ,populacao FROM estados
WHERE populacao >= 10
ORDER BY populacao DESC



UPDATE estados
SET nome = 'Maranhão'
WHERE sigla = 'MA'

UPDATE estados
SET nome = 'Paraná', populacao = 11.32
WHERE id = 15

SELECT * FROM estados

INSERT INTO estados(nome, sigla, regiao, populacao)
VALUES
('Novo', 'NV', 'Sul', 2.32),
('NovoNovo', 'NN', 'Sudeste', 1.79)


DELETE FROM estados
WHERE id = 28



DELETE FROM estados
WHERE nome = 'Novo' AND regiao = 'Sul'

SELECT * FROM estados

SELECT regiao, SUM(populacao) PopRegiao
FROM estados
GROUP BY regiao
ORDER BY PopRegiao DESC

CREATE TABLE cidades (
	id INT NOT NULL IDENTITY(1, 1),
	nome VARCHAR(255) NOT NULL ,
	estado_id INT NOT NULL,
	area DECIMAL(10,2),
	PRIMARY KEY(id),
	FOREiGN KEY (estado_id) REFERENCES estados(id)
);

INSERT INTO cidades (nome, area, estado_id)
VALUES
('Campinas',795, 24),
('Niterói', 133.25, 18),
('Caruaru', 920.6, (SELECT id FROM estados WHERE sigla = 'PE')),
('Juazeiro do Norte', 248.2, (SELECT id FROm estados WHERE sigla = 'CE')
);


SELECT * FROM cidades

SELECT c.id, c.nome 'Cidade' , e.nome 'Estado' FROM estados e, cidades c
WHERE e.id = c.estado_id

SELECT c.id, c.nome 'Cidade' , e.nome 'Estado' FROM estados e
INNER JOIN cidades c 
ON e.id = c.estado_id

CREATE TABLE prefeitos(
	id INT NOT NULL IDENTITY(1, 1) PRIMARY KEY,
	nome VARCHAR(250) NOT NULL,
	cidade_id INT NOT NULL UNIQUE,
	FOREIGN KEY(cidade_id) REFERENCES cidades(id)
	
)

ALTER TABLE prefeitos ALTER COLUMN cidade_id INT NULL;

SELECT * FROM cidades

INSERT INTO prefeitos(nome, cidade_id)
VALUES
('Rodrigo Neves', 2),
('Raquel Lyra', 3),
('Zenaldo Coutinho', NULL);


/*
INSERT INTO prefeitos(nome, cidade_id)
VALUES
('Rodrigo Pinheiro', 2)*/


SELECT * FROM prefeitos

SELECT c.id , c.nome, p.nome,c.estado_id FROM cidades c
INNER JOIN prefeitos p ON c.id = p.cidade_id

SELECT c.id, c.nome, p.nome, c.estado_id FROM cidades c
LEFT JOIN prefeitos p ON c.id = p.cidade_id

SELECT c.id, c.nome, p.nome, c.estado_id FROM cidades c
RIGHT JOIN prefeitos p ON c.id = p.cidade_id

SELECT c.id, c.nome, p.nome, c.estado_id FROM cidades c
FULL JOIN prefeitos p ON c.id = p.cidade_id

CREATE TABLE empresa(
	id INT NOT NULL IDENTITY(1,1),
	nome VARCHAR(50) NOT NULL,
	cnpj INT,
	PRIMARY KEY(ID),
	UNIQUE(cnpj)
);


CREATE TABLE empresas_unidades(
	empresa_id INT NOT NULL,
	cidade_id INT NOT NULL,
	sede TINYINT CHECK(sede = 0 OR sede = 1) NOT NULL,
	PRIMARY KEY(empresa_id, cidade_id)

);

INSERT INTO empresa(nome, cnpj)
VALUES
('Bradesco', 12345678),
('Vale', 98776543),
('Cielo', 87452392);

INSERT INTO empresas_unidades(empresa_id, cidade_id, sede)
VALUES
(1, 1, 1),
(1, 2, 0),
(2, 1, 0),
(2, 2, 1);

SELECT e.nome, c.nome FROM empresa e, empresas_unidades eu, cidades c
WHERE e.id = eu.empresa_id
AND c.id = eu.cidade_id
AND sede = 1;


