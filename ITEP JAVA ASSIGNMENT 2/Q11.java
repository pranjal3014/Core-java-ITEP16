class FindHeightBase {
  public static void main(String[] args) {
    int Area = 320;
    int BreathCoffient = 8;
    int LengthCoffient = 5;

    double coffient = (0.5) * (8 * 5);
    double y = Area / coffient;
    double x = Math.sqrt(y);
    System.out.println("Breadth of Triangle " + x * BreathCoffient + "m");
    System.out.println("Length of Triangle " + x * LengthCoffient + "m");
  }

}