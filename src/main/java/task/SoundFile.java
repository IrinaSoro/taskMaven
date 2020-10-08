package task;

import lombok.Data;

@Data
public class SoundFile implements Attachment {
    private String name;
    private long playTime;

    public SoundFile(String name, long playTime) {
        this.name = name;
        this.playTime = playTime;
    }

    public SoundFile() {
    }

}
