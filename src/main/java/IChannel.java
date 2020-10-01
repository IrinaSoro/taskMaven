import java.util.ArrayList;

public interface IChannel {

    void receiveMessage(Message message, ArrayList<IAttachment> attachments);

}
