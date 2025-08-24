class Brick {
    public static void main(String args[]) {

        int length_of_brick = 15;
        int breadth_of_brick = 8;
        int height_of_brick = 5;

        int length_of_wall_in_m = 15;
        int breadth_of_wall_in_m = 10;
        int height_of_wall_in_m = 8;

        int length_of_wall_in_cm = 15 * 100;
        int breadth_of_wall_in_cm = 10 * 100;
        int height_of_wall_in_cm = 8 * 100;

        int volume_of_brick = (length_of_brick * breadth_of_brick * height_of_brick);
        int volume_of_wall = (length_of_wall_in_cm * breadth_of_wall_in_cm * height_of_wall_in_cm);

        int total_brick = volume_of_wall / volume_of_brick;

        System.out.println(total_brick + "brick use to make a wall");
    }
}
