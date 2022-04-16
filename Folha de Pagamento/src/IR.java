
public class IR {

	double salarioMenosINSS;
	int qtdDependentes;

	double valorDependente = 189.59;
	private final double[] aliquota = { 0.075, 0.15, 0.225, 0.275 };
	private final double[] deducao = { 142.80, 354.80, 636.13, 869.36 };

	public IR(double salarioMenosINSS, int qtdDependentes) {
		super();
		this.salarioMenosINSS = salarioMenosINSS;
		this.qtdDependentes = qtdDependentes;
	}

	public IR(){}

	double calculoIR() {
		salarioMenosINSS -= (valorDependente * qtdDependentes);
		if (salarioMenosINSS <= 1900) {
			return 0;
		} else if (salarioMenosINSS >= 1900.01 && salarioMenosINSS <= 2800.00) {
			return salarioMenosINSS * aliquota[0] - deducao[0];
		} else if (salarioMenosINSS >= 2800.01 && salarioMenosINSS <= 3751.00) {
			return salarioMenosINSS * aliquota[1] - deducao[1];
		} else if (salarioMenosINSS >= 3751.01 && salarioMenosINSS <= 4664.00) {
			return salarioMenosINSS * aliquota[2] - deducao[2];
		} else {
			return salarioMenosINSS * aliquota[3] - deducao[3];
		}
	}
}
