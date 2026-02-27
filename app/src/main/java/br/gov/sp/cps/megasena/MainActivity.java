package br.gov.sp.cps.megasena;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView val1, val2, val3, val4, val5, val6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        val1 = findViewById(R.id.val1);
        val2 = findViewById(R.id.val2);
        val3 = findViewById(R.id.val3);
        val4 = findViewById(R.id.val4);
        val5 = findViewById(R.id.val5);
        val6 = findViewById(R.id.val6);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void sorteioNumero(View view){

        Random random = new Random();
        HashSet<Integer> numeros = new HashSet<>();

        while(numeros.size() < 6 ){
            numeros.add(random.nextInt(60) + 1);
        }

        ArrayList<Integer> lista = new ArrayList<>(numeros);
        Collections.sort(lista);

        val1.setText(String.valueOf(lista.get(0)));
        val2.setText(String.valueOf(lista.get(1)));
        val3.setText(String.valueOf(lista.get(2)));
        val4.setText(String.valueOf(lista.get(3)));
        val5.setText(String.valueOf(lista.get(4)));
        val6.setText(String.valueOf(lista.get(5)));


    }

    public void limparNumeros(View view){
        val1.setText("");
        val2.setText("");
        val3.setText("");
        val4.setText("");
        val5.setText("");
        val6.setText("");
    }

}