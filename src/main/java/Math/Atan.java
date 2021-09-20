package Math;

public class Atan {
    public Atan() {
    }


    public double doAtan(double val, double eps) {
        double curAnswer = 0.0;
        double newAnswer = 0.0;
        if (Math.abs(val) > 1) {
            System.out.println("Wrong Input, |X|>1");
        } else {
            int n = 0;

            do {
                curAnswer = newAnswer;
                newAnswer += Math.pow(-1.0,n) * Math.pow(val,2 * n + 1) / (2 * n + 1);
                n += 1;
            } while ((Math.abs(newAnswer - curAnswer) > eps));

        }
        return newAnswer;
    }
}


