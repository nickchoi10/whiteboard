public class secondHighestOddNumber {

    public static void main (String[] arg){
        Integer [] array = {1,2,3,4,5,6,13,14,15,17};
        System.out.println(secondHighestOddNumber(array));

    }

    public static Integer secondHighestOddNumber(Integer[] arr){
        Integer maxValue=Integer.MIN_VALUE;
        Integer secondMaxValue=Integer.MIN_VALUE;

        for(int i=0; i <arr.length; i++){
            if(arr[i] >maxValue && arr[i]%2!=0){
                maxValue=arr[i];
            }
        }
        for(int i=0; i<arr.length;i++){
            if(arr[i]<maxValue && arr[i]>secondMaxValue && arr[i]%2!=0){
                secondMaxValue=arr[i];
            }
        }
        return secondMaxValue;
    }
}
