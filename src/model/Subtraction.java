package model;

/**
 * Cette classe la soustraction entre deux op�randes
 * @author anis
 *
 */
public class Subtraction implements Operation {

	@Override
	public double executer(double leftOperand, double rightOperand) {

		return leftOperand-rightOperand;
	}

}
