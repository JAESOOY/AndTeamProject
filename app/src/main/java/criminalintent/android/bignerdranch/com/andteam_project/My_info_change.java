package criminalintent.android.bignerdranch.com.andteam_project;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class My_info_change extends Setting_screen{
    private Button cancel_btn;
    private Button save_btn;
    private EditText phone_edttext;
    private EditText name_edttext;
    private EditText birth_edttext;
    private EditText email_edttext;
    private RadioGroup sex;
    RadioButton man_btn;
    RadioButton woman_btn;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor sharedPreferencesEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_info_change);

        sex = (RadioGroup) findViewById(R.id.sex);
        man_btn = (RadioButton) findViewById(R.id.man_btn);
        woman_btn = (RadioButton) findViewById(R.id.woman_btn);

        sharedPreferences = getSharedPreferences("info", MODE_PRIVATE);
        sharedPreferencesEditor = sharedPreferences.edit();

        phone_edttext = (EditText) findViewById(R.id.phone_edttext);
        name_edttext = (EditText) findViewById(R.id.name_edttext);
        birth_edttext = (EditText) findViewById(R.id.birth_edttext);
        email_edttext = (EditText) findViewById(R.id.email_edttext);

        try {
            String phone = sharedPreferences.getString("phone","");
            String name = sharedPreferences.getString("name", "");
            String birth = sharedPreferences.getString("birth", "");
            String email = sharedPreferences.getString("email", "");

            phone_edttext.setText(phone);
            name_edttext.setText(name);
            birth_edttext.setText(birth);
            email_edttext.setText(email);
            sex.check(sharedPreferences.getInt("sex",0));

            Log.i("쉐어드프리퍼런스 가져오기","됨");
        }catch (Exception e){
            Log.i("쉐어드프리퍼런스 가져오기","안됨");
        }


        cancel_btn = (Button) findViewById(R.id.cancel_btn);

        cancel_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

        save_btn = (Button)findViewById(R.id.save_btn);

        save_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPreferencesEditor.putString("phone", String.valueOf(phone_edttext.getText()));
                sharedPreferencesEditor.putString("name", String.valueOf(name_edttext.getText()));
                sharedPreferencesEditor.putString("birth", String.valueOf(birth_edttext.getText()));
                sharedPreferencesEditor.putString("email", String.valueOf(email_edttext.getText()));
                sharedPreferencesEditor.putInt("sex",sex.getCheckedRadioButtonId());
                sharedPreferencesEditor.commit();

                Toast toast = Toast.makeText(My_info_change.this, "저장되었습니다.",
                        Toast.LENGTH_SHORT);
                toast.show();
                finish();


            }
        });


    }
}
