package ddddd;

public class Daily extends Appointment{

    public Daily(Date date){
        super(date);
    }

    @Override
    public boolean occursOn() {
        return false;
    }
}
