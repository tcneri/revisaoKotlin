package br.com.digitalhouse.exFatura

fun main(){
    val item1 = Item(11,"sapato",-1,55.0)
    val item2 = Item(22,"calça", 1,100.00)
    val item3 = Item(33, "mochila escolar", 2, 40.00)

<<<<<<< HEAD:src/br/com/digitalhouse/exFatura/Principal.kt
    val listaItens = mutableListOf<Item> (item1, item2, item3)
=======
    val listaItens = mutableListOf<Item> (item1, item2,item3)
>>>>>>> af2f3d2ed79e041bbfa9e9890f7a2622245c5bc4:src/br/com/digitalhouse/exercicio2/Principal.kt

    val fatura = Fatura(listaItens)

    println(fatura.getTotalFatura())
}