class CylinderDiameter {
    public static void main(String args[]) {

        double surface_area = 149;
        double height = 6;
        double pi = 3.14;

        double a = 1;
        double b = height;
        double c = - (surface_area / (2 * pi));

        double discriminant = Math.sqrt(b * b - 4 * a * c);
        double radius = (-b + discriminant) / (2 * a);
        double diameter = 2 * radius;

        System.out.println("Diameter of the cylinder = " + diameter + " cm");
    }
}

