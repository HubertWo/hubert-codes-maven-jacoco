package codes.hubertwo.maven.coverage;

/**
 * Repository that always returns the same message.
 */
public class HelloMessageRepository implements MessageRepository {

    @Override
    public String getMessage() {
        return "Hello from MessageRepository";
    }
}
