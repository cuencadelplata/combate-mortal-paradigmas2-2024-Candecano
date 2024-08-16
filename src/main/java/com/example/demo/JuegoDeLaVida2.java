package com.example.demo;
import java.util.*;
public class JuegoDeLaVida2 {
   private List <String> caso1;
   public JuegoDeLaVida2(){
      caso1 = new ArrayList<String>();
   }
   public void Nace_una_celula_con_tres_vecinos(){
      if (caso1.size()==3) {
         caso1.add("Nueva Celula");
      }
        
      }
      public List<String> getcaso1(){
         return caso1;
      }



}
