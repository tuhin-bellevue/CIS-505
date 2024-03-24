package Module_2.JarPracticeFiles;

/*
    Daw, Tuhin(2024), CIS-505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

public class Team {

    private String teamName = "";

    private String[] palyers = new String[20];

    private int playerCount = 0;

    public Team(String teamName){
        this.teamName = teamName;
    }

    public String[] getPalyers() {
        return palyers;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getPlayerCount() {
        return playerCount;
    }

    /**
     * Method with one String argument which is used to insert value in the String Array and increment the player count
     * @param newPlayer String
     */
    public void addPlayer(String newPlayer) {
        palyers[this.playerCount] = newPlayer;
        playerCount++;
    }
}
