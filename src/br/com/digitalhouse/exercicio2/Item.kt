package br.com.digitalhouse.exercicio2

class Item(var nItemFaturado: Int, var descricaoItem: String, var qtdItemComp: Int, var precoUnItem: Double) {

    init {
        when {
            qtdItemComp < 0 -> {
                qtdItemComp = 0
                println("Quantindade de item foi reconfigurada para: $qtdItemComp")
            }
            precoUnItem < 0 -> {
                precoUnItem = 0.0
                println("Preço Unitário de item foi reconfigurado: $precoUnItem")
            }
        }
    }
}