import java.util.Scanner;
//Programa baseado no Exercicio 7 de variaveis
public class LerValores{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int x,y,troca;
		x=sc.nextInt();
		y=sc.nextInt();
		troca=x;
		x=y;
		y=troca;
		System.out.println("x="+x+" y="+y);

	}
}