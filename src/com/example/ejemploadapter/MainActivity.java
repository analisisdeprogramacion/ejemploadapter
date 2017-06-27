/*
    © 2017 Análisis de Programación
    Contacto: http://jlvr@sweaghe.com/blog    
*/

package com.example.ejemploadapter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	Adaptador adapter;
	String[] elementos = {"Elemento 1 \n", "Elemento 2 \n", "Modificado 3 \n", "Elemento 4 \n", "Elemento 5 \n", "Elemento 6 \n"};
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ListView lista = (ListView) findViewById(R.id.listadeelementos);
        
        lista.setAdapter(new Adaptador(this, elementos));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
