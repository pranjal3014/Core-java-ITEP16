class TileRate {
    public static void main(String[] args) {

        int length_of_rectangular_plot = 300;
        int breadth_of_rectangular_plot = 150;
        int cost_of_per_100sqfeet = 6;

        int area_of_rectangular_plot = length_of_rectangular_plot * breadth_of_rectangular_plot;
        int total_cost_of_tile = (area_of_rectangular_plot * cost_of_per_100sqfeet) / 100;

        System.out.println("Cost of total Tile= " + total_cost_of_tile + "rs.");

    }
}