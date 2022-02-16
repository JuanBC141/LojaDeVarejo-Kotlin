package controller

class Produto {
    fun produtoFactory(
        id:String,
        marca:String,
        preco:Double,
        peso:Double,
        tamanho:Double,
        quantidade:Short
    ) = model.Produto(
        id = id,
        marca = marca,
        preco = preco,
        peso = peso,
        tamanho = tamanho,
        quantidade = quantidade
    )
}