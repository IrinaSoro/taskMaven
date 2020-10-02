package task;

import lombok.Data;

@Data
public class Document implements Attachment {
    private String name;

    private String documentType;

    public Document(String name, String documentType) {
        this.name = name;
        this.documentType = documentType;
    }


}
