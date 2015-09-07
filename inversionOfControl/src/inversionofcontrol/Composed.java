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
public class Composed {
  
  private ExtraBehavior behavior = new ExtraBehavior();
  
  public String getMessage() {
	return behavior.getMessage();
  }

  public void setMessage(String message) {
	this.behavior.setMessage(message);
  }
}
