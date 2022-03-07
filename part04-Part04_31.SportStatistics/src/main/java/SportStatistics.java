
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();

        //reads file, uses method made to read file
        //breaks up information in the way we want it
        ArrayList<Game> games = readingRecordsFromFile(fileName);

        //tells me how many games team plays
        //creates new list and loop compares it to (games) and keeps only (team) information
        //(gamesOfTeam) list keeps only the (team) info
        ArrayList<Game> gamesOfTeam = new ArrayList<>();
        for(Game game : games){
            //team variables checks the value of (game) output
            //(game) is the variable that is checked and uses modules from class and goes through loop
            if (team.equals(game.getTeam1()) || team.equals(game.getTeam2())) {
                gamesOfTeam.add(game);
            }
        }
        //Number of games played
        System.out.println("Games: " + gamesOfTeam.size());

        //Tracker for wins/losses
        //use previous list already made
        //use boolean method (.winnerIs(team) to determine information)
        int wins = 0;
        for(Game game : gamesOfTeam) {
            if(game.winnerIs(team)) {
                wins++;
            }
        }

        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (gamesOfTeam.size() - wins));
    }


    public static ArrayList<Game> readingRecordsFromFile(String file) {
        ArrayList<Game> games = new ArrayList<>();
    
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            //keeps reading until there's no more line
            //below we have the objects broken up
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if(line.isEmpty()) {
                    continue;
                }
    
                String[] parts = line.split(",");

                String team1 = parts[0];
                String team2 = parts[1];
                int score1 = Integer.valueOf(parts[2]);
                int score2 = Integer.valueOf(parts[3]);
    
                //adds team if it was mention in a game

                games.add(new Game(team1, team2, score1, score2));
            }
        } catch (Exception e) {
            System.out.println("Could not read file");
        }
        
        return games;
    
    }

}



/* 

        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();

        //Tracker for wins/losses
        int wins = 0;
        int losses = 0;
        //Scanner for files
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            //keeps reading until there's no more line
            //below we have the objects broken up
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(",");
                String team1 = parts[0];
                String team2 = parts[1];
                int score1 = Integer.valueOf(parts[2]);
                int score2 = Integer.valueOf(parts[3]);

                //adds team if it was mention in a game
                //helps us deduce whether the team lost or won the game
                if (team1.equals(team)) {
                    list.add(team1);
                    if (score1 > score2) {
                        wins++;
                    } else {
                        losses++;
                    }
                } else if (team2.equals(team)) {
                    list.add(team2);
                    if (score2 > score1) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Could not read file");
        }

        System.out.println("Games: " + list.size());
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
*/