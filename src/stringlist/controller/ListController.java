package stringlist.controller;

import java.util.List;
import java.util.ArrayList;
import stringlist.model.kahoot;
import stringlist.view.PopupDisplay;

public class ListController
{
	private List<kahoot> myKahoots;
	private PopupDisplay popup;
	
	public ListController()
	{
		myKahoots = new ArrayList<kahoot>();
		popup = new PopupDisplay();
	}
	
	public void start()
	{
		kahoot myFirstKahoot = new kahoot();
		myKahoots.add(myFirstKahoot);
		fillTheList();
		showTheList();
	}	
	
	private void showTheList()
	{
		String currentCreator = "";
		for (int index = 0; index < myKahoots.size(); index += 1)
		{
			currentCreator = myKahoots.get(index).getCreator();
			
			kahoot currentKahoot = myKahoots.get(index);
			String creator = currentKahoot.getCreator();
			
			popup.displayText(myKahoots.get(index).toString());
			
			if (currentCreator.equals("nobody"))
			{
				for (int loop = 0; loop < 5; loop += 1)
				{
					popup.displayText("wow nobody does a lot");
				}
			}
		}
		
		for (int currentLetterIndex = 0; currentLetterIndex < currentCreator.length(); currentLetterIndex += 1)
		{
			popup.displayText(currentCreator.substring(currentLetterIndex, currentLetterIndex + 1));
		}
	}
	
	private void fillTheList()
	{
		kahoot fiftyStates = new kahoot("Kashish", 50);
		kahoot mySecondKahoot = new kahoot("Ethan", 2);
		kahoot bigQuiz = new kahoot("Derek", Integer.MAX_VALUE);
		kahoot animalColor = new kahoot("Branton", 10);
		kahoot presidents = new kahoot("Obama", 44);
		myKahoots.add(fiftyStates);
		myKahoots.add(mySecondKahoot);
		myKahoots.add(bigQuiz);
		myKahoots.add(animalColor);
		myKahoots.add(presidents);
	}
//		for (int kahoot = 0; kahoot < 5; kahoot +=1)
//		{
//			kahoot mySecondKahoot = new kahoot("Ethan", 2);
//			myKahoots.add(mySecondKahoot);	
//		}

}
