package CardGame;

public class Card {

//      Created private variables for name and value of a card.

    private String name;
    private int value;

//      Creating card method.

    public Card(int value, String name) {

        this.name = name;
        this.value = value;

    }

//      Getters and setters for name and value.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

//      Method that describes the card when called.

    public void describe() {
        System.out.println(this.name);

    }
}

