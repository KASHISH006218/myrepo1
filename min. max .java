public class MinMaxArray{
    public static void main(String[] args) {
        int[] arr = {25,11,7,75,56};

        int Max = arr[0];
        int Min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] >Max){

                Max = arr[i];
            }
            if (arr[i] <Min){
                Min = arr[i];
            }
        }
        System.out.println("Maximum element: " + Max);
        System.out.println("Minimum element:" + Min);
    }
}