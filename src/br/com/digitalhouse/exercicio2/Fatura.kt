package br.com.digitalhouse.exercicio2

class Fatura(var itens: MutableList<Item>) {

    fun getTotalFatura():Double{
        var totalFatura = 0.0

        for(){
            totalFatura += itens[i].qtdItemComp * itens[i].precoUnItem
        }

        return totalFatura
    }


}