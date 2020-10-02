package task;

import lombok.Data;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class Message {
        private String sender_name;
        private LocalTime time;
    private String text;
    private List<AttachmentFilter.AttachmentType> attachments;
    private ArrayList<IChannel> channels;
}

