import java.util.Scanner;
//Programa baseado no Exercicio 3 de funções
public class Conversao{
	public static Scanner sc;
	public static String[] memoria;
	public static double celsios(double a){
		double celsios;
		celsios=((a-32)*5)/9.0;
		return celsios;
	}
	public static double fahrenheit(double a){
		double fahrenheit;
		fahrenheit=9/5.0*(a)+32;
		return fahrenheit;
	}
	public static void main(String[] args) {
		
		sc=new Scanner(System.in);
		memoria=new String[5];
		String menu;
		menu="\tMenu\n\n";
		menu+="1- Celsios para Fahrenheit\n"+
		  "2- Fahrenheit para Celsios\n"+
		  "3- Ultimas Conversoes\n"+
		  "4- Sair\n\n";
		  int opcao,cont;
		  boolean memoriaCheia;
		  cont=0;
		  memoriaCheia=false;
		 while(true){
		 	System.out.print(menu);
		 	opcao=sc.nextInt();
		 	if(opcao>4){
		 		System.out.println("\n============\nOpcao nao encontrada\n\n");
				continue ;
		 	}else if(opcao==4){
		 		System.out.println("\n============\nFinalizando\n\n");
				break;
		 	}
		 	double temperatura,nt;
		 	String resp="";
		 	switch(opcao){
		 		case 1:
		 			System.out.println("Insira a temperatura");
		 			temperatura=sc.nextDouble();
		 			nt=fahrenheit(temperatura);
		 			resp=temperatura+"ºC = "+nt+" F";
		 			memoria[cont]=resp;
		 			cont++;
		 			System.out.println("\n============\n");
		 			System.out.println(resp);
		 			System.out.println("============\n");
		 			
		 		break;
		 		case 2:
		 			System.out.println("Insira a temperatura");
		 			temperatura=sc.nextDouble();
		 			nt=celsios(temperatura);
		 			resp=temperatura+"F = "+nt+" ºC";
		 			memoria[cont]=resp;
		 			cont++;
		 			System.out.println("\n============\n");
		 			System.out.println(resp);
		 			System.out.println("============\n");
		 			
		 		break;
		 		case 3:
		 			int limite;
		 			if(memoriaCheia)limite=5;
		 			else limite=cont;
		 			System.out.println("\n============\n");
		 			for (int i=0;i<limite ;i++ ) {

		 				System.out.println(memoria[i]);
		 			}
		 			System.out.println("\n============\n");
		 		break;
		 		
		 	}
		 	if(cont==5){
		 			cont=0;
		 			memoriaCheia=true;
		 	}
		 }
	}
}