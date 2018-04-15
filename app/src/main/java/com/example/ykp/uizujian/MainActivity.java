package com.example.ykp.uizujian;

import android.os.Bundle;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {
    private List<Animal> animalList = new ArrayList<Animal>();
    private ListView listview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initAnimals();
        final AnimalAdapter adapter = new AnimalAdapter(MainActivity.this, R.layout.animal_layout, animalList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                view.setBackgroundColor(Color.RED);
                TextView txt1=view.findViewById(R.id.animal_name);
                Toast.makeText(MainActivity.this,txt1.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initAnimals() {
        Animal lion = new Animal("Lion", (R.drawable.lion));
        animalList.add(lion);
        Animal tiger = new Animal("Tiger", (R.drawable.tiger));
        animalList.add(tiger);
        Animal monkey = new Animal("Monkey", (R.drawable.monkey));
        animalList.add(monkey);
        Animal dog = new Animal("Dog", (R.drawable.dog));
        animalList.add(dog);
        Animal cat = new Animal("Cat", (R.drawable.cat));
        animalList.add(cat);
        Animal elephant = new Animal("Elephant", (R.drawable.elephant));
        animalList.add(elephant);
    }
}
