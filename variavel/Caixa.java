import java.util.Scanner;
public class Caixa{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double comprimento,largura,altura,area;
		System.out.println("Insira as tres medidas do cubo");
		comprimento=sc.nextDouble();
		largura=sc.nextDouble();
		altura=sc.nextDouble();
		area=comprimento*largura*altura;
		System.out.printf("A area he de %.2f u²\n",area);
	}
}