import java.util.Arrays;
import java.util.Scanner; 

public class TicTacToe {

	public static void main(String[] args) 
	{
		
		// Definir tableau 2D //
		// Afficher tableau //
		// Saisir coordonnées //
		// Afficher là où on a choisit la coordonnée // 
		int x = 0;
		int y = 0;  
		String[][] array2D = new String[][] {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
		System.out.println("Welcome in the game TicTacToe ! :)");
		System.out.println("You will be playing against the computer, good luck ;)");
		int tours = 1;
		
		System.out.println("Enter X & Y cordinates for your move : ");
		Scanner in = new Scanner(System.in);
		
		do
		{
			if((tours % 2) == 1)
			{
				System.out.println("Player 1 play : ");
			}
			else
			{
				System.out.println("Player 2 play: ");
			}
			x = in.nextInt();
			y = in.nextInt();
			printBoard(array2D, tours, x, y);
			tours = tours + 1;
		}while(tours != 5);
		
		
	}
	
	public static void printBoard(String[][] array2D, int tours, int x, int y)
	{
		String player;
			if((tours % 2) == 1  )
			{
				// You play //
				//System.out.println("Player 1 play : ");
				player = "X";
			}
			else
			{
				// Computer play // 
				//System.out.println("Player 2 play: ");
				player = "O";
				
			}		
				for(int i=0; i<array2D.length; i++)
				{
					System.out.print("|");
					for(int j=0; j<array2D.length; j++)
					{
						if(i==x && j==y)
						{
							array2D[i][j] = player;
							//tours = tours +1;
						}
						System.out.print(array2D[i][j] += "|");
					}
					System.out.print("\n");
				}
			System.out.print("\n");
	}
}
