import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Top3 {
	
	private ArrayList <Integer> inputList = new ArrayList<Integer>();
	
	public Top3 () {
		
	}
	
	// adds input value into ArrayList if valid input
	public void enterValue(String num) {
		try {
			if (!num.isEmpty() && Integer.parseInt(num) <= 100) {
				inputList.add(Integer.parseInt(num));	
			}
		}
		
		catch (Exception e){
			JOptionPane.showMessageDialog(null, "Please Enter Valid Input");
			
		}
		
		
	}
	
	// calculates top 3 values in ArrayList 
	public String calculateTop3 () {
		
		int first = 0; 
		int second = 0;
		int third = 0;
		String top3 = "";
		
		try {
			
			if (inputList.size() < 3) {
				throw new Exception ("Need to at least input 3 values");
			}
			
			// find top 3 values
			for (int i = 0; i < inputList.size(); i++) { 
			
				if (inputList.get(i) > first) {
					third = second;
	                second = first;
	                first = inputList.get(i);
				}
				
				else if (inputList.get(i) > second) {
	                third = second;
	                second = inputList.get(i);
	            } 
				
				else if (inputList.get(i) > third) {
	                third = inputList.get(i);
	            }
                
            } 
			

			top3 = Integer.toString(first) + " " + Integer.toString(second) + " " + Integer.toString(third);

		
		// catch if less than 3 values entered that are <= 100
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Please Enter At Least 3 Values no greater than 100");
			e.printStackTrace();
		}
		
		
		
		return top3;
		
	}

}
