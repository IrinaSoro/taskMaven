package task;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class AttachmentFilter implements IAttachmentFilter {
    FacebookChannel facebookChannel = new FacebookChannel();
    EmailChannel emailChannel = new EmailChannel();
    SmsChannel smsChannel = new SmsChannel();

    public AttachmentType emailFilterAttachments(EmailChannel emailChannel, AttachmentType attachment) {
        this.emailChannel = emailChannel;
        switch (attachment) {
            case DOCUMENT:
                System.out.println(AttachmentType.DOCUMENT.toString());
                break;
            case PICTURE:
                System.out.println(AttachmentType.PICTURE.toString());
                break;
            case SOUND_FILE:
                System.out.println(AttachmentType.SOUND_FILE.toString());
                break;
            default:
                System.out.println("Not acceptable attachment");
        }
        return attachment;
    }

    public AttachmentType facebookFilterAttachments(FacebookChannel facebookChannel, AttachmentType attachment) {
        this.facebookChannel = facebookChannel;
        switch (attachment) {
            case DOCUMENT:
                System.out.println(AttachmentType.DOCUMENT.toString());
                break;
            case PICTURE:
                System.out.println(AttachmentType.PICTURE.toString());
                break;
            default:
                System.out.println("Not acceptable attachment");
        }
        return attachment;
    }

    public void smsFilterAttachments(SmsChannel smsChannel) {
        this.smsChannel = smsChannel;
        System.out.println("Any attachments are not acceptable");
    }

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


    enum AttachmentType {
        DOCUMENT,
        PICTURE,
        SOUND_FILE
    }
}
