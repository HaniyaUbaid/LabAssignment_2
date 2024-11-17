import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MessageManager messageManager = new MessageManager();               //object creation
        messageManager.addMessage(new Message("1","1","Hello world","unread","12"));        //Add message
        messageManager.addMessage(new Message("2","2","Hi world","unread","12"));
        messageManager.addContact(new Contact("1","Haniya"));          //add contact
        messageManager.addContact(new Contact("1","Haniya"));
        System.out.println(" Welcome message");
        boolean istrue = true;
        while(istrue) {                                                        //user base menu
            System.out.println("Enter 1 to display Contacts");
            System.out.println("Enter 2 to display Messages");
            System.out.println("Enter 3 to send  messages");
            System.out.println("Enter 4 to search  messages");
            System.out.println("Enter 5 to Delete messages");
            System.out.println("Enter 6 to display for specific contact");
            System.out.println("Enter 7 to Mark messages");
            System.out.println("Enter 8 to Exist");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){                                            //switch case
                case 1:
                    messageManager.displayContacts();
                    break;
                case 2:
                    messageManager.displayMessages();
                    break;
                case 3:
                    System.out.print("Enter Sender ID: ");
                    String senderID = sc.nextLine();
                    System.out.print("Enter Receiver ID: ");
                    String receiverID = sc.nextLine();
                    System.out.print("Enter Message: ");
                    String text = sc.nextLine();
                    Message newMessage = new Message(senderID, receiverID, text, "unread","12");
                    messageManager.addMessage(newMessage);
                    System.out.println("Message Sent!");
                    break;
                case 4:
                    System.out.println("Enter message");
                    String m=sc.nextLine();
                    messageManager.SearchMessage(m);
                    break;
                case 5:
                    System.out.println("Enter ContactID");
                    String id=sc.nextLine();
                    messageManager.Deletemessage(id);
                    break;
                case 6:
                    System.out.println("Enter ContactID");
                    String id2=sc.nextLine();
                    messageManager.displaYforSpecificContact(id2);
                    break;
                case 7:
                    System.out.println("Enter ContactID");
                    String id3=sc.nextLine();
                    messageManager.Markmessages(id3);
                    break;
                case 8:
                    System.out.println("Goodbye Message");
                    istrue = false;
                    break;
            }
        }
    }
}