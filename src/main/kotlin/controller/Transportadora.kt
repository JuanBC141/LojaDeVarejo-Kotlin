package controller

class Transportadora {
    fun transportadoraFactory(
        nome:String,
        cnpj:String
    ) = model.Transportadora(
        nome = nome,
        cnpj = cnpj
    )
}