class Serie(
    idItem: Int,
    titulo: String,
    disponivel: Boolean,
    private var qtdTemporadas: Int
) : ItemLocadora(idItem, titulo, disponivel) {

    // Getter e Setter específico
    fun getQtdTemporadas(): Int = qtdTemporadas
    fun setQtdTemporadas(novaQtd: Int) { qtdTemporadas = novaQtd }

    // Polimorfismo
    override fun exibirDetalhes() {
        println("""
            ID: ${this.getIdItem()}
            Título (Série): ${this.getTitulo()}
            Temporadas: $qtdTemporadas
            Disponível: ${if (this.isDisponivel()) "Sim" else "Não"}
        """.trimIndent())
    }
}