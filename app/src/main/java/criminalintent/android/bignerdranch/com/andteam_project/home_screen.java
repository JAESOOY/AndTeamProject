package criminalintent.android.bignerdranch.com.andteam_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home_screen extends Sign_up {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);


        Button home_button = (Button) findViewById(R.id.home_button);
        home_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home_screen.this, home_screen.class);
                startActivity(intent);
            }
        });

        Button whole_button = (Button) findViewById(R.id.whole_button);
        whole_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home_screen.this, Whole_store_screen.class);
                startActivity(intent);
            }
        });
        Button event_button = (Button) findViewById(R.id.event_button);
        event_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home_screen.this, item_detail.class);
                startActivity(intent);
            }
        });
        Button setting_button = (Button) findViewById(R.id.setting_button);
        setting_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home_screen.this, Setting_screen.class);
                startActivity(intent);
            }
        });
    }
}
