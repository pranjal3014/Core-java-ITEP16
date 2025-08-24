class FindPerimeter {
    public static void main(String args[]) {

        int area_rectangle = 96;
        int breadth_rectangle = 8;

        int length_rectangle = (area_rectangle / breadth_rectangle);
        float perimeter = 2 * (length_rectangle + breadth_rectangle);

        System.out.println("Length of Rectangle= " + length_rectangle + "cm");
        System.out.println("Perimeter of Rectangle= " + perimeter + "cm");

    }
}