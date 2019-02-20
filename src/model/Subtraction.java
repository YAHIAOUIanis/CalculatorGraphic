package model;

/**
 * Cette classe la soustraction entre deux opérandes
 * @author anis
 *
 */
public class Subtraction implements Operation {

	@Override
	public double executer(double leftOperand, double rightOperand) {

		return leftOperand-rightOperand;
	}

}
