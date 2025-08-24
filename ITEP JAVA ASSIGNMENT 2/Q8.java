class FindBase {
    public static void main(String[] args) {

        double height_triangle=20;
        double area_in_meter= 0.8;

        double area_in_cm = area_in_meter*10000;

        double base_triangle=(2*area_in_cm)/height_triangle;

        System.out.println("Base of the Triangle =  " +base_triangle+ "m");
       
    }
}  