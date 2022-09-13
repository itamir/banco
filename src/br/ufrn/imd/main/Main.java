package br.ufrn.imd.main;

import java.util.Scanner;

import br.ufrn.imd.dominio.Cliente;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			while (true) {
				System.out
						.println("Digite a opção desejada: \n" 
						+ "1 - novo cliente \n" + "9 - opções \n" + "0 - Sair");
				int opcao = Integer.parseInt(sc.nextLine());
				switch (opcao) {
				case 1:
					System.out.println("Digite o nome do Cliente:");
					String nome = sc.nextLine();
					Cliente c = new Cliente();
					c.setNome(nome);
					break;
				case 0:
					System.exit(0);
				}

			}
		} finally {
			sc.close();
		}
	}
}
