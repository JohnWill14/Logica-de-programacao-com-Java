import java.util.Scanner;
public class Salario2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.printf("Horas Trabalhadas: ");
		int hora_trabalhada;
		hora_trabalhada=sc.nextInt();
		System.out.printf("Valor Hora: ");
		int valor_hora;
		valor_hora=sc.nextInt();
		int salario_base;
		salario_base=hora_trabalhada*valor_hora;
		System.out.println("Percentual de desconto");
		int percentual_desconto;
		percentual_desconto=sc.nextInt();
		double total_desconto;
		total_desconto=(percentual_desconto/100.0)*salario_base;
		double salario_liquido;
		salario_liquido=((double)salario_base)-total_desconto;
		System.out.printf("Salario Base he de R$ %.2f\n",(double)salario_base);
		System.out.printf("Salario Liquido he de R$ %.2f\n",salario_liquido);
	}
}