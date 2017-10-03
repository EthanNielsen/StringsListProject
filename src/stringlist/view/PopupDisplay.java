package stringlist.view;

import javax.swing.JOptionPane;

public class PopupDisplay
{
	/**
	 * Displays a popup showing the supplied String to the user.
	 * @param textToDisplay The text to be displayed.
	 */
	public void displayText(String textToDisplay)
	{
		JOptionPane.showMessageDialog(null,  textToDisplay);
	}
	
	/**
	 * Uses a popup to display a question to the user and returns their response as a Stringg.
	 * @param fromQuestion The question being asked.
	 * @return The users response to the question.
	 */
	public String getResponse(String fromQuestion)
	{
		String answer = "";
		
		answer += JOptionPane.showInputDialog(null, fromQuestion);
		
		return answer;
	}
}
