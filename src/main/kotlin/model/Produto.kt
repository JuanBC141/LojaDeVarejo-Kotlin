package model

class Produto{

    constructor(
        id:String,
        marca:String,
        preco:Double,
        peso:Double,
        tamanho:Double,
        quantidade:Short
    )
    {
        this.id = id
        this.marca = marca
        this.preco = preco
        this.peso = peso
        this.tamanho = tamanho
        this.quantidade = quantidade
    }

    var id:String? = null
        get() = if (field.isNullOrEmpty()) "ID não informado" else field
        set(value) {
            field = if (value!!.length >10) null else value
        }
    var marca:String? = null
        get() = if (field.isNullOrEmpty()) "Marca não informada" else field
        set(value) {
            field = if(value.isNullOrEmpty()) null else value
        }
    var preco:Double? = null
        set(value) {
            field = if (value!! <00.00) null else value
        }

    var peso:Double? = null
        set(value){
            field = if (value!! <0) null else value
        }
    var tamanho:Double? = null
        set(value) {
            field = if(value!! <90.00 ) null else value
        }
    var quantidade:Short? = null
        set(value) {
            field = if(value!! <=0 || value!! >=100) null else value
        }

    override fun toString(): String {
        return "\n-----------------Dados do Produto-----------------" +
                "\n ID: ${this.id}" +
                "\n Marca: ${this.marca}" +
                "\n Preço: ${this.preco}" +
                "\n Peso: ${this.peso}" +
                "\n Tamanho: ${this.tamanho}" +
                "\n Quantidade: ${this.quantidade}"
    }
}