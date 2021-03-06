package org.htbox.crisischeckin.activity;

import org.htbox.crisischeckin.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	switch (item.getItemId()) {
    	case R.id.menu_login:
    		myLogin();
    		return true;
    	default:
    		return super.onOptionsItemSelected(item);
    	}
    }
    
    protected void myLogin() {
        Intent myIntent = new Intent(this, LoginActivity.class);
        startActivity(myIntent);   
    }
}