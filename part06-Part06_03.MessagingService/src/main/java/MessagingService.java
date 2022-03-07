import java.util.ArrayList;

//only parameter needed is (ArrayList)
public class MessagingService {
    private ArrayList<Message> list;
    
    //constructor is parameterless
    public MessagingService() {
        this.list = new ArrayList<>();
    }

    //(getSender) and (getContent) receives the values from (Message) class
    public void add(Message message) {
        String sender = message.getSender();
        String content = message.getContent();

        //puts values together into (newMessage)
        Message newMessage = new Message(sender, content);
        
        //if its less than 280 characters then it is added to ArrayList
        if (newMessage.getContent().length() <= 280) {
            this.list.add(newMessage);
        }
        //could have typed this without the newMessage variable;
        //this.messages.add(message);
    }

    //returns to print ArrayList of messages that were added
    public ArrayList<Message> getMessages() {
        return list;
    }

}
