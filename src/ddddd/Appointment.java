package ddddd;

public abstract class Appointment {

    private Date date;

//    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }

    public Appointment(Date date) {
        this.date = date;
    }

    public abstract boolean occursOn();
}
