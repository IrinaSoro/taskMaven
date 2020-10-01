import java.util.ArrayList;
import java.util.stream.Collectors;

public class AttachmentFilter implements IAttachmentFilter {
    FacebookChannel facebookChannel = new FacebookChannel();
    EmailChannel emailChannel = new EmailChannel();

    @Override
    public ArrayList<IAttachment> filterOutAttachments(IChannel channel, ArrayList<IAttachment> attachments) {

        if (channel instanceof FacebookChannel) {
            return (ArrayList<IAttachment>) attachments.stream()
                    .filter(a -> a instanceof Document ||
                            a instanceof Picture).collect(Collectors.toList());

        } else if (channel instanceof EmailChannel) {
            return attachments;
        } else if (channel instanceof SmsChannel) {
            return null;
        } else {
            return null;
        }

    }
}
