import java.util.Scanner;
public class MaiorMenor{
	public static void main(String[] args) {
		Scanner sc;
		sc=new Scanner(System.in);
		int numeros[];
		numeros=new int[5];
		for(int i=0;i<5;i++)numeros[i]=sc.nextInt();
		int maior=(int)-9e5,menor=(int)9e5;
		for(int i:numeros){
			if(i>maior)maior=i;
			if(i<menor)menor=i;
		}
		System.out.println("maior: "+maior+"\nmenor: "+menor);
	}
}