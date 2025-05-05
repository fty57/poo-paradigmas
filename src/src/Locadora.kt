class Locadora(private var nomeLocadora: String) {
    private val listaClientes = mutableListOf<Cliente>()
    private val listaItens = mutableListOf<ItemLocadora>()
    private val locacoes = mutableMapOf<Cliente, MutableList<ItemLocadora>>()

    // Getters
    fun getNomeLocadora(): String = nomeLocadora
    fun getListaClientes(): List<Cliente> = listaClientes.toList()
    fun getListaItens(): List<ItemLocadora> = listaItens.toList()
    fun getLocacoes(): Map<Cliente, List<ItemLocadora>> = locacoes.toMap()

    // Setter para nome
    fun setNomeLocadora(novoNome: String) { nomeLocadora = novoNome }

    // Métodos para gerenciar clientes
    fun adicionarCliente(cliente: Cliente) {
        listaClientes.add(cliente)
    }

    fun removerCliente(cliente: Cliente) {
        listaClientes.remove(cliente)
        locacoes.remove(cliente)
    }

    // Métodos para gerenciar itens
    fun adicionarItem(item: ItemLocadora) {
        listaItens.add(item)
    }

    fun removerItem(item: ItemLocadora) {
        listaItens.remove(item)
        // Remove item de todas as locações
        locacoes.values.forEach { it.remove(item) }
    }

    // Método para alugar itens
    fun alugarItens(cliente: Cliente, itens: List<ItemLocadora>): Boolean {
        if (!listaClientes.contains(cliente)) {
            println("Cliente não cadastrado.")
            return false
        }

        val itensParaAlugar = mutableListOf<ItemLocadora>()
        val itensIndisponiveis = mutableListOf<ItemLocadora>()

        for (item in itens) {
            if (item.isDisponivel()) {
                itensParaAlugar.add(item)
            } else {
                itensIndisponiveis.add(item)
            }
        }

        if (itensIndisponiveis.isNotEmpty()) {
            println("Os seguintes itens não estão disponíveis:")
            itensIndisponiveis.forEach { println("- ${it.getTitulo()}") }
        }

        if (itensParaAlugar.isEmpty()) {
            return false
        }

        // Efetua o aluguel
        itensParaAlugar.forEach { item ->
            item.alugar()
            locacoes.getOrPut(cliente) { mutableListOf() }.add(item)
        }

        return true
    }

    // Método para devolver itens
    fun devolverItens(cliente: Cliente, itens: List<ItemLocadora>): Boolean {
        val itensCliente = locacoes[cliente] ?: return false

        val itensParaDevolver = mutableListOf<ItemLocadora>()

        for (item in itens) {
            if (itensCliente.contains(item)) {
                itensParaDevolver.add(item)
            }
        }

        if (itensParaDevolver.isEmpty()) {
            return false
        }

        itensParaDevolver.forEach { item ->
            item.devolver()
            itensCliente.remove(item)
        }

        if (itensCliente.isEmpty()) {
            locacoes.remove(cliente)
        }

        return true
    }

    // Método para listar locações
    fun listarLocacoes() {
        if (locacoes.isEmpty()) {
            println("Não há itens alugados no momento.")
            return
        }

        println("Locações ativas:")
        locacoes.forEach { (cliente, itens) ->
            println("$cliente:")
            itens.forEach { item ->
                println("- ${item.getTitulo()} (${item::class.simpleName})")
            }
        }
    }

    // Método para listar itens disponíveis
    fun listarItensDisponiveis() {
        val disponiveis = listaItens.filter { it.isDisponivel() }

        if (disponiveis.isEmpty()) {
            println("Não há itens disponíveis no momento.")
            return
        }

        println("Itens disponíveis para locação:")
        disponiveis.forEach { item ->
            item.exibirDetalhes()
            println()
        }
    }
}