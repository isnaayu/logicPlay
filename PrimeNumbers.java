import java.util.ArrayList;

public class PrimeNumbers {
    public static void main(String[] args) {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        ArrayList<Integer> result = primeNumbers.prime(1,10);
        for (int r: result){
            System.out.print(r+" ");
        }
    }
    ArrayList<Integer> prime(int a, int b){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = a; i<=b; i++){
            if (isPrime(i))
                result.add(i);

        }
        return result;
    }

    boolean isPrime(int a){
        if (a <= 1) return false;
        if (a==2 || a==3) return true;
        if (a % 2 == 0 || a % 3 == 0 ) return false;
        for (int i = 5; i<=Math.sqrt(a); i = i+ 6)
            if (a % i == 0 || a % (i+2) == 0) return false;
        return true;
    }
}
