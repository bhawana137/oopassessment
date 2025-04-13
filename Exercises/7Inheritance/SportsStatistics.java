/*
Player Statistics
Design and implement a set of classes that keep track of various player sports statistics (PlayerStats). Have a lower level (sub) class that 
represent specific sports (FootballStats, CricketStats…). Tailor the services of the classes to the sport in question, with common attributes and
methods in the higher-level class, as appropriate. Create a driver class to instantiate and text instances of the classes.
*/

package week7;

//Base class for all player stats
class PlayerStats {
 int playerId;  // Player ID
 String playerName;  // Player Name

 // Constructor to initialize player details
 public PlayerStats(int playerId, String playerName) {
     this.playerId = playerId;
     this.playerName = playerName;
 }

 // Display player's basic info
 public void displayPlayerInfo() {
     System.out.println("Player ID: " + playerId);
     System.out.println("Player Name: " + playerName);
 }
}

//Football stats class that extends PlayerStats
class FootballStats extends PlayerStats {
 int goals;  // Goals scored by the player
 int assists;  // Assists made by the player

 // Constructor to initialize football player details
 public FootballStats(int playerId, String playerName, int goals, int assists) {
     super(playerId, playerName);  // Call the base class constructor
     this.goals = goals;
     this.assists = assists;
 }

 // Display football player's stats
 public void displayFootballStats() {
     displayPlayerInfo();  // Display basic info from PlayerStats class
     System.out.println("Goals Scored: " + goals);
     System.out.println("Assists: " + assists);
 }
}

//Cricket stats class that extends PlayerStats
class CricketStats extends PlayerStats {
 int runs;  // Runs scored by the player
 int wickets;  // Wickets taken by the player

 // Constructor to initialize cricket player details
 public CricketStats(int playerId, String playerName, int runs, int wickets) {
     super(playerId, playerName);  // Call the base class constructor
     this.runs = runs;
     this.wickets = wickets;
 }

 // Display cricket player's stats
 public void displayCricketStats() {
     displayPlayerInfo();  // Display basic info from PlayerStats class
     System.out.println("Runs Scored: " + runs);
     System.out.println("Wickets Taken: " + wickets);
 }
}

//Driver class to test the functionality
public class SportsStatistics {

 public static void main(String[] args) {
     // Create a football player with some stats
     FootballStats footballPlayer = new FootballStats(1, "Lionel Messi", 50, 20);

     // Create a cricket player with some stats
     CricketStats cricketPlayer = new CricketStats(2, "Virat Kohli", 4500, 0);

     // Display football player's stats
     System.out.println("------ Football Player Stats ------");
     footballPlayer.displayFootballStats();
     
     // Display cricket player's stats
     System.out.println("\n------ Cricket Player Stats ------");
     cricketPlayer.displayCricketStats();
 }
}
