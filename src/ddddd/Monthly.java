package ddddd;

public class Monthly extends  Appointment{
    public Monthly(Date date){
        super(date);
    }

    @Override
    public boolean occursOn() {
        return false;
    }
}
