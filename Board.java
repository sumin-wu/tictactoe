
public class Board 
{
	public Space a, b, c, d, e, f, g, h, i;

  //Space s = new Space();

	public Board()
	{
		a = new Space("a");
		b = new Space("b");
		c = new Space("c");
		d = new Space("d");
		e = new Space("e");
		f = new Space("f");
		g = new Space("g");
		h = new Space("h");
		i = new Space("i");
	}

  public void displayBoard()
  {
    a.printLine();
    b.printLine();
    c.printLine();
    System.out.println();
    d.printLine();
    e.printLine();
    f.printLine();
    System.out.println();
    g.printLine();
    h.printLine();
    i.printLine();
    System.out.println();
  }
 public boolean isEmpty(String position) //fix this
  {
    if (position.equals("a") && (a.returnSpace().equals("_")))
    {
      return true;
    }
    if (position.equals("b") && (b.returnSpace().equals("_")))
    {
      return true;
    }
    if (position.equals("c") && (c.returnSpace().equals("_")))
    {
      return true;
    }
    if (position.equals("d") && (d.returnSpace().equals("_")))
    {
      return true;
    }
    if (position.equals("e") && (e.returnSpace().equals("_")))
    {
      return true;
    }
    if (position.equals("f") && (f.returnSpace().equals("_")))
    {
      return true;
    }
    if (position.equals("g") && (g.returnSpace().equals("_")))
    {
      return true;
    }
    if (position.equals("h") && (h.returnSpace().equals("_")))
    {
      return true;
    }
    if (position.equals("i") && (i.returnSpace().equals("_")))
    {
      return true;
    }
    return false;
  }


  public void makeMove(Player currentPlayer, String position) 
  {
   if (currentPlayer.getSymbol().equals("X"))
   { 
     if(position.equals("a")){
       a.setPosition("X");
     }
     if(position.equals("b")){
       b.setPosition("X");
     }
     if(position.equals("c")){
       c.setPosition("X");
     }
     if(position.equals("d")){
       d.setPosition("X");
     }
     if(position.equals("e")){
       e.setPosition("X");
     }
     if(position.equals("f")){
       f.setPosition("X");
     }
     if(position.equals("g")){
       g.setPosition("X");
     }
     if(position.equals("h")){
       h.setPosition("X");
     }
     if(position.equals("i")){
       i.setPosition("X");
     }
   }
    if (currentPlayer.getSymbol().equals("O"))
   { 
     if(position.equals("a")){
       a.setPosition("O");
     }
     if(position.equals("b")){
       b.setPosition("O");
     }
     if(position.equals("c")){
       c.setPosition("O");
     }
     if(position.equals("d")){
       d.setPosition("O");
     }
     if(position.equals("e")){
       e.setPosition("O");
     }
     if(position.equals("f")){
       f.setPosition("O");
     }
     if(position.equals("g")){
       g.setPosition("O");
     }
     if(position.equals("h")){
       h.setPosition("O");
     }
     if(position.equals("i")){
       i.setPosition("O");
     }
   }
  }
  
    public boolean checkDiagonals(Player currentPlayer)
  {
  if (a.returnSpace().equals(e.returnSpace()) && (e.returnSpace().equals(i.returnSpace())))
    {
      if ((!a.returnSpace().equals("_")) && (!e.returnSpace().equals("_")) && (!i.returnSpace().equals("_")))
      {
      return true;
      }  
    }
     if (c.returnSpace().equals(e.returnSpace()) && (e.returnSpace().equals(g.returnSpace()))) 
    {
        if ((!c.returnSpace().equals("_")) && (!e.returnSpace().equals("_")) && (!g.returnSpace().equals("_")))
        {
        return true;
        }
    }
      return false;
  }

  public boolean checkRows(Player currentPlayer)
  {
   if (a.returnSpace().equals(b.returnSpace()) && (b.returnSpace().equals(c.returnSpace()))) 
    {
      if ((!a.returnSpace().equals("_")) && (!b.returnSpace().equals("_")) && (!c.returnSpace().equals("_")))
      {
      return true;
      }  
    }
   if (d.returnSpace().equals(e.returnSpace()) && (e.returnSpace().equals(f.returnSpace()))) 
    {
       if ((!d.returnSpace().equals("_")) && (!e.returnSpace().equals("_")) && (!f.returnSpace().equals("_")))
       {
       
      return true;
       }  
    }
    if (g.returnSpace().equals(h.returnSpace()) && (h.returnSpace().equals(i.returnSpace()))) 
    {
      if ((!g.returnSpace().equals("_")) && (!h.returnSpace().equals("_")) && (!i.returnSpace().equals("_")))
      {
      
      return true;
      }  
    }
    return false;
  }

  public boolean checkColumns(Player currentPlayer)
  {
    if ((a.returnSpace()).equals(d.returnSpace()) && ((d.returnSpace()).equals(g.returnSpace()))) 
    {
      if ((!a.returnSpace().equals("_")) && (!d.returnSpace().equals("_")) && (!g.returnSpace().equals("_")))
      {
     
      return true;
      }  
    }
    if ((b.returnSpace()).equals(e.returnSpace()) && ((e.returnSpace()).equals(h.returnSpace()))) 
    {
      if ((!b.returnSpace().equals("_")) && (!f.returnSpace().equals("_")) && (!h.returnSpace().equals("_")))
      {
  
      return true;
      } 
    }

   if ((c.returnSpace()).equals(f.returnSpace()) && ((f.returnSpace()).equals(i.returnSpace()))) 
    {
      if ((!c.returnSpace().equals("_")) && (!f.returnSpace().equals("_")) && (!i.returnSpace().equals("_")))   
      {
       
      return true;
      }  
    }
    return false;
  }
        
  public void printWinner (Player currentPlayer)
  {
System.out.println(currentPlayer.playerName + " won.");
  }
}