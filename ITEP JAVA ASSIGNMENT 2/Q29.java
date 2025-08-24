class Tile {
    public static void main(String args[]) {

        int floor_length = 800;
        int floor_width = 900;

        int tile_side = 10;

        int floor_area = floor_length * floor_width;
        int tile_area = tile_side * tile_side;

        int number_of_tiles = floor_area / tile_area;

        System.out.println("Number of tiles required = " + number_of_tiles);
    }
}
