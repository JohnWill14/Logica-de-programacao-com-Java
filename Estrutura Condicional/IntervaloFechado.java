import java.util.Scanner;
public class IntervaloFechado{
	public static void main(String[] args) {
		Scanner sc;
		sc=new Scanner(System.in);
		int numero;
		numero=sc.nextInt();
		if(numero>=1&&numero<=9)System.out.println("Dentro do intervalo");
		else System.out.println("Fora do intervalo");
	}
}