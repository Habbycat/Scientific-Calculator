import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class calc {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc window = new calc();
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
	public calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ScientificCalculator");
		lblNewLabel.setFont(new Font("Centaur", Font.BOLD, 21));
		lblNewLabel.setBounds(103, 0, 295, 54);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Centaur", Font.PLAIN, 22));
		textField.setBounds(21, 42, 344, 72);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u221A");
		btnNewButton.setEnabled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton.setFont(new Font("Centaur", Font.BOLD, 21));
		btnNewButton.setBounds(10, 148, 75, 72);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnx = new JButton("1/x");
		btnx.setEnabled(false);
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnx.setFont(new Font("Centaur", Font.PLAIN, 21));
		btnx.setBounds(10, 216, 75, 72);
		frame.getContentPane().add(btnx);
		
		JButton btnX = new JButton("X^3");
		btnX.setEnabled(false);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnX.setFont(new Font("Centaur", Font.PLAIN, 21));
		btnX.setBounds(10, 357, 75, 72);
		frame.getContentPane().add(btnX);
		
		JButton btnExpo = new JButton("X^2");
		btnExpo.setEnabled(false);
		btnExpo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnExpo.setFont(new Font("Centaur", Font.PLAIN, 21));
		btnExpo.setBounds(10, 426, 75, 72);
		frame.getContentPane().add(btnExpo);
		
		JButton btnExclamation = new JButton("n!");
		btnExclamation.setEnabled(false);
		btnExclamation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(textField.getText());
				double fact=1;
				while(a!=0)
				{
					fact=fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
			}
		});
		btnExclamation.setFont(new Font("Centaur", Font.BOLD, 21));
		btnExclamation.setBounds(10, 495, 75, 72);
		frame.getContentPane().add(btnExclamation);
		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.setEnabled(false);
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnPlusMinus.setFont(new Font("Centaur", Font.BOLD, 21));
		btnPlusMinus.setBounds(10, 564, 75, 72);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Centaur", Font.BOLD, 21));
		btn1.setBounds(84, 495, 75, 72);
		frame.getContentPane().add(btn1);
		
		JButton btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Centaur", Font.BOLD, 21));
		btn4.setBounds(84, 426, 75, 72);
		frame.getContentPane().add(btn4);
		
		JButton btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Centaur", Font.BOLD, 21));
		btn7.setBounds(84, 357, 75, 72);
		frame.getContentPane().add(btn7);
		
		JButton btnLog = new JButton("Log");
		btnLog.setEnabled(false);
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnLog.setFont(new Font("Centaur", Font.PLAIN, 21));
		btnLog.setBounds(84, 216, 75, 72);
		frame.getContentPane().add(btnLog);
		
		JButton btnEx = new JButton("e^x");
		btnEx.setEnabled(false);
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnEx.setFont(new Font("Centaur", Font.PLAIN, 21));
		btnEx.setBounds(84, 148, 75, 72);
		frame.getContentPane().add(btnEx);
		
		JButton btn0 = new JButton("0");
		btn0.setEnabled(false);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Centaur", Font.BOLD, 21));
		btn0.setBounds(84, 564, 149, 72);
		frame.getContentPane().add(btn0);
		
		JButton btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Centaur", Font.BOLD, 21));
		btn2.setBounds(158, 495, 75, 72);
		frame.getContentPane().add(btn2);
		
		JButton btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Centaur", Font.BOLD, 21));
		btn5.setBounds(158, 426, 75, 72);
		frame.getContentPane().add(btn5);
		
		JButton btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Centaur", Font.BOLD, 21));
		btn8.setBounds(158, 357, 75, 72);
		frame.getContentPane().add(btn8);
		
		JButton btnSin = new JButton("Sin");
		btnSin.setEnabled(false);
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSin.setFont(new Font("Centaur", Font.PLAIN, 21));
		btnSin.setBounds(158, 148, 75, 72);
		frame.getContentPane().add(btnSin);
		
		JButton btnDot = new JButton(".");
		btnDot.setEnabled(false);
		btnDot.setFont(new Font("Centaur", Font.BOLD, 21));
		btnDot.setBounds(231, 564, 75, 72);
		frame.getContentPane().add(btnDot);
		
		JButton btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Centaur", Font.BOLD, 21));
		btn3.setBounds(231, 495, 75, 72);
		frame.getContentPane().add(btn3);
		
		JButton btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Centaur", Font.BOLD, 21));
		btn6.setBounds(231, 426, 75, 72);
		frame.getContentPane().add(btn6);
		
		JButton btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Centaur", Font.BOLD, 21));
		btn9.setBounds(231, 357, 75, 72);
		frame.getContentPane().add(btn9);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.setEnabled(false);
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackspace.setFont(new Font("Wingdings", Font.PLAIN, 21));
		btnBackspace.setBounds(231, 286, 75, 72);
		frame.getContentPane().add(btnBackspace);
		
		JButton btnCos = new JButton("Cos");
		btnCos.setEnabled(false);
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCos.setFont(new Font("Centaur", Font.PLAIN, 21));
		btnCos.setBounds(231, 148, 75, 72);
		frame.getContentPane().add(btnCos);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setEnabled(false);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second=Double.parseDouble(textField.getText());
				if(operation=="+") 
				{
					result=first+second;
					answer=String.format("%,2f",result);
					textField.setText(answer);
				}else if(operation=="-") 
				{
					result=first-second;
					answer=String.format("%,2f",result);
					textField.setText(answer);
				}else if(operation=="*") 
				{
					result=first*second;
					answer=String.format("%,2f",result);
					textField.setText(answer);
				}else if(operation=="/") 
				{
					result=first/second;
					answer=String.format("%,2f",result);
					textField.setText(answer);
				}else if(operation=="%") 
				{
					result=first%second;
					answer=String.format("%,2f",result);
					textField.setText(answer);
				}else if(operation=="X^Y") {
					double resultt=1;
					for(int i=0;i<second;i++)
					{
						resultt=first*resultt;
					}
					
					answer=String.format("%.2f",resultt);
					textField.setText(answer);
        }
				
		}});
		btnEqual.setFont(new Font("Centaur", Font.PLAIN, 21));
		btnEqual.setBounds(313, 564, 75, 72);
		frame.getContentPane().add(btnEqual);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setEnabled(false);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide.setFont(new Font("Centaur", Font.PLAIN, 21));
		btnDivide.setBounds(313, 495, 75, 72);
		frame.getContentPane().add(btnDivide);
		
		JButton btnMul = new JButton("*");
		btnMul.setEnabled(false);
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMul.setFont(new Font("Centaur", Font.PLAIN, 21));
		btnMul.setBounds(313, 426, 75, 72);
		frame.getContentPane().add(btnMul);
		
		JButton btnSub = new JButton("-");
		btnSub.setEnabled(false);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSub.setFont(new Font("Centaur", Font.PLAIN, 21));
		btnSub.setBounds(313, 357, 75, 72);
		frame.getContentPane().add(btnSub);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setEnabled(false);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnAdd.setFont(new Font("Centaur", Font.PLAIN, 21));
		btnAdd.setBounds(313, 286, 75, 72);
		frame.getContentPane().add(btnAdd);
		
		JButton btnTan = new JButton("Tan");
		btnTan.setEnabled(false);
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTan.setFont(new Font("Centaur", Font.PLAIN, 21));
		btnTan.setBounds(313, 148, 75, 72);
		frame.getContentPane().add(btnTan);
		
		JButton btnClear = new JButton("C");
		btnClear.setEnabled(false);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Centaur", Font.BOLD, 21));
		btnClear.setBounds(158, 286, 75, 72);
		frame.getContentPane().add(btnClear);
		
		JButton btnPercent = new JButton("%");
		btnPercent.setEnabled(false);
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPercent.setFont(new Font("Centaur", Font.BOLD, 21));
		btnPercent.setBounds(84, 286, 75, 72);
		frame.getContentPane().add(btnPercent);
		
		JButton btnXy = new JButton("X^Y");
		btnXy.setEnabled(false);
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="X^Y";
			}
		});
		btnXy.setFont(new Font("Centaur", Font.PLAIN, 21));
		btnXy.setBounds(10, 286, 75, 72);
		frame.getContentPane().add(btnXy);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.setEnabled(false);
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSinh.setFont(new Font("Centaur", Font.PLAIN, 21));
		btnSinh.setBounds(158, 216, 75, 72);
		frame.getContentPane().add(btnSinh);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.setEnabled(false);
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnCosh.setFont(new Font("Centaur", Font.PLAIN, 21));
		btnCosh.setBounds(231, 216, 75, 72);
		frame.getContentPane().add(btnCosh);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.setEnabled(false);
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTanh.setFont(new Font("Centaur", Font.PLAIN, 17));
		btnTanh.setBounds(313, 216, 75, 72);
		frame.getContentPane().add(btnTanh);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {btn0.setEnabled(false);
			btn0.setEnabled(true);
			btn1.setEnabled(true);
			btn2.setEnabled(true);
			btn3.setEnabled(true);
			btn4.setEnabled(true);
			btn5.setEnabled(true);
			btn6.setEnabled(true);
			btn7.setEnabled(true);
			btn8.setEnabled(true);
			btn9.setEnabled(true);
			btnDot.setEnabled(true);
			btnAdd.setEnabled(true);
			btnSub.setEnabled(true);
			btnMul.setEnabled(true);
			btnDivide.setEnabled(true);
			btnEqual.setEnabled(true);
			btnBackspace.setEnabled(true);
			btnClear.setEnabled(true);
			btnPlusMinus.setEnabled(true);
			btnExclamation.setEnabled(true);
			btnExpo.setEnabled(true);
			btnX.setEnabled(true);
			btnXy.setEnabled(true);
			btnx.setEnabled(true);
			btnNewButton.setEnabled(true);
			btnEx.setEnabled(true);
			btnPercent.setEnabled(true);
			btnLog.setEnabled(true);
			btnSin.setEnabled(true);
			btnSinh.setEnabled(true);
			btnCos.setEnabled(true);
			btnCosh.setEnabled(true);
			btnTan.setEnabled(true);
			btnTanh.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Centaur", Font.BOLD, 11));
		rdbtnNewRadioButton.setBounds(10, 121, 63, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.setSelected(true);
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				btn0.setEnabled(false);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btnDot.setEnabled(false);
				btnAdd.setEnabled(false);
				btnSub.setEnabled(false);
				btnMul.setEnabled(false);
				btnDivide.setEnabled(false);
				btnEqual.setEnabled(false);
				btnBackspace.setEnabled(false);
				btnClear.setEnabled(false);btn8.setEnabled(false);
				btnPlusMinus.setEnabled(false);
				btnExclamation.setEnabled(false);
				btnExpo.setEnabled(false);
				btnX.setEnabled(false);
				btnXy.setEnabled(false);
				btnx.setEnabled(false);
				btnNewButton.setEnabled(false);
				btnEx.setEnabled(false);btn8.setEnabled(false);
				btnPercent.setEnabled(false);
				btnLog.setEnabled(false);
				btnSin.setEnabled(false);
				btnSinh.setEnabled(false);
				btnCos.setEnabled(false);
				btnCosh.setEnabled(false);
				btnTan.setEnabled(false);
				btnTanh.setEnabled(false);
			}
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setFont(new Font("Centaur", Font.BOLD, 11));
		rdbtnOff.setBounds(71, 121, 63, 23);
		frame.getContentPane().add(rdbtnOff);
	}
} 

