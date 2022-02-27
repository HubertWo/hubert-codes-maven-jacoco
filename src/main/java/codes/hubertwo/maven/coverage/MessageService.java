package codes.hubertwo.maven.coverage;

/**
 * Message service.
 */
public class MessageService {

    private final MessageRepository messageRepository;

    /**
     * Constructor.
     *
     * @param messageRepository source of messages.
     */
    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    /**
     * Fetches the message from {@link  MessageService#messageRepository} and adds prefix to it.
     */
    public String getMessage() {
        return messageRepository.getMessage() + " and from MessageService";
    }

}
