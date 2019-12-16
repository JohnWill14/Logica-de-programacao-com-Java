import java.util.Scanner;

//Programa baseado no Exercicio 3 de variaveis
public class Conversor{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Insira a temperatura em farenheit: ");
		double farenheit;
		farenheit=sc.nextDouble();
		double celsios;
		celsios=((farenheit-32)*5)/9.0;
		System.out.printf("Temperatura em Celsios he : %.2f°\n",celsios);
	}
}