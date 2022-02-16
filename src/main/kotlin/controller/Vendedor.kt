package controller

class Vendedor {
    fun vendedorFactory(
        nome:String,
        email:String,
        cpf:String,
        rg:String,
        telefoneParaContato:String
    ) = model.Vendedor(
        nome = nome,
        email = email,
        cpf = cpf,
        rg = rg,
        telefoneParaContato = telefoneParaContato
    )
}