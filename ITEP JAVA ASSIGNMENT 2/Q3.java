class CoveredArea {
    public static void main(String args[]) {

        int length_of_tile = 13;
        int breadth_of_tile = 7;

        int length_of_cover_area = 520;
        int breadth_of_cover_area = 140;

        int area_of_tile = (length_of_tile * breadth_of_tile);
        int area_of_covered_area = (length_of_cover_area * breadth_of_cover_area);

        int total_tile = (area_of_covered_area / area_of_tile);

        System.out.println("Area of Tile= " + area_of_tile + "cm^2");
        System.out.println("Area of covered area= " + area_of_covered_area + "cm^2");

        System.out.println("Number of tile use= " + total_tile);

    }
}