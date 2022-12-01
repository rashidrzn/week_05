package week05;

public class Passport extends Card {
    private String birthLocation;
    private int expirationYear;

    public Passport( String name, String birthLocation) {
        super(name);
        this.birthLocation=birthLocation;
    }

    @Override
    public boolean isExpired() {
        return false;
    }

    public String getBirthLocation() {
        return birthLocation;
    }

    public void setBirthLocation(String birthLocation) {
        this.birthLocation = birthLocation;
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(int expirationYear) {
        this.expirationYear = expirationYear;
    }
}
