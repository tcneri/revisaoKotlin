package br.com.digitalhouse.exEscola

class Aluno(override val nome: String, override val sobrenome: String, override val registro: Int): Pessoa {
    fun assistirAula(){
            println("O aluno $nome $sobrenome está assistindo aula")
    }
    fun fazerLicao(){
        println("O aluno $nome $sobrenome está fazendo a lição de casa")
    }
}