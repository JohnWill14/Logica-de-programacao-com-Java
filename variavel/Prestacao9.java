import java.util.Scanner;
public class Prestacao9{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double valor,taxa,tempo,prestacao;
		System.out.println("Insira o valor da prestacao a taxa e o tempo de atraso");
		valor=sc.nextDouble();
		taxa=sc.nextDouble();
		tempo=sc.nextDouble();
		prestacao=valor+(valor*(taxa/100.0)*tempo);
		System.out.printf("O valor da prestacao he de R$ %.2f\n",prestacao);
	}
}


// P = V ALOR + (V ALOR × (TAXA ÷ 100) × TEMPO)