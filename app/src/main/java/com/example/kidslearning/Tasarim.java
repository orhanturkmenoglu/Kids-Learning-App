package com.example.kidslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Locale;

import static com.example.kidslearning.R.drawable.ic_animal_bear;
import static com.example.kidslearning.R.drawable.ic_animal_cat;
import static com.example.kidslearning.R.drawable.ic_animal_dog;
import static com.example.kidslearning.R.drawable.ic_animal_elephant;
import static com.example.kidslearning.R.drawable.ic_animal_fish;
import static com.example.kidslearning.R.drawable.ic_animal_giraffa;
import static com.example.kidslearning.R.drawable.ic_animal_lion;
import static com.example.kidslearning.R.drawable.ic_animal_monkey;
import static com.example.kidslearning.R.drawable.ic_animal_owl;
import static com.example.kidslearning.R.drawable.ic_animal_panda;
import static com.example.kidslearning.R.drawable.ic_animal_snake;
import static com.example.kidslearning.R.drawable.ic_animal_turtle;
import static com.example.kidslearning.R.drawable.ic_colors_black;
import static com.example.kidslearning.R.drawable.ic_colors_blue;
import static com.example.kidslearning.R.drawable.ic_colors_brown;
import static com.example.kidslearning.R.drawable.ic_colors_gray;
import static com.example.kidslearning.R.drawable.ic_colors_green;
import static com.example.kidslearning.R.drawable.ic_colors_orange;
import static com.example.kidslearning.R.drawable.ic_colors_pink;
import static com.example.kidslearning.R.drawable.ic_colors_purple;
import static com.example.kidslearning.R.drawable.ic_colors_red;
import static com.example.kidslearning.R.drawable.ic_colors_turquoise;
import static com.example.kidslearning.R.drawable.ic_colors_white;
import static com.example.kidslearning.R.drawable.ic_colors_yellow;
import static com.example.kidslearning.R.drawable.ic_food_ananas;
import static com.example.kidslearning.R.drawable.ic_food_apple;
import static com.example.kidslearning.R.drawable.ic_food_banana;
import static com.example.kidslearning.R.drawable.ic_food_broccoli;
import static com.example.kidslearning.R.drawable.ic_food_carrot;
import static com.example.kidslearning.R.drawable.ic_food_corn;
import static com.example.kidslearning.R.drawable.ic_food_orange;
import static com.example.kidslearning.R.drawable.ic_food_paprika;
import static com.example.kidslearning.R.drawable.ic_food_pear;
import static com.example.kidslearning.R.drawable.ic_food_potato;
import static com.example.kidslearning.R.drawable.ic_food_strawberry;
import static com.example.kidslearning.R.drawable.ic_food_tomato;
import static com.example.kidslearning.R.drawable.ic_instruments_clarinet;
import static com.example.kidslearning.R.drawable.ic_instruments_drums;
import static com.example.kidslearning.R.drawable.ic_instruments_flute;
import static com.example.kidslearning.R.drawable.ic_instruments_guitar;
import static com.example.kidslearning.R.drawable.ic_instruments_maracas;
import static com.example.kidslearning.R.drawable.ic_instruments_piano;
import static com.example.kidslearning.R.drawable.ic_instruments_saxophone;
import static com.example.kidslearning.R.drawable.ic_instruments_tambourine;
import static com.example.kidslearning.R.drawable.ic_instruments_triangle;
import static com.example.kidslearning.R.drawable.ic_instruments_trumpet;
import static com.example.kidslearning.R.drawable.ic_instruments_violin;
import static com.example.kidslearning.R.drawable.ic_instruments_xylophone;
import static com.example.kidslearning.R.drawable.ic_items_alarm_clock;
import static com.example.kidslearning.R.drawable.ic_items_bag;
import static com.example.kidslearning.R.drawable.ic_items_door_bell;
import static com.example.kidslearning.R.drawable.ic_items_fan;
import static com.example.kidslearning.R.drawable.ic_items_microwave;
import static com.example.kidslearning.R.drawable.ic_items_mixer;
import static com.example.kidslearning.R.drawable.ic_items_scissors;
import static com.example.kidslearning.R.drawable.ic_items_shower;
import static com.example.kidslearning.R.drawable.ic_items_toilet;
import static com.example.kidslearning.R.drawable.ic_items_tv;
import static com.example.kidslearning.R.drawable.ic_items_water;
import static com.example.kidslearning.R.drawable.ic_numbers_four;
import static com.example.kidslearning.R.drawable.ic_numbers_seven;
import static com.example.kidslearning.R.drawable.ic_vehicle_ambulance;
import static com.example.kidslearning.R.drawable.ic_vehicle_bike;
import static com.example.kidslearning.R.drawable.ic_vehicle_bus;
import static com.example.kidslearning.R.drawable.ic_vehicle_car;
import static com.example.kidslearning.R.drawable.ic_vehicle_drone;
import static com.example.kidslearning.R.drawable.ic_vehicle_helicopter;
import static com.example.kidslearning.R.drawable.ic_vehicle_moderntrain;
import static com.example.kidslearning.R.drawable.ic_vehicle_motorcyle;
import static com.example.kidslearning.R.drawable.ic_vehicle_policecar;
import static com.example.kidslearning.R.drawable.ic_vehicle_tank;
import static com.example.kidslearning.R.drawable.ic_vehicle_tir;
import static com.example.kidslearning.R.drawable.ic_vehicle_tractor;
import static com.example.kidslearning.R.drawable.telescope;



