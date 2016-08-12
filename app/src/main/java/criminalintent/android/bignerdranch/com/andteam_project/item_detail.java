package criminalintent.android.bignerdranch.com.andteam_project;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class item_detail extends Whole_store_screen{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_detail);


        ImageButton store_map_button = (ImageButton) findViewById(R.id.store_map);
        store_map_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://map.naver.com/?lng=126.9832952&lat=37.5656402&dlevel=11&mapmode=0&pinId=20669049&pinType=site&enc=b64"));
                startActivity(intent);
            }
        });

    }
}
