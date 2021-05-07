package tictactoe;
import java.util.*;
public class TicTacToe 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		do
		{
			Grid g = new Grid();
			char x = 'X', o = 'O', player;
			int move;
			g.printGrid();
			for(int i = 0; i < 9; i++)
			{
				if(i % 2 == 0)
				{
					player = x;
				}
				else
				{
					player = o;
				}
				boolean valid = false;
				do
				{
					System.out.print("Player " + player + ": Make your move: ");
					move = sc.nextInt();
					if(g.makeMove(move, player))
					{
						valid = true;
					}
				}while(!valid);
				g.printGrid();
				if(g.checkWin())
				{
					break;
				}
			}
			if(g.win)
			{
				System.out.print("Winner: ");
				if(g.xWin)
				{
					System.out.println("X");
				}
				else
				{
					System.out.println("O");
				}
			}
			else
			{
				System.out.println("No Winner!");
			}
			System.out.println("\n\nWould you like to play again? \n1. Yes\n2. No\n");
			choice = sc.nextInt();
		}while(choice == 1);
		sc.close();
		System.out.println("Thank you for playing. Goodbye!");
	}
}
