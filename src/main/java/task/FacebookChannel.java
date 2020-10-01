package task;

import java.util.ArrayList;

public class FacebookChannel implements IChannel {
    public void receiveMessage(Message message, ArrayList<IAttachment> attachments) {
        System.out.println("Facebook receive message \n");
        System.out.println(message + "\n");
        if (attachments != null && attachments.size() > 0) {
            for (IAttachment attachment : attachments) {
                System.out.println(attachment.toString());
            }
        }
    }
}
