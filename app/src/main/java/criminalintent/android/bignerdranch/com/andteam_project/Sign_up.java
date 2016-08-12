package criminalintent.android.bignerdranch.com.andteam_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sign_up extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        Button go_home_button = (Button) findViewById(R.id.go_home);
        go_home_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sign_up.this, home_screen.class);
                startActivity(intent);
            }
        });

    }
}
