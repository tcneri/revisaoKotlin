package br.com.digitalHouse.controleEstoque

class Estoque(var nome: String = "", var qtdAtual: Int = 0, var qtdMinima: Int = 0) {
    init{
        when(qtdAtual < 0){
            true -> qtdAtual = 0
        }

        when(qtdMinima < 0){
            true -> qtdMinima = 0
        }
    }

    fun mudarNome(novoNome: String){
        nome = novoNome
        println("Nome: $nome")
    }

    fun mudarQtdMinima(novaQtdMinima: Int){
        if (novaQtdMinima >= 0)
            qtdMinima = novaQtdMinima
        println("Quantidade mínima: $qtdMinima")
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