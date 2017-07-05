package matrix.wallpaperchanger;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView dispaly;
    int toPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toPhone = R.drawable.a1;
        dispaly= (ImageView) findViewById(R.id.IVdisplay);
        Button setwall = (Button) findViewById(R.id.WallPaperButton);

        ImageView image1 = (ImageView) findViewById(R.id.IVimage1);
        ImageView image2 = (ImageView) findViewById(R.id.IVimage2);
        ImageView image3 = (ImageView) findViewById(R.id.IVimage3);
        ImageView image4 = (ImageView) findViewById(R.id.IVimage4);
        ImageView image5 = (ImageView) findViewById(R.id.IVimage5);
        ImageView image6 = (ImageView) findViewById(R.id.IVimage6);
        ImageView image7 = (ImageView) findViewById(R.id.IVimage7);

        image1.setOnClickListener(this);
        image2.setOnClickListener(this);
        image3.setOnClickListener(this);
        image4.setOnClickListener(this);
        image5.setOnClickListener(this);
        image6.setOnClickListener(this);
        image7.setOnClickListener(this);
        setwall.setOnClickListener(this);



    }


    @Override
    public void onClick(View view) {

         switch(view.getId()) {

             case R.id.IVimage1:
                 dispaly.setImageResource(R.drawable.a1);
                 toPhone = R.drawable.a1;
                 break;
             case R.id.IVimage2:
                 dispaly.setImageResource(R.drawable.a2);
                 toPhone = R.drawable.a2;
                 break;
             case R.id.IVimage3:
                 dispaly.setImageResource(R.drawable.a3);
                 toPhone = R.drawable.a3;
                 break;
             case R.id.IVimage4:
                 dispaly.setImageResource(R.drawable.a4);
                 toPhone = R.drawable.a4;
                 break;
             case R.id.IVimage5:
                 dispaly.setImageResource(R.drawable.a5);
                 toPhone = R.drawable.a5;
                 break;
             case R.id.IVimage6:
                 dispaly.setImageResource(R.drawable.a6);
                 toPhone = R.drawable.a6;
                 break;
             case R.id.IVimage7:
                 dispaly.setImageResource(R.drawable.a7);
                 toPhone = R.drawable.a7;
                 break;

             case R.id.WallPaperButton:
                 InputStream yeaaaa = getResources().openRawResource(toPhone);
                 Bitmap whatever = BitmapFactory.decodeStream(yeaaaa);
                 try{
                     getApplicationContext().setWallpaper(whatever);
                 }
                 catch (IOException e)
                 {
                     e.printStackTrace();
                 }
                 break;


        }

    }
}
