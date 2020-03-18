public class Random {

    public static void main(String[] args)
    {
        double myNumber;
        myNumber = Math.random();
        for (int i=0; i<100;) {
            System.out.println( (int) Math.random()*10 +1);
        }

    }
}
