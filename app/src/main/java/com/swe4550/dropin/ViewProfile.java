package com.swe4550.dropin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

import org.w3c.dom.Text;

import java.security.Key;

public class ViewProfile extends AppCompatActivity {

    //ViewProfile bonding variables
    User user_info;
    String user_key;
    ImageView userPfp;
    TextView userName;
    EditText bio;
    ImageView game_one;
    ImageView game_two;
    ImageView game_three;
    ImageView game_four;
    TextView interest_one;
    TextView interest_two;
    TextView interest_three;
    TextView interest_four;
    Button star_btn_one;
    Button star_btn_two;
    Button star_btn_three;
    Button star_btn_four;
    Button star_btn_five;
    ImageView star_image_one;
    ImageView star_image_two;
    ImageView star_image_three;
    ImageView star_image_four;
    ImageView star_image_five;
    Button setupProfile;
    Button logoutBtn;
    Button pokeBtn;
    TextView poke_text;
    TextView rate_text;
    ImageView setupProfileImg;
    // end of bonding variables



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_profile);
        userPfp = findViewById(R.id.user_pfp);
        userName = findViewById(R.id.user_name);
        bio = findViewById(R.id.biography);
        game_one = findViewById(R.id.game_1);
        game_two = findViewById(R.id.game_2);
        game_three = findViewById(R.id.game_3);
        game_four = findViewById(R.id.game_4);
        interest_one = findViewById(R.id.interest_1);
        interest_two = findViewById(R.id.interest_2);
        interest_three = findViewById(R.id.interest_3);
        interest_four = findViewById(R.id.interest_4);
        star_btn_one = findViewById(R.id.star_btn_1);
        star_btn_two = findViewById(R.id.star_btn_2);
        star_btn_three = findViewById(R.id.star_btn_3);
        star_btn_four = findViewById(R.id.star_btn_4);
        star_btn_five = findViewById(R.id.star_btn_5);
        star_image_one = findViewById(R.id.star_image_1);
        star_image_two = findViewById(R.id.star_image_2);
        star_image_three = findViewById(R.id.star_image_3);
        star_image_four = findViewById(R.id.star_image_4);
        star_image_five = findViewById(R.id.star_image_5);
        setupProfile = findViewById(R.id.setup_profile);
        logoutBtn = findViewById(R.id.login_btn);
        pokeBtn = findViewById(R.id.poke_btn);
        poke_text = findViewById(R.id.poke_txt);
        rate_text = findViewById(R.id.rate_txt);
        setupProfileImg = findViewById(R.id.setup_profile_img);


        //if yes
        //Set log-out and edit profile buttons to visible
        //set each star, rate text, Poke text, and the Poke button to invisible
        //Set the logout button, and the edit profile button that takes the user to "SetupProfile" Activity
        // to VISIBLE
        String viewed_user_key = getIntent().getStringExtra("USER KEY");
        if (viewed_user_key.equals(FirebaseAuth.getInstance().getCurrentUser().getUid())) {

            logoutBtn.setVisibility(View.VISIBLE);
            setupProfile.setVisibility(View.VISIBLE);
            setupProfileImg.setVisibility(View.VISIBLE);

            star_btn_one.setVisibility(View.INVISIBLE);
            star_btn_two.setVisibility(View.INVISIBLE);
            star_btn_three.setVisibility(View.INVISIBLE);
            star_btn_four.setVisibility(View.INVISIBLE);
            star_btn_five.setVisibility(View.INVISIBLE);
            star_image_one.setVisibility(View.INVISIBLE);
            star_image_two.setVisibility(View.INVISIBLE);
            star_image_three.setVisibility(View.INVISIBLE);
            star_image_four.setVisibility(View.INVISIBLE);
            star_image_five.setVisibility(View.INVISIBLE);


            rate_text.setVisibility(View.INVISIBLE);
            poke_text.setVisibility(View.INVISIBLE);
            pokeBtn.setVisibility(View.INVISIBLE);
        }
