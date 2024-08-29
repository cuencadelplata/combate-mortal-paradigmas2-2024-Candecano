package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

class EjercitoTest {
  
  @Test
  void soldado_dispara_a_tanque_y_lo_mata() {

    Soldado soldado1= new Soldado();
    Tanque tanque1= new Tanque();
   
    tanque1.getVida();
    soldado1.setDisparo(1);
    tanque1.recibe(soldado1.getDisparo());
    assert tanque1.getVida()==1;
    assertTrue(tanque1.getVivo());


    tanque1.setVida(1);
    soldado1.setDisparo(1);
    tanque1.recibe(soldado1.getDisparo());
    assert tanque1.getVida()==0;
    assertTrue(tanque1.getMuerto());

  }

  @Test
  void tanque_dispara_a_soladado_y_lo_mata() {
    Soldado soldado1= new Soldado();
    Tanque tanque1= new Tanque();

    soldado1.getVida();
    tanque1.setDisparo(1);
    soldado1.recibe(tanque1.getDisparo());
    assert soldado1.getVida()==0;
    assertTrue(soldado1.getMuerto());

    }

    @Test
    void tanque_dispara_a_buque_y_lo_mata() {

      Buque buque1= new Buque();
      Tanque tanque1= new Tanque();

      buque1.getVida();
      tanque1.setDisparo(1);
      buque1.recibe(tanque1.getDisparo());
      assert buque1.getVida()==2;
      assertTrue(buque1.getVivo());
  
      buque1.setVida(2);
      tanque1.setDisparo(1);
      buque1.recibe(tanque1.getDisparo());
      assert buque1.getVida()==1;
      assertTrue(buque1.getVivo());

      buque1.setVida(1);
      tanque1.setDisparo(1);
      buque1.recibe(tanque1.getDisparo());
      assert buque1.getVida()==0;
      assertTrue(buque1.getMuerto());

      }

    @Test 
    void soldado_adquiere_item_escudo() {
       Soldado soldado1 = new Soldado();

       soldado1.setEscudo(50);
       soldado1.adquirir(soldado1.getEscudo());
       assert soldado1.getVida() == 1;

    }

  @Test
    void tanque_dispara_soladado_con_escudo() {
    Soldado soldado1 = new Soldado();
    Tanque tanque1= new Tanque();
    
   //soldado con escudo
   soldado1.setEscudo(50);
   soldado1.adquirir(soldado1.getEscudo());
   assert soldado1.getVida() == 1;
//el tanque le dispara al soldado y se reduce su vida al 50% (0.5), el daño es del 50%
tanque1.setDisparo(1);
soldado1.recibe(tanque1.getDisparo());
assert soldado1.getVida() == 0.5;
assertTrue(soldado1.getVivo());
//el tanque vuelve a disparar al soldado y lo mata
tanque1.setDisparo(1);
soldado1.recibe(tanque1.getDisparo());
assert soldado1.getVida() == 0;
assertTrue(soldado1.getMuerto());
   
  }
  

@Test 
void disparan_a_Chuck_Norris_y_no_muere(){
  ChuckNorris chuck1= new ChuckNorris();
      Tanque tanque1= new Tanque();

      chuck1.setVida(1);
      tanque1.setDisparo(1);
      chuck1.recibirChuck(tanque1.getDisparo()); 
      assert chuck1.getVida() == 1;
      assertTrue(chuck1.getVivo());





}
  


}







