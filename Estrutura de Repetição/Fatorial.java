import java.util.Scanner;
public class Fatorial{
	public static void main(String[] args) {
		Scanner sc;
		sc=new Scanner(System.in);
		int num;
		System.out.println("Insira um numero para saber seu fatorial");
		num=sc.nextInt();
		int fat;
		fat=1;
		for(int i=1;i<=num;i++)fat*=i;
		System.out.println("O fat("+num+")="+fat);
	}
}