package urfu.lesson5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Lesson5ApplicationTests {

    @Autowired
    private CustomEventPublisher eventPublisher;

    @Test
    void contextLoads() {
        eventPublisher.publishCustomEvent("Привет мир!", "Русский");
    }

}
