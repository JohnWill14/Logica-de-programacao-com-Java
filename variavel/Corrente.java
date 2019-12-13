import java.util.Scanner;

public class Corrente{
	public static void main(String[] args) {
		Scanner sc;
		sc=new Scanner(System.in);
		double tensao , corrente,resistencia;
		System.out.println("Insira a resistencia e tensao, respectivamente: ");
		resistencia=sc.nextDouble();
		tensao=sc.nextDouble();
		corrente=tensao/resistencia;
		System.out.printf("Tensao he de %02.02f A\n",corrente);
	}
}