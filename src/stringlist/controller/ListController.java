package stringlist.controller;

import java.util.ArrayList;
import java.util.List;

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
			
			String topic = currentKahoot.getTopic();
			
			for (int letter = currentKahoot.getTopic().length() - 1; letter >= 0; letter -= 1)
			{
				popup.displayText(topic.substring(letter, letter + 1));
			}
		}
		
		for (int currentLetterIndex = 0; currentLetterIndex < currentCreator.length(); currentLetterIndex += 1)
		{
			popup.displayText(currentCreator.substring(currentLetterIndex, currentLetterIndex + 1));
		}
	}
	
	private void fillTheList()
	{
		kahoot fiftyStates = new kahoot("Kashish", 50, "The fifty United States");
		kahoot mySecondKahoot = new kahoot("Ethan", 2, "The Double data type");
		kahoot bigQuiz = new kahoot("Derek", Integer.MAX_VALUE, "Everything...");
		kahoot animalColor = new kahoot("Branton", 10, "All the colors of the animals");
		kahoot presidents = new kahoot("Obama", 44, "The 44th president of the US");
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
	private void changeTheList()
	{
		popup.displayText("The current list size is:" + myKahoots.size());
		kahoot removed =myKahoots.remove(3);
		popup.displayText("I removed the Kahoot by " + removed.getCreator());
		popup.displayText("The li now has: " + myKahoots.size() + " items inside.");
		myKahoots.add(0, removed);
		
		popup.displayText("The list is still: " + myKahoots.size() + " items big." );
		removed = myKahoots.set(2, new kahoot());
		popup.displayText("The Kahoot by " + removed.getCreator() + " was replaced with one by: " + myKahoots.get(2).getCreator());
		
	}	
}
