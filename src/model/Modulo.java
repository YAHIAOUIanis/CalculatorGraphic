package model;

/**
 * Cette classe calcule le modulo entre deux op�randes
 * @author anis
 *
 */
public class Modulo implements Operation {

	@Override
	public double executer(double leftOperand, double rightOperand) {

		return leftOperand%rightOperand;
		
	}

	
}
