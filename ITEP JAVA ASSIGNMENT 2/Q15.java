class BiggestGarden {
    public static void main(String[] args) {

        int shelly_garden_length = 22;
        int shelly_garden_breadth = 15;

        int rachel_garden_side = 21;

        int area_of_shelly_garden = (shelly_garden_length * shelly_garden_breadth);
        int area_of_rachel_garden = (rachel_garden_side * rachel_garden_side);

        System.out.println("Area of shelly garden  =  " + area_of_shelly_garden + "cm\u00B2");
        System.out.println("Area of rachel garden  =  " + area_of_rachel_garden + "cm\u00B2");

        if (area_of_rachel_garden > area_of_shelly_garden) {
            System.out.println("Rachel garden is greater than Shelly garden");
        } else {
            System.out.println("Shelly garden is greather than Rachel garden");
        }

    }
}
