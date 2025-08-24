class CubeAndCuboid {
    public static void main(String args[]) {

        int length_cuboid = 7;
        int breadth_cuboid = 4;
        int height_cuboid = 8;
        int cube_edge = 7;

        int volume_of_cube = (cube_edge * cube_edge * cube_edge);
        int volume_of_cuboid = (length_cuboid * breadth_cuboid * height_cuboid);

        if (volume_of_cube > volume_of_cuboid) {
            System.out.println("Cube have more volume than cuboid");
        } else {
            System.out.println("Cuboid have more volume than cube");
        }
    }
}