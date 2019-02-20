package model;

import java.util.HashMap;
import java.util.Map;

/**
 * Cette classe joue le role d'une calculatirce qui contient plusieurs opérations
 * 
 * @author anis
 *
 */
public class Calculator {
	
	private double leftOperand;
	private double rightOperand;
	private String oper;
	private Map<String, Operation> operations;
	
	
	public Calculator() {
		this.oper ="";
		this.operations = new HashMap<>();
	}
	
	/**
	 * @return the leftOperand
	 */
	public double getLeftOperand() {
		return leftOperand;
	}

	/**
	 * @param leftOperand the leftOperand to set
	 */
	public void setLeftOperand(double leftOperand) {
		this.leftOperand = leftOperand;
	}

	/**
	 * @return the rightOperand
	 */
	public double getRightOperand() {
		return rightOperand;
	}

	/**
	 * @param rightOperand the rightOperand to set
	 */
	public void setRightOperand(double rightOperand) {
		this.rightOperand = rightOperand;
	}

	/**
	 * @return the oper
	 */
	public String getOper() {
		return this.oper;
	}

	/**
	 * @param oper the oper to set
	 */
	public void setOper(String oper) {
		this.oper = oper;
	}

	/**
	 * @return the operations
	 */
	public Map<String,Operation> getOperations(){
		return this.operations;
	}
	
	/**
	 * Initiliser les opérandes et l'opération
	 * @param a
	 * @param b
	 * @param c
	 */
	public void init(double a, String b, double c) {
		this.leftOperand = a;
		this.oper = b;
		this.rightOperand = c;
	}
	
	/**
	 * ajouter une opération
	 * @param str
	 * @param op
	 */
	public void addOperation(String str, Operation op) {
		if(!this.operations.containsKey(str)) {
			operations.put(str, op);
		}
	}
	
	/**
	 * supprimer une opération
	 * @param str
	 */
	public void removeOperation(String str) {
		if(this.operations.containsKey(str)) {
			this.operations.remove(str);
		}
	}
	
	/**
	 * Calculer le résultat
	 * @return
	 */
	public double calcule() {
        if (this.operations.containsKey(this.oper)) {
            return operations.get(this.oper).executer(this.leftOperand, this.rightOperand);
        } 
        return 0;
    }
	
}
