public class FloydsTri {
    public static void floyds_Triangle(int m,int count){
        
    for( int i=1;i<=m;i++){
        for(int j=1;j<=i;j++){
            System.out.print(count++ +" ");
        }
        System.out.println();
    }
    }
    public static void main(String[]args){
    floyds_Triangle(5,1);
    }
}
