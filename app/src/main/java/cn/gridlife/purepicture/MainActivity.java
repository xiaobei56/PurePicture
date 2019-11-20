package cn.gridlife.purepicture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnSelectPicture;
    Button btnSelectAlbum;
    final int PICTURES_REQUEST_CODE = 0x0001;
    final int ALBUM_REQUEST_CODE = 0x0002;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSelectAlbum = findViewById(R.id.btn_select_album);
        btnSelectPicture = findViewById(R.id.btn_pictures);
        btnSelectAlbum.setOnClickListener(v -> {
            Intent intent=new Intent();
//            intent.setAction()
        });

    }

    @Override
    public void onActivityReenter(int resultCode, Intent data) {
        super.onActivityReenter(resultCode, data);
        switch (resultCode) {
//            case :
        }
    }
}
