package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.app.Activity;
import android.os.Bundle;

import com.example.databinding.Api.ApiServers;
import com.example.databinding.databinding.ActivityMainBinding;
import com.example.databinding.modeldata.User;

import static com.example.databinding.Api.ApiClient.getClient;

public class MainActivity extends AppCompatActivity {
ApiServers apiServers;
private ActivityMainBinding binding ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this , R.layout.activity_main);
        apiServers = getClient().create(ApiServers.class);

        User datauser = new User();
        binding.setModel(datauser);


    }

    private void getdata(){
apiServers.getDataUser().enqueue(new Callback<User>() {
    @Override
    public void onResponse(Call<User> call, Response<User> response) {
        binding.userid.setText(response.body().getId());
        binding.userfirstname.setText(response.body().getFirstName());
        binding.userlastname.setText(response.body().getLastName());
    }

    @Override
    public void onFailure(Call<User> call, Throwable t) {

    }
});

    }
}
