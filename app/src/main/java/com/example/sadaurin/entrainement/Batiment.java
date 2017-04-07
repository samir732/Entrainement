package com.example.sadaurin.entrainement;

import com.orm.SugarRecord;

/**
 * Created by sadaurin on 06/04/2017.
 */


public class Batiment extends SugarRecord{
    String nomBatiment;

    public Batiment(){
    }

    public Batiment (String a){
        this.nomBatiment=a;
    }

    public void setNomBatiment(String a){
        this.nomBatiment=a;
    }
    public String getNomBatiment(){
        return nomBatiment;
    }

}


