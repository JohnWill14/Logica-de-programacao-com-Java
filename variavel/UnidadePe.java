import java.util.Scanner;
public class UnidadePe{
	public static void main(String[] args) {
		Scanner sc;
		sc=new Scanner(System.in);
		double pe,metros;
		System.out.println("Insira o valor em ft,pes:");
		pe=sc.nextDouble();
		metros=pe*0.3048;
		System.out.printf("%.2f pe he igual a %02.05f m\n",pe,metros);
	}
}