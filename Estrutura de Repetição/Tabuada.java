import java.util.Scanner;
public class Tabuada{
	public static void main(String[] args) {
		Scanner sc;
		sc=new Scanner(System.in);
		System.out.println("Insira um numero: ");
		int numero;
		numero=sc.nextInt();
		System.out.println("\tTabuada de "+numero);
		for(int i=1;i<=10;i++){
			System.out.println("\t"+i+" x "+numero+" = "+(numero*i));
		}
	}
}