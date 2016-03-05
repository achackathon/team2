INSERT INTO usuario VALUES ('097.364.526-11','Eduardo Mota','x7wbhn','eduardomota.sais@gmail.com','(31) 99405-2367');

SELECT * FROM usuario;

INSERT INTO habilidade VALUES ('1','Ele');

SELECT * FROM habilidade;

INSERT INTO usuario_has_habilidade VALUES ('097.364.526-11','2');

SELECT * FROM usuario_has_habilidade;


CREATE TABLE IF NOT EXISTS `uzbico`.`usuario` (
  `cpf` INT NOT NULL,
  `nome` VARCHAR(45) NULL,
  `senha` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `telefone` VARCHAR(45) NULL,
  PRIMARY KEY (`cpf`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `uzbico`.`habilidade` (
  `id` INT NOT NULL,
  `titulo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `uzbico`.`usuario_has_habilidade` (
  `usuario_cpf` VARCHAR(45) NOT NULL,
  `habilidade_id` INT NOT NULL,
  PRIMARY KEY (`usuario_cpf`, `habilidade_id`),
  INDEX `fk_usuario_has_habilidade_habilidade1_idx` (`habilidade_id` ASC),
  INDEX `fk_usuario_has_habilidade_usuario_idx` (`usuario_cpf` ASC),
  CONSTRAINT `fk_usuario_has_habilidade_usuario`
    FOREIGN KEY (`usuario_cpf`)
    REFERENCES `uzbico`.`usuario` (`cpf`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_usuario_has_habilidade_habilidade1`
    FOREIGN KEY (`habilidade_id`)
    REFERENCES `uzbico`.`habilidade` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
