package controller

class Venda {
    fun vendaFactory(
        valUnitario: Double,
        cartaoDeCredito: String,
        cpf:String,
        endereco:String
    ) = model.Venda(
        valUnitario = valUnitario,
        cartaoDeCredito = cartaoDeCredito,
        cpf = cpf,
        endereco = endereco,
    )
}