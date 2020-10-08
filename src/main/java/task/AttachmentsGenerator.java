package task;

import java.util.ArrayList;
import java.util.List;

public class AttachmentsGenerator {

    public List<Attachment> generate(int attachmentsNumber) {
        if (attachmentsNumber < 0) {
            throw new IllegalArgumentException("Unacceptable number of attachments");
        }
        List<Attachment> at = new ArrayList<>();

        for (int i = 0; i < attachmentsNumber; i++) {
            at.add(new Document());
            at.add(new Picture());
            at.add(new SoundFile());

            System.out.println(at.get(i));
        }
//        Document doc = new Document("name", "doc");
//        Picture pic = new Picture("pic", "jpg");
//        SoundFile sound = new SoundFile("name", 253);
//        at.add(doc);
//        at.add(pic);
//        at.add(sound);

        return at;

    }
}
