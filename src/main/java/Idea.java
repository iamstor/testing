public class Idea {
    public String topic;
    public String type;
    public int count;
    Time time;




    public Idea(int count) {
        this.count = count;

    }

    public int createIdeas(int time, int count){
        int result_time=time;
         if (count>=0){
             result_time++;
         }
         return result_time;
    }

}