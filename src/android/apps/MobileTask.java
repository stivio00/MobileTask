package android.apps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;



public class MobileTask extends Activity { 
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //foo
        setContentView(R.layout.main);        
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	boolean result = super.onCreateOptionsMenu(menu);
    	menu.add("Verde");
    	menu.add("Rojo");
    	menu.add("Azul");
    	menu.add("Amarillo");
    	
    	
		return result;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	boolean result =  super.onOptionsItemSelected(item);
    	if (item.toString() == "Verde") {
			
			
		}else if(item.toString() == "Amarillo"){
			Intent i = new Intent(this, android.apps.NewTaskActivity.class);

			startActivity(i); 
		}
    	return result;
    }

}