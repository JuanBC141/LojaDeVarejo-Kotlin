package model

class Fornecedor{
    constructor(
        nome:String,
        cnpj:String
    )
    {
        this.nome = nome
        this.cnpj = cnpj
    }
    var nome:String? = null
        get() = if(field.isNullOrEmpty())"Nome não informado" else field
        set(value) {
            field = if (value.isNullOrEmpty())null else value
        }
    var cnpj:String? = null
        get() = if (field.isNullOrEmpty())"CNPJ não informado" else field
        set(value) {
            field = if (value!!.length >14) null else value
        }

    override fun toString(): String {
        return "\n-----------------Dados do Fornecedor-----------------" +
                "\n Nome: ${this.nome}" +
                "\n CNPJ: ${this.cnpj}"
    }
}