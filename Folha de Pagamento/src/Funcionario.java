
public class Funcionario {
	private double salarioBruto;
	private int tipo;
	private int qtdDependentes;

	public Funcionario(double salarioBruto, int tipo, int qtdDependentes) {
		super();
		this.salarioBruto = salarioBruto;
		this.tipo = tipo;
		this.qtdDependentes = qtdDependentes;
	}

	public double obterContribuicaoFGTS() {
		FGTS funcionarioFGTS = new FGTS(salarioBruto, tipo);
		return funcionarioFGTS.calcularContribuicaoFGTS();
	}

	public double obterContribuicaoINSS() {
		INSS funcionarioINSS = new INSS(salarioBruto);
		return funcionarioINSS.calcularContribuicaoINSS();
	}
	
	public double obterSalarioMenosINSS() {
		INSS funcionarioINSS = new INSS(salarioBruto);
		return salarioBruto - funcionarioINSS.calcularContribuicaoINSS();
	}

	public double obterContribuicaoIR(double salarioMenosINSS) {
		IR funcionarioIR = new IR(salarioMenosINSS, qtdDependentes);
		return funcionarioIR.calculoIR();
	}

	public double calcularSalarioLiquido(double FGTS, double INSS, double IR) {
		return salarioBruto - FGTS - INSS - IR;
	}

}