//event listeners

        //Get user key sent from previous activity stored with key: "USER KEY"
        setupProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ViewProfileAct = new Intent(ViewProfile.this, SetUpProfile.class);

                startActivity(ViewProfileAct);
            }
        });
// End of Get user key sent from previous activity
        //Check if the profile being viewed is the person who is logged in
        //getIntent().putExtra("USER KEY", FirebaseAuth.getInstance().getCurrentUser().getUid());
        // if (setupProfile.getText().toString().equals(logoutBtn.FirebaseAuth.getInstance().getCurrentUser().getUid))


        // End of Check (now for the yes or no)
        // end of yes

        //if no
        //Database code here: download the user information.....


        //End of Database code

        //Find how many interests/games are non-empty (matthew's code)


        // Display viewed user's information (end of code matthew's code)


        //On Other User's Profile
        // Star Clicked: Control taken by Database Team.
        // Point out the key of the user being viewed and the variable holding the rating that was given to them
        //  this is the key:  String viewed_user_key = getIntent().getStringExtra("USER KEY");
        star_btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //inside here
                setStarImageDrawable("1");
                setEmptyStars("1");
                //I need to send data here, the data I need to be sent is the number 1 as a string, and below is the currently viewed user's key
                String viewed_user_key = getIntent().getStringExtra("USER KEY");


            }
        });
        star_btn_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //inside here
                setStarImageDrawable("2");
                setEmptyStars("2");
                // I need to send data here, the data I need to be sent is the number 2 as a string, and below is the currently viewed user's key
                String viewed_user_key = getIntent().getStringExtra("USER KEY");

            }
        });
        star_btn_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //inside here
                setStarImageDrawable("3");
                setEmptyStars("3");
                // I need to send data here, the data I need to be sent is the number 3 as a string, and below is the currently viewed user's key
                String viewed_user_key = getIntent().getStringExtra("USER KEY");

            }
        });
        star_btn_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //inside here
                setStarImageDrawable("4");
                setEmptyStars("4");
                //I need to send data here, the data I need to be sent is the number 4 as a string, and below is the currently viewed user's key
                String viewed_user_key = getIntent().getStringExtra("USER KEY");


            }
        });
        star_btn_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //inside here
                setStarImageDrawable("5");
                setEmptyStars("5");
                //I need to send data here, the data I need to be sent is the number 5 as a string, and below is the currently viewed user's key
                String viewed_user_key = getIntent().getStringExtra("USER KEY");


            }
        });
        //specify the key of the user being viewed and the rating given with a comment - leave space for the
        pokeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // here is the user that is currently signed in:
                String current_user = FirebaseAuth.getInstance().getCurrentUser().getUid();
                //Database code and stuff starts here

            }
        });

    }
//Database code after PokeButton Starts Here




    //End of database code


    //Method sets the correct image resource using the passed in string
    private void setStarImageDrawable(String key){
        int imageInt;
        switch(key){
            case "5":
                star_image_five.setImageResource(R.drawable.filled_star);
            case "4":
                star_image_four.setImageResource(R.drawable.filled_star);

            case "3":
                star_image_three.setImageResource(R.drawable.filled_star);

            case "2":
                star_image_two.setImageResource(R.drawable.filled_star);

            case "1":
                star_image_one.setImageResource(R.drawable.filled_star);

                //imageInt = R.drawable.grey_background_circle;
        }
       // return imageInt;
    }
    private void setEmptyStars(String key){
        switch(key){
            case "1":
                star_image_two.setImageResource(R.drawable.empty_star);
            case "2":
                star_image_three.setImageResource(R.drawable.empty_star);
            case "3":
                star_image_four.setImageResource(R.drawable.empty_star);
            case "4":
                star_image_five.setImageResource(R.drawable.empty_star);

        }

    }
}

