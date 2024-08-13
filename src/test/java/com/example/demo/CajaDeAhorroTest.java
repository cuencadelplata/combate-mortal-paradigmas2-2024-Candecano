package com.example.demo;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest  
public class CajaDeAhorroTest {
 @Test
  void test1() {   
     CajaDeAhorro caja = new CajaDeAhorro(0);
    assert caja.getsaldo() == 0;
  }
 
  @Test
  void test2() {   
     CajaDeAhorro caja = new CajaDeAhorro(0);
    caja.depositar(100);
    assert caja.getsaldo() == 100;
  }
  @Test
  void extraer_cuando_deposito_100_extraigo_10_debe_quedar_90() {   
     CajaDeAhorro caja = new CajaDeAhorro(0);
    caja.depositar(100);
    caja.extraer (10);
    assert caja.getsaldo() == 90;
  }

  @Test 
  void extraer_cuando_deposito_100_extraigo_110_debe_arrojar_error() {   
     CajaDeAhorro caja = new CajaDeAhorro(0);
     caja.depositar(100);
    
    assertThrows(RuntimeException.class, () ->{
            caja.extraer(110);
    }, "No se puede extraer más de lo que hay en la caja");
     
  }
  @Test 
  void titular_debe_asignarse_como_titular_una_persona() {   
     CajaDeAhorro caja = new CajaDeAhorro(0);
     
     Persona persona1= new Persona();

     persona1.setNombre("Juan");

     caja.titular(persona1);

     assert caja.titular().getNombre()==("Juan");
     

    
  }



}





  

