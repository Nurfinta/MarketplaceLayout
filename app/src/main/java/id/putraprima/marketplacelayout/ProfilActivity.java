package id.putraprima.marketplacelayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
    }

    public void clickBackRegister(View view){
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    public void clickEdit(View view){
        Intent intent = new Intent(this, ProfilActivity.class);
        startActivity(intent);
    }

    public void clickPen(View view){
        Intent intent = new Intent(this, ProfilActivity.class);
        startActivity(intent);
    }
}
