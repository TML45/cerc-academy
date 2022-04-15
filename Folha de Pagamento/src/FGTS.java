
public class FGTS {
	private double salarioBruto;
	private int tipo;

	public FGTS(double salarioBruto, int tipo) {
		super();
		this.salarioBruto = salarioBruto;
		this.tipo = tipo;
	}

	public double calcularContribuicaoFGTS() {
		double contribuicaoFGTS;
		switch (tipo) {
		case 1:
			return contribuicaoFGTS = 0.02 * salarioBruto;
		case 2:
			return contribuicaoFGTS = 0.112 * salarioBruto;
		case 3:
			return contribuicaoFGTS = 0.08 * salarioBruto;
		default:
			return (Double) null;
		}
	}

	public double calcularSalarioDecontadoFGTS() {
		double salarioDescontadoFGTS;
		switch (tipo) {
		case 1:
			return salarioDescontadoFGTS = 0.98 * salarioBruto;
		case 2:
			return salarioDescontadoFGTS = 0.888 * salarioBruto;
		case 3:
			return salarioDescontadoFGTS = 0.92 * salarioBruto;
		default:
			return (Double) null;
		}
	}
}
