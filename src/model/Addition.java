package model;
/**
 * Cette classe l'addition entre deux op�randes
 * @author anis
 *
 */
public class Addition implements Operation {

	@Override
	public double executer(double leftOperand, double rightOperand) {

		return leftOperand+rightOperand;
		
	}

}
