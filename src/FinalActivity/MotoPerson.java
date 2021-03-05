package FinalActivity;

 public interface MotoPerson  {
    public default void makeNoise() {
        String noise = "Wrooom Wroooooom";
        System.out.println(noise);
    }


}
