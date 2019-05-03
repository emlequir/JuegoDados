/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import ContextoProblema.Dado;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author licho
 */
public class Gestor {
    private Dado dado1;
    private Dado dado2;
    
    public Gestor(){
        dado1 = new Dado();
        dado2 = new Dado();
        menu();
    }
    
    public void menu(){
        System.out.println("Eliga una opción");
        System.out.println("1.Lanzar dados");
        System.out.println("2.Salir");
        int resp;
        do{
        resp=leerInt();
        }while(validarMenu(resp));
        accionMenu(resp);
    } 
       
    public int leerInt(){
        Scanner teclado = new Scanner(System.in);
        int resp=0;
        try{
            resp = teclado.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Dato invalido");
            resp=-1;
        }
        return resp;
    }
    
    public static boolean validarMenu(int resp){
        if(resp<1 || resp>2){
            return false;
        }else {
            return true;
        }
    }
    
    public void lanzarDados(){
        Random aleatorio = new Random();
        dado1.setCara(aleatorio.nextInt(6)+1);
        dado2.setCara(aleatorio.nextInt(6)+1);
    }
    
    public int sumarDados(){
        return dado1.getCara()+dado2.getCara();
    }

    private void accionMenu(int resp) {
        switch(resp){
            case 1:
                lanzarDados();
                System.out.println("Suma de los dados: "+sumarDados());
                menu();
                break;
            case 2:
                break;               
        }
    }
    
    
}
