package com.firstapp.myapplication;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.firstapp.myapplication.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private EditText inputEditText1;
    private EditText inputEditText2;
    private EditText inputEditText3;
    private EditText inputEditText4;
    private EditText inputEditText5;
    private Button submitButton;

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        inputEditText1 = findViewById(R.id.editTextTextPersonName);
        inputEditText2 = findViewById(R.id.editTextTextPersonName2);
        inputEditText3 = findViewById(R.id.editTextTextPersonName3);
        inputEditText4 = findViewById(R.id.editTextTextPersonName4);
        inputEditText5 = findViewById(R.id.editTextTextPersonName5);
        submitButton = findViewById(R.id.button);


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userInput1 = inputEditText1.getText().toString().trim();
                String userInput2 = inputEditText2.getText().toString().trim();
                String userInput3 = inputEditText3.getText().toString().trim();
                String userInput4 = inputEditText4.getText().toString().trim();
                String userInput5 = inputEditText5.getText().toString().trim();

                // Save the user's input here
                saveUserInput(userInput1, userInput2, userInput3, userInput4, userInput5);

                // Display a confirmation message
                Toast.makeText(MainActivity.this, "Data saved", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void saveUserInput(String userInput1, String userInput2, String userInput3, String userInput4, String userInput5) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}
