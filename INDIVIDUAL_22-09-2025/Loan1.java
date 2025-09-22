package TotalReturn;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import javax.swing.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JTextField;

public class Loan1 implements ActionListener {

	JFrame frame;
	JLabel Amount= new JLabel("Amount Requested");
	JLabel Duration= new JLabel ("Duration(year)");
	JLabel Total= new JLabel ("Total Return");
	
	JTextField AmountTXF= new JTextField();
	JTextField DurationTXF= new JTextField();
	JTextField TotalTXF= new JTextField();
	
	JButton CalcBtn= new JButton("Calculate");
	
	public Loan1(){
		CreateWindow();
		setLocationAndSize();
		addComponentsToFrame();
		addActionEvent();
	}
	
	private void CreateWindow(){
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 300);
		frame.getContentPane().setBackground(new Color(51, 153, 255));
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
		
	}
	private void setLocationAndSize(){
		Amount.setBounds(30,30,150, 30);
		AmountTXF.setBounds(200, 30, 150, 30);
		
		Duration.setBounds(30,80,150,30);
		DurationTXF.setBounds(200, 80, 150, 30);
		
		Total.setBounds(30, 130, 150, 30);
		TotalTXF.setBounds(200, 130, 150,30);
		TotalTXF.setFont(new Font("Arial", Font.BOLD, 14));
		
		CalcBtn.setBounds(120, 180, 150, 40);
	}
	private void addComponentsToFrame(){
		Amount.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		Duration.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		Total.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		CalcBtn.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		
		Amount.setForeground(Color.WHITE);
		Duration.setForeground(Color.WHITE);
		Total.setForeground(Color.WHITE);
		CalcBtn.setForeground(Color.WHITE);
		
		CalcBtn.setBackground(new Color(51, 153, 255));
		
		frame.add(Amount);
        frame.add(Duration);
        frame.add(Total);

        frame.add(AmountTXF);
        frame.add(DurationTXF);
        frame.add(TotalTXF);

        frame.add(CalcBtn);
		
}
	private void addActionEvent(){
		CalcBtn.addActionListener(this);
	}

   
    	public static void main(String[] args){
    	  new Loan1();
    	}

		public void actionPerformed(ActionEvent E) {
			try {
	            double amount = Double.parseDouble(AmountTXF.getText().replace(" ", ""));
	            int years = Integer.parseInt(DurationTXF.getText());

	            double interestRate = 0.006; 
	            double total = amount + (amount * interestRate * years);

	            
	            DecimalFormatSymbols symbols = new DecimalFormatSymbols();
	            symbols.setGroupingSeparator(' ');
	            DecimalFormat formatter = new DecimalFormat("#,###", symbols);

	            TotalTXF.setText(formatter.format(total));
	        } catch (NumberFormatException ex) {
	            JOptionPane.showMessageDialog(frame, " Enter valid numbers!");
	        }
	           
	            
	            	        } 
	        }
			
		

		
    		
    	
    		   
    	   
    
  
    
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	






















