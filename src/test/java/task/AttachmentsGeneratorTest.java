package task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AttachmentsGeneratorTest {
    @Test
    void name1() throws IOException {
        AttachmentsGenerator generator = new AttachmentsGenerator();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            generator.generate(-1);
        });

    }

    @Test
    void name() {
        AttachmentsGenerator generator = new AttachmentsGenerator();
        int atNumber = 5;
        List<Attachment> res = generator.generate(atNumber);
        //проверка результата
        assertEquals(5, res.size());
    }

}