class CubicalCartoon {
    public static void main(String args[]) {

        int length_of_carton = 15;
        int breadth_of_carton = 9;
        int height_of_carton = 12;

        int cube_side = 3;

        int volume_of_carton = (length_of_carton * breadth_of_carton * height_of_carton);
        int volume_of_cube = (cube_side * cube_side * cube_side);

        int total_cubes = volume_of_carton / volume_of_cube;

        System.out.println(total_cubes + "cubes are placed in this box");
    }
}