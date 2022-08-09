import java.util.Scanner;// user import

public class TestTeam {

    public static void main(String[] args) {
        Scanner teamsData = new Scanner(System.in);
        System.out.println(" Insert the team's name: ");
        String name=teamsData.nextString();
        System.out.println(" Insert the team's wins: ");
        int wins= teamsData.nextInt();
        System.out.println(" Insert the team's losses: ");
        int losses= teamsData.nextInt();

        Team result= new Team();
        result.setName(name);
        result.setLosses(losses);
        result.setWins(wins);


        System.out.println(result.printStanding());
    }


}
