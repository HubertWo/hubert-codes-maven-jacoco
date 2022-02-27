package codes.hubertwo.maven.coverage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests of {@link HelloMessageRepository}.
 */
class HelloMessageRepositoryTest  {

    private static final MessageRepository MESSAGE_REPOSITORY = new HelloMessageRepository();

    @Test
    void getMessage_returnsMessage() {
        String actualMessage = MESSAGE_REPOSITORY.getMessage();

        assertEquals("Hello from MessageRepository", actualMessage);
    }

}