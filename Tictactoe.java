
/* CONSTRUCTING THE GAME

The TicTacToe class is our control class.

That’s just a fancy way of saying it will run the whole game.

When creating a control class for a game, you have to think about the parts of the
game that need representation.

For Tic Tac Toe, we need 2 players and a board. */

public class Tictactoe
{
    public Board theBoard;
    Board b = new Board();
    int count = 0;
    
  public void runGame()
    {
      String p = "";
      Player player1 = new Player();
      Player player2 = new Player(); 
      System.out.println("Welcome to TicTacToe. What are your names?");
      player1.playerName = Jin.readLine("Player 1 Name: ");
      player1.playerSymbol = ("X");
      player2.playerName = Jin.readLine("Player 2 Name: ");
      player2.playerSymbol = ("O");
      System.out.println("These letters correspond with their following space. Please use lower case when indicating the space you choose.");
      System.out.println("a b c");
      System.out.println("d e f");
      System.out.println("g h i");
      b.displayBoard();

      
      while (count <10 && checkWinner(player1) == false && checkWinner(player2) == false)
      {
              p = Jin.readLine("Make a move " + player1.playerName + " ");
        
        while (!b.isEmpty(p))
        {
          System.out.println("Choose another space.");
          p = Jin.readLine("Make a move " + player1.playerName + " ");
        }
        if (b.isEmpty(p))
          {
            b.makeMove(player1, p);
              b.displayBoard();
            ++count;
             if (count == 5) 
                {
                  if (checkWinner(player1) == true)
                    { 
                      System.out.println(player1.playerName + " won.");
                      break;
                    }
               }
            if (count >6)
            { 
              if (checkWinner(player1) == true)
              {
                System.out.println(player1.playerName + " won");
                break;
              }
              if (checkWinner(player2) == true)
              {
                System.out.println(player2.playerName + " won");
                break;
              }
              if (checkWinner(player1) == false && checkWinner(player2) == false)
              {
                if (count == 9)
                {
                System.out.println("Game is tied.");
                  break;
                }
              }
            } 
            } 
              p = Jin.readLine("Make a move " + player2.playerName + " ");
        
        while (!b.isEmpty(p))
        {
          System.out.println("Choose another space.");
          p = Jin.readLine("Make a move " + player2.playerName + " ");
        }
          
        if (b.isEmpty(p))
          {
            b.makeMove(player2, p);
              b.displayBoard();
            ++count;
            if (count == 6) //issue: after player1 wins, player 2 keeps playing???// xxx/oo
            {
              if (checkWinner(player2) == true)
              {
               System.out.println(player2.playerName + " has won the game!");
                 break;
                }
              }
            }

            if (count == 7)
            { 
              if (checkWinner(player1) == true)
                  {
                System.out.println(player1.playerName + " has won the game");
                break;
                  }
            }
            if (count == 8)
            {
              if (checkWinner(player2) == true)
              {
                System.out.println(player2.playerName + " has won the game");
                break;
              }
            }
        if (count == 9)
        {
          if (checkWinner(player1) == false && checkWinner(player2) == false)
          {
            System.out.println("There is a tie!");
              break;
          }
        }
      }
    }

  public boolean checkWinner(Player currentPlayer)
  { 
    if (b.checkDiagonals(currentPlayer) == true)
    {
      return true;
    }
    
    if (b.checkRows(currentPlayer) == true)
      {
      return true;
      }
  
    if (b.checkColumns(currentPlayer) == true)
    {
      return true;
    }
      return false;
  }
}
  
    