
public class ExercicioTesteIR {
	
	public static void main(String[] args) {
		
		double salario = 3300.0;
		
		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("O IR � de 7.5% e pode deduzir na declara��o o valor deR$142,00");
		} else {
			if (salario >= 2800.01 && salario <= 3751.0) {
				System.out.println("O IR � de 15% e pode deduzir R$350,00");
			} else {
				if (salario >= 3751.01 && salario <= 4664.0) {
					System.out.println("O IR � de 22,5% e pode deduzir R$636,00");
				}
			}
		}
	}

}
