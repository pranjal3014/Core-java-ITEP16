class TilingCost {
    public static void main(String args[]) {

        int length = 20;
        int width = 15;
        int rate = 5;

        int area = length * width;
        int total_cost = area * rate;

        System.out.println("Total cost of tiling = " + total_cost+ " rs");
    }
}
