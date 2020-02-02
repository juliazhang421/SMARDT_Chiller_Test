import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font; 

public class GuiApp {

	private JFrame frame;
	private JTextField tempInputBox;
	private JTextField setpointBox;
	private JTextField deadbandBox;
	private JTextField num1Box;
	private JTextField num2Box;
	private JTextField num3Box;
	private JTextField num4Box;
	private JTextField num5Box;
	private JTextField num6Box;
	private JTextField num7Box;
	private JTextField num8Box;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiApp window = new GuiApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GuiApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		
		// TEMPERATURE CONTROL 
		
		TemperatureController tempController = new TemperatureController();
		
		
		// Temperature Control GUI Design Layout
		
		JLabel lbFunc1Title = new JLabel("Temperature Controls");
		lbFunc1Title.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lbFunc1Title.setBounds(71, 23, 316, 42);
		frame.getContentPane().add(lbFunc1Title);
		
		tempInputBox = new JTextField();
		tempInputBox.setForeground(Color.BLACK);
		tempInputBox.setBounds(71, 132, 130, 26);
		frame.getContentPane().add(tempInputBox);
		tempInputBox.setColumns(10);
		
		JLabel lblInputs = new JLabel("Inputs:");
		lblInputs.setBounds(71, 63, 61, 16);
		frame.getContentPane().add(lblInputs);
		
		JLabel lblTemperature = new JLabel("Input Temperature");
		lblTemperature.setBounds(71, 104, 169, 16);
		frame.getContentPane().add(lblTemperature);
		
		JLabel lblTemperatureSetPoint = new JLabel("Temperature Set Point");
		lblTemperatureSetPoint.setBounds(289, 104, 151, 16);
		frame.getContentPane().add(lblTemperatureSetPoint);
		
		JLabel lblNewtemperatureDeadbandLabel = new JLabel("Temperature Setpoint Deadband");
		lblNewtemperatureDeadbandLabel.setBounds(501, 104, 217, 16);
		frame.getContentPane().add(lblNewtemperatureDeadbandLabel);
		
		setpointBox = new JTextField();
		setpointBox.setBounds(289, 132, 138, 26);
		frame.getContentPane().add(setpointBox);
		setpointBox.setColumns(10);
		
		deadbandBox = new JTextField();
		deadbandBox.setBounds(501, 132, 202, 26);
		frame.getContentPane().add(deadbandBox);
		deadbandBox.setColumns(10);
		
		JLabel lblCooling = new JLabel("Cooling:");
		lblCooling.setBounds(71, 179, 92, 16);
		frame.getContentPane().add(lblCooling);
		
		JLabel resultLabel = new JLabel("");
		resultLabel.setForeground(Color.RED);
		resultLabel.setBounds(137, 179, 61, 16);
		frame.getContentPane().add(resultLabel);
		
		
		// implementation of Temperature Control calculate button 
		
		JButton tmpControlsButton = new JButton("Calculate");
		tmpControlsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				

				tempController.setInputTemp(tempInputBox.getText());
				tempController.setSetpoint(setpointBox.getText());
				tempController.setDeadband(deadbandBox.getText());
				
				
				resultLabel.setText(tempController.coolingStatus());
			
				
			}
		});
		
		tmpControlsButton.setBounds(309, 174, 117, 29);
		frame.getContentPane().add(tmpControlsButton);
		
		
		
		
		//TOP 3
		
		//Top 3 GUI design layout
		
		JLabel lblTop = new JLabel("Top 3");
		lblTop.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblTop.setBounds(71, 270, 81, 26);
		frame.getContentPane().add(lblTop);
		
		JLabel lblInputs_1 = new JLabel("Inputs:");
		lblInputs_1.setBounds(71, 312, 61, 16);
		frame.getContentPane().add(lblInputs_1);
		
		num1Box = new JTextField();
		num1Box.setBounds(71, 340, 130, 26);
		frame.getContentPane().add(num1Box);
		num1Box.setColumns(10);
		
		num2Box = new JTextField();
		num2Box.setBounds(212, 340, 130, 26);
		frame.getContentPane().add(num2Box);
		num2Box.setColumns(10);
		
		num3Box = new JTextField();
		num3Box.setBounds(354, 340, 130, 26);
		frame.getContentPane().add(num3Box);
		num3Box.setColumns(10);
		
		num4Box = new JTextField();
		num4Box.setBounds(501, 340, 130, 26);
		frame.getContentPane().add(num4Box);
		num4Box.setColumns(10);
		
		num5Box = new JTextField();
		num5Box.setBounds(71, 385, 130, 26);
		frame.getContentPane().add(num5Box);
		num5Box.setColumns(10);
		
		num6Box = new JTextField();
		num6Box.setBounds(212, 385, 130, 26);
		frame.getContentPane().add(num6Box);
		num6Box.setColumns(10);
		
		num7Box = new JTextField();
		num7Box.setBounds(354, 385, 130, 26);
		frame.getContentPane().add(num7Box);
		num7Box.setColumns(10);
		
		num8Box = new JTextField();
		num8Box.setBounds(501, 385, 130, 26);
		frame.getContentPane().add(num8Box);
		num8Box.setColumns(10);
		
		JLabel lblTop_1 = new JLabel("Top 3:");
		lblTop_1.setBounds(71, 448, 61, 16);
		frame.getContentPane().add(lblTop_1);
		
		JLabel top3Label = new JLabel("");
		top3Label.setForeground(Color.RED);
		top3Label.setBounds(123, 448, 164, 16);
		frame.getContentPane().add(top3Label);
		
		
		// Implementatin of top3 calculate button 
		JButton top3Button = new JButton("Calculate");
		top3Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				
				Top3 top3 = new Top3();
				top3.enterValue(num1Box.getText());
				top3.enterValue(num2Box.getText());
				top3.enterValue(num3Box.getText());
				top3.enterValue(num4Box.getText());
				top3.enterValue(num5Box.getText());
				top3.enterValue(num6Box.getText());
				top3.enterValue(num7Box.getText());
				top3.enterValue(num8Box.getText());
				
						
				top3Label.setText(top3.calculateTop3());
		
			}
		});
		top3Button.setBounds(299, 443, 117, 29);
		frame.getContentPane().add(top3Button);
		
		
		
		
		
		
	}
	
	
}
