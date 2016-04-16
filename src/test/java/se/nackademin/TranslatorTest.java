/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 *
 * @author niin
 */
public class TranslatorTest {
    
    @Test
    public void testNoun(){
        Translator t = new Translator();
        String result = t.getNoun(1);
        assertEquals("Getting noun 1 should return \"en lönesänkning\"","en lönesänkning",result);
    }
    @Test
    public void testVerb(){
        Translator t = new Translator();
        String result = t.getVerb(1);
        assertEquals("Getting verb 1 should return \"ljuga\"","ljuga",result);
    }
    @Test
    public void testAdjective(){
        Translator t = new Translator();
        String result = t.getAdjective(1);
        assertEquals("Getting adjective 1 should return \"liten\"","liten",result);
    }

    
}
