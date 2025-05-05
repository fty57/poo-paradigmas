class Cliente(
    private var idCliente: Int,
    private var nome: String,
    private var cpf: String,
    private var email: String
) {
    // Getters e Setters
    fun getIdCliente(): Int = idCliente
    fun getNome(): String = nome
    fun getCpf(): String = cpf
    fun getEmail(): String = email

    fun setIdCliente(id: Int) { idCliente = id }
    fun setNome(novoNome: String) { nome = novoNome }
    fun setCpf(novoCpf: String) { cpf = novoCpf }
    fun setEmail(novoEmail: String) { email = novoEmail }

    override fun toString(): String {
        return "Cliente $idCliente: $nome"
    }
}