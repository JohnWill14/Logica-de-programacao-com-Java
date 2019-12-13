import java.util.Scanner;
public class Reais{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double dolar,reais,totalDeDolar;
		System.out.print("Insira o valor do dolar em reais:");
		dolar=sc.nextDouble();
		System.out.print("Insira a quantidade de reais:");
		reais=sc.nextDouble();
		totalDeDolar=reais/dolar;
		System.out.printf("R$ %.2f ira resultar em US$ %.2f\n",reais,totalDeDolar);
	}
}