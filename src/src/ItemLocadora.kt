abstract class ItemLocadora(
    private var idItem: Int,
    private var titulo: String,
    private var disponivel: Boolean
) {
    // Método abstrato para polimorfismo
    abstract fun exibirDetalhes()

    // Getters e Setters
    fun getIdItem(): Int = idItem
    fun getTitulo(): String = titulo
    fun isDisponivel(): Boolean = disponivel

    fun setIdItem(id: Int) { idItem = id }
    fun setTitulo(novoTitulo: String) { titulo = novoTitulo }
    fun setDisponivel(disponibilidade: Boolean) { disponivel = disponibilidade }

    fun alugar(): Boolean {
        if (disponivel) {
            disponivel = false
            return true
        }
        return false
    }

    fun devolver() {
        disponivel = true
    }
}