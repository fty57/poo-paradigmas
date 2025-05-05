class Filme(
    idItem: Int,
    titulo: String,
    disponivel: Boolean,
    private var classificacao: String
) : ItemLocadora(idItem, titulo, disponivel), ItemFisico {

    // Getter e Setter específico
    fun getClassificacao(): String = classificacao
    fun setClassificacao(novaClassificacao: String) { classificacao = novaClassificacao }

    // Polimorfismo
    override fun exibirDetalhes() {
        println("""
            ID: ${this.getIdItem()}
            Título (Filme): ${this.getTitulo()}
            Classificação: $classificacao
            Disponível: ${if (this.isDisponivel()) "Sim" else "Não"}
        """.trimIndent())
    }

    // Implementação da interface
    override fun verificarDisponibilidadeFisica(): Boolean {
        return this.isDisponivel()
    }
}