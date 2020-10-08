package task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AttachmentsGeneratorTest {
    @Test
    void negativeNum() throws IOException {
        AttachmentsGenerator generator = new AttachmentsGenerator();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            generator.generate(-1);
        });

    }

    @Test
    void number() {
        AttachmentsGenerator generator = new AttachmentsGenerator();
        int atNumber = 5;
        List<Attachment> res = generator.generate(atNumber);
        //проверка результата
        assertEquals(5, res.size());
    }

    @Test
    void instance() {
        AttachmentsGenerator generator = new AttachmentsGenerator();
        int atNumber = 1;
        List<Attachment> res = generator.generate(atNumber);
        //проверка результата
        assertTrue(res.get(0) instanceof Document);
    }

    @Test
    void instanceOf() {
        AttachmentsGenerator generator = new AttachmentsGenerator();
        int atNumber = 5;
        List<Attachment> res = generator.generate(atNumber);
        //проверка результата
        assertTrue(res.get(0) instanceof Document);
        assertTrue(res.get(1) instanceof Picture);
        assertTrue(res.get(2) instanceof SoundFile);
        assertTrue(res.get(3) instanceof Document);
        assertTrue(res.get(4) instanceof Picture);
    }
}