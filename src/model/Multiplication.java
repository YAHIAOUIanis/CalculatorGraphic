package model;

/**
 * Cette classe la multiplication entre deux op�randes
 * @author anis
 *
 */
public class Multiplication implements Operation {

	@Override
	public double executer(double leftOperand, double rightOperand) {

		return leftOperand*rightOperand;
		
	}

}
