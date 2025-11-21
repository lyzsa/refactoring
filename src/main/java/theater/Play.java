package theater;

/**
 * Represents a theatrical play with a name and a type (e.g., Drama, Comedy).
  */
public class Play {

    private String name;
    private String type;

    /**
     * Constructs a new Play object.
     *
     * @param name The title of the play. **(non-null)**
     * @param type The genre of the play. **(non-null)**
     * @throws IllegalArgumentException if name or type are null or empty.
     */

    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Gets the name of the play.
     *
     * @return The name of the play.
     */

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
