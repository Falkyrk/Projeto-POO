package atividades.livro;
import java.util.Scanner;//programa utiliza a classe Scanner

public class pag36 {
	//m�todo main inicia a execu��o do aplicativo Java
	public static void main(String[] args) {
		
		//cria um Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		int number1; //primeiro n�mero a somar
		int number2; //segundo numero a somar
		int sum; //soma de number1 e number2
		
		System.out.print("Enter first integer"); //prompt"
		number1  = input.nextInt(); //l� primeiro o numero fornecido pelo usu�rio
		
		System.out.print("Enter second integer"); //prompt
		number2 = input.nextInt(); //l� o segundo n�mero fornecido pelo usu�rio
		
		sum = number1 + number2; //soma os n�meros, depois amazena o total em sum
		
		System.out.printf("Sum is %d%n",sum); //exibe a soma

	} //fim do metodo main

} // fim da clase Addition
