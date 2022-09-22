import java.util.ArrayList;
import java.util.Arrays;

public class EratosthenesPrimeSieve implements PrimeSieve{


    private ArrayList<Boolean> array = new ArrayList<Boolean>();

    public EratosthenesPrimeSieve(int upperLimit) {
        for(int i = 0; i < upperLimit; i++){
            array.set(i, true);
        }

        for(int i = 2; i < upperLimit; i++){

            if(array.get(i) == true){

                for(int j = 1; i < upperLimit; i *= j){

                    array.set(j, false);
                }
            }
        }
    }

    @Override
    public boolean isPrime(int p) {
        return array.get(p);
    }

    @Override
    public void printPrimes() {

        for(int i = 0; i < array.size(); i++){

            if(array.get(i) == true){
                System.out.println(i);
            }
        }
    }
}
