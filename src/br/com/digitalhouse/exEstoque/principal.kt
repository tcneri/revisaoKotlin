package br.com.digitalhouse.exEstoque

fun main(){
    val estoque1 = Estoque("café",20,5)

    estoque1.mostra()
    estoque1.mudarNome("feijao")
    estoque1.darBaixa(5)
    println(estoque1.precisaRepor())
    estoque1.repor(10)
    estoque1.mudarQtdMinima(2)
}

