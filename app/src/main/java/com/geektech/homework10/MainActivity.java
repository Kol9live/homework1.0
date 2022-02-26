package com.geektech.homework10;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.geektech.homework10.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initListener();
    }

    private void initListener() {
        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.etUserName.length() != 0 && binding.etPassword.length() != 0) {
                    if (binding.etUserName.getText().toString().equals("1") && binding.etPassword.getText().toString().equals("2") ) {
                            binding.etUserName.setVisibility(View.GONE);
                            binding.etPassword.setVisibility(View.GONE);
                            binding.btnLogin.setVisibility(View.GONE);
                            binding.forgot.setVisibility(View.GONE);
                            binding.member.setVisibility(View.GONE);
                            binding.or.setVisibility(View.GONE);
                            binding.sing.setVisibility(View.GONE);
                            binding.imgLabel.setVisibility(View.GONE);

                            binding.getRoot().setBackgroundColor(getResources().getColor(R.color.black, getTheme()));
                            binding.login.setText("Добро пожаловать");
                    } else {
                        Toast.makeText(MainActivity.this, "Неправильные данные!", Toast.LENGTH_SHORT).show();
                    }
                }
                
            }
        });
    }
}