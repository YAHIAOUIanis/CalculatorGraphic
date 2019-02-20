package model;

/**
 * Cette classe la division entre deux op�randes
 * @author anis
 *
 */
public class Division implements Operation {

	@Override
	public double executer(double leftOperand, double rightOperand) {

		if(rightOperand != 0) {
			return leftOperand / rightOperand;
		}else {
			throw new ArithmeticException("Impossible to divide "+leftOperand+" by 0");
		}
		
	}

}
