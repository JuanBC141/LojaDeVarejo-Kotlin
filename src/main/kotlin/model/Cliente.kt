package model

class Cliente {
    constructor(
        nome:String,
        idade: Byte,
        endereco:String,
        cpf:String,
        telefoneCelular:String
    )
    {
        this.nome = nome
        this.idade = idade
        this.endereco = endereco
        this.cpf = cpf
        this.telefoneCelular = telefoneCelular
    }
    var nome:String? = null
        get() = if (field.isNullOrEmpty()) " Nome não informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var idade:Byte? = null
        set(value){
            field = if(value!! <=0 || value!! >100) null else value
        }

    var endereco:String? = null
        get() = if (field.isNullOrEmpty())"Endereço não informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var cpf:String? = null
        get() = if (field.isNullOrEmpty())"CPF não informado" else field
        set(value) {
            field = if (value!!.length >11) null else value
        }

    var telefoneCelular:String? = null
        get() = if (field.isNullOrEmpty()) "Número de Telefone não informado" else field
        set(value) {
            field = if (value!!.length >= 12) null else value
        }

    override fun toString(): String {
        return "\n -----------------Dados do Cliente-----------------" +
                "\n Nome: ${this.nome}" +
                "\n Idade: ${this.idade}" +
                "\n Endereço: ${this.endereco}" +
                "\n CPF: ${this.cpf}" +
                "\n Telefone Celular: ${this.telefoneCelular}"
    }
}