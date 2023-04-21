package Deporte;

import javax.swing.*;
import java.awt.*;

public class DeporteGrupo {
    private String nombre;
    private String pais;
    private int nroIntegrantes;
    private int edad[]= new int[50];
    private String integrantes[][]= new String[50][4];
    private String posicion[]= new String[50];
    public DeporteGrupo(){

    }
    public DeporteGrupo(String nombre, String pais){
        this.nombre = nombre;
        this.pais = pais;
        this.nroIntegrantes = 5;
        integrantes[0][0] = "juan";integrantes[0][1] ="titular"; integrantes [0][2] = "boliviana";edad[0]=45;posicion[0]="primero";
        integrantes[1][0] = "mario";integrantes[1][1] ="titular"; integrantes [1][2] = "boliviana";edad[1]=32;posicion[1]="tercero";
        integrantes[2][0] = "gonzalo";integrantes[2][1] ="titular"; integrantes [2][2] = "boliviana";edad[2]=21;posicion[2]="cuarto";
        integrantes[3][0] = "ricky";integrantes[3][1] ="titular"; integrantes [3][2] = "boliviana";edad[3]=22;posicion[3]="segundo";
        integrantes[4][0] = "daniel";integrantes[4][1] ="titular"; integrantes [4][2] = "boliviana";edad[4]=43;posicion[4]="quinto";
    }
    public DeporteGrupo(String nombre){
        this.nombre = nombre;
        this.pais = "argentina";
        this.nroIntegrantes = 7;
        integrantes[0][0] = "juan";integrantes[0][1] ="titular"; integrantes [0][2] = "argentina";edad[0]=45;posicion[0]="primero";
        integrantes[1][0] = "mario";integrantes[1][1] ="titular"; integrantes [1][2] = "boliviana";edad[1]=32;posicion[1]="tercero";
        integrantes[2][0] = "gonzalo";integrantes[2][1] ="titular"; integrantes [2][2] = "argentina";edad[2]=21;posicion[2]="cuarto";
        integrantes[3][0] = "ricky";integrantes[3][1] ="titular"; integrantes [3][2] = "uruguay";edad[3]=22;posicion[3]="segundo";
        integrantes[4][0] = "daniel";integrantes[4][1] ="titular"; integrantes [4][2] = "paraguay";edad[4]=43;posicion[4]="quinto";
        integrantes[5][0] = "ricky";integrantes[5][1] ="titular"; integrantes [5][2] = "boliviana";edad[5]=22;posicion[5]="segundo";
        integrantes[6][0] = "rock";integrantes[6][1] ="titular"; integrantes [6][2] = "peru";edad[6]=22;posicion[6]="septimo";

    }

    public void mostrar(){
        System.out.println("---- Deporte ----");
        System.out.println("nombre:"+nombre+"\n pais: "+pais);
        for (int i=0;i<=nroIntegrantes-1;i++)
            System.out.println("nombre: "+integrantes[i][0]+" estado: "+integrantes[i][1]+" nacionalidad: "+ integrantes[i][2]+" edad:"+edad[i]+" posicion:"+posicion[i]);
    }
    public void mostrarNacinalidadX( String naccionalidadX){
        System.out.println("---- f) Mostrar los datos de los integrantes y su posición que tengan la nacionalildad X ---- ");
        for (int i = 0 ; i<nroIntegrantes -1 ; i++){
            if(naccionalidadX.equals(integrantes[i][2]))
                System.out.println("nombre: "+ integrantes[i][0] +" estado: "+integrantes[i][1] + " posicion:"+ posicion[i]+" edad: "+edad[i]);
        }
    }
//    public void contarNacinalidadX( String naccionalidadX){
//        System.out.println("---- f) Mostrar los datos de los integrantes y su posición que tengan la nacionalildad X ---- ");
//        int c=0;
//        for (int i = 0 ; i<nroIntegrantes -1 ; i++){
//            if(naccionalidadX.equals(integrantes[i][2]))
//                c++;
////                System.out.println("nombre: "+ integrantes[i][0] +" estado: "+integrantes[i][1] + " posicion:"+ posicion[i]+" edad: "+edad[i]);
//        }
//        System.out.printf("deportista de la misma nacionalidad "+naccionalidadX+" son: "+c );
//    }
    public void eli(int i){
        System.out.printf("---- h) Eliminar al i-esimo integrante del Objeto DFutbo ----");
        if(i<=nroIntegrantes){
            for (int j =1 ; j < nroIntegrantes+1;j++){
                integrantes[0][j-1]= integrantes [0][j];
                integrantes[1][j-1]= integrantes [1][j];
                integrantes[2][j-1]= integrantes [2][j];
                edad[j-1] = edad[j];
                posicion[j-1] = posicion [j];
            }
        }
        nroIntegrantes--;
    }

    public boolean exite(DFutbol b){

        for (int i=0;i<nroIntegrantes;i++){
            if (integrantes[i][0].equals(b.integrantes[i][0]))
                return true;
        }
        return false;
    }
}
