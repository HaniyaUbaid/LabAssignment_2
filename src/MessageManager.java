import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MessageManager{
    ArrayList<Message> messages;                         //declaration of array list
    ArrayList<Contact> contacts;

    public MessageManager() {
        messages = new ArrayList<>();                   //initialization of array list
        contacts = new ArrayList<>();
    }

    public void addMessage(Message m) {               //function to add message
        messages.add(m);

    }

    public void addContact(Contact c) {              //function to add contact
        contacts.add(c);
    }


    public void SearchMessage(String message){      //function to search message
        for(Message m : messages){
            if(m.getText().equals(message)){
                System.out.println("Message found");
                return;
            }

        } System.out.println("Message not found");


    }


    public void Deletemessage(String ID){         //function to delete message
        List<Message> deletemessages = new ArrayList<>();
        boolean found = false;
        while(!found) {
            for (Message m : messages) {
                if (m.getSenderID().equals(ID) || m.getReceiverID().equals(ID)) {
                    deletemessages.add(m);
                    found = true;
                }
            }
            messages.removeAll(deletemessages);
            if (!found) {
                System.out.println("Message not found");
                break;
            }
        }
    }

    public void displaYforSpecificContact(String ID){            //function to display for specific contact
        boolean found = false;
        while(!found) {
            for (Message m : messages) {
                if (m.getSenderID().equals(ID) || m.getReceiverID().equals(ID)) {
                    String s = m.toString();
                    System.out.println(s);
                    found = true;
                }

            }
            if(!found) {
                System.out.println("Message not found");
                break;
            }
        }

    }


    public String Markmessages(String ID){                    //function to mark messages
        boolean found = false;
        while(!found) {
            for(Message m : messages){
                if (m.getSenderID().equals(ID) || m.getReceiverID().equals(ID)) {
                    m.UpdateStatus("Read");
                    System.out.println("Message marked");
                    found = true;
                }
            }
            if(!found) {
                System.out.println("Message not found");
                break;
            }

        }
        return null;
    }


    public void displayMessages(){                          //function to display message
        for(Message message:messages){
            System.out.println(message);
        }
    }
    public void displayContacts(){                       //function to display contact
        for(Contact contact:contacts){
            System.out.println(contact);
        }
    }


}