public class Tasarim extends AppCompatActivity {
    private ImageView imgBack;
    private LinearLayout lnrBackground, lnr1, lnr2, lnr3, lnr4, lnr5, lnr6, lnr7, lnr8, lnr9, lnr10, lnr11, lnr12;
    private TextView tvText, tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9, tv10, tv11, tv12;
    private ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12;
    private int kategori = 1;
    TextToSpeech t1;
    String toSpeak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        kategori = intent.getIntExtra("kategori", 1);
        switch (kategori) {
            case Constant.NUMBERS:
                setTheme(R.style.Theme_Numbers);
                break;
            case Constant.COLORS:
                setTheme(R.style.Theme_Colors);
                break;
            case Constant.ANIMALS:
                setTheme(R.style.Theme_Animals);
                break;
            case Constant.VEHICLES:
                setTheme(R.style.Theme_Vehicles);
                break;
            case Constant.FRUITS:
                setTheme(R.style.Theme_Foods);
                break;
            case Constant.INSTRUMENTS:
                setTheme(R.style.Theme_Instrumenst);
                break;
            case Constant.ITEMS:
                setTheme(R.style.Theme_Items);
                break;
            case Constant.MIX:
                setTheme(R.style.Theme_Mix);
                break;
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasarim);
        findView();

        setKategori();

