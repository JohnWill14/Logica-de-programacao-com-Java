import java.util.Scanner;
public class Elevando{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int numero,quadrado,decima,soma;
		numero=sc.nextInt();
		quadrado=(int)Math.pow(numero,2);
		decima=(int)Math.pow(numero,10);
		soma=numero+quadrado+decima;
		System.out.println("Numero: "+numero+"\nQuadrado: "+quadrado
							+"\nDecima: "+decima+"\nSoma: "+soma);
	}
}