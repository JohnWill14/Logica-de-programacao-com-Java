import java.util.Scanner;
//Programa baseado no Exercicio 15 de variaveis
public class Projetil{
	public static void main(String[] args) {
		Scanner sc; 
		sc=new Scanner(System.in);
		double distancia,tempo,velocidade;
		System.out.println("Insira a distancia, em metros, e o tempo, em segundos, respectivamente");
		distancia=sc.nextDouble();
		tempo=sc.nextDouble();
		velocidade=distancia/tempo;
		System.out.printf("A velocidade do projetil he de %.2f m/s\n",velocidade);
	}
}