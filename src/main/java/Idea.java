public class Idea {
    public String topic;
    public String type;
    public int count;
    Time time;




    public Idea(int count) {
        this.count = count;

    }

    public int createIdeas(int time, int count){
         if (count>=0){
             time++;
         }
         return time;
    }

}