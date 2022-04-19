
public class IR {

//	private double salarioMenosINSS;
//	private int qtdDependentes;
//	private double outrosDescontos;
//	private  double pensaoAlimenticia;
//	private double previdenciaSocial;

// 	public IR(double salarioMenosINSS, int qtdDependentes, double outrosDescontos) {
//		super();
//		this.salarioMenosINSS = salarioMenosINSS;
//		this.qtdDependentes = qtdDependentes;
//		this.outrosDescontos = outrosDescontos;
//	}

	double valorDependente = 189.59;
	private final double[] aliquota = { 0.075, 0.15, 0.225, 0.275 };
	private final double[] deducao = { 142.80, 354.80, 636.13, 869.36 };

	double calculoIR(double salario, int qtdDependentes, double outrosDescontos,
					 double pensaoAlimenticia, double previdenciaSocial){

		salario -= (valorDependente * qtdDependentes) - pensaoAlimenticia - previdenciaSocial;

		if (salario <= 1900) {
			return 0;
		} else if (salario >= 1900.01 && salario <= 2800.00) {
			return salario * aliquota[0] - deducao[0];
		} else if (salario >= 2800.01 && salario <= 3751.00) {
			return salario * aliquota[1] - deducao[1];
		} else if (salario >= 3751.01 && salario <= 4664.00) {
			return salario * aliquota[2] - deducao[2];
		} else {
			return salario * aliquota[3] - deducao[3];
		}
	}
}
