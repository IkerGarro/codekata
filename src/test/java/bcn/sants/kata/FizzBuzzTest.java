package bcn.sants.kata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp(){
        fizzBuzz=new FizzBuzz();
    }

    @Test
    public void isMultipleOfThree(){
        Assert.assertEquals(FizzBuzzConstants.FIZZ,fizzBuzz.calculateOutputWord(9));
        Assert.assertEquals(FizzBuzzConstants.FIZZ,fizzBuzz.calculateOutputWord(3));
        Assert.assertEquals(FizzBuzzConstants.FIZZ,fizzBuzz.calculateOutputWord(99));
        Assert.assertEquals(FizzBuzzConstants.FIZZ,fizzBuzz.calculateOutputWord(999));
    }

    @Test
    public void isMultipleOfFive(){
        Assert.assertEquals(FizzBuzzConstants.BUZZ,fizzBuzz.calculateOutputWord(5));
        Assert.assertEquals(FizzBuzzConstants.BUZZ,fizzBuzz.calculateOutputWord(25));
    }

    @Test
    public void isMultipleOfThreeAndFive(){
        Assert.assertEquals(FizzBuzzConstants.FIZZBUZZ,fizzBuzz.calculateOutputWord(15));
        Assert.assertEquals(FizzBuzzConstants.FIZZBUZZ,fizzBuzz.calculateOutputWord(150));
        Assert.assertEquals(FizzBuzzConstants.FIZZBUZZ,fizzBuzz.calculateOutputWord(555));
    }

    @Test
    public void isNotMultipleOfThreeNorFive(){
        Assert.assertEquals("",fizzBuzz.calculateOutputWord(1));
        Assert.assertEquals("",fizzBuzz.calculateOutputWord(2));
        Assert.assertEquals("",fizzBuzz.calculateOutputWord(4));
        Assert.assertEquals("",fizzBuzz.calculateOutputWord(7));
    }
}
