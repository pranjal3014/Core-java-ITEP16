class M{
    public static void main(String... args){
        for(int i=1; i<= 6; i++){
            for(int j=1; j<=6; j++){
            System.out.print(" ");
                if(j == 1 || j == 5 || i == j && j<4 || i == 2 && j == 4){
                    System.out.print("*");
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}