// Classe Jogo
class Jogo(
    idItem: Int,
    titulo: String,
    disponivel: Boolean,
    private var genero: String
) : ItemLocadora(idItem, titulo, disponivel), ItemFisico {

    // Getter e Setter específico
    fun getGenero(): String = genero
    fun setGenero(novoGenero: String) { genero = novoGenero }

    // Polimorfismo
    override fun exibirDetalhes() {
        println("""
            ID: ${this.getIdItem()}
            Título (Jogo): ${this.getTitulo()}
            Gênero: $genero
            Disponível: ${if (this.isDisponivel()) "Sim" else "Não"}
        """.trimIndent())
    }

    // Implementação da interface
    override fun verificarDisponibilidadeFisica(): Boolean {
        return this.isDisponivel()
    }
}