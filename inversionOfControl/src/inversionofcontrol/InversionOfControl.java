/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inversionofcontrol;

/**
 *
 * @author samuraipanzer
 */
public class InversionOfControl {

  /**
   * @param args the command line arguments
   */
  
  
  
  public static void main(String[] args) {
	// Our base class with first class method getMessage(); 
	// new ExtraBehavior()
	ExtraBehavior extraBehavior = new ExtraBehavior();
	
	// Extends the ExtraBehavior base class
	// Traditional OOP design (Very Orthoginal)
	// new Inherited()
	Inherited inherited = new Inherited();
	
	// Provide the extra behavior at creation time (More Flexible)
	// new Injected(ExtraBehavior extraBehavior)
	Injected injected = new Injected(new ExtraBehavior());
	
	// Composition does not require the extra behavior to be injected
	// It is explicit in the compsed class
	// new Composed()
	Composed composed = new Composed();
	
	
	// You will notice the outcomes are all the same
	print("Base Class Message:\t\t"     + extraBehavior.getMessage());
	print("Inherited Class Message:\t"  + inherited.getMessage());
	print("Injected Class Message:\t\t" + injected.getMessage());
	print("Composed Class Message:\t\t" + composed.getMessage());
  }
  
  public static void print(String output){
	System.out.println(output);
  }
  
}
