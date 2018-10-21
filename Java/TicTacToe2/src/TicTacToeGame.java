import java.util.Scanner;

public class TicTacToeGame {
	public static void main(String[] args)
	{
		// Afficher la grille //
		// Saisir les coordonnées //
		String board[][] = new String[3][3]; 
		System.out.println("Welcome in the game TicTacToe ! :)");
		System.out.println("You will be playing against the computer, good luck ;)");
		System.out.println("Enter X & Y cordinates for your move : ");
		int coordX; 
		int coordY;
		Scanner in = new Scanner(System.in);
		coordX = in.nextInt();
		coordY = in.nextInt();
		
		printBoard(board, coordX, coordY);
		
		
	}
	
	public static void printBoard(String[][] board, int coordX, int coordY)
	{
		
		
	}

}
