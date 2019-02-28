package com.example.ivan.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_test, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu:
                novaActivity(MenuActivity.class,"MenuActivity");
                return true;
            case R.id.crearReserva:
                novaActivity(ReservaActivity.class,"ReservaActivity");
                return true;
            case R.id.buscarReserva:
                novaActivity(BuscarReserva.class,"BuscarReserva");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void novaActivity(Class activityCrida, String info) {

        Intent intent = new Intent(this, activityCrida);
        intent.putExtra("info",info);
        startActivity(intent);
    }

}
