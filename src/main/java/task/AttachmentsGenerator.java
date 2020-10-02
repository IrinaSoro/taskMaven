package task;

import java.util.ArrayList;
import java.util.List;

public class AttachmentsGenerator {

    public List<Attachment> generate() {
        List<Attachment> at = new ArrayList<>();
        Document doc = new Document("name", "doc");
        Picture pic = new Picture("pic", "jpg");
        SoundFile sound = new SoundFile("name", 253);
        at.add(doc);
        at.add(pic);
        at.add(sound);

        return at;

    }
}
