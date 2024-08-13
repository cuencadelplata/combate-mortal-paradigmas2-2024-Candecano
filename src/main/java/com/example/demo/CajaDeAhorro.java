package com.example.demo;

public class CajaDeAhorro {
    private int saldo;
    private Persona titular;

    public CajaDeAhorro(int saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(int monto) {
        //saldo += monto;
        setSaldo(getsaldo()+monto);
    }
    private void setSaldo (int valor){
        saldo= valor;
    }


    public int getsaldo(){
        return saldo;
    }

    public int extraer(int monto) {
        if (getsaldo() < monto) {
            throw new RuntimeException("Saldo insuficiente");
        }
        //saldo -= monto;
        setSaldo(getsaldo()-monto);
        
       
        return getsaldo();
    }

    public void titular (Persona persona1) {
        titular=persona1;
    }
public Persona titular (){
    return titular;
}

}
