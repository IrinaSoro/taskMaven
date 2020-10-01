package task;

public class EmailChannel extends AttachmentFilter {

//    public void sendMessage(Message message) {
//        System.out.println("Email receive message \n" + "Name: " + message.getUserName() + "\nSend time: " + message.sendTime
//                + "\nContent: " + message.getText());
//        System.out.println(message + "\n");
//        if (attachments != null && attachments.size() > 0) {
//            for (IAttachment attachment : attachments) {
//                System.out.println(attachment.toString());
//            }
//        }
//    }


    @Override
    public void sendMessage(Message message) {
        super.sendMessage(message);

    }

}
