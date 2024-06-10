import java.util.ArrayList;

public class OddEven {
    public static void main(String[] args) {
        OddEven oddEven = new OddEven();
        ArrayList<Integer> odd = oddEven.odd(1,10);
        ArrayList<Integer> even = oddEven.even(1,10);
        System.out.println("odd = " + odd);
        System.out.println("even = "+even);


    }

    ArrayList<Integer> odd(int a,int b){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = a; i <= b; i++){
            if (i%2 != 0)
                result.add(i);
        }
        return result;
    }

    ArrayList<Integer> even(int a,int b){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = a; i <= b; i++){
            if (i%2 == 0)
                result.add(i);
        }
        return result;
    }
}
