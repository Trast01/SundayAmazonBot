package org.itstep.view; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.itstep.model.Reversing;

public class MainWindow extends JFrame{
	private JTextField outField;



public MainWindow (String title)
{
setTitle("Reverso");
setSize(400,222);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setVisible(true);
setLocation(200,200);

setResizable(false);
getContentPane().setLayout(null);

JEditorPane revitems = new JEditorPane();
revitems.setText("Enter Reversable Text");
revitems.setBounds(10, 46, 291, 28);
getContentPane().add(revitems);

Reversing revmethod = new Reversing();

JButton btnNewButton = new JButton("Reverse ");
btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {

	outField.setText(revmethod.reverseText(revitems.getText()));	
	//revitems.setText("");
	
	getContentPane().repaint();
	}
});

btnNewButton.setBounds(10, 160, 89, 23);
getContentPane().add(btnNewButton);

outField = new JTextField();
outField.setEditable(false);
outField.setColumns(10);
outField.setBounds(10, 85, 374, 57);
getContentPane().add(outField);


JLabel lblNewLabel = new JLabel("Enter the reversable text");
lblNewLabel.setBounds(10, 21, 291, 14);
getContentPane().add(lblNewLabel);
JButton btnNewButton_1 = new JButton("Decimal Delimitter");
btnNewButton_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		outField.setText(revmethod.numericDelimiter(revitems.getText()));	
	}
});
btnNewButton_1.setBounds(110, 160, 149, 23);
getContentPane().add(btnNewButton_1);



}






}