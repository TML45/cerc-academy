
public class INSS {
	private double salarioBruto;

	public INSS(double salarioBruto) {
		super();
		this.salarioBruto = salarioBruto;
	}
	
	public double calcularContribuicaoINSS() {
		double contribuicaoINSS;
		if(salarioBruto <= 1212) {
			return contribuicaoINSS = 0.075 * salarioBruto;
		}else if(salarioBruto > 1212 && salarioBruto <= 2427.35) {
			return contribuicaoINSS = 0.09 * salarioBruto - 18.18;
		}else if(salarioBruto > 2427.35 && salarioBruto <= 3641.03) {
			return contribuicaoINSS = 0.12 * salarioBruto - 91;
		}else if(salarioBruto > 3641.03 && salarioBruto <= 7087.22) {
			return contribuicaoINSS = 0.12 * salarioBruto - 163.82;
		}else {
			return 828.39;
		}
	}

}
