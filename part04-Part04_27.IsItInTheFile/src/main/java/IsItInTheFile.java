
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {  
                nameList.add(fileReader.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

        while (nameList.size() > 0) {
            if (nameList.contains(searchedFor)) {
                System.out.println("Found!");
                break;
            } else {
                System.out.println("Not found.");
                break;
            }
        }
    }
}

/* 
MOOC DID NOT USE ARRAYLIST, BUT I THINK THAT WAS THE INFERIOR METHOD
                String line = fileReader.nextLine();
                if (!line.contains(searchedFor)) 
made a variable for the fileReader.nextLine... which changed with each loop
if this (line) variable does not contain (SearchedFor) the 

        int lines = 0;
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
 
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if (!line.contains(searchedFor)) {
                    continue;
                }
 
                lines++;
            }
 
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
 
        if (lines == 0) {
            System.out.println("Not found.");
        } else {
            System.out.println("Found!");
        }
*/