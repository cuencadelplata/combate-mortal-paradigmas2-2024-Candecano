package com.example.demo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest

public class MatrizPruebaTest{
 //1 vivo, 0 muerto
    @Test
    void crear_matriz(){
        int matriz [][]= {
         {1,0,0},
         {0,1,1},
         {1,1,0}
        };

        if (matriz [1][1]==1 && matriz[1][2]==1 && matriz [0][0] == 1){

            matriz [0][0] = 0;
            matriz [0][1] = 1;
           
          assertEquals(0, matriz[0][0]);
          assertEquals(1, matriz [0][1]);
          
         
        }	
     
        assertTrue(matriz[1][1]==1 && matriz[1][2]==1 && matriz [0][0] == 0 && matriz [0][1] == 1);




            
        }
         


        



    }
    
