import java.util.Scanner;
public class Trinta{
	public static void main(String[] args) {
		Scanner sc;
		sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		if(n>=15)System.out.println("O numero he "+(n*2));
		else System.out.println("Numero nao pode ser exibido");
	}
}