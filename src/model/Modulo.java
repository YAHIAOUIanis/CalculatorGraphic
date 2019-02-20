package model;

/**
 * Cette classe calcule le modulo entre deux opérandes
 * @author anis
 *
 */
public class Modulo implements Operation {

	@Override
	public double executer(double leftOperand, double rightOperand) {

		return leftOperand%rightOperand;
		
	}

	
}