        t1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                t1.setLanguage(Locale.ENGLISH);
            }
        });
    }

    public void onBackClick(View view) {
        onBackPressed();
    }

    public void onClickTasarim(View view) {
        switch (view.getId()) {
            case R.id.lnr1:
                toSpeak = tv1.getText().toString();
                break;

            case R.id.lnr2:
                toSpeak = tv2.getText().toString();
                break;

            case R.id.lnr3:
                toSpeak = tv3.getText().toString();
                break;

            case R.id.lnr4:
                toSpeak = tv4.getText().toString();
                break;

            case R.id.lnr5:
                toSpeak = tv5.getText().toString();
                break;

            case R.id.lnr6:
                toSpeak = tv6.getText().toString();
                break;

            case R.id.lnr7:
                toSpeak = tv7.getText().toString();
                break;

            case R.id.lnr8:
                toSpeak = tv8.getText().toString();
                break;

            case R.id.lnr9:
                toSpeak = tv9.getText().toString();
                break;

            case R.id.lnr10:
                toSpeak = tv10.getText().toString();
                break;

            case R.id.lnr11:
                toSpeak = tv11.getText().toString();
                break;

            case R.id.lnr12:
                toSpeak = tv12.getText().toString();
                break;

            default:
                toSpeak = tv1.getText().toString();
                break;

        }

        t1.speak(toSpeak,TextToSpeech.QUEUE_FLUSH,null);
    }


    private void setKategori() {
        switch (kategori) {
            case Constant.NUMBERS:
                setNumbers();
                break;
            case Constant.COLORS:
                setColors();
                break;
            case Constant.ANIMALS:
                setAnimals();
                break;
            case Constant.VEHICLES:
                setVehicles();
                break;
            case Constant.FRUITS:
                setFruits();
                break;
            case Constant.INSTRUMENTS:
                setInstruments();
                break;
            case Constant.ITEMS:
                setItems();
                break;
            case Constant.MIX:
                setMix();
                break;
        }
    }


    private void setNumbers() {
        lnrBackground.setBackgroundColor(Color.parseColor("#06d6a0"));
        tvText.setText("NUMBERS");
        img1.setImageResource(R.drawable.ic_numbers_one);
        img2.setImageResource(R.drawable.ic_numbers_two);
        img3.setImageResource(R.drawable.ic_numbers_three);
        img4.setImageResource(R.drawable.ic_numbers_four);
        img5.setImageResource(R.drawable.ic_numbers_five);
        img6.setImageResource(R.drawable.ic_numbers_six);
        img7.setImageResource(R.drawable.ic_numbers_seven);
        img8.setImageResource(R.drawable.ic_numbers_eight);
        img9.setImageResource(R.drawable.ic_numbers_nine);
        img10.setImageResource(R.drawable.ic_numbers_ten);
        lnr11.setVisibility(View.INVISIBLE);
        lnr12.setVisibility(View.INVISIBLE);
    }

    private void setColors() {
        lnrBackground.setBackgroundColor(Color.parseColor("#9b5de5"));
        tvText.setText("COLORS");
        img1.setImageResource(ic_colors_black);
        img2.setImageResource(ic_colors_blue);
        img3.setImageResource(ic_colors_brown);
        img4.setImageResource(ic_colors_gray);
        img5.setImageResource(ic_colors_green);
        img6.setImageResource(ic_colors_orange);
        img7.setImageResource(ic_colors_pink);
        img8.setImageResource(ic_colors_purple);
        img9.setImageResource(ic_colors_red);
        img10.setImageResource(ic_colors_turquoise);
        img11.setImageResource(ic_colors_white);
        img12.setImageResource(ic_colors_yellow);
        tv1.setText("Black");
        tv2.setText("Blue");
        tv3.setText("Brown");
        tv4.setText("Gray");
        tv5.setText("Green");
        tv6.setText("Orange");
        tv7.setText("Pink");
        tv8.setText("Purple");
        tv9.setText("Red");
        tv10.setText("Turqoise");
        tv11.setText("White");
        tv12.setText("Yellow");

    }

    private void setAnimals() {
        lnrBackground.setBackgroundColor(Color.parseColor("#ff9f1c"));
        tvText.setText("ANIMALS");
        img1.setImageResource(ic_animal_bear);
        img2.setImageResource(ic_animal_cat);
        img3.setImageResource(ic_animal_dog);
        img4.setImageResource(ic_animal_elephant);
        img5.setImageResource(ic_animal_fish);
        img6.setImageResource(ic_animal_giraffa);
        img7.setImageResource(ic_animal_lion);
        img8.setImageResource(ic_animal_monkey);
        img9.setImageResource(ic_animal_owl);
        img10.setImageResource(ic_animal_panda);
        img11.setImageResource(ic_animal_snake);
        img12.setImageResource(ic_animal_turtle);
        tv1.setText("Bear");
        tv2.setText("Cat");
        tv3.setText("Dog");
        tv4.setText("Elephant");
        tv5.setText("Fish");
        tv6.setText("Giraffa");
        tv7.setText("Lion");
        tv8.setText("Monkey");
        tv9.setText("Owl");
        tv10.setText("Panda");
        tv11.setText("Snake");
        tv12.setText("Turtle");

    }

    private void setVehicles() {
        lnrBackground.setBackgroundColor(Color.parseColor("#0f4c5c"));
        tvText.setText("VEHICLES");
        img1.setImageResource(ic_vehicle_ambulance);
        img2.setImageResource(ic_vehicle_bike);
        img3.setImageResource(ic_vehicle_bus);
        img4.setImageResource(ic_vehicle_car);
        img5.setImageResource(ic_vehicle_drone);
        img6.setImageResource(ic_vehicle_helicopter);
        img7.setImageResource(ic_vehicle_moderntrain);
        img8.setImageResource(ic_vehicle_motorcyle);
        img9.setImageResource(ic_vehicle_policecar);
        img10.setImageResource(ic_vehicle_tank);
        img11.setImageResource(ic_vehicle_tir);
        img12.setImageResource(ic_vehicle_tractor);
        tv1.setText("Ambulance");
        tv2.setText("Bike");
        tv3.setText("Bus");
        tv4.setText("Car");
        tv5.setText("Drone");
        tv6.setText("Helicopter");
        tv7.setText("Fast Train");
        tv8.setText("Motorcyle");
        tv9.setText("Police Car");
        tv10.setText("Tank");
        tv11.setText("Truck");
        tv12.setText("Tomato");

    }

    private void setFruits() {
        lnrBackground.setBackgroundColor(Color.parseColor("#da1e37"));
        tvText.setText("FRUITS");
        img1.setImageResource(ic_food_ananas);
        img2.setImageResource(ic_food_apple);
        img3.setImageResource(ic_food_banana);
        img4.setImageResource(ic_food_broccoli);
        img5.setImageResource(ic_food_carrot);
        img6.setImageResource(ic_food_corn);
        img7.setImageResource(ic_food_orange);
        img8.setImageResource(ic_food_paprika);
        img9.setImageResource(ic_food_pear);
        img10.setImageResource(ic_food_potato);
        img11.setImageResource(ic_food_strawberry);
        img12.setImageResource(ic_food_tomato);
        tv1.setText("Ananas");
        tv2.setText("Apple");
        tv3.setText("Banana");
        tv4.setText("Broccoli");
        tv5.setText("Carrot");
        tv6.setText("Corn");
        tv7.setText("Orange");
        tv8.setText("Paprika");
        tv9.setText("Pear");
        tv10.setText("Potato");
        tv11.setText("Strawberry");
        tv12.setText("Tomato");

    }

    private void setInstruments() {
        lnrBackground.setBackgroundColor(Color.parseColor("#3a86ff"));
        tvText.setText("INSTRUMENTS");
        img1.setImageResource(ic_instruments_clarinet);
        img2.setImageResource(ic_instruments_drums);
        img3.setImageResource(ic_instruments_guitar);
        img4.setImageResource(ic_instruments_flute);
        img5.setImageResource(ic_instruments_maracas);
        img6.setImageResource(ic_instruments_piano);
        img7.setImageResource(ic_instruments_saxophone);
        img8.setImageResource(ic_instruments_tambourine);
        img9.setImageResource(ic_instruments_triangle);
        img10.setImageResource(ic_instruments_trumpet);
        img11.setImageResource(ic_instruments_violin);
        img12.setImageResource(ic_instruments_xylophone);
        tv1.setText("Clarinet");
        tv2.setText("Drums");
        tv3.setText("Guitar");
        tv4.setText("Flute");
        tv5.setText("Maracas");
        tv6.setText("Piano");
        tv7.setText("Saxophone");
        tv8.setText("Tambourine");
        tv9.setText("Triangle");
        tv10.setText("Trumpet");
        tv11.setText("Violin");
        tv12.setText("Xylophone");
    }

    private void setItems() {
        lnrBackground.setBackgroundColor(Color.parseColor("#0d3b66"));
        tvText.setText("ITEMS");
        img1.setImageResource(ic_items_door_bell);
        img2.setImageResource(ic_items_alarm_clock);
        img3.setImageResource(ic_items_fan);
        img4.setImageResource(ic_items_bag);
        img5.setImageResource(ic_items_microwave);
        img6.setImageResource(ic_items_mixer);
        img7.setImageResource(ic_items_shower);
        img8.setImageResource(ic_items_toilet);
        img9.setImageResource(ic_items_tv);
        img10.setImageResource(ic_items_scissors);
        img11.setImageResource(telescope);
        img12.setImageResource(ic_items_water);
        tv1.setText("Door Bell");
        tv2.setText("Alarm Clock");
        tv3.setText("Fan");
        tv4.setText("Bag");
        tv5.setText("Microwave");
        tv6.setText("Mixer");
        tv7.setText("Shower");
        tv8.setText("Toilet");
        tv9.setText("Tv");
        tv10.setText("Scissors");
        tv11.setText("Telescope");
        tv12.setText("Water");

    }

    private void setMix() {
        lnrBackground.setBackgroundColor(Color.parseColor("#8f2d56"));
        tvText.setText("MIX");
        img1.setImageResource(ic_numbers_four);
        img2.setImageResource(ic_animal_panda);
        img3.setImageResource(ic_colors_blue);
        img4.setImageResource(ic_food_orange);
        img5.setImageResource(ic_instruments_guitar);
        img6.setImageResource(ic_items_tv);
        img7.setImageResource(ic_food_strawberry);
        img8.setImageResource(ic_instruments_piano);
        img9.setImageResource(ic_numbers_seven);
        img10.setImageResource(ic_colors_pink);
        img11.setImageResource(ic_items_alarm_clock);
        img12.setImageResource(ic_animal_owl);
        tv1.setText("Four");
        tv2.setText("Panda");
        tv3.setText("Blue");
        tv4.setText("Orange");
        tv5.setText("Guitar");
        tv6.setText("Tv");
        tv7.setText("Strawberyy");
        tv8.setText("Piano");
        tv9.setText("Seven");
        tv10.setText("Pink");
        tv11.setText("Alarm Clock");
        tv12.setText("Owl");

    }


    private void findView() {
        imgBack = findViewById(R.id.imgBack);
        tvText = findViewById(R.id.tvText);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        img5 = findViewById(R.id.img5);
        img6 = findViewById(R.id.img6);
        img7 = findViewById(R.id.img7);
        img8 = findViewById(R.id.img8);
        img9 = findViewById(R.id.img9);
        img10 = findViewById(R.id.img10);
        img11 = findViewById(R.id.img11);
        img12 = findViewById(R.id.img12);
        lnrBackground = findViewById(R.id.lnrBackground);
        lnr1 = findViewById(R.id.lnr1);
        lnr2 = findViewById(R.id.lnr2);
        lnr3 = findViewById(R.id.lnr3);
        lnr4 = findViewById(R.id.lnr4);
        lnr5 = findViewById(R.id.lnr5);
        lnr6 = findViewById(R.id.lnr6);
        lnr7 = findViewById(R.id.lnr7);
        lnr8 = findViewById(R.id.lnr8);
        lnr9 = findViewById(R.id.lnr9);
        lnr10 = findViewById(R.id.lnr10);
        lnr11 = findViewById(R.id.lnr11);
        lnr12 = findViewById(R.id.lnr12);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);
        tv7 = findViewById(R.id.tv7);
        tv8 = findViewById(R.id.tv8);
        tv9 = findViewById(R.id.tv9);
        tv10 = findViewById(R.id.tv10);
        tv11 = findViewById(R.id.tv11);
        tv12 = findViewById(R.id.tv12);

    }
}