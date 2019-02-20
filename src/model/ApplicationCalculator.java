package model;

/**
 * Cette classe contient une calculatrice et ajoute les op�rations dans la calculatrice
 * 
 * @author anis
 *
 */
public class ApplicationCalculator {
	
	private Calculator calculator;

	public ApplicationCalculator() {
		
		this.calculator = new Calculator();
		
	}
	
	public Calculator getCalculator() {
		
		return this.calculator;
		
	}
	
	/**
	 * Cette m�thode ajoute les op�rations dans la calculatrice
	 */
	public void addOperations() {
		
		calculator.addOperation("-", new Subtraction());
		calculator.addOperation("*", new Multiplication());
		calculator.addOperation("%", new Modulo());
		calculator.addOperation("/", new Division());
		calculator.addOperation("+", new Addition());
		
	}
	
	/**
	 * @return retourne le r�sultat de calcule de type double
	 */
	public double calcule() {
		return calculator.calcule();		
	}	

}
