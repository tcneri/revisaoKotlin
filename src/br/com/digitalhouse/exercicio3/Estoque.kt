package br.com.digitalhouse.exercicio3

class Estoque(var nome: String, var qtdAtual: Int, var qtdMinima: Int) {
    fun mudarNome(novoNome: String){
        nome = novoNome
        println("Nome alterado para: $nome")
    }

    fun mudarQtdMinima(qtd: Int){
        when{
            qtd >= 0 -> {
                qtdMinima = qtd
                println("Quantidade mínima alterada para $qtdMinima")
            }
        }
    }

    fun repor(qtd: Int){
        qtdAtual += qtd
        println("Quantidade atual: $qtdAtual")
    }

    fun darBaixa(qtd: Int){
        if(qtd <= qtdAtual)
            qtdAtual -= qtd
        println("Quantidade atual: $qtdAtual")
    }

    fun mostra(): String{
        return "O produto $nome possui como quantidade mínima $qtdMinima unidades e atualmente tem-se $qtdAtual unidades em estoque."
    }

    fun precisaRepor(): Boolean {
        return qtdAtual <= qtdMinima
    }
}