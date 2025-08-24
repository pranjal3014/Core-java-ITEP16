class SurfaceArea {
    public static void main(String args[]) {

        double diameter = 12;
        double height = 9;
        double pi = 3.14;

        double radius = diameter / 2;
        double surface_area = 2 * pi * radius * (radius + height);

        System.out.println("Surface area of the cylinder = " + surface_area + " cm\u00B2");
    }
}
