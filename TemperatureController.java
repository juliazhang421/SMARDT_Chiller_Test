import javax.swing.JOptionPane;

public class TemperatureController {
	
	private int inputTemp;
	private int setpoint; 
	private int deadband;
	private boolean status = false;
	private String ans;
	
	public TemperatureController () {
		inputTemp = 0;
		setpoint = 0;
		deadband = 0;

		
	}
	
	// determine cooling status 
	public String coolingStatus() {
		
		if (inputTemp > setpoint) {
			ans = "ON";
			status = true;
		}
		
		else if (inputTemp < (setpoint - deadband)) {
			ans = "OFF";
			status = false;
		}
		
		else if (status) {
			ans = "ON";
			
		}
		
		else {
			status = false;
			ans = "OFF";
		}
				
		return ans;
	}
	
	
	// sets Input Temperature value
	public void setInputTemp(String inputTemp) {
		try {
			this.inputTemp = Integer.parseInt(inputTemp);		
		}
		
		catch (Exception e){
			JOptionPane.showMessageDialog(null, "Please Enter Valid Input");
		
		}
		
	}
	
	// Sets temperature setpoint value 
	public void setSetpoint (String setpoint) {
		try {
			if (setpoint.isEmpty()) {
				this.setpoint = 22;
			}
			else {
				this.setpoint = Integer.parseInt(setpoint);
			}
		}
		
		catch (Exception e){
			JOptionPane.showMessageDialog(null, "Please Enter Valid Input");
		
		}
	}
	
	// Sets temperature setpoint deadband value
	public void setDeadband (String deadband) {
		try {
			if (deadband.isEmpty()) {
				this.deadband = 2;
			}
			
			else {
				this.deadband = Integer.parseInt(deadband);
			}
		}
		
		catch (Exception e){
			JOptionPane.showMessageDialog(null, "Please Enter Valid Input");
		
		}
		
	}
	
	
}
