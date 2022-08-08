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
	private String _name;
	private int _wins;
	private int _losses;

	// Constructor
	public Team(String name, int wins, int losses)
	{
		setName();
		setWins();
		setLosses();
	}

	public void setName()
	{
	}

	public String getName()
	{
		return "NA"; // TODO: Return name
	}

	public float getWinPercentage()
	{
		return 0.0f; // TODO: Return the win percentage
	}

	public void printStanding()
	{
		// TODO: output the win percentage of the team with two digits after
		// the decimal point and whether the team has a winning or losing average.
		// A team has a winning average if the win percentage is 0.5 or greater.
	}
}
