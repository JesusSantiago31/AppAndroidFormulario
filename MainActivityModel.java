package com.tesji.runers.model;


public class MainActivityModel {
    //En EStructura de DAtos es mi TDA
    //TDA = Datos + Operaciones

    //Definiendo datos
    private int minutos1;
    private int segundos1;
    private int minutos2;
    private int segundos2;


    public int getMinutos1() {
        return minutos1;
    }

    public void setMinutos1(int minutos1) {
        this.minutos1 = minutos1;
    }

    public int getMinutos2() {
        return minutos1;
    }

    public void setMinutos2(int minutos2) {
        this.minutos2 = minutos2;
    }

    public int getSegundos1() {
        return segundos1;
    }

    public void setSegundos1(int segundos1) {
        this.segundos1 = segundos1;
    }

    public int getSegundos2() {
        return segundos2;
    }

    public void setSegundos2(int segundos2) {
        this.segundos2 = segundos2;
    }

    //Definiendo Operaciones
    public String sumaTiempos() {
        int horas;
        int minutos;
        int minutosTotales1;
        int minutosTotales2;
        int minseg;
        int segundosTotales;
        int sumaMinutos;
        int sumaSegundos;

        if(minutos1<60 && segundos1<60 && minutos2<60 &&segundos2<60){        sumaMinutos = minutos1 + minutos2;
        sumaSegundos = segundos1 + segundos2;
        minseg = sumaSegundos / 60;
        segundosTotales = sumaSegundos % 60;
        minutos = sumaMinutos + minseg;
        minutosTotales1 = minutos / 60;
        minutosTotales2 = minutos % 60;
        horas = minutosTotales1*1;
        return "Las horas totales son :"+ horas + "h : " + minutosTotales2 + " min: "+ segundosTotales + " seg";
}else{
return "Introduce una cantidad correcta";}
   
}  

}
