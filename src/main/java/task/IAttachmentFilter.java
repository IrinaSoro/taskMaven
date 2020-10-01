package task;

import java.util.ArrayList;

public interface IAttachmentFilter {


    ArrayList<IAttachment> filterOutAttachments(IChannel channel, ArrayList<IAttachment> attachments);
}
