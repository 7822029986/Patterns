public class SolRhombus {
    public static void solid_Rhombus(int m){
    for(int i=1;i<=m;i++){
        for(int j=1;j<=m-i;j++){
        System.out.print(" ");
     }
     for(int j=1;j<=m;j++){
     System.out.print("*");
     }
     System.out.println();
}
}
    public static void main(String[]args){
    solid_Rhombus(5);
    }
}
