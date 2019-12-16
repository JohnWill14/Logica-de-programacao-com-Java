import java.util.Scanner;

//Programa baseado no Exercicio 1 de variaveis
public class AreaCirculo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double raio=sc.nextDouble(),pi= 3.141592654;
		double area=pi*raio*raio;
		System.out.printf("%.3fu² area do circulo\n",area);
	}
}