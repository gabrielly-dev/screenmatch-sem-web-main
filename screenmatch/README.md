# 🎬 Screenmatch - Buscador de Séries

## 📚 Visão Geral
Aplicação Java/Spring Boot para busca e gerenciamento de informações sobre séries de TV. Consome a API OMDB (Open Movie Database) e armazena os dados localmente em um banco de dados PostgreSQL.

## 🧩 Funcionalidades Detalhadas

### 🔍 Busca de Séries
- Consulta séries por título na API OMDB
- Armazena informações básicas (título, sinopse, avaliação, gênero, etc.)
- Suporte a múltiplas séries

### 📺 Gerenciamento de Temporadas
- Lista todas as temporadas de uma série
- Exibe detalhes de cada episódio
- Calcula estatísticas básicas

### 💾 Armazenamento Local
- Persistência dos dados usando Spring Data JPA
- Banco de dados PostgreSQL
- Modelo relacional entre Séries e Episódios

## 🛠 Stack Tecnológica

### Backend
- Java 17
- Spring Boot 3.x
- Spring Data JPA
- Jackson (JSON processing)
- PostgreSQL

### APIs Integradas
- OMDB API (https://www.omdbapi.com/)

## 🏗 Diagrama de Classes Simplificado
```
ScreenmatchApplication
       ▲
       │
       ▼
   Principal ───▶ ConsumoApi
       │             ▲
       ▼             │
   SerieRepository   │
       ▲             │
       │             ▼
     Serie ◄─── Episodio
```

## 🚀 Configuração e Execução

### Pré-requisitos
- Java 17 JDK
- Chave de API OMDB (gratuita)
- Banco de dados PostgreSQL configurado

### Passos para Execução
1. Configure a variável de ambiente:
```bash
export APIKEY_ALURASERIES="sua_chave_aqui"
```

2. Configure o banco de dados PostgreSQL no seu ambiente.

3. Execute a aplicação:
```bash
./mvnw spring-boot:run
```

4. Acesse o menu interativo no console

## 📊 Modelo de Dados

### Entidades Principais
- **Serie**: Armazena informações gerais da série
  - id, titulo, totalTemporadas, avaliacao, genero, atores, poster, sinopse
- **Episodio**: Armazena dados de cada episódio
  - id, titulo, numero, avaliacao, dataLancamento, temporada

### Relacionamentos
- Uma Série possui muitos Episódios (1:N)

## 🔄 Fluxo de Trabalho

1. Usuário busca uma série pelo nome
2. Aplicação consulta a API OMDB
3. Dados são convertidos para objetos Java
4. Série é armazenada localmente
5. Usuário pode buscar episódios
6. Temporadas e episódios são exibidos

## 💻 Exemplo Completo de Uso

```plaintext
1 - Buscar séries
2 - Buscar episódios
3 - Listar séries buscadas
0 - Sair

Opção: 1
Digite o nome da série para busca: The Office

Série encontrada:
Título: The Office
Avaliação: 8.9
Gênero: Comedy
Temporadas: 9
```

## 🧪 Testes e Qualidade

### Tipos de Testes
- Testes de integração com a API OMDB
- Testes de persistência
- Validação de modelos

### Executando Testes
```bash
./mvnw test
```

## 📌 Próximos Passos
- [ ] Adicionar autenticação
- [ ] Implementar frontend web
- [ ] Adicionar recomendações

## 🤝 Como Contribuir
1. Reporte bugs via Issues
2. Faça fork e envie Pull Requests
3. Sugira novas funcionalidades

## 📄 Licença
MIT License - veja o arquivo LICENSE.md para detalhes
