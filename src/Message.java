public class Message {
    private String SenderID;                              //Attributes
    private String ReceiverID;
    private String Text;
    private String Status;
    private String Timestamp;
    public Message(String SenderID, String ReceiverID, String Text, String Status, String Timestamp) {             //Constructor
        this.SenderID = SenderID;
        this.ReceiverID = ReceiverID;
        this.Text = Text;
        this.Status = Status;
        this.Timestamp = Timestamp;

    }

    public String getSenderID() {
        return SenderID;
    }

    public void setSenderID(String senderID) {
        SenderID = senderID;
    }

    public String getReceiverID() {
        return ReceiverID;
    }

    public void setReceiverID(String receiverID) {
        ReceiverID = receiverID;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public String getStatus() {
        return Status;
    }

    public void UpdateStatus(String status) {
        Status = status;
    }

    public String getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(String timestamp) {
        Timestamp = timestamp;
    }

    @Override
    public String toString() {                         //function to display message
        return "Message{" +
                "SenderID='" + SenderID + '\'' +
                ", ReceiverID='" + ReceiverID + '\'' +
                ", Text='" + Text + '\'' +
                ", Status='" + Status + '\'' +
                ", Timestamp='" + Timestamp + '\'' +
                '}';
    }

    public boolean equals(Object o){                  //equals function
        Message m = (Message)o;
        return m.getText().equals(this.getText());
    }



}
