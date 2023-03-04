package Agencia;

import java.util.Scanner;

public class ControleDeVendas {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Clientes clientesY02 = new Clientes();
		
		//Posso criar uma variável para escolha e atribuir nextline. Utilizar if e depois o for dentro do if para prosseguir
		
		//Cadastro de pessoas
		
		for(int x = 0; x < clientesY02.getCadastro().length; x++) {
			System.out.println("Digite o nome do cliente!");
			clientesY02.getCadastro()[x][0] = in.nextLine();
			System.out.println("Digite o cpf do cliente!");
			clientesY02.getCadastro()[x][1] = in.nextLine();
			System.out.println("Digite o telefone do cliente!");
			clientesY02.getCadastro()[x][2] = in.nextLine();
		}
		
		Carro carrosY02 = new Carro();
		
		//Cadastro de carros
		
		for(int x = 0; x < carrosY02.getCarrosCadastros().length; x++) {
			System.out.println("Digite o fabricante do veículo");
			carrosY02.getCarrosCadastros()[x][0] = in.nextLine();
			System.out.println("Digite o modelo do veículo");
			carrosY02.getCarrosCadastros()[x][1] = in.nextLine();
			System.out.println("Digite o valor do veículo");
			carrosY02.getCarrosCadastros()[x][2] = in.nextLine();
			
		}
		
		//Atribuindo as lasses carros e clientes à Concessionária.
		
		Concessionarias y02 = new Concessionarias();
		y02.setNomeDaEmpresa ("Y 02");
		y02.carros = carrosY02;
		y02.cliente = clientesY02;
		
		
		System.out.println("Relação de Veículos da concessionária" + y02.getNomeDaEmpresa());
		for(int x = 0; x < y02.carros.getCarrosCadastros().length; x++) {
			System.out.println("Veículo: " + (x + 1));
			for(int y = 0; y < 3; y++) {
				System.out.println(y02.carros.getCarrosCadastros()[x][y]);
			}
		System.out.println();	
		}
		
		System.out.println("Relação de clientes da concessionária: " + y02.getNomeDaEmpresa());
		for(int x = 0; x < y02.cliente.getCadastro().length; x++) {
			
			System.out.println("Cliente N " + (x + 1));
			for(int y = 0; y < 3; y++) {
				System.out.println(y02.cliente.getCadastro()[x][y]);
			}
			System.out.println();
		}
				
		System.out.println("Digite o seu CPF");
		String cpf = in.nextLine();
		
		for(int x = 0; x < y02.cliente.getCadastro().length; x++) {
			if(y02.cliente.getCadastro()[x][1].equals(cpf)) {
				System.out.println("Cliente: " +  y02.cliente.getCadastro()[x][0]);
				System.out.println("CPF: " +  y02.cliente.getCadastro()[x][1]);
				System.out.println("Telefone: " +  y02.cliente.getCadastro()[x][2]);
			}else {
				System.out.println("CPF não encontrado!");
			}
		}
		
		System.out.println("Digite o modelo do veículo");
		String modelo = in.nextLine();
		
		for(int x = 0; x < y02.carros.getCarrosCadastros().length; x++) {
			if(y02.carros.getCarrosCadastros()[x][1].equals(modelo)) {
				System.out.println("Adquiriu o modelo: " + y02.carros.getCarrosCadastros()[x][1]);
				System.out.println("Do fabricante: " + y02.carros.getCarrosCadastros()[x][0]);
				System.out.println("Valor: " + y02.carros.getCarrosCadastros()[x][2]);
			}else {
				System.out.println("Modelo não encontrado!");
			}
		}
	}

}

