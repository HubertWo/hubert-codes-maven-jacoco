package codes.hubertwo.maven.coverage;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Integration tests of {@link MessageService} and {@link HelloMessageRepository}.
 */
class MessageServiceTestIT {

    private static MessageService messageService;
    private static MessageRepository messageRepository;

    @BeforeAll
    static void beforeAll() {
        // Not using any injector for simplicity
        MessageServiceTestIT.messageRepository = new HelloMessageRepository();
        MessageServiceTestIT.messageService = new MessageService(MessageServiceTestIT.messageRepository);
    }

    @Test
    public void getMessage_returnsMessageWithSuffix() {
        String actualMessage = messageService.getMessage();

        assertEquals("Hello from MessageRepository and from MessageService", actualMessage);
    }

}