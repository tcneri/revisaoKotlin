package br.com.digitalhouse.exEscola

fun main(){
    val m1 = Materia("Orientação a Objeto")
    val m2 = Materia("Introdução ao Kotlin")
    val m3 = Materia("Orientação a Objeto em Kotlin")

    val a1 = Aula(m1,"14h00","17h30")
    val a2 = Aula(m2,"14h00","17h30")
    val a3 = Aula(m3,"14h00","17h30")
    val listaAula = mutableListOf<Aula>(a1,a2,a3)

    val estudante1 = Aluno("Douglas","Costa",1)
    val estudante2 = Aluno("Leonardo","Bonacini",2)
    val estudante3 = Aluno("Leonardo","Carvalho",3)
    val estudante4 = Aluno("Luis","Gustavo",4)
    val estudante5 = Aluno("Thalita","Neri",5)
    val listaAluno = mutableListOf<Aluno>(estudante1,estudante2,estudante3,estudante4,estudante5)

    val professor = Professor("Jéssica","Corrêa",1)

    val curso = Curso("Desenvolvimento Android",listaAula, listaAluno, professor)

    val turma = Turma("Santander Coders",curso)

    professor.darAula(curso)
    professor.fazerChamada(curso)

    estudante1.assistirAula()
    estudante1.fazerLicao()

    estudante2.assistirAula()
    estudante2.fazerLicao()

    estudante3.assistirAula()
    estudante3.fazerLicao()

    estudante4.assistirAula()
    estudante4.fazerLicao()

    estudante5.assistirAula()
    estudante5.fazerLicao()
}