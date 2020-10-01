import java.util.ArrayList;

public class EmailChannel implements IChannel {
    @Override
    public void receiveMessage(Message message, ArrayList<IAttachment> attachments) {
        System.out.println("Email receive message \n" + "Name: " + message.getUserName() + "\nSend time: " + message.sendTime
                + "\nContent: " + message.getText());
        System.out.println(message + "\n");
        if (attachments != null && attachments.size() > 0) {
            for (IAttachment attachment : attachments) {
                System.out.println(attachment.toString());
            }
        }
    }
}
