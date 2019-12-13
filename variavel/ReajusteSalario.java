import java.util.Scanner;
public class ReajusteSalario{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double percentual_reajuste,salario_base,novo_salario;
		System.out.print("Insira o salario, em R$, base a ser alterado: ");
		salario_base=sc.nextDouble();
		System.out.print("Insira o percentual de reajuste: ");
		percentual_reajuste=sc.nextDouble();
		novo_salario=salario_base+(salario_base*percentual_reajuste)/100.0;
		System.out.printf("O novo salario do funcionario sera de R %.2f\n",novo_salario);
	}
}