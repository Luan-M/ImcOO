package application;

import java.util.Locale;
import java.util.Scanner;

import entity.Imc;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Imc calculoImc = new Imc();
		
		System.out.print("Digite o seu nome: ");
		calculoImc.nome = sc.nextLine();
		System.out.print("Digite o seu peso: ");
		calculoImc.peso = sc.nextDouble();
		System.out.print("Digite a sua altura: ");
		calculoImc.altura = sc.nextDouble();
		
		System.out.println();
		
		System.out.println(calculoImc);
		
		sc.close();
	}
}
