import kotlin.math.PI
fun main() {

    println("========== HORA DE CODAR 1 ==========\n" +
            "Qual exercício deseja executar?\n" +
            "1 - Ex. Exibir valor 'Fusca'\n" +
            "2 - Ex. Exibir 'Olá, [nome_do_usuario]'\n" +
            "3 - Ex. Exibir 'Olá, [nome_do_usuario]. Sua idade é [idade]'\n" +
            "4 - Ex. Exibir Áreas de Figuras Planas\n" +
            "5 - Sair")
    var option = readlnOrNull()?.toInt()

    while (option != 5) {

        when (option) {

            1 -> {
                ex01()
                break
            }

            2 -> {
                ex02()
                break
            }

            3 -> {
                ex03()
                break
            }

            4 -> {
                ex04()
                break
            }

            5 -> {
                println("Encerrando programa...")
                break
            }
            else -> {
                println("Opção inválida! Tente novamente: ")
                option = readlnOrNull()?.toInt()
            }
        }
    }
}

fun ex01() {
    //Escreva um programa que crie uma variável chamada "nome_do_carro" e atribua-a um valor "Fusca". Exiba-a ao usuário.
    val carro : String = "Fusca"
    println(carro)

    main()
}

fun ex02() {
    //Escreva um programa em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]".
    println("Informe seu nome:")
    val nome = readLine()!!
    println("Olá, ${nome}.")

    main()
}

fun ex03() {
    //Escreva um programa em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário. Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".
    println("Informe seu nome:")
    val nome = readLine()!!
    println("Informe sua idade:")
    val idade = readLine()!!.toInt()

    println("Olá, ${nome}. Sua idade é ${idade}")

    main()

}

fun ex04() {
    //Considerando a figura abaixo, escreva um programa para cada forma que calcule e exiba em tela cada uma de suas respectivas áreas. O usuário irá informar os valores de cada variável.

    println("Qual área deseja calcular?\n" +
            "1 - Retângulo\n" +
            "2 - Quadrado\n" +
            "3 - Losango\n" +
            "4 - Trapézio\n" +
            "5 - Paralelograma\n" +
            "6 - Triângulo\n" +
            "7 - Círculo\n" +
            "8 - Voltar para o menu principal" +
            "9 - Sair")
    var option = readlnOrNull()?.toInt()

    while(option != 9) {

        when(option){
            1 -> {
                retangulo()
                break            }
            2 -> {
                quadarado()
                break
            }
            3 -> {
                losango()
                break
            }
            4 -> {
                trapezio()
                break
            }
            5 -> {
                paralelogramo()
                break
            }
            6 -> {
                triangulo()
                break
            }
            7 -> {
                circulo()
                break
            }
            8-> {
                println("Voltando para menu principal...")
                main()
                break
            }
            9 -> {
                println("Encerrando programa...")
            }
            else -> {
                println("Opção inválida! Tente novamente: ")
                option = readlnOrNull()?.toInt()
            }
        }
    }
}

fun retangulo () {
    println("Informe a base do retângulo:")
    val base : Int = readLine()!!.toInt()
    println("Informe a altura do retângulo:")
    val altura: Int = readLine()!!.toInt()

    val area = base * altura
    println("A área do retângulo é ${area}")

    ex04()
}
fun quadarado () {
    println("Informe o lado do quadrado:")
    val lado : Int = readLine()!!.toInt()

    val area = lado * lado
    println("A área do quadrado é ${area}")

    ex04()
}
fun losango () {
    println("Informe a diagonal maior do losango:")
    val diagMaior : Int = readLine()!!.toInt()
    println("Informe a diagonal menor do losango:")
    val diagMenor : Int = readLine()!!.toInt()

    val area = (diagMenor * diagMaior) / 2
    println("A área do losango é ${area}")

    ex04()
}
fun trapezio () {
    println("Informe a base maior do trapézio:")
    val baseMaior : Int = readLine()!!.toInt()
    println("Informe a base menor do trapézio:")
    val baseMenor : Int = readLine()!!.toInt()
    println("Informe a altura do trapézio:")
    val altura : Int = readLine()!!.toInt()

    val area = ((baseMaior + baseMenor) * altura) / 2
    println("A área do trapézio é ${area}")

    ex04()
}
fun paralelogramo () {
    println("Informe a base do paralelogramo:")
    val base : Int = readLine()!!.toInt()
    println("Informe a altura do paralelogramo:")
    val altura : Int = readLine()!!.toInt()

    val area = base * altura
    println("A área do paralelogramo é ${area}")

    ex04()

}
fun triangulo () {
    println("Informe a base do triângulo:")
    val base : Int = readLine()!!.toInt()
    println("Informe a altura do triângulo:")
    val altura : Int = readLine()!!.toInt()

    val area = (base * altura) / 2
    println("A área do triângulo é ${area}")

    ex04()
}
fun circulo () {
    println("Informe o raio do círculo:")
    val raio : Int = readLine()!!.toInt()

    val area = PI * raio.pow(2)
    println("A área do raio é ${area}")

    ex04()
}
