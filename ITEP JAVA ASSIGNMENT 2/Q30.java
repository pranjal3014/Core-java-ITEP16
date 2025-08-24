class BadroomTile {
    public static void main(String args[]) {

        int floor_length = 200;
        int floor_width = 400;

        int tile_length = 5;
        int tile_width = 8;

        int floor_area = floor_length * floor_width;
        int tile_area = tile_length * tile_width;

        int number_of_tiles = floor_area / tile_area;

        System.out.println("Number of tiles required = " + number_of_tiles);
    }
}

