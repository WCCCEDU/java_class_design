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
public class Injected {
  
  private ExtraBehavior behavior = null;
  
  public Injected(ExtraBehavior behavior) {
	this.behavior = behavior;
  }
  
  public String getMessage() {
	return this.behavior.getMessage();
  }

  public void setMessage(String message) {
	this.behavior.setMessage(message);
  }
  
}
