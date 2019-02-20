package model;

/**
 * Cette classe contient une calculatrice et ajoute les opérations dans la calculatrice
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
	 * Cette méthode ajoute les opérations dans la calculatrice
	 */
	public void addOperations() {
		
		calculator.addOperation("-", new Subtraction());
		calculator.addOperation("*", new Multiplication());
		calculator.addOperation("%", new Modulo());
		calculator.addOperation("/", new Division());
		calculator.addOperation("+", new Addition());
		
	}
	
	/**
	 * @return retourne le résultat de calcule de type double
	 */
	public double calcule() {
		return calculator.calcule();		
	}	

}
