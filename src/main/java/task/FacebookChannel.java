package task;

public class FacebookChannel extends IChannel {

    FacebookChannel facebookChannel = new FacebookChannel();
//    public void sendMessage(Message message, ArrayList<IAttachment> attachments) {
//        System.out.println("Facebook receive message \n");
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
