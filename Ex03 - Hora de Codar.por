programa
{
	
	funcao inicio()
	{

		//EPS -> entrada - processamento - saída
	
		inteiro idade
		cadeia nome, resultado

		escreva("Qual seu nome?\n")
		leia(nome)
		escreva("Qual sua idade?\n")
		leia(idade)
		
		resultado = "Seu nome é " + nome + " e sua idade é " + idade + " anos.\n"

		escreva(resultado)

		se (idade >= 18){
			escreva("Você maior de idade\n")
		} senao {
			escreva("Você é menor de idade\n")
		}
		
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 429; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */