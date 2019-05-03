/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Interfaz.Gestor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author licho
 */
public class GestorTest {
    
    boolean a;
    
    @Before
    public void setUp(){
        a=false;
    }
    
    @Test
    public void validarMenuTest(){
        assertEquals(Gestor.validarMenu(0),a);
    }
   
    @Test
    public void validarMenuTest2(){
        assertEquals(Gestor.validarMenu(3),a);
    }

   
}
