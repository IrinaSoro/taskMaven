package task;

import lombok.Data;

@Data
public class Picture extends Attachments {
    private String name;
    private String pictureType;

    public Picture(String name, String pictureType) {
        this.name = name;
        this.pictureType = pictureType;
    }


}
