# 📽️ Sistema de Locação de Filmes, Séries e Jogos

Um sistema de locação desenvolvido em Kotlin seguindo os princípios de Programação Orientada a Objetos (POO) para gerenciar a locação de itens de entretenimento.

## 📋 Funcionalidades Principais

- Cadastro de clientes
- Gerenciamento de itens (Jogos, Filmes e Séries)
- Processo de locação e devolução
- Consulta de disponibilidade
- Relatório de locações ativas

## 🏗️ Estrutura do Projeto

O sistema é composto por:

1. **Classes Principais**:
   - `ItemLocadora` (classe abstrata)
   - `Jogo`, `Filme`, `Série` (classes concretas)
   - `Cliente`
   - `Locadora` (classe de serviço)

2. **Interface**:
   - `ItemFisico` (para itens com mídia física)

## 📚 Diagrama de Classes Simplificado

```
ItemLocadora (abstract)
├── Jogo
├── Filme
└── Série

ItemFisico (interface)
├── Jogo
└── Filme

Cliente

Locadora
```

## 🛠️ Como Utilizar

### 1. Criando a Locadora
```kotlin
val locadora = Locadora("Nome da Locadora")
```

### 2. Cadastrando Clientes
```kotlin
val cliente = Cliente(1, "Nome", "CPF", "email@exemplo.com")
locadora.adicionarCliente(cliente)
```

### 3. Adicionando Itens
```kotlin
// Jogo
val jogo = Jogo(1, "Nome do Jogo", true, "Gênero")

// Filme
val filme = Filme(2, "Nome do Filme", true, "Classificação")

// Série
val serie = Serie(3, "Nome da Série", true, 3)

locadora.adicionarItem(jogo)
locadora.adicionarItem(filme)
locadora.adicionarItem(serie)
```

### 4. Realizando uma Locação
```kotlin
val itensParaAlugar = listOf(jogo, filme)
locadora.alugarItens(cliente, itensParaAlugar)
```

### 5. Devolvendo Itens
```kotlin
locadora.devolverItens(cliente, listOf(filme))
```

### 6. Consultas
```kotlin
// Listar locações ativas
locadora.listarLocacoes()

// Listar itens disponíveis
locadora.listarItensDisponiveis()

// Exibir detalhes de um item
jogo.exibirDetalhes()
```

## 🧩 Conceitos de POO Implementados

- **Encapsulamento**: Atributos privados com acesso via getters/setters
- **Herança**: `Jogo`, `Filme` e `Série` herdam de `ItemLocadora`
- **Polimorfismo**: Método `exibirDetalhes()` com comportamentos diferentes
- **Classe Abstrata**: `ItemLocadora` não pode ser instanciada diretamente
- **Interface**: `ItemFisico` implementada por itens com mídia física
- **Composição**: `Locadora` contém listas de clientes e itens

## 📝 Requisitos

- Kotlin 1.3+
- JVM 1.8+

## ▶️ Executando o Projeto

1. Clone o repositório
2. Importe o projeto na sua IDE favorita
3. Execute a função `main()` no arquivo principal

## 📄 Licença

Este projeto está licenciado sob a licença MIT.

---

Desenvolvido com ❤️ por [Seu Nome]
