package week05;

public class DriverLicens extends Card {
    private int expirationYear;

    public DriverLicens( String name, int expirationYear){
        super(name);
        this.expirationYear=expirationYear;
    }

    @Override
    public boolean isExpired() {
        return false;
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(int expirationYear) {
        this.expirationYear = expirationYear;
    }
}
