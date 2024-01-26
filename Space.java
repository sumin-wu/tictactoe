
public class Space
 {
	public String spaceIcon;  
  public String position; 

	public Space(String p) //constructor
    {
		spaceIcon = "_";
    position = p;
	  }
 



  public void printLine()
  {
    System.out.print(spaceIcon);
  }

  public String returnSpace()
  {
    return spaceIcon;
  }

  public void setPosition(String symbol)
  {
    spaceIcon = symbol;
  }

   
 }

