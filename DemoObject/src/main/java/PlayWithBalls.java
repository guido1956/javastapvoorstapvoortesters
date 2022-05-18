public class PlayWithBalls {
    public static void main(String[] args) {
        Ball ballOfCoen = new Ball("voetbal", 15, "wit");
        Ball ballOfNigel = new Ball("basketbal", 18, "oranje");

        System.out.println(ballOfCoen.getColor());
        int sizeBallOfNigel = ballOfNigel.getSize();
        System.out.println(sizeBallOfNigel);
        ballOfNigel.setSize(25);
        ballOfNigel.setName("Skippyball");
        System.out.println(ballOfNigel.getSize() + " " +
                ballOfNigel.getName());
        ballOfCoen.bouncingTimes(24);

        String myText = "Ballen";
        String myText2 = new String("Ballen");
    }
}
