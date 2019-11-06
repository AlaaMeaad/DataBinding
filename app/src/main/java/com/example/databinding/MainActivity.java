package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.os.Bundle;

import com.example.databinding.Api.ApiServers;
import com.example.databinding.databinding.ActivityMainBinding;
import com.example.databinding.modeldata.User;

import static com.example.databinding.Api.ApiClient.getClient;

public class MainActivity extends AppCompatActivity {
ApiServers apiServers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this , R.layout.activity_main);

        User datauser = new User();
        binding.setModel(datauser);
        datauser. getId();
        datauser.getFirstName();
        datauser.getLastName();

    }
}
