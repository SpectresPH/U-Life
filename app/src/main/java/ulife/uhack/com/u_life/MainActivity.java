package ulife.uhack.com.u_life;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void register(View v)
    {

    }

    public void login(View v)
    {
        Intent i = new Intent(this, MainMenu.class);
        this.startActivity(i);
    }

}