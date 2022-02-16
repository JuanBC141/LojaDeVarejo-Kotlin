package view

import model.Cliente

fun main() {
    val clientController = controller.Cliente()
    val clienteUm = clientController.clienteFactory(
        "Jorge",
        19,
        "Assis Brasil 1223",
        "123123123",
        "231312311"
    )


    val fornecedorController = controller.Fornecedor()
    val fornecedorUm = fornecedorController.fornecedorFactory(
        "Marquinhos Vendas",
        "123123123123"
    )

    val produtoController = controller.Produto()
    val produtoUm = produtoController.produtoFactory(
        "123123123",
        "Joca",
        12.22,
        30.33,
        130.22,
        2
    )

    val transportadoraController = controller.Transportadora()
    val transportadoraUm = transportadoraController.transportadoraFactory(
        "JãoTRANS",
        "123123123123"
    )

    val vendaController = controller.Venda()
    val vendaUm = vendaController.vendaFactory(
        16.99,
        "Master card 12312312 123124124",
        "12312312312",
        "Tchurusbangos Tchurusbagos"
    )

    val vendedorController = controller.Vendedor()
    val vendedorUm = vendedorController.vendedorFactory(
        "Veralcio",
        "veralcio69@gmail.com",
        "123123123",
        "121212313",
        "94847839483"
    )

    println(clienteUm)
    println(fornecedorUm)
    println(produtoUm)
    println(transportadoraUm)
    println(vendaUm)
    println(vendedorUm)
}