package tools.controller;

import java.util.ArrayList;
import java.util.List;

import tools.model.Kahoot;
import tools.view.PopupDisplay;

public class Controller
{
	private List<Kahoot> myKahoots;
	private PopupDisplay popup;
	
	public Controller()
	{
		myKahoots = new ArrayList<Kahoot>();
		popup = new PopupDisplay();
	}
	
	public void start()
	{
		Kahoot myFirstKahoot = new Kahoot();
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
			
			Kahoot currentKahoot = myKahoots.get(index);
			String creator = currentKahoot.getCreator();
			
			popup.displayText(myKahoots.get(index).toString());
			
			if (currentCreator.equals("nobody"))
			{
				for (int loop = 0; loop < 5; loop += 1)
				{
					popup.displayText("wow nobody does a lot");
				}
			}
//			
//			String topic = currentKahoot.getTopic();
//			
//			for (int letter = currentKahoot.getTopic().length() - 1; letter >= 0; letter -= 1)
//			{
//		
//			popup.displayText(topic.substring(letter, letter + 1));
//			}
//		}
//		
//		for (int currentLetterIndex = 0; currentLetterIndex < currentCreator.length(); currentLetterIndex += 1)
//		{
//			popup.displayText(currentCreator.substring(currentLetterIndex, currentLetterIndex + 1));
		}
	}
	
	private void fillTheList()
	{
		Kahoot fiftyStates = new Kahoot("Kashish", 50, "The fifty United States");
		Kahoot mySecondKahoot = new Kahoot("Ethan", 2, "The Double data type");
		Kahoot bigQuiz = new Kahoot("Derek", Integer.MAX_VALUE, "Everything...");
		Kahoot animalColor = new Kahoot("Branton", 10, "All the colors of the animals");
		Kahoot presidents = new Kahoot("Obama", 44, "The 44th president of the US");
		Kahoot thebest = new Kahoot("haha! 1 more", 1, " The last and final test!");
		myKahoots.add(fiftyStates);
		myKahoots.add(mySecondKahoot);
		myKahoots.add(bigQuiz);
		myKahoots.add(animalColor);
		myKahoots.add(presidents);
		myKahoots.add(thebest);
		
		myKahoots.add(4, fiftyStates);
	}
//		for (int kahoot = 0; kahoot < 5; kahoot +=1)
//		{
//			kahoot mySecondKahoot = new kahoot("Ethan", 2);
//			myKahoots.add(mySecondKahoot);	
//		}
	
	private void changeTheList()
	
	{
		popup.displayText("The current list size is:" + myKahoots.size());
		Kahoot removed =myKahoots.remove(3);
		popup.displayText("I removed the Kahoot by " + removed.getCreator());
		popup.displayText("The li now has: " + myKahoots.size() + " items inside.");
		myKahoots.add(0, removed);
		
		popup.displayText("The list is still: " + myKahoots.size() + " items big." );
		removed = myKahoots.set(2, new Kahoot());
		popup.displayText("The Kahoot by " + removed.getCreator() + " was replaced with one by: " + myKahoots.get(2).getCreator());
		
	}	
	
	public int findMaxLength(ArrayList<String> myList)
	{
		int min = Integer.MAX_VALUE;
		
		for (int index = 0; index < myList.size(); index += 1)
		{
			if (myList.get(index).length() > min)
			{
				min = myList.get(index).length();
			}
		}
		
		return min;
	}
	
	
	public PopupDisplay getPopup()
	{
		return popup;
	}
	
	public ArrayList<Kahoot> getMyKahoots()
	{
		return (ArrayList<Kahoot>) myKahoots;
	}
}
