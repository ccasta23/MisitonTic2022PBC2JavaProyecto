/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos.tests;

import classes.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;

/**
 *
 * @author CARLOS CASTAÑEDA
 */
public class TallerMecanicoTest {
    
    clsTallerMecanico taller;
    clsMecanico mecanico;
    clsCarro carro;
    
    public TallerMecanicoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        mecanico = Mockito.mock(clsMecanico.class);
        taller = new clsTallerMecanico("Donde Juan", "Calle 1 # 2", mecanico);
        carro = new clsCarro(0, true, 0, "CV001", "Chevrolet", 4, "Azult", 80);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void test_entrar_vehiculo_y_repararlo(){
        //Preparación
        Mockito.when(mecanico.getNombre()).thenReturn("Alberto");
        Mockito.when(mecanico.repararVehiculo(carro)).thenReturn(true);
        
        //Actuar
        boolean valorObtenido = taller.recibirVehiculo(carro);
        
        //Afirmar
        assertTrue(valorObtenido);
    }
    
    @Test
    public void test_entrar_vehiculo_y_no_repararlo(){
        //Preparación
        Mockito.when(mecanico.getNombre()).thenReturn("Alberto");
        Mockito.when(mecanico.repararVehiculo(carro)).thenReturn(Boolean.FALSE);
        
        //Actuar
        boolean valorObtenido = taller.recibirVehiculo(carro);
        
        //Afirmar
        assertFalse(valorObtenido);
    }
}
