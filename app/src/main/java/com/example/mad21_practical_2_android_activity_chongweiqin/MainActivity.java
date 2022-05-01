package com.example.mad21_practical_2_android_activity_chongweiqin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Button followBtn = (Button) findViewById(R.id.follow);

        User user = new User("Arthur","A quiet reserved individual.",5, false);
        User user1 = new User("Lewis","A quiet reserved individual.",5, false);

        boolean follow = user.followed;

        followBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                OnClick(followBtn,user);
            }
        });
    }

    public void OnClick(Button button, User u1){

        if(u1.followed == false){
            button.setText("Followed");
            u1.followed = true;
        }else{
            button.setText("Unfollowed");
            u1.followed = false;
        }
    }
}

