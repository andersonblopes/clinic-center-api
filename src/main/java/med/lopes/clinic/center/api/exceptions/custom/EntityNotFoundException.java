package med.lopes.clinic.center.api.exceptions.custom;

/**
 * The type Entity not found exception.
 */
public class EntityNotFoundException extends RuntimeException {

    /**
     * Instantiates a new Entity not found exception.
     *
     * @param message the message
     */
    public EntityNotFoundException(String message) {
        super(message);
    }
}
