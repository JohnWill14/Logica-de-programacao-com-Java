import java.util.Scanner;
public class Dolar{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double dolar,reais,totalDeDolar;
		System.out.print("Insira o valor do dolar em reais:");
		dolar=sc.nextDouble();
		System.out.print("Insira a quantidade de dolares:");
		totalDeDolar=sc.nextDouble();
		reais=totalDeDolar*dolar;
		System.out.printf("US$ %.2f ira resultar em R$ %.2f\n",totalDeDolar,reais);
	}
}