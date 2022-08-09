/******************************************************************************/
// Team Members: Olga Timbur, Ali Abdi, Tyrell Mercolino, Carlos Cruz
// Course: IT211
// Project: Winning Team Final Project
// Last Modification: 08/08/22
//
// Purpose: Create a class that determines if a team has a winning or losing average based on team wins and losses.
// Assumptions:
//		User input ex. -	Raven 13 3 (team name, wins, losses)
//
//		Output ex. -		Win percentage: 0.81
//							Congratulations, Team Ravens has a winning average!
//
//		winPercentage >= 0.5 is winning and winPercentage < 0.5 is losing
//
//		Calculating win percentage rounding to 2 digits after the decimal
//		Helper function - System.out.printf("Win percentage: %.2f\n", winPercentage);
//
//
/******************************************************************************/

public class Team {
	private String name;
	private int wins;
	private int losses;

	// Constructor
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;

	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public double getWinPercentage() {

		if (wins == 0 && losses == 0) {
			return -1;
		} else {

			return (double) wins / (wins + losses); // the result will be f

		}

	}

	public void printStanding() {

		if (getWinPercentage() >= 0.5) // determine if the winning score if >=0.5
		{
			System.out.format("Win percentage: %.2f\n", getWinPercentage());
			System.out.println("Congratulations, team " + getName() + " has a winning average!");

		} else if (getWinPercentage() == -1) {
			System.out.println("The team did not win anything");
		} else {
			System.out.format("Win percentage: %.2f\n", getWinPercentage());
			System.out.println("Team " + getName() + " has a losing average.");
		}
	}
}
