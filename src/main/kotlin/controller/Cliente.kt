package controller

class Cliente {
    fun clienteFactory(
        nome:String,
        idade:Byte,
        endereco:String,
        cpf:String,
        telefoneCelular:String
    ) = model.Cliente(
        nome = nome,
        idade = idade,
        endereco = endereco,
        cpf = cpf,
        telefoneCelular = telefoneCelular

    )
}