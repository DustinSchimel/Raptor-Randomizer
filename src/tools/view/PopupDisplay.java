package tools.view;

import javax.swing.JOptionPane;

public class PopupDisplay
{
	public void displayText(String textToDisplay)
	{
		JOptionPane.showMessageDialog(null, textToDisplay);
	}
	
	public String getResponse(String questionToDisplay)
	{
		String answer = "";
		
		answer += JOptionPane.showInputDialog(null, questionToDisplay);
		
		return answer;
	}
}
