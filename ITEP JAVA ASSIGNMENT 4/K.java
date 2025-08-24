class K{
    public static void main(String... args){
        for(int i =1; i<=5; i++){
            for(int j=1; j<=5; j++){
                if(j == 1 || j == 3 && i ==2 || j == 5 && i ==1){
                    System.out.print("*");
                }
                else if(j == 3 && i == 4 || j == 5 && i == 5)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}