import java.util.Scanner;
public class Media{
	public static void main(String args[]){
		Scanner sc;
		sc=new Scanner(System.in);
		int todasNotas;
		todasNotas=0;
		for(int i=0;i<4;i++)todasNotas+=sc.nextInt();
		double media;
		String situacao=new String("");
		media=todasNotas/4.0;
		if(media<50)situacao="Reprovado";
		else if(media==50)situacao="Recuperacao";
		else situacao="Aprovado";
		System.out.println(situacao);
	}
}