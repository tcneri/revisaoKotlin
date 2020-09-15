package br.com.digitalhouse.exercicio2

class Item(var nItemFaturado: Int, var descricaoItem: String, var qtdItemComp: Int, var precoUnItem: Double) {

    init {
        when {
            qtdItemComp < 0 -> {
                qtdItemComp = 0
                println("Quantindade do item $descricaoItem foi reconfigurada para: $qtdItemComp")
                println(---------------------------------------------------------------------------------------->)
            }
            precoUnItem < 0 -> {
                precoUnItem = 0.0
                println("Preço Unitário do item $descricaoItem foi reconfigurado: $precoUnItem")
                println(---------------------------------------------------------------------------------------->)
            }
        }
    }
}