programa
{
	
	funcao inicio()
	{

		inteiro base, altura, lado, diagMaior, diagMenor, baseMaior, baseMenor
		inteiro esc
		real resultado, raio
		

		escreva("Qual área deseja calcular?\n" +
				"Digite 1 para calcular RETÂNGULO\n" +
				"Digite 2 para calcular QUADRADO\n" +
				"Digite 3 para calcular LOSANGO\n" +
				"Digite 4 para calcular TRAPÉZIO\n" + 
				"Digite 5 para calcular PARALELOGRAMO\n" +
				"Digite 6 para calcular TRIÂNGULO\n" + 
				"Digite 7 para calcular CÍRCULO\n")
		leia(esc)
		
		escolha (esc){
			caso 1:
			//retângulo
				escreva("Informe a base do retângulo: ")
				leia(base)
				escreva("Informe a altura do retângulo: ")
				leia(altura)

				resultado = base * altura
				escreva("A área do retângulo é " + resultado)
				
				pare

			caso 2:
			//quadrado
				escreva("Informe o lado do quadrado: ")
				leia(lado)

				resultado = lado * lado
				escreva("A área do quadrado é " + resultado)

				pare
				
			caso 3:
			//losango
				escreva("Informe a diagonal maior: ")
				leia(diagMaior)
				escreva("Informe a diagonal menor: ")
				leia(diagMenor)

				resultado = (diagMaior * diagMenor) / 2
				escreva("A área do losango é " + resultado)

				pare
				
			caso 4:
			//trapézio
				escreva("Informa a base maior: ")
				leia(baseMaior)
				escreva("Informa a base menor: ")
				leia(baseMenor)
				escreva("Informa a altura: ")
				leia(altura)

				resultado = ((baseMaior + baseMenor) * altura) / 2
				escreva("A área do trapézio é " + resultado)

				pare

			caso 5:
			//paralelogramo
				escreva("Informe a base do paralelogramo: ")
				leia(base)
				escreva("Informe a altura do paralelogramo: ")
				leia(altura)

				resultado = base * altura
				escreva("A área do paralelogramo é " + resultado)

				pare

			caso 6:
			//triângulo
				escreva("Informa a base do triângulo: ")
				leia(base)
				escreva("Informa a altura do triângulo: ")
				leia(altura)

				resultado = (base * altura) / 2
				escreva("A área do triângulo é " + resultado)

				pare

			caso 7:
			//círculo
				escreva("Informa o raio do círculo: ")
				leia(raio)

				resultado = 3.14159 * (raio * raio)
				escreva("A área do círculo é " + resultado)
				
				pare
				
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2086; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
