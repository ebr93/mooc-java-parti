import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todoList;

    public TodoList() {
        this.todoList = new ArrayList<>();
    }

    public void add(String task) {
        this.todoList.add(task);
    }

    //uses for loop to run through list
    //variable used as index to indicate the order of command
    public void print() {
        int index = 1;

        for (String list : todoList) {
            System.out.println(index + ": " + list);
            index++;
        }
    }

    //(.remove) helps to remove an object from the list
    //the number helps identify which one, have to subtract by 1 to erase the correct one
    //ArrayList count from 0   
    public void remove(int number) {
        this.todoList.remove(number-1);
    }
}
