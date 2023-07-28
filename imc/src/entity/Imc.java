package entity;

public class Imc {

	public String nome;
	public double peso;
	public double altura;
	
	public double imcUser() {
		return peso / (altura * altura);
		
	}
	
	public String toString() {
		return nome + ", o seu IMC é: " + String.format("%.2f", imcUser());
	}
}
