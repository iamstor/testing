public class Time {

    public int v;
    public String description;
    public String person;
    public String personName;
    public String personAge;

    public Time(int v) {
        this.v = v;

    }




    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getValue() {
        return v;
    }
    public void setValue(int value){
        this.v = v;
    }
}