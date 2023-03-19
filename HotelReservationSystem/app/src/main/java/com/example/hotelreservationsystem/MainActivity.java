package com.example.hotelreservationsystem;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                // create a fragment transaction and replace the fragment container with your desired fragment
//                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//                ft.replace(R.id.frame_layout, new HotelSearchFragment());
//                ft.commit();
//            }
//        }, SPLASH_SCREEN);
//    }


//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent intent = new Intent(MainActivity.this, jk.class);
//                startActivity(intent);
//                finish();
//            }
//        },SPLASH_SCREEN);
//        };
//    NavController navController = Navigation.findNavController(MainActivity.this, R.id.search_layout);
//    navController.navigateUp();
//    navController.navigate(R.id.HotelSearchFragment);

//         Begin the transaction
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
////
////        // Replace the contents of the container with the new fragment
        fragmentTransaction.replace(R.id.frame_layout, new HotelSearchFragment());
////
////        // Complete the changes added above
        fragmentTransaction.commit();


    }
}
