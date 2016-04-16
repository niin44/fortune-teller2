package se.nackademin;

import org.junit.Test;

import static org.junit.Assert.*;

public class FortuneTellerIT {

    @Test
    public void testGetFortune() {
        FortuneTeller fortuneTeller = new FortuneTeller(new MagicNumbers(), new Translator());
        fortuneTeller.setAge("16");
        fortuneTeller.setHeight("165");
        fortuneTeller.setIncome("11000");
        fortuneTeller.setLocation("Hagfors");
        fortuneTeller.setName("Sture Hagfors");
        String output = fortuneTeller.calculate();
        assertEquals("Fortune should be calculated correctly", "Din framtid är mjuk. Du borde sluta se. Vi ser att du snart kommer att skaffa en fotboja. Snart kommer du vilja mäta, men då är det viktigt att du är mörk.", output);
    }
    @Test
    public void testGetFortuneDOver5(){
        FortuneTeller fortuneTeller = new FortuneTeller(new MagicNumbers(), new Translator());
        fortuneTeller.setAge("5");
        fortuneTeller.setHeight("165");
        fortuneTeller.setIncome("11000");
        fortuneTeller.setLocation("Hagfors");
        fortuneTeller.setName("Sture Hagfors");
        String output = fortuneTeller.calculate();
        assertEquals("Fortune should be calculated correctly", "Din framtid är vacker. Du borde sluta se. Vi ser att du snart kommer att skaffa ett hus. Snart kommer du vilja springa, men då är det viktigt att du är hård.", output);
    }
        @Test
    public void testGetFortuneIncomeOver10mil() {
        FortuneTeller fortuneTeller = new FortuneTeller(new MagicNumbers(), new Translator());
        fortuneTeller.setAge("16");
        fortuneTeller.setHeight("165");
        fortuneTeller.setIncome("11000000");
        fortuneTeller.setLocation("Hagfors");
        fortuneTeller.setName("Sture Hagfors");
                }
           @Test
    public void testGetFortuneNameNull() {
        FortuneTeller fortuneTeller = new FortuneTeller(new MagicNumbers(), new Translator());
        fortuneTeller.setAge("16");
        fortuneTeller.setHeight("165");
        fortuneTeller.setIncome("11000000");
        fortuneTeller.setLocation("Hagfors");
        fortuneTeller.setName(null);
                }
               @Test
    public void testGetFortuneLocationNull() {
        FortuneTeller fortuneTeller = new FortuneTeller(new MagicNumbers(), new Translator());
        fortuneTeller.setAge("16");
        fortuneTeller.setHeight("165");
        fortuneTeller.setIncome("11000000");
        fortuneTeller.setLocation(null);
        fortuneTeller.setName("a");
                }
        // Testing bugs found in acceptance tests
        // Issue #37:  Svante/-10000/Malmö/27/0 ger ArrayIndexOutOfBoundsException
    public void testIssue37(){
        FortuneTeller fortuneTeller = new FortuneTeller(new MagicNumbers(), new Translator());
        fortuneTeller.setName("Svante");
        fortuneTeller.setIncome("-1000");
        fortuneTeller.setLocation("Malmö");
        fortuneTeller.setAge("27");
        fortuneTeller.setHeight("0");
        boolean result = fortuneTeller.calculate().length()>1;
        assertEquals("should work with no error message",true,result);
    }
            // Issue #38: Svante/10000/Malmö/27/0 ger ArrayIndexOutOfBoundsException
    public void testIssue38(){
        FortuneTeller fortuneTeller = new FortuneTeller(new MagicNumbers(), new Translator());
        fortuneTeller.setName("Svante");
        fortuneTeller.setIncome("10000");
        fortuneTeller.setLocation("Malmö");
        fortuneTeller.setAge("27");
        fortuneTeller.setHeight("0");
        boolean result = fortuneTeller.calculate().length()>1;
        assertEquals("should work with no error message",true,result);
    }
                // Issue #39: Svante/10000/Malmö/-5/165 ger ArrayIndexOutOfBoundsException
    public void testIssue39(){
        FortuneTeller fortuneTeller = new FortuneTeller(new MagicNumbers(), new Translator());
        fortuneTeller.setName("Svante");
        fortuneTeller.setIncome("10000");
        fortuneTeller.setLocation("Malmö");
        fortuneTeller.setAge("-5");
        fortuneTeller.setHeight("165");
        boolean result = fortuneTeller.calculate().length()>1;
        assertEquals("should work with no error message",true,result);
    }
                    // Issue #40: Svante/10000/Malmö/27/-20 ger ArrayIndexOutOfBoundsException
    public void testIssue40(){
        FortuneTeller fortuneTeller = new FortuneTeller(new MagicNumbers(), new Translator());
        fortuneTeller.setName("Svante");
        fortuneTeller.setIncome("10000");
        fortuneTeller.setLocation("Malmö");
        fortuneTeller.setAge("27");
        fortuneTeller.setHeight("-20");
        boolean result = fortuneTeller.calculate().length()>1;
        assertEquals("should work with no error message",true,result);
    }
                        //Issue #41: Svante/0/Malmö/27/165 ger ArrayIndexOutOfBoundsException
    public void testIssue41(){
        FortuneTeller fortuneTeller = new FortuneTeller(new MagicNumbers(), new Translator());
        fortuneTeller.setName("Svante");
        fortuneTeller.setIncome("0");
        fortuneTeller.setLocation("Malmö");
        fortuneTeller.setAge("27");
        fortuneTeller.setHeight("165");
        boolean result = fortuneTeller.calculate().length()>1;
        assertEquals("should work with no error message",true,result);
    }
    }

