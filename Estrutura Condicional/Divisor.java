import java.util.Scanner;
public class Divisor{
	public static void main(String args[]){
		Scanner sc;
		sc=new Scanner(System.in);
		int numeros[];
		numeros=new int[5];
		for(int i=0;i<5;i++)numeros[i]=sc.nextInt();
		for(int i:numeros){
			if(i%2==0&&i%3==0)System.out.println(i);
		}
	}
}