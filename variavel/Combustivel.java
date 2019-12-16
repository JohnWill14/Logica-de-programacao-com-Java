import java.util.Scanner;
//Programa baseado no Exercicio 6 de variaveis

public class Combustivel{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double velocidade,tempo,distancia,litros;
		System.out.println("Velocidade percorrida");
		velocidade=sc.nextDouble();
		System.out.println("Tempo decorrido");
		tempo=sc.nextDouble();
		distancia=velocidade*tempo;
		litros=distancia/12.0;
		System.out.printf("Foram gastos %.2f litros de gasolina\n",litros);

	}
}
