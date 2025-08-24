class PathArea {
    public static void main(String[] args) {
      
        int length = 24;
        int breadth = 15;
        int number_Of_Bricks = 100;

     
        int area_of_OneBrick = length * breadth;

        int total_area = area_of_OneBrick * number_Of_Bricks;

        System.out.println("Total area of the path = " + total_area + " cm\u00B2");
    }
}
