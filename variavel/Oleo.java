import java.util.Scanner;

public class Oleo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Insira o valor do raio da lata, em centimetros");
		double raio,pi=3.141592654,altura,volume;
		raio=sc.nextDouble();
		System.out.println("Insira a altura da lata, em centimetros");
		altura=sc.nextDouble();
		volume=pi*(raio*raio)*altura;
		System.out.printf("A Area he de %.2f cm³\n",volume);

	}
}
