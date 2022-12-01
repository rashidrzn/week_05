package ddddd;

public class Onetime extends Appointment{

    public Onetime(Date date){
        super(date);
    }

    @Override
    public boolean occursOn() {
        return false;
    }
}

