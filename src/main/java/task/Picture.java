package task;

import lombok.Data;

@Data
public class Picture implements Attachment {
    private String name;
    private String pictureType;

    public Picture(String name, String pictureType) {
        this.name = name;
        this.pictureType = pictureType;
    }

    public Picture() {
    }

}
