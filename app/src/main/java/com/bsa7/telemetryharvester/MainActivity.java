package com.bsa7.telemetryharvester;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
  private Button loginButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    loginButton = (Button) findViewById(R.id.login_button);
    loginButton.setOnClickListener(this.onLoginButtonClickListener);
  };

  private View.OnClickListener onLoginButtonClickListener = new View.OnClickListener() {
    @Override
    public void onClick(View v) {
      openLoginActivity();
    }
  };

  public void openLoginActivity() {
    Intent intent = new Intent(this, LoginActivity.class);
    startActivity(intent);
  };
}
