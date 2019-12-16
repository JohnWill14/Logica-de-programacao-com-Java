import java.util.Scanner;
//Programa baseado no Exercicio 1 de vetores
public class MultiplicandoVetores{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] v1,v2;
		v1=new int[9];
		v2=new int[9];
		System.out.println("Insira nove numeros para o vetor 1 e nove numeros para o vetor 2");
		for(int i=0;i<9;i++){
			v1[i]=sc.nextInt();
		}
		for(int i=0;i<9;i++){
			v2[i]=sc.nextInt();
		}
		for (int i=0;i<9 ;i++ ) {
			System.out.print(v1[i]+" ");
		}
		System.out.println();
		for (int i=0;i<9 ;i++ ) {
			System.out.print(v2[i]+" ");
		}

		System.out.println();
		for (int i=0;i<9 ;i++ ) {
			System.out.print((v2[i]*v1[i])+" ");
		}
		System.out.println();
		
	}
}