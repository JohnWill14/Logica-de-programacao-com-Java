import java.util.Scanner;
public class Pell{
	public static void main(String[] args) {
		Scanner sc; 
		sc=new Scanner(System.in);
		System.out.println("Insira um numero");
		int num,aux,cont;
		num=sc.nextInt();
		aux=num;
		cont=0;
		for(int i=1;num>0;i+=2,cont++){
			num-=i;
		}
		System.out.println("O valor literal da raiz quadrada de "+aux+" he de "+cont);
	}
}