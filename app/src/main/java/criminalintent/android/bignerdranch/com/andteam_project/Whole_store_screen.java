package criminalintent.android.bignerdranch.com.andteam_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class Whole_store_screen extends AppCompatActivity {
    //public static CheckBox cb;
    //private EditText search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.whole_screen);

                /*EditText search ;
        search = (EditText)findViewById(R.id.search);

        검색버튼 클릭하면 {

            String searchtext = search.getText();

        } */


        Button home_button = (Button) findViewById(R.id.home_button);
        home_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Whole_store_screen.this, home_screen.class);
                startActivity(intent);
            }
        });

        Button whole_button = (Button) findViewById(R.id.whole_button);
        whole_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Whole_store_screen.this, Whole_store_screen.class);
                startActivity(intent);
            }
        });
        Button event_button = (Button) findViewById(R.id.event_button);
        event_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Whole_store_screen.this, item_detail.class);
                startActivity(intent);
            }
        });
        Button setting_button = (Button) findViewById(R.id.setting_button);
        setting_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Whole_store_screen.this, Setting_screen.class);
                startActivity(intent);
            }
        });

        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        List<Recycler_item> items = new ArrayList<>();
        Recycler_item[] item = new Recycler_item[10];
        item[0] = new Recycler_item(R.drawable.starbucks_1,"#1");
        item[1] = new Recycler_item(R.drawable.starbucks_2,"#2");
        item[2] = new Recycler_item(R.drawable.starbucks_3,"#3");
        item[3] = new Recycler_item(R.drawable.starbucks_4,"#4");
        item[4] = new Recycler_item(R.drawable.twosome_1,"#5");
        item[5] = new Recycler_item(R.drawable.twosome_2,"#6");
        item[6] = new Recycler_item(R.drawable.twosome_3,"#7");
        item[7] = new Recycler_item(R.drawable.twosome_4,"#8");
        item[8] = new Recycler_item(R.drawable.coffeebean_1,"#9");
        item[9] = new Recycler_item(R.drawable.coffeebean_2,"#10");

        /*LinearLayout detail_button = (LinearLayout) findViewById(R.id.image_click);
        detail_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), item_detail.class);
                startActivity(intent);
            }
        });*/


        for(int i=0;i<10;i++) items.add(item[i]);

        recyclerView.setAdapter(new RecyclerAdapter(getApplicationContext(),items, R.layout.whole_screen));
    }
}


