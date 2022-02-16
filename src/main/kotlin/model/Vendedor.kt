package model

class Vendedor{
    constructor(
        nome:String,
        email:String,
        cpf:String,
        rg:String,
        telefoneParaContato:String
    )
    {
        this.nome = nome
        this.email = email
        this.cpf = cpf
        this.rg = rg
        this.telefoneParaContato = telefoneParaContato
    }


    var nome:String? = null
        get() = if (field.isNullOrEmpty()) "O Nome não foi informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }
    var email:String? = null
        get() = if (field.isNullOrEmpty()) "O email não foi informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }
    var cpf:String? = null
        get() = if (field.isNullOrEmpty())"CPF não informado" else field
        set(value) {
            field = if(value!!.length >11) null else value
        }
    var rg:String? = null
        get() = if (field.isNullOrEmpty()) "RG não informado" else field
        set(value) {
            field = if (value!!.length>13)null else value
        }
    var telefoneParaContato:String? = null
        get() = if (field.isNullOrEmpty()) "Número de Telefone não informado" else field
        set(value) {
            field = if(value!!.length >=12) null else value
        }

    override fun toString(): String {
        return "-----------------Dados do Vendedor-----------------" +
                "\n Nome: ${this.nome}" +
                "\n Email: ${this.email}" +
                "\n CPF: ${this.cpf}" +
                "\n RG: ${this.rg}" +
                "\n Telefone Para Contato: ${this.telefoneParaContato}"
    }
}