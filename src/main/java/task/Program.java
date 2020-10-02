package task;

public class Program {
    public static void main(String[] args) {
        AttachmentsGenerator gen = new AttachmentsGenerator();
        gen.generate();
        for (Attachment a : gen.generate()) {
            System.out.println(a.toString());

        }
    }
}


