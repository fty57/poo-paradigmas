abstract class ItemLocadora(
    protected var idItem: Int,
    private var titulo: String,
    private var disponivel: Boolean
) {
    abstract fun exibirDetalhes()

    fun getIdItemInfo(): Int = idItem
    fun getTitulo(): String = titulo
    fun isDisponivel(): Boolean = disponivel

    fun setIdItemInfo(id: Int) { idItem = id }
    fun setTitulo(novoTitulo: String) { titulo = novoTitulo }
    fun setDisponivel(disponibilidade: Boolean) { disponivel = disponibilidade }

    fun alugar(): Boolean {
        if (isDisponivel()) {
            setDisponivel(false)
            return true
        }
        return false
    }

    fun devolver() {
        setDisponivel(true)
    }
}