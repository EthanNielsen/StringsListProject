package stringlist.model;

public class kahoot
{
	private int questionCount;
	private int level;
	private String creator;
	private boolean isJumble;
	
	
	
	public kahoot()
	{
		this.questionCount = 0;
		this.level = 1;
		this.creator = "nobody";
		this.isJumble = false;
	}
	
	public kahoot(String creator, int questionount)
	{
		this.creator = creator;
		this.questionCount = questionCount;
	}
}
