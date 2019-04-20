package Comparisons;

public class Player implements Comparable<Player> {



    String firstname;
    String lastname;
    int age;
    int goals;
    int assists;
    int appearances;
    public double goalsToGameRatio;


    public Player(String firstname, String lastname, int age, int goals, int assists, int appearances){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.goals = goals;
        this.assists = assists;
        this.appearances = appearances;
        this.goalsToGameRatio = Math.round(((double) goals / (double) appearances)*100.00)/100.00;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
        updateGTGR();
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getAppearances() {
        return appearances;
    }

    public void setAppearances(int appearances) {
        this.appearances = appearances;
        updateGTGR();
    }

    public void updateGTGR(){
        this.goalsToGameRatio = Math.round(((double) this.goals / (double) this.appearances)*100.00)/100.00;

    }


    //Solution
    @Override
    public int compareTo(Player p){
        return this.lastname.compareTo(p.lastname);
    }

    public String toString(){
        return firstname + " " + lastname + " | " + "Age: " + age + " | " + "Goals: " + goals + " | " + "Assists: " + assists + " | " + "Appearances: " + appearances + " | " + " Goals per game: " + goalsToGameRatio;
    }
}
