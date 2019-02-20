package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import model.ApplicationCalculator;
import view.View;

/**
 * Cette classe gère les évenements elle implémente @EventHandler<ActionEvent>
 * @author anis
 *
 */
public class Controller implements EventHandler<ActionEvent> {
	
    private final View view ;
    private static ApplicationCalculator ac = new ApplicationCalculator();
    private static String a;
    private static String b;
	
    /**
     * Constructeur
     * @param view de type View
     */
	public Controller(View view){
        this.view = view ;
        a="";
        b="";
    }

	/**
	 * pour initialiser leftOperand, l'operation 
	 * @param str de type String
	 */
	public void init(String str) {		
		ac.getCalculator().setLeftOperand(Double.parseDouble(a));
		ac.getCalculator().setOper(str);
		view.setDisplay(view.getDisplay().getText()+str);
	}
	
	/**
	 * pour initialiser les opérandes 
	 * @param str de type string
	 */
	public void initOperand(String str) {		
		view.setDisplay(view.getDisplay().getText()+str);
		if(ac.getCalculator().getOper().equals("")) {
			a += str;
		} else {
			b += str;
		}
	}

	/**
	 * une méthode surchargé pour gérer les évenements
	 */
	@Override
	public void handle(ActionEvent event) {
		
		//ajouter les opérations
		ac.addOperations();
		Button temp = (Button) event.getTarget();
		//les nombres
		if(temp.getId().equals("0") || temp.getId().equals("1") || temp.getId().equals("2") ||
				temp.getId().equals("3") || temp.getId().equals("4") || temp.getId().equals("5") ||
					temp.getId().equals("6") || temp.getId().equals("7") || temp.getId().equals("8") ||
						temp.getId().equals("9") || temp.getId().equals(".")) {
			
			initOperand(temp.getId());			
		}		
		//les opérations
		if(temp.getId().equals("+") || temp.getId().equals("-") || temp.getId().equals("*") || temp.getId().equals("/")||
				temp.getId().equals("%")) {
			
			init(temp.getId());
		}
		//egal
		if(temp.getId().equals("=")) {
			ac.getCalculator().setRightOperand(Double.parseDouble(b));
			try {
				view.setDisplay(view.getDisplay().getText()+" = "+ac.calcule());	
			}catch(ArithmeticException e) {
				view.setDisplay(view.getDisplay().getText()+" = Erreur");				
			}						
		}
		//initialiser tout
		if(temp.getId().equals("c")) {
			a="";
			b="";
			ac.getCalculator().setOper("");
			view.setDisplay("");
		}
					
	}
	
}
