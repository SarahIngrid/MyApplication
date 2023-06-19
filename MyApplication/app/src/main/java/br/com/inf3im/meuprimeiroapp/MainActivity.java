package br.com.inf3im.meuprimeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mButton;
    int vCount = 0;

    private void showMessage(){
        vCount++;
        Toast.makeText(this, "Fui clicado "+vCount, Toast.LENGTH_SHORT).show();


    }


    public class ClickMyButton implements View

            .OnClickListener{
        @Override
        public void onClick(View view) {
            showMessage();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mButton = findViewById(R.id.buttonTest);
        mButton.setOnClickListener();



    }
}