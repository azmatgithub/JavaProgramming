package _2;
//spiral matrix
public class SpriralMatrix {
    public static void printSpiralmatrix(int arr[][]){
        int startrow=0;
        int startcol=0;
        int endrow=arr.length-1;
        int endcol=arr[0].length-1;
        while (startrow<=endrow && startcol<=endcol){
            for (int j=startcol; j<endcol;j++){
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
    int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    printSpiralmatrix(arr);
    }
}
