import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int tipo;
		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor, informe o salário bruto do funcionário");
		double salarioBruto = sc.nextDouble();

		do {
			System.out.println("Escolha o tipo de funcionário: 1-Jovem aprendiz  2-Trabalhadores domésticos  3-Colaboradores em geral");
			tipo = sc.nextInt();
		} while (tipo != 1 && tipo!= 2 && tipo!=3);
		
		System.out.println("Informe o numero de dependentes");
		int qtdDependentes = sc.nextInt();

		Funcionario funcionario1 = new Funcionario(salarioBruto, tipo, qtdDependentes);

		System.out.println("Valor da contribuição ao FGTS: " + funcionario1.obterContribuicaoFGTS());
		System.out.println("Valor da contribuição ao INSS: " + funcionario1.obterContribuicaoINSS());
		System.out.println("Valor da contribuição ao IR: " + funcionario1.obterContribuicaoIR(funcionario1.obterSalarioMenosINSS()));		
		System.out.println("Valor do salário líquido, descontado FGTS, INSS e IR: " + funcionario1.calcularSalarioLiquido(funcionario1.obterContribuicaoFGTS(), funcionario1.obterContribuicaoINSS(), funcionario1.obterContribuicaoIR(funcionario1.obterSalarioMenosINSS())));
	}

}
