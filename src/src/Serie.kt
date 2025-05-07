class Serie(
    idItem: Int,
    titulo: String,
    disponivel: Boolean,
    private var qtdTemporadas: Int
) : ItemLocadora(idItem, titulo, disponivel) {

    fun getQtdTemporadas(): Int = qtdTemporadas
    fun setQtdTemporadas(novaQtd: Int) { qtdTemporadas = novaQtd }

    override fun exibirDetalhes() {
        println("""
            ID: ${this.getIdItemInfo()}
            Título (Série): ${this.getTitulo()}
            Temporadas: ${this.getQtdTemporadas()}
            Disponível: ${if (this.isDisponivel()) "Sim" else "Não"}
        """.trimIndent())
    }
}