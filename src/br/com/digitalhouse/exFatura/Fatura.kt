package br.com.digitalhouse.exFatura

class Fatura(var itens: MutableList<Item>) {

    fun getTotalFatura():Double{
        var totalFatura = 0.0

        itens.forEach(){
            totalFatura += it.qtdItemComp* it.precoUnItem
            println("Compra do item: ${it.descricaoItem}, valor unitário: ${it.precoUnItem}, quantidade: ${it.qtdItemComp} ")
        }

        return totalFatura
    }

}