class CylinderSurface {
    public static void main(String args[]) {

        double volume = 1287;
        double radius = 10;
        double pi = 3.14;

        double height = volume / (pi * radius * radius);
        double surface_area = 2 * pi * radius * (radius + height);

        System.out.println("Surface area of the cylinder = " + surface_area + " cm\u00B2");
    }
}

