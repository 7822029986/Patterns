public class InvHalfPyr {
    public static void inv_HalfPyramid(int m){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m-i+1;j++){
             System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        inv_HalfPyramid(5);
    }
}
