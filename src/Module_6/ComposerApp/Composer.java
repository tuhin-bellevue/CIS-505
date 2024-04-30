package Module_6.ComposerApp;

/*
    Daw, Tuhin(2024), CIS-505 Intermediate Java Programming. Bellevue University, all rights reserved.
    Test class to test Module 6 assignment
 */
public class Composer {

    private int id = 0;
    private String name = "";

    private String genre = "";

    public Composer() {
    }

    public Composer(int id, String name, String genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "---Composer---"+ "\n" +
                "id:" + id + "\n" +
                "name:" + name + "\n" +
                "genre: " + "$ "+ genre + "\n";
    }
}
