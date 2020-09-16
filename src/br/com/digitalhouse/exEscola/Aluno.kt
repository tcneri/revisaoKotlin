package exercicio1



class Aluno(override var nome: String, override var sobrenome:String, override var registroAcademico: Int) : Discente{

    fun assistirAula(){
        println("O aluno $nome $sobrenome está assistindo aula")
    }

    fun fazerlicao(){
        println("O aluno $nome $sobrenome está fazendo a lição de casa")
    }
}


