package bcn.sants.kata;
public class FizzBuzz {

    public String calculateOutputWord(final int inputNumber) {
        String output="";
        if(inputNumber%3==0 && inputNumber%5==0){
            output= FizzBuzzConstants.FIZZBUZZ;
        }else if(inputNumber%3==0) {
            output= FizzBuzzConstants.FIZZ;
        }else if(inputNumber%5==0) {
            output= FizzBuzzConstants.BUZZ;
        }
        return output;
    }
}
