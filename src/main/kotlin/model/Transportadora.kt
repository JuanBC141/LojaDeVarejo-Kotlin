package model

class Transportadora {
    constructor(
        nome:String,
        cnpj:String
    )
    {
        this.nome = nome
        this.cnpj =cnpj
    }

    var nome:String? = null
        get() = if (field.isNullOrEmpty())"Transportadora não informada" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var cnpj:String? = null
        get() = if(field.isNullOrEmpty())"CNPJ não informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    override fun toString(): String {
        return "-----------------Dados da Transportadora-----------------" +
                "\n Nome: ${this.nome}" +
                "\n CNPJ: ${this.cnpj}"
    }
}