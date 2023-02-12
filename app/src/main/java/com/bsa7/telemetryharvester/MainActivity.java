package com.bsa7.telemetryharvester;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    findViewById(R.id.menuIcon).setOnClickListener(handleMenuIconClick);

    NavigationView navigationView = findViewById(R.id.navigationView);
    NavController navController = Navigation.findNavController(this, R.id.navHostFragment);
    NavigationUI.setupWithNavController(navigationView, navController);
  };

  private View.OnClickListener handleMenuIconClick = new View.OnClickListener() {
    @Override
    public void onClick(View v) {
      DrawerLayout drawerLayout = findViewById(R.id.drawerLayout);
      drawerLayout.openDrawer(GravityCompat.START);
    }
  };
}
