class LayPath {
    public static void main(String args[]) {
        int length_of_path = 120;
        double breadth_of_path = 2.4;

        int length_of_brick = 24;
        int breadth_of_brick = 15;

        int length_of_path_in_cm = length_of_path * 100;
        double breadth_of_path_in_cm = breadth_of_path * 100;

        double area_of_path = length_of_path_in_cm * breadth_of_path_in_cm;
        int area_of_brick = length_of_brick * breadth_of_brick;

        int total_brick = (int)area_of_path / area_of_brick;

        System.out.println(total_brick + " bricks are used to make the path");
    }
}

