import java.util.Scanner;

public class Tensao{
	public static void main(String[] args) {
		Scanner sc;
		sc=new Scanner(System.in);
		double tensao , corrente,resistencia;
		System.out.println("Insira a resistencia e corrente, respectivamente: ");
		resistencia=sc.nextDouble();
		corrente=sc.nextDouble();
		tensao=resistencia*corrente;
		System.out.printf("Tensao he de %02.02f V\n",tensao);
	}
}