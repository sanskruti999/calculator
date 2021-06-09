package info.planet;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class MyCalci {

	private JFrame frame;
	private JTextField tf;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalci window = new MyCalci();
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
	public MyCalci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 307, 411);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tf = new JTextField();
		tf.setHorizontalAlignment(SwingConstants.RIGHT);
		tf.setBounds(10, 10, 270, 50);
		frame.getContentPane().add(tf);
		tf.setColumns(10);
		
		JButton btnback = new JButton("<-");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 String backspace=null;
			 
			 if(tf.getText().length()>0) {
				 StringBuilder strB=new StringBuilder(tf.getText());
				 strB.deleteCharAt(tf.getText().length() -1);
				 backspace=strB.toString();
				 tf.setText(backspace);
				 
			 }
			
			}
		});
		btnback.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnback.setBounds(10, 70, 60, 50);
		frame.getContentPane().add(btnback);
		
		JButton btnc = new JButton("c");
		btnc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tf.setText(null);
			}
		});
		btnc.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnc.setBounds(80, 70, 60, 50);
		frame.getContentPane().add(btnc);
		
		JButton btnmod = new JButton("%");
		btnmod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum=Double.parseDouble(tf.getText());
				tf.setText("");
				operations="%";
			}
		});
		btnmod.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnmod.setBounds(150, 70, 60, 50);
		frame.getContentPane().add(btnmod);
		
		JButton btnadd = new JButton("+");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum=Double.parseDouble(tf.getText());
				tf.setText("");
				operations="+";
			
			}
		});
		btnadd.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnadd.setBounds(220, 70, 60, 50);
		frame.getContentPane().add(btnadd);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=tf.getText()+btn7.getText();
				tf.setText(EnterNumber);
				
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 130, 60, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=tf.getText()+btn8.getText();
				tf.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(80, 130, 60, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=tf.getText()+btn9.getText();
				tf.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(150, 130, 60, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum=Double.parseDouble(tf.getText());
				tf.setText("");
				operations="-";
			}
		});
		btnsub.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnsub.setBounds(220, 130, 60, 50);
		frame.getContentPane().add(btnsub);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=tf.getText()+btn4.getText();
				tf.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 190, 60, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=tf.getText()+btn5.getText();
				tf.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(80, 190, 60, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=tf.getText()+btn6.getText();
				tf.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(150, 192, 60, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnmul = new JButton("*");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum=Double.parseDouble(tf.getText());
				tf.setText("");
				operations="*";
			}
		});
		btnmul.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnmul.setBounds(220, 190, 60, 50);
		frame.getContentPane().add(btnmul);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=tf.getText()+btn1.getText();
				tf.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(10, 250, 60, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=tf.getText()+btn2.getText();
				tf.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(80, 250, 60, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=tf.getText()+btn3.getText();
				tf.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(150, 252, 60, 50);
		frame.getContentPane().add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=tf.getText()+btn0.getText();
				tf.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(10, 310, 60, 50);
		frame.getContentPane().add(btn0);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum=Double.parseDouble(tf.getText());
				tf.setText("");
				operations="/";
			}
		});
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		btndiv.setBounds(220, 250, 60, 50);
		frame.getContentPane().add(btndiv);
		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=tf.getText()+btndot.getText();
				tf.setText(EnterNumber);
			}
		});
		btndot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btndot.setBounds(80, 312, 60, 50);
		frame.getContentPane().add(btndot);
		
		JButton btnplusmin = new JButton("+-");
		btnplusmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops=Double.parseDouble(String.valueOf(tf.getText()));
				ops=ops*(-1);
				tf.setText(String.valueOf(ops));
			}
		});
		btnplusmin.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnplusmin.setBounds(150, 312, 60, 50);
		frame.getContentPane().add(btnplusmin);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum=Double.parseDouble(tf.getText());
				if(operations=="+") {
					result=firstnum+secondnum;
					answer=String.format("%2f", result);
					tf.setText(answer);
				}
					
					else if(operations=="-") {
						result=firstnum-secondnum;
						answer=String.format("%2f", result);
						tf.setText(answer);
					}
				
					else if(operations=="*") {
						result=firstnum*secondnum;
						answer=String.format("%2f", result);
						tf.setText(answer);
					}
				
					else if(operations=="/") {
						result=firstnum/secondnum;
						answer=String.format("%2f", result);
						tf.setText(answer);
					}
				
					else if(operations=="%") {
					result=firstnum%secondnum;
					answer=String.format("%2f", result);
					tf.setText(answer);
				}
			
				
			}
		});
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnequal.setBounds(220, 313, 60, 50);
		frame.getContentPane().add(btnequal);
	}
}
