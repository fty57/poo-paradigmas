import ItemFisico
import ItemLocadora
import Jogo
import Filme
import Serie
import Cliente
import Locadora

fun main() {
    val locadora = Locadora("Locadora")
    locadora.setNomeLocadora("Locaí Raridades")

    // Adicionando clientes
    val cliente1 = Cliente(1, "João Oliveira", "123.456.789-00", "joao.oliveira@gmail.com")
    val cliente2 = Cliente(2, "Maria Souza", "987.654.321-00", "maria.souza@gmail.com")
    val cliente3 = Cliente(idCliente = 3, nome = "Silva Junior", "321.654.987-88", "silva.junior@gmail.com")

    locadora.adicionarCliente(cliente1)
    locadora.adicionarCliente(cliente2)
    locadora.adicionarCliente(cliente3)

    // Adicionando itens
    val jogo1 = Jogo(1, "The Last of Us Part II", true, "Ação/Aventura")
    val jogo2 = Jogo(2, "Frostpunk", true, "Civilização")
    val filme1 = Filme(3, "Interestelar", true, "12 anos")
    val filme2 = Filme(idItem = 4, "Matrix", disponivel = true, "14 anos")
    val serie1 = Serie(5, "Stranger Things", true, 4)
    val serie2 = Serie(idItem = 6, "Doctor Who", disponivel = true, qtdTemporadas = 12)

    locadora.adicionarItem(jogo1)
    locadora.adicionarItem(jogo2)
    locadora.adicionarItem(filme1)
    locadora.adicionarItem(filme2)
    locadora.adicionarItem(serie1)
    locadora.adicionarItem(serie2)

    // Listando itens disponíveis
     locadora.listarItensDisponiveis()

    // Alugando itens
    locadora.alugarItens(cliente1, listOf(jogo1, filme1, serie1))
    locadora.alugarItens(cliente2, listOf(jogo2, filme2))
    locadora.alugarItens(cliente3, listOf(serie2))
    locadora.alugarItens(cliente1,listOf(serie2))
    locadora.alugarItens(cliente2,listOf(serie1))

    // Listando locações
     locadora.listarLocacoes()

    // Devolvendo itens
    // locadora.devolverItens(cliente1, listOf(jogo1, filme1, serie1))
    // locadora.devolverItens(cliente2, listOf(jogo2, filme2))

    // Listando locações
    // locadora.listarLocacoes()

    // Tentando alugar item já alugado
    // locadora.alugarItens(cliente3, listOf(serie2))

    // Exibindo detalhes de um item
    /*
    jogo2.exibirDetalhes()
    filme1.exibirDetalhes()
    serie2.exibirDetalhes()
     */

}