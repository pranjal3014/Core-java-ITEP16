class FindPerimeter {
    public static void main(String[] args) {

        int total_cost=1600;
        int cost_per_meter = 25;
        int length_of_park= 20;

        int perimeter_of_fence = (total_cost/cost_per_meter);
        int breadth_of_park = (perimeter_of_fence/2)-length_of_park;
        int area_of_field = (length_of_park*breadth_of_park);

        System.out.println("Perimeter of Fence =  " +perimeter_of_fence + "m");
        System.out.println("Breadth of Park =  " +breadth_of_park+ "m");
        System.out.println("Area of Field =  " +area_of_field+ " m^2");

    }
}