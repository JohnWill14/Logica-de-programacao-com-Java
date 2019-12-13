import java.util.Scanner;
public class Esfera{
	public static void main(String[] args) {
		Scanner sc;
		sc=new Scanner(System.in);
		double raio,volume,pi=3.141592654;
		System.out.print("Insira o raio, em metros: ");
		raio=sc.nextDouble();
		volume=(4/3.0)*pi*(raio*raio*raio);
		System.out.printf("O volume da esfera he de %.3f m³\n",volume);
	}
}