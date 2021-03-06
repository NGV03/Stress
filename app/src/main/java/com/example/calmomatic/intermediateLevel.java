package com.example.calmomatic;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import java.util.Arrays;
import java.util.Collections;

public class intermediateLevel extends AppCompatActivity {

    private static int SPLASH_TIMEOUT = 4000;

    ImageView iv_11, iv_12, iv_13, iv_14,iv_21, iv_22, iv_23, iv_24,iv_31, iv_32, iv_33, iv_34;

    //array for the images
    Integer[] cardsArray = {101, 102, 103, 104, 105, 106, 201, 202, 203, 204, 205, 206};

    //actual images
    int image101, image102, image103, image104, image105, image106,
            image201, image202, image203, image204, image205, image206;

    int firstCard, secondCard;
    int clickedFirst, clickedSecond;
    int cardNumber = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.flipcard);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate);


        iv_11 = (ImageView) findViewById(R.id.iv_11);
        iv_12 = (ImageView) findViewById(R.id.iv_12);
        iv_13 = (ImageView) findViewById(R.id.iv_13);
        iv_14 = (ImageView) findViewById(R.id.iv_14);
        iv_21 = (ImageView) findViewById(R.id.iv_21);
        iv_22 = (ImageView) findViewById(R.id.iv_22);
        iv_23 = (ImageView) findViewById(R.id.iv_23);
        iv_24 = (ImageView) findViewById(R.id.iv_24);
        iv_31 = (ImageView) findViewById(R.id.iv_31);
        iv_32 = (ImageView) findViewById(R.id.iv_32);
        iv_33 = (ImageView) findViewById(R.id.iv_33);
        iv_34 = (ImageView) findViewById(R.id.iv_34);

        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");
        iv_21.setTag("4");
        iv_22.setTag("5");
        iv_23.setTag("6");
        iv_24.setTag("7");
        iv_31.setTag("8");
        iv_32.setTag("9");
        iv_33.setTag("10");
        iv_34.setTag("11");

        //loading card images
        frontOfCardsResources();

        //rand the images
        Collections.shuffle(Arrays.asList(cardsArray));



        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                mp.start();
                doStuff(iv_11, theCard);
            }
        });
        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                mp.start();
                doStuff(iv_12, theCard);
            }
        });
        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                mp.start();
                doStuff(iv_13, theCard);
            }
        });
        iv_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                mp.start();
                doStuff(iv_14, theCard);
            }
        });
        iv_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                mp.start();
                doStuff(iv_21, theCard);
            }
        });
        iv_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                mp.start();
                doStuff(iv_22, theCard);
            }
        });
        iv_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                mp.start();
                doStuff(iv_23, theCard);
            }
        });
        iv_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                mp.start();
                doStuff(iv_24, theCard);
            }
        });
        iv_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                mp.start();
                doStuff(iv_31, theCard);
            }
        });
        iv_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                mp.start();
                doStuff(iv_32, theCard);
            }
        });
        iv_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                mp.start();
                doStuff(iv_33, theCard);
            }
        });
        iv_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                mp.start();
                doStuff(iv_34, theCard);
            }
        });

    }

    private void doStuff(ImageView iv, int card){

        //set the correct image to the image view
        if (cardsArray[card] == 101){
            iv.setImageResource(image101);
        }else if (cardsArray[card] == 102){
            iv.setImageResource(image102);
        }
        else if (cardsArray[card] == 103){
            iv.setImageResource(image103);
        }
        else if (cardsArray[card] == 104){
            iv.setImageResource(image104);
        }
        else if (cardsArray[card] == 105){
            iv.setImageResource(image105);
        }
        else if (cardsArray[card] == 106){
            iv.setImageResource(image106);
        }
        else if (cardsArray[card] == 201){
            iv.setImageResource(image201);
        }
        else if (cardsArray[card] == 202){
            iv.setImageResource(image202);
        }
        else if (cardsArray[card] == 203){
            iv.setImageResource(image203);
        }
        else if (cardsArray[card] == 204){
            iv.setImageResource(image204);
        }
        else if (cardsArray[card] == 205){
            iv.setImageResource(image205);
        }
        else if (cardsArray[card] == 206){
            iv.setImageResource(image206);
        }

        //check which image is selected and save to temporary variable
        if(cardNumber == 1){
            firstCard = cardsArray[card];
            if(firstCard > 200){
                firstCard = firstCard - 100;
            }
            cardNumber = 2;
            clickedFirst = card;

            iv.setEnabled(false);
        }else if(cardNumber == 2){
            secondCard = cardsArray[card];
            if(secondCard > 200){
                secondCard = secondCard - 100;
            }
            cardNumber = 1;
            clickedSecond = card;

            iv_11.setEnabled(false);
            iv_12.setEnabled(false);
            iv_13.setEnabled(false);
            iv_14.setEnabled(false);
            iv_21.setEnabled(false);
            iv_22.setEnabled(false);
            iv_23.setEnabled(false);
            iv_24.setEnabled(false);
            iv_31.setEnabled(false);
            iv_32.setEnabled(false);
            iv_33.setEnabled(false);
            iv_34.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //check if selected images are equal
                    calculate();
                }
            }, 1000);
        }
    }

    private void calculate(){
        //if images are equal, remove them and add points
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.correct);
        if(firstCard == secondCard){
            if(clickedFirst == 0){
                iv_11.setVisibility(View.INVISIBLE);
                mp.start();
            }else if(clickedFirst == 1){
                iv_12.setVisibility(View.INVISIBLE);
                mp.start();
            }
            else if(clickedFirst == 2){
                iv_13.setVisibility(View.INVISIBLE);
                mp.start();
            }
            else if(clickedFirst == 3){
                iv_14.setVisibility(View.INVISIBLE);
                mp.start();
            }
            else if(clickedFirst == 4){
                iv_21.setVisibility(View.INVISIBLE);
                mp.start();
            }
            else if(clickedFirst == 5){
                iv_22.setVisibility(View.INVISIBLE);
                mp.start();
            }
            else if(clickedFirst == 6){
                iv_23.setVisibility(View.INVISIBLE);
                mp.start();
            }
            else if(clickedFirst == 7){
                iv_24.setVisibility(View.INVISIBLE);
                mp.start();
            }
            else if(clickedFirst == 8){
                iv_31.setVisibility(View.INVISIBLE);
                mp.start();
            }
            else if(clickedFirst == 9){
                iv_32.setVisibility(View.INVISIBLE);
                mp.start();
            }
            else if(clickedFirst == 10){
                iv_33.setVisibility(View.INVISIBLE);
                mp.start();
            }
            else if(clickedFirst == 11){
                iv_34.setVisibility(View.INVISIBLE);
                mp.start();
            }


            if(clickedSecond == 0){
                iv_11.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 1){
                iv_12.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 2){
                iv_13.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 3){
                iv_14.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 4){
                iv_21.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 5){
                iv_22.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 6){
                iv_23.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 7){
                iv_24.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 8){
                iv_31.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 9){
                iv_32.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 10){
                iv_33.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 11){
                iv_34.setVisibility(View.INVISIBLE);
            }


        }else{
            iv_11.setImageResource(R.drawable.back);
            iv_12.setImageResource(R.drawable.back);
            iv_13.setImageResource(R.drawable.back);
            iv_14.setImageResource(R.drawable.back);
            iv_21.setImageResource(R.drawable.back);
            iv_22.setImageResource(R.drawable.back);
            iv_23.setImageResource(R.drawable.back);
            iv_24.setImageResource(R.drawable.back);
            iv_31.setImageResource(R.drawable.back);
            iv_32.setImageResource(R.drawable.back);
            iv_33.setImageResource(R.drawable.back);
            iv_34.setImageResource(R.drawable.back);
            MediaPlayer mpp = MediaPlayer.create(getApplicationContext(), R.raw.wrong);
            mpp.start();



        }
        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_14.setEnabled(true);
        iv_21.setEnabled(true);
        iv_22.setEnabled(true);
        iv_23.setEnabled(true);
        iv_24.setEnabled(true);
        iv_31.setEnabled(true);
        iv_32.setEnabled(true);
        iv_33.setEnabled(true);
        iv_34.setEnabled(true);

        //check if the game is over
        checkEnd();
    }
    private void checkEnd(){
        if(iv_11.getVisibility() == View.INVISIBLE &&
                iv_12.getVisibility() == View.INVISIBLE &&
                iv_13.getVisibility() == View.INVISIBLE &&
                iv_14.getVisibility() == View.INVISIBLE &&
                iv_21.getVisibility() == View.INVISIBLE &&
                iv_22.getVisibility() == View.INVISIBLE &&
                iv_23.getVisibility() == View.INVISIBLE &&
                iv_24.getVisibility() == View.INVISIBLE &&
                iv_31.getVisibility() == View.INVISIBLE &&
                iv_32.getVisibility() == View.INVISIBLE &&
                iv_33.getVisibility() == View.INVISIBLE &&
                iv_34.getVisibility() == View.INVISIBLE){

            //display random quote after game finishes
            final String[] quoteArray =
                    {"Everyone thinks I’m overly dramatic when I’m stressed. When an octopus is stressed, it eats itself. Now that’s overdramatic. ~Unknown",
                    "So you mean to tell me a stress ball isn’t for throwing at people who stress you out? ~Unknown",
                    "When stress is at its highest, just know it can only go down. ~Unknown",
                    "Every mountain top is within reach if you just keep climbing. ~ Barry Finlay ",
                    "You can do anything but not everything. ~Unknown",
                    "You can’t control the wind but you can adjust the sails. -Dolly Parton",
                    "This is not my gray hair, I just refer to them as my stress highlights. ~Unknown",
                    "Its not stress that kills us, it is our reaction to it. – Hans Selye",
                    "The greatest weapon against stress is our ability to choose one thought over another. – William James",
                    "Tension is who you think you should be. Relaxation is who you are. – Chinese Proverb",
                    "If you don’t like something change it; if you can’t change it, change the way you think about it. – Mary Engelbreit",
                    "Yesterday is gone. Tomorrow has not yet come. We have only today. Let us begin. – Mother Teresa",
                    "One moment of patience may ward off great disaster, one moment of impatience may ruin a whole life. – Chinese proverb",
                    "One of the symptoms of an approaching nervous breakdown is the belief that one's work is terribly important.  - Bertrand Russell",
                    "Do not anticipate trouble or worry about what may never happen. Keep in the sunlight. -Marcus Aurelius",
                    "An hour of anxiety cannot change my circumstances, but a minute of prayer can alter everything.   -Al Bryant",
                    "Stress is not what happens to us. It's our response TO what happens. And RESPONSE is something we can choose. -Maureen Killoran",
                    "You must learn to let go. Release the stress. You were never in control anyway. -Steve Maraboli",
                    "Everyday brings a choice: to practice stress or to practice peace. -Joan Borysenko",
                    "Life is really simple, but we insist on making it complicated.  - Confucius",
                    "When you feel the need to hurry, remember that everything in life is a CHOICE. -Jonathan Lockwood Huie",
                    "You are the only one who can limit your greatness. – Unknown",
                    "Make the most of yourself….for that is all there is of you. – Ralph Waldo Emerson",
                    "It takes courage to grow up and become who you really are. – E.E. Cummings",
                    "It is never too late to be what you might have been. – George Eliot",
                    "Whatever you are, be a good one. – Abraham Lincoln"

                    };


            //generate random value from array list
            String randomValue = quoteArray[(int) Math.floor(Math.random() * quoteArray.length)];


            AlertDialog.Builder alertDialogueBuilder = new AlertDialog.Builder(intermediateLevel.this);
            alertDialogueBuilder
                    .setMessage(randomValue)
                    .setCancelable(false)
                    .setPositiveButton("    NEW", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(getApplicationContext(), advancedLevel.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });

            AlertDialog alertDialogue = alertDialogueBuilder.create();
            alertDialogue.show();
        }
    }

    private void frontOfCardsResources(){
        image101 = R.drawable.image_101;
        image102 = R.drawable.image_102;
        image103 = R.drawable.image_103;
        image104 = R.drawable.image_104;
        image105 = R.drawable.image_105;
        image106 = R.drawable.image_106;
        image201 = R.drawable.image_201;
        image202 = R.drawable.image_202;
        image203 = R.drawable.image_203;
        image204 = R.drawable.image_204;
        image205 = R.drawable.image_205;
        image206 = R.drawable.image_206;
    }
}
