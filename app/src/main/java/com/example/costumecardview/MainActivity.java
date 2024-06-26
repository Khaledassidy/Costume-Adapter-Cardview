package com.example.costumecardview;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageView profile_image,flight,hotel,car,bus;
    TextView name_costumer,text_cardview,text_car,text_bus,text_hotel,text_flight,desitination_text;
    CardView cardView;
    GridView gridView;
    ArrayList<travel> arrayList;
    costumeaddapter costumeaddapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        profile_image=findViewById(R.id.profile_img);
        flight=findViewById(R.id.flight);
        hotel=findViewById(R.id.hotel);
        car=findViewById(R.id.car);
        bus=findViewById(R.id.bus);
        name_costumer=findViewById(R.id.name_costumer);
        cardView=findViewById(R.id.cardview_image);
        text_cardview=findViewById(R.id.text_cardview);
        text_car=findViewById(R.id.text_car);
        text_bus=findViewById(R.id.text_bus);
        text_hotel=findViewById(R.id.hotel_text);
        text_flight=findViewById(R.id.filght_text);
        desitination_text=findViewById(R.id.destiantion);
        gridView=findViewById(R.id.grid_view);
        arrayList=new ArrayList<>();
        costumeaddapter=new costumeaddapter(this,R.layout.modelview,arrayList);
        travel travel1=new travel(R.drawable.paris,"Paris","France");
        travel travel2=new travel(R.drawable.bacelona,"Barcelona","Spain");
        travel travel3=new travel(R.drawable.lebanon,"Beirut","Lebanon");
        travel travel4=new travel(R.drawable.serlnak,"Serelanka","Serelanka");
        travel travel5=new travel(R.drawable.dubia,"Dubia","United Emarates");
        travel travel6=new travel(R.drawable.malidives,"Malidives","Malidives");
        costumeaddapter.add(travel1);
        costumeaddapter.add(travel2);
        costumeaddapter.add(travel3);
        costumeaddapter.add(travel4);
        costumeaddapter.add(travel5);
        costumeaddapter.add(travel6);
        gridView.setAdapter(costumeaddapter);




    }
}