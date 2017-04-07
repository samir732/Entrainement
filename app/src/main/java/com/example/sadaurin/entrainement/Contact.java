package com.example.sadaurin.entrainement;

import com.orm.SugarRecord;

/**
 * Created by sadaurin on 07/04/2017.
 */



    public class Contact extends SugarRecord {
        String nom;
        String prenom;
        String tel;

        public Contact(){
        }

        public Contact(String nom, String prenom, String tel){
            this.nom = nom;
            this.prenom = prenom;
            this.tel = tel;
        }
        public String getNom() {
            return nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public String getTel() {
            return tel;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }
}
