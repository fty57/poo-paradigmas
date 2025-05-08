class Cliente(
    private var idCliente: Int,
    private var nome: String,
    private var cpf: String,
    private var email: String
) {

    fun getCpf(): String {
        return cpf
    }

    fun setCpf(valor: String) {
        if (valor.length == 11 && valor.all { it.isDigit() }) {
            cpf = valor
        } else {
            throw IllegalArgumentException("CPF inválido! Deve ter 11 dígitos.")
        }
    }

    fun getIdCliente(): Int = idCliente
    fun getNome(): String = nome
    fun getEmail(): String = email

    fun setIdCliente(id: Int) { idCliente = id }
    fun setNome(novoNome: String) { nome = novoNome }
    fun setEmail(novoEmail: String) { email = novoEmail }

    override fun toString(): String {
        return "Cliente $idCliente: $nome"
    }
}
