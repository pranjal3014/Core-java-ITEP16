class BrickCost {
    public static void main(String[] args) {

        double brickLength = 25;
        double brickWidth = 10;
        double brickThickness = 7.5;
        double brickVolume = brickLength * brickWidth * brickThickness;

        double wall_Length = 20 * 100;
        double wall_Height = 2 * 100;
        double wall_Thickness = 0.75 * 100;
        double wall_Volume = wall_Length * wall_Height * wall_Thickness;

        int number_of_bricks = (int) (wall_Volume / brickVolume);

        int cost = 900;
        double total_Cost = (number_of_bricks / 1000.0) * cost;

        System.out.println("Number of bricks required: " + number_of_bricks);
        System.out.println("Total cost of bricks: " + total_Cost);
    }
}
