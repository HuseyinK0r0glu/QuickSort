import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {1,32,3,23,51,4,14,1,13,3,23,52,13,4,245,31,1241,3,23,2333,52,21313,3};
        System.out.println("Beginning of the sort");
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
        System.out.println("End of the sort");
    }

    public static void quickSort(int[] array,int left,int right){

        // index is the left that is returned from the partition method which is the first element of right half of pivot
        int index = partition(array,left,right);

        if(left < index-1){
            quickSort(array,left,index-1);
        }

        if(right > index){
            quickSort(array,index,right);
        }

    }


    public static int partition(int[] array,int left,int right){

        int pivot = array[(left + right) / 2];

        while(left<=right){

            // if left element is greater than or equal to pivot we move the left pointer to the right
            while (array[left] < pivot){
                left++;
            }

            // if right element is smaller than or equal to pivot we move the right pointer to the left
            while(array[right] > pivot){
                right--;
            }

            if(left<=right){
                exchange(array,left,right);
                left++;
                right--;
            }

        }

        return left;
    }

    public static void exchange(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}