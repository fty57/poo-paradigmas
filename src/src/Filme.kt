class Filme(
    idItem: Int,
    titulo: String,
    disponivel: Boolean,
    private var classificacao: String
) : ItemLocadora(idItem, titulo, disponivel), ItemFisico {

    fun getClassificacao(): String = classificacao
    fun setClassificacao(novaClassificacao: String) { classificacao = novaClassificacao }

    override fun exibirDetalhes() {
        println("""
            ID: ${this.getIdItemInfo()}
            Título (Filme): ${this.getTitulo()}
            Classificação: ${this.getClassificacao()}
            Disponível: ${if (this.isDisponivel()) "Sim" else "Não"}
        """.trimIndent())
    }

    override fun podeSerAlugadoFisicamente(): Boolean {
        return this.isDisponivel()
    }
}