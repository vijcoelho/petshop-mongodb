#🐾 PetShop API - Spring Boot + MongoDB
Uma API simples para gerenciar donos e pets, com operações básicas de CRUD usando Spring Boot e MongoDB.

##📋 Endpoints
###1. Salvar Dono
`POST /dono/save`
Salva um novo dono no banco de dados.

**Request (JSON):**

```json
Copy
{
    "nome": "João Silva"
}
Response (200 OK):
```
```json
Copy
{
    "id": "507f1f77bcf86cd799439011",
    "nome": "João Silva"
}
```
###2. Salvar Pet

`POST /pet/save`
Salva um novo pet associado a um dono.

**Request (JSON):**

```json
Copy
{
    "nome": "Rex",
    "nomeDono": "João Silva",
    "raca": "Vira-Lata",
    "vacinas": ["raiva", "v8"]
}
Response (200 OK):
```
```json
Copy
{
    "id": "67fecfa3ea836f4262bbfdc2",
    "nome": "Rex",
    "nomeDono": "João Silva",
    "raca": "Vira-Lata",
    "vacinas": ["raiva", "v8"]
}
```
###3. Buscar Pet por Nome
POST /pet/getNome
Retorna um pet com base no nome (busca exata).

**Request (JSON):**

```json
Copy
{
    "nome": "Rex"
}
Response (200 OK):
```
```json
Copy
{
    "id": "67fecfa3ea836f4262bbfdc2",
    "nome": "Rex",
    "nomeDono": "João Silva",
    "raca": "Vira-Lata",
    "vacinas": ["raiva", "v8"]
}
Se não encontrar:

Retorna 404 Not Found.
```

##🛠 Configuração
Pré-requisitos
Java 17+

MongoDB local (ou altere a URI no application.properties)

##Como Executar
Clone o repositório:

```bash
Copy
git clone https://github.com/vijcoelho/petshop-api.git
```
##Configure o MongoDB:

Certifique-se de que o MongoDB está rodando em localhost:27017.

O banco de dados padrão é petshop (pode ser alterado em application.properties).

Execute a aplicação:

```bash
Copy
./mvnw spring-boot:run
```
##Confira no MongoDB Shell:

```bash
Copy
use petshop
db.pet.find({ nome: "Rex" })
Erro ao salvar (400 Bad Request)
Certifique-se de que todos os campos obrigatórios estão no JSON.
```

📜 Licença
MIT License.

👉 Dúvidas? Abra uma issue no repositório! 🚀
