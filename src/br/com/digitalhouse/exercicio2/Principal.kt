package br.com.digitalhouse.exercicio2

fun main(){
    val item1 = Item(11,"sapato",- 8,55.0)
    val item2 = Item(22,"calça", 1,100.00)
    val item3 = Item(33, "mochila escolar", 2, 40.00)

    val listaItens = mutableListOf<Item> (item1, item2,item3)

    val fatura = Fatura(listaItens)

    println(fatura.getTotalFatura())
}