class FindVolume {
    public static void main(String args[]) {

        double diameter = 2.25;
        double height = 2.25;
        double pi = 3.14;

        double radius = diameter / 2;
        double volume = pi * radius * radius * height;

        System.out.println("Volume of the cylinder = " + volume + " cm^3");
    }
}

