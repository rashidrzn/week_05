package week05;

public abstract class Card {
    private String name;
                public Card() {
                    super();
                    name = "";

                }
                public Card(String n) {
                    name = n;
                }
    public String getName() {
        return name;
    }
    public abstract boolean isExpired();

    public String format() {
        return "Card holder: " + name;
    }
    }
