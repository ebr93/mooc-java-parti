public class Game {

    private String team1;
    private String team2;
    private int score1;
    private int score2;

    public Game(String team1, String team2, int score1, int score2) {
        this.team1 = team1;
        this.team2 = team2;
        this.score1 = score1;
        this.score2 = score2;
    }

    public String getTeam1() {
        return team1;
    }

    public String getTeam2() {
        return team2;
    }

    //method tells me how many games were won
    public boolean winnerIs(String teamInput) {
        if(teamInput.equals(team1) && score1 > score2) {
            return true;
        }

        if(teamInput.equals(team2) && score2 > score1) {
            return true;
        }

        return false;
    }
}
