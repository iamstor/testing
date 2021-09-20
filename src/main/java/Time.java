public class Time {

    public int time_value;
    public String description;


    public Time(int time_value) {
        this.time_value = time_value;

    }




    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getValue() {
        return time_value;
    }
    public void setValue(int value){
        this.time_value = time_value;
    }
}