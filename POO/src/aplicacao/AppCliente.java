package aplicacao;

import java.util.Scanner;

import classes.Cliente;
import repositorio.RepoCliente;

public class AppCliente {

	public static void main(String[] args) {
	
	Scanner tela = new Scanner(System.in);	
	Cliente cli = null;
	RepoCliente rc = new RepoCliente();
	
	
	String resposta = "";
	
	while(!resposta.equals  ("n")) {
		 cli = new Cliente();
	
	
	
	System.out.println("Digite o nome do cliente");
	
	cli.nome = tela.next();
	System.out.println("Digite o email do cliente");
	cli.email = tela.next();
	System.out.println("Digite o cpf do cliente");
	cli.cpf = tela.next();
	rc.cadastrar(cli);
	
	System.out.println("\nVoc� deseja cadastrar outro cliente? Digine n para n�o e s para sim ");
	resposta = tela.next();
	
	}
	
	System.out.println("----------------------Clientes cadastrados---------------------");
	rc.listar();
	System.out.println("----------------------Clientes atualizado---------------------");
	Cliente cli2 = new Cliente();
	cli2.nome = "Bruno";
	cli2.email = "bruno@uol.com.br";
	cli2.cpf = "44567676567";
	rc.atualizar(cli2);
	rc.listar();
	
	System.out.println("----------------------Clientes cliente deletado---------------------");
	rc.deletar("Maria");
	rc.listar();

	}

}
