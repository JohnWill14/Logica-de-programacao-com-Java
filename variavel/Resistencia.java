import java.util.Scanner;

public class Resistencia{
	public static void main(String[] args) {
		Scanner sc;
		sc=new Scanner(System.in);
		double tensao , corrente,resistencia;
		System.out.println("Insira a tensao e corrente, respectivamente: ");
		tensao=sc.nextDouble();
		corrente=sc.nextDouble();
		resistencia=tensao/corrente;
		System.out.printf("Resistencia he de %02.02f Ω\n",resistencia);
	}
}