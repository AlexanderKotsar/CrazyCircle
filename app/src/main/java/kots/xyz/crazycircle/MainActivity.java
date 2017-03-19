package kots.xyz.crazycircle;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button playBtn, helpBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        //Получаем ссылки на элементы кнопки
        playBtn = (Button) findViewById(R.id.play_btn);
        helpBtn = (Button) findViewById(R.id.help_btn);

        //Устанавливаем слушателя для этих кнопок
        playBtn.setOnClickListener(this);
        helpBtn.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {

        //выясняем, какая кнопка была нажата и создем блок кода для ответа на каждый
        if(view.getId()==R.id.play_btn){
            //play button

            Intent helpIntent = new Intent(this, PlayGame.class);
            this.startActivity(helpIntent);
        }
        else if(view.getId()==R.id.help_btn){
            //how to play button

            Intent helpIntent = new Intent(this, HowToPlay.class);
            this.startActivity(helpIntent);
        }
    }

}
