public class InvHalfPy {
    public static void rotated_Pyra(int m){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
    rotated_Pyra(4);
    }
}
