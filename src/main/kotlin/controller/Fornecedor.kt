package controller

class Fornecedor {
    fun fornecedorFactory(
        nome:String,
        cnpj: String
    ) = model.Fornecedor(
        nome = nome,
        cnpj = cnpj
    )
}