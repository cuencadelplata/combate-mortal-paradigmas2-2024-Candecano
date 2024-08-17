package com.example.demo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

public class MatrizPruebaTest{
 
    @Test
    void primer_fila_muere_uno_y_nace_otro(){
        int matriz1 [][]= {
         {1,0,0},
         {0,1,1},
         {1,1,0}
        };

        if (matriz1 [1][1]==1 && matriz1[1][2]==1 && matriz1 [0][0] == 1){

            matriz1 [0][0] = 0;
            matriz1 [0][1] = 1;
           
          
          
         
        }	
     
        assertTrue(matriz1 [0][0] == 0 && matriz1 [0][1] == 1);




            
        }
         
     
     @Test
     void segunda_fila_muere_uno_el_resto_queda_igual_nace_uno_tercer_fila(){

      int matriz2 [][]= {
        {0,1,0},
        {0,1,1},
        {1,1,0}
       };
       if (matriz2 [0][0]==0 && matriz2[1][0]==0 && matriz2 [1][2] == 1 ){
         matriz2 [1][1] = 0;
         matriz2[2][2] = 1;
       }

       assertTrue(matriz2[1][1]==0 );
       assertTrue(matriz2[2][2]==1);

    }



    
    






    }
