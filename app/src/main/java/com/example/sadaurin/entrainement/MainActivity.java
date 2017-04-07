package com.example.sadaurin.entrainement;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    public Contact c = new Contact();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Contact.deleteAll(Contact.class);
             Contact c = new Contact(
                "1","ojfd","fdsf");
        c.save();

         c = new Contact(
                "2","ojfd","fdsf");
        c.save();


        List<Contact> listContact = Contact.listAll(Contact.class);

        for (int i =0;i<listContact.size();i++){
            Log.v("salut",listContact.get(i).getNom());
        }


        Toast.makeText(this,
                "le Contact " + c.getId() + " "
                        + c.getNom() + " a été inséré",
                Toast.LENGTH_LONG).show();

//        TextView mpa= (TextView) findViewById(R.id.textView);


        //   Batiment re= Batiment.findById(Batiment.class,1);




        //     mpa.setText(re.getNomBatiment());


    }





}
