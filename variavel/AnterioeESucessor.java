import java.util.Scanner;
public class AnterioeESucessor{
	public static void main(String[] args) {
		Scanner sc;
		sc=new Scanner(System.in);
		int numero;
		numero=sc.nextInt();
		System.out.println("Antecessor de "+numero+" : "+(numero-1)+"\nsucessor de "+numero
			+" : "+(numero+1));
	}
}