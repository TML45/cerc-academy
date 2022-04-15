import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int tipo;
		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor, informe o sal�rio bruto do funcion�rio");
		double salarioBruto = sc.nextDouble();

		do {
			System.out.println("Escolha o tipo de funcion�rio: 1-Jovem aprendiz  2-Trabalhadores dom�sticos  3-Colaboradores em geral");
			tipo = sc.nextInt();
		} while (tipo != 1 && tipo!= 2 && tipo!=3);
		
		System.out.println("Informe o numero de dependentes");
		int qtdDependentes = sc.nextInt();

		Funcionario funcionario1 = new Funcionario(salarioBruto, tipo, qtdDependentes);

		System.out.println("Valor da contribui��o ao FGTS: " + funcionario1.obterContribuicaoFGTS());
		System.out.println("Valor da contribui��o ao INSS: " + funcionario1.obterContribuicaoINSS());
		System.out.println("Valor da contribui��o ao IR: " + funcionario1.obterContribuicaoIR(funcionario1.obterSalarioMenosINSS()));		
		System.out.println("Valor do sal�rio l�quido, descontado FGTS, INSS e IR: " + funcionario1.calcularSalarioLiquido(funcionario1.obterContribuicaoFGTS(), funcionario1.obterContribuicaoINSS(), funcionario1.obterContribuicaoIR(funcionario1.obterSalarioMenosINSS())));
	}

}
