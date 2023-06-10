package com.example.inipunyahilmiy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;


import com.example.inipunyahilmiy.Fragment.DailyFragment;
import com.example.inipunyahilmiy.Fragment.GalleryFragment;
import com.example.inipunyahilmiy.Fragment.HomeFragment;
import com.example.inipunyahilmiy.Fragment.MusicVideoFragment;
import com.example.inipunyahilmiy.Fragment.ProfileFragment;
import com.example.inipunyahilmiy.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new HomeFragment());

        binding.bottomNavigationView.setOnNavigationItemSelectedListener(item ->{

            switch (item.getItemId()) {

                case R.id.home:
                    replaceFragment(new HomeFragment());
                    break;
                case R.id.activity:
                   replaceFragment(new DailyFragment());
                    break;
                case R.id.gallery:
                    replaceFragment(new GalleryFragment());
                    break;
                case R.id.music:
                    replaceFragment(new MusicVideoFragment());
                    break;
                case R.id.profile:
                    replaceFragment(new ProfileFragment());
                    break;

            }
            return true;
        });
    }

    private void replaceFragment(Fragment fragment){

        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction FragmentTransaction=fragmentManager.beginTransaction();
        FragmentTransaction.replace(R.id.root_container,fragment);
        FragmentTransaction.commit();

    }
}