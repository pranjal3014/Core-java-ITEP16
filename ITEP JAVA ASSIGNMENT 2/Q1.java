class FindArea {
    public static void main(String args[]) {

        int perimeter_rectangle = 230;
        int length_rectangle = 70;

        int breadth_rectangle = (perimeter_rectangle / 2) - length_rectangle;
        int area = 2*(length_rectangle * breadth_rectangle);

        System.out.println("Breadth of Rectangle= " + breadth_rectangle + "cm");
        System.out.println("Area of Rectangle= " + area + "cm^2");

    }
}