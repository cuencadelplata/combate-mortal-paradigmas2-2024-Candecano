package com.example.demo;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest

public class TestJuegoDeLaVida {
    private List<String> caso1;
    @BeforeEach
    public void setUp(){
		caso1 = new ArrayList<String>();
	}
    @Test
    public void Nace_una_celula_con_tres_vecinos(){

    caso1.add (0, "Vecino1");
    caso1.add (1, "Vecino2");
    caso1.add (2, "Vecino3");

    assertEquals("Vecino1", caso1.get(0));
    assertEquals("Vecino2", caso1.get(1));
    assertEquals("Vecino3", caso1.get(2));

   caso1.add (3, "Nueva Celula");

   assertEquals("Vecino1", caso1.get(0));
   assertEquals("Vecino2", caso1.get(1));
   assertEquals("Vecino3", caso1.get(2));
   assertEquals("Nueva Celula", caso1.get(3));
    
   assertTrue(caso1.size()==4);



    }


    private List<String> caso2;
    @BeforeEach
    public void Remover(){
        caso2 = new ArrayList<String>();
    }

    @Test
    public void Muere_una_celula_con_mas_de_tres_vecinos(){

    caso2.add (0, "Vecino1");
    caso2.add (1, "Vecino2");
    caso2.add (2, "Vecino3");
    caso2.add (3, "Vecino4");

    assertEquals("Vecino1", caso2.get(0));
    assertEquals("Vecino2", caso2.get(1));
    assertEquals("Vecino3", caso2.get(2));
    assertEquals("Vecino4", caso2.get(3));


   caso2.remove(3);

   assertEquals("Vecino1", caso2.get(0));
   assertEquals("Vecino2", caso2.get(1));
   assertEquals("Vecino3", caso2.get(2));

   assertTrue(caso2.size()==3);



    }

    private List<String> caso4;
    @BeforeEach
    public void CasoPorDefecto(){
        caso4 = new ArrayList<String>();
    }

    @Test
    public void Muere_el_vecino_de_del_muerto(){

    caso4.add (0, "Vecino1");
    assertEquals("Vecino1", caso4.get(0));
    caso4.remove(0);

    assertTrue(caso4.isEmpty());

    }



    private List<String> caso5;
    @BeforeEach
    public void siguevivo(){
        caso5 = new ArrayList<String>();
    }
    @Test
    public void una_celula_se_mantiene_viva_si_tiene_3_vecinos(){

   caso5.add (0, "Vecino1");
   caso5.add (1, "Vecino2");
   caso5.add (2, "Vecino3");
   caso5.add (3, "Vecino4");

    assertEquals("Vecino1", caso5.get(0));
    assertEquals("Vecino2", caso5.get(1));
    assertEquals("Vecino3", caso5.get(2));
    assertEquals("Vecino4", caso5.get(3));

   assertTrue(caso5.size()==4);
    }



    








    }

