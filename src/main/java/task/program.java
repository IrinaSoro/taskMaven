package task;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class program {
    public static void main(String[] args) {
        MessageService messageService = new MessageService();

        Message message = new Message();
        message.setUserName("Alex");
        message.sendTime = LocalDateTime.now();
        message.setText("hello");
        message.attachments = new ArrayList<IAttachment>();
        Document document = new Document();
        document.setDocumentType("Excel document");
        document.setName("Tables");
        SoundFile soundFile = new SoundFile();
        soundFile.setName("Sound file");
        soundFile.setPlayTime(120);
        Picture picture = new Picture();
        picture.setName("Image");
        picture.setPictureType("Type.jpg");


        message.channels = new ArrayList<IChannel>() {{
            add(new EmailChannel());
            add(new SmsChannel());
            add(new FacebookChannel());
        }};


        Message secondMessage = new Message();
        secondMessage.setUserName("Dima");//userName = "Dima";
        secondMessage.sendTime = LocalDateTime.now();
        secondMessage.setText("Call me back");
        secondMessage.attachments = new ArrayList<IAttachment>();
        Document document1 = new Document();
        document1.setDocumentType("word document");
        document1.setName("document.docx");
        SoundFile soundFile1 = new SoundFile();
        soundFile1.setName("Another sound file");
        soundFile1.setPlayTime(120);
        Picture picture1 = new Picture();
        picture1.setName("Picture1");
        picture1.setPictureType("Type.png");


        secondMessage.channels = new ArrayList<IChannel>() {{
            add(new EmailChannel());
            add(new SmsChannel());
            // add(new FacebookChannel());
        }};

        messageService.sendMessage(message);
        messageService.sendMessage(secondMessage);


    }
}


