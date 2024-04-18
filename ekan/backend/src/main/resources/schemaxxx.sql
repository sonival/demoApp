CREATE TABLE Beneficiario (
  id bigint unsigned NOT NULL AUTO_INCREMENT,
  nome varchar(300) NOT NULL,
  telefone varchar(300) NOT NULL,
  dataNascimento date NOT NULL,
  dataInclusao date NOT NULL,
  dataAtualizacao date NOT NULL,
  PRIMARY KEY (id)
) AUTO_INCREMENT=1;


CREATE TABLE Documento (
  id bigint unsigned NOT NULL AUTO_INCREMENT,
  tipoDocumento bigint NOT NULL,
  descricao varchar NOT NULL,
  dataInclusao date NOT NULL,
  dataAtualizacao date ,
  PRIMARY KEY (id),
  CONSTRAINT beneficiarioFK FOREIGN KEY (tipoDocumento) REFERENCES Beneficiario (id) ON DELETE CASCADE ON UPDATE CASCADE
) AUTO_INCREMENT=1;