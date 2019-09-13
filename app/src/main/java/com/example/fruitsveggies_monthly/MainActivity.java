package com.example.fruitsveggies_monthly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import java.text.SimpleDateFormat;
import java.util.Date;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Date today = new Date();
    private int monthVal = today.getMonth();
    private static final String TAG = "Kanki";

    private Food mandalina = new Food("Mandalina", 1, R.drawable.fruit_jan_mandalina);
    private Food portakal = new Food("Portakal", 2, R.drawable.fruit_feb_portakal);
    private Food elma = new Food("Elma", 3, R.drawable.fruit_mar_elma);
    private Food cilek = new Food("Çilek", 4, R.drawable.fruit_apr_cilek);
    private Food dut = new Food("Dut", 5, R.drawable.fruit_may_dut);
    private Food seftali = new Food("Şeftali", 6, R.drawable.fruit_jun_seftali);
    private Food kayisi = new Food("Kayısı", 7, R.drawable.fruit_jul_kayisi);
    private Food uzum = new Food("Üzüm", 8, R.drawable.fruit_aug_uzum);
    private Food kavun = new Food("Kavun", 9, R.drawable.fruit_sep_kavun);
    private Food nar = new Food("Nar", 10, R.drawable.fruit_oct_nar);
    private Food greyfurt = new Food("Greyfurt", 11, R.drawable.fruit_nov_greyfurt);
    private Food armut = new Food("Armut", 12, R.drawable.fruit_dec_armut);

    private Food brokoli = new Food("Brokoli", 1, R.drawable.veggie_jan_brokoli);
    private Food kereviz = new Food("Kereviz", 2, R.drawable.veggie_feb_kereviz);
    private Food ispanak = new Food("Ispanak", 3, R.drawable.veggie_mar_ispanak);
    private Food enginar = new Food("Enginar", 4, R.drawable.veggie_apr_enginar);
    private Food bezelye = new Food("Bezelye", 5, R.drawable.veggie_may_bezelye);
    private Food marul = new Food("Marul", 6, R.drawable.veggie_jun_marul);
    private Food kabak = new Food("Kabak", 7, R.drawable.veggie_jul_kabak);
    private Food patlican = new Food("Patlıcan", 8, R.drawable.veggie_aug_patlican);
    private Food mantar = new Food("Mantar", 9, R.drawable.veggie_sep_mantar);
    private Food pirasa = new Food("Pırasa", 10, R.drawable.veggie_oct_pirasa);
    private Food yerelmasi = new Food("Yer Elması", 11, R.drawable.veggie_nov_yerelmasi);
    private Food karnabahar = new Food("Karnabahar", 12, R.drawable.veggie_dec_karnabahar);

    Food[] fruits = {mandalina, portakal, elma, cilek, dut, seftali, kayisi, uzum, kavun, nar, greyfurt, armut};
    Food[] veggies = {brokoli, kereviz, ispanak, enginar, bezelye, marul, kabak, patlican, mantar, pirasa, yerelmasi, karnabahar};

    @TargetApi(Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.date);

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        String currentDateAndTime = sdf.format(today);
        textView.setText(currentDateAndTime);

        Spinner months_spinner = findViewById(R.id.spinner);
        months_spinner.setSelection(monthVal);

    }

    public void sendMessage(View view) {

        Intent intent = new Intent(this, DisplayPhotosActivity.class);
        Bundle extras = new Bundle();

        for(int i=0; i<12; i++){
            Spinner months_spinner = findViewById(R.id.spinner);
           if((months_spinner.getSelectedItemPosition()+1) == fruits[i].getMonth()){
               extras.putParcelable("fruit", fruits[i]);
               extras.putParcelable("veggie", veggies[i]);
           }
        }
        intent.putExtras(extras);
        startActivity(intent);
    }





    }

