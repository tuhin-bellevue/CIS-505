package Module_2.JarPracticeFiles;

import java.util.Scanner;

/*
    Daw, Tuhin(2024), CIS-505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

/*
    Java class with main method to test class Team
 */
public class TestSportsTeamApp {
    /**
     * Main method to test functionality of Team class.
     * This method takes user input as team name as a String and team members names as comma separated String
     * and display team size along with team member names.
     * User can continue as many times as they want and also have the ability to quit
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the Sports Team App");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a team name:");
            String teamName = scanner.nextLine();
            Team team = new Team(teamName);
            System.out.println("Enter the player names :");
            String[] players = scanner.nextLine().split(",");
            for (String player : players) {
                team.addPlayer(player);
            }
            System.out.println("---Team Summary---");
            System.out.println("Number of players in team : " + team.getPlayerCount());
            StringBuilder names = new StringBuilder();
            for (String name : team.getPalyers()) {
                if (null != name)
                    names.append(name).append(",");
            }
            String teamMembers = names.deleteCharAt(names.length() - 1).toString();
            System.out.println("Players on team: " + teamMembers);
            System.out.println("Continue? (y/n):");
            String userDecision = scanner.nextLine();
            if("n".equalsIgnoreCase(userDecision))
                break;
        }
    }
}
