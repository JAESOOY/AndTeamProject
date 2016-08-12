package criminalintent.android.bignerdranch.com.andteam_project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Setting_screen extends home_screen{
    private Button push_menu_btn;
    private Button my_info_btn;
    private Button app_info_btn;
    private Button logout_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_screen);

        my_info_btn = (Button) findViewById(R.id.my_info_btn);

        my_info_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Setting_screen.this, My_info_change.class));

                //finish();
                Log.i("00", "start!!!");
            }
        });

        logout_btn = (Button) findViewById(R.id.logout_btn);

        logout_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences sharedPreferences =
                        getSharedPreferences("sharedPreferences", MODE_PRIVATE);
                SharedPreferences.Editor Edit = sharedPreferences.edit();
                Edit.putBoolean("logout",true);
                Edit.commit();

                Toast toast = Toast.makeText(Setting_screen.this, "로그아웃 되었습니다",
                        Toast.LENGTH_SHORT);
                toast.show();

            }
        });
    }
}
