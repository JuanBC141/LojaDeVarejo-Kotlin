package model

class Venda{
    constructor(
        valUnitario: Double,
        cartaoDeCredito: String,
        cpf:String,
        endereco:String
    )
    {
        this.valUnitario = valUnitario
        this.cartaoDeCredito = cartaoDeCredito
        this.cpf = cpf
        this.endereco = endereco
    }


    var valUnitario:Double? = null
        set(value) {
            field = if(value!! <=00.00) null else value
        }
    var cartaoDeCredito:String? = null
        get() = if (field.isNullOrEmpty())"Cartão de credito não informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }


    var cpf:String? = null
        get() = if (field.isNullOrEmpty())"CPF não informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }
    var endereco:String? = null
        get() = if (field.isNullOrEmpty())"Endereço não informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    override fun toString(): String {
        return "-----------------Dados da Venda-----------------" +
                "\n Valor Unitario: ${this.valUnitario}" +
                "\n Informações do Cartão de Crédito: ${this.cartaoDeCredito}" +
                "\n CPF: ${this.cpf}" +
                "\n Endereço: ${this.endereco}"
    }
}