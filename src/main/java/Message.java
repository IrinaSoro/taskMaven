import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Message {

        public LocalDateTime sendTime;
        public ArrayList<IChannel> channels;
        public ArrayList<IAttachment> attachments;
        private String userName;
        private String text;

        public String getUserName() {
                return userName;
        }

        public void setUserName(String userName) {
                this.userName = userName;
        }

        public String getText() {

                return text;
        }

        public void setText(String text) {
                this.text = text;

        }

        public List<IChannel> getChannels() {
                return channels;
        }

        public void setChannels(ArrayList<IChannel> channels) {
                this.channels = channels;
        }

        public ArrayList<IAttachment> getAttachments() {
                return attachments;
        }

        public void setAttachments(ArrayList<IAttachment> attachments) {
                this.attachments = attachments;
        }


}
