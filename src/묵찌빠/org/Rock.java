package 묵찌빠.org;

public class Rock {
	import java.util.Scanner;

	public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] rps = { "rock", "paper", "scissors" };
        int computer = (int) (Math.random() * 3);

        System.out.print("Enter your move (rock, paper, or scissors): ");
        String player = sc.nextLine();

        if (!player.equals("rock") && !player.equals("paper") && !player.equals("scissors")) {
            System.out.println("Invalid move. Please enter rock, paper, or scissors.");
        } else {
            System.out.println("Computer: " + rps[computer]);
            System.out.println("Player: " + player);

            if (player.equals(rps[computer])) {
                System.out.println("Tie!");
            } else if ((player.equals("rock") && rps[computer].equals("scissors"))
                    || (player.equals("paper") && rps[computer].equals("rock"))
                    || (player.equals("scissors") && rps[computer].equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }
        sc.close();
    }
}


}
