public class LinearSearch {

    public static int linearSearch(int[] arr, int num){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){
             return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] numbers = {13, 47, 5, 56, 29, 43};
        System.out.println(linearSearch(numbers, 11));
    }

}
