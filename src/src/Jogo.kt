// Classe Jogo
class Jogo(
    idItem: Int,
    titulo: String,
    disponivel: Boolean,
    private var genero: String
) : ItemLocadora(idItem, titulo, disponivel), ItemFisico {

    fun getGenero(): String = genero
    fun setGenero(novoGenero: String) { genero = novoGenero }

    // Polimorfismo
    override fun exibirDetalhes() {
        println("""
            ID: ${this.getIdItem()}
            Título (Jogo): ${this.getTitulo()}
            Gênero: ${this.getGenero()}
            Disponível: ${if (this.isDisponivel()) "Sim" else "Não"}
        """.trimIndent())
    }

    override fun podeSerAlugadoFisicamente(): Boolean {
        return this.isDisponivel()
    }
}