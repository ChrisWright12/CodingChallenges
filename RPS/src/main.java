import java.util.*;
public class main
{
    public void game(String player1_choice, String player2_choice)
    {
        if(player1_choice.equals(player2_choice))
        {
            System.out.println("It's a TIE");
        }
        else
        {
            if(player1_choice.equals("Rock"))
            {
                if(player2_choice.equals("Paper"))
                {
                    System.out.println("Player2 wins");
                }
                else
                {
                    if(player2_choice.equals("Scissor"))
                        System.out.println("Player1 wins");
                }
            }
            else if(player1_choice.equals("Paper"))
            {
                if(player2_choice.equals("Scissor"))
                {
                    System.out.println("Player2 wins");
                }
                else
                {
                    if(player2_choice.equals("Rock"))
                        System.out.println("Player1 wins");
                }
            }
            else if(player1_choice.equals("Scissor"))
            {
                if(player2_choice.equals("Paper"))
                {
                    System.out.println("Player1 wins");
                }
                else
                {
                    if(player2_choice.equals("Rock"))
                        System.out.println("Player2 wins");
                }
            }
            else
            {
                System.out.println("Something is wrong!!!Please Re-enter your choices");
            }
        }
    }
   public static void main(String[] args) {
        String player1_choice,player2_choice;
        main obj=new main();
        Scanner scan=new Scanner(System.in);
        System.out.print("Player1, Enter your choice (Rock,Paper,Scissor): ");
        player1_choice=scan.nextLine();
        System.out.print("Player2, Enter your choice (Rock,Paper,Scissor): ");
        player2_choice=scan.nextLine();
        obj.game(player1_choice,player2_choice);
   }
}