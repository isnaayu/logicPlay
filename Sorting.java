public class Sorting {
    public static void main(String[] args) {
        int[] numbers = {5,7,1,9,2,6,3};
        char[] alphabeth = {'C','U','A','E','Y','F'};
        Sorting sorting = new Sorting();
        int[] result = sorting.sortingNumb(numbers);
        for (int r:result){
            System.out.print(r+" ");
        }
        System.out.println();
        char[] resultAlpha = sorting.sortingAlpha(alphabeth);
        for (char r:resultAlpha){
            System.out.print(r+" ");
        }
    }

    int[] sortingNumb(int[] arr){
        for (int i= 0; i< arr.length; i++){
            for (int j = 0; j< arr.length-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    char[] sortingAlpha(char[] arr){
        for (int i= 0; i< arr.length; i++){
            for (int j = 0; j< arr.length-1; j++){
                if (arr[j] > arr[j+1]){
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
