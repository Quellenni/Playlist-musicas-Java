# Projeto Final - School Java MJV :headphones:

Nesse projeto foi desenvolvida uma Api em Java com Spring Boot para criação de Playlists de Músicas.

## :computer: Tecnologias usadas para a execução do projeto:

* Java 8
* Maven
* Eclipse
* [Spring Boot](https://spring.io/) 
* [Astah](https://astah.net/) 
* [Swagger](https://swagger.io/tools/swagger-ui/) 
* [MySql](https://www.mysql.com/)


## UML - Diagrama de Classes


![Diagrama](https://user-images.githubusercontent.com/86434650/159821674-fced2bf7-a20d-491e-bb02-32bc40b5020f.png)


## 📝 :pencil:Desenvolvimento do Projeto

Foram utilizados Spring Framework para configurações do sistema, Spring data jpa para a persistência de dados e Springdoc-openapi para gerar documentação com Swagger.
Para estabelecer a conexão com o banco de dados mysql utilizamos o Mysql connector Java. 

Será necessário adicionar as seguintes dependências ao maven para a utilização dessa API:

* _Spring Boot Starter_
* _MySql Connector_
* _Spring Boot Starter Web_
* _SpringDoc OpenApi Ui_
* _Spring Boot Data JPA_


Para acessar a API documentada no Swagger foi utilizada a url :

>http://localhost:8080/swagger-ui/index.html

![swagger](https://user-images.githubusercontent.com/86434650/159829955-8d00663d-ff0a-4ee2-bd72-a123267f2a4c.png)

### Exemplos de JSON para POST:

/artista

```
{
 "id": 0,
 "nome": "Bryan Adams"
}
```

/musica

```
{
  "id": 0,
  "nome": "Heaven",
  "album": " Reckless",
  "genero": "Rock",
  "duracao": 4.13,
  "artista": {
    "id": // id artista
    }
}
```

/playlist

```
{
  "nome": "Anos 80",
  "genero": "Rock",
  "musicas": [
    {
      "id": // id musica
    }
  ]
}

```














