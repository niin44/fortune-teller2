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
}
