package task;

public abstract class IChannel {

     public void sendMessage(Message message) {
          message.getTime();
          message.getSender_name();
          message.getChannels();
          message.getAttachments();
     }
}


