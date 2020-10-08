package task;

public class Program {
    public static void main(String[] args) {
        AttachmentsGenerator gen = new AttachmentsGenerator();
        gen.generate(5);
        for (Attachment a : gen.generate(5)) {
            System.out.println(a.toString());

        }

    }
}


