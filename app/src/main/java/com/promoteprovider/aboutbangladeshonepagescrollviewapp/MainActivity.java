package com.promoteprovider.aboutbangladeshonepagescrollviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   private ImageView image_like;
   private TextView like_count;
   private LinearLayout bangladesh;
   private LinearLayout main_linear_like;
   private ImageView image_like2;
   private TextView like_count2;
   private LinearLayout united;
   private LinearLayout main_linear_like2;
   private ImageView image_like3;
   private TextView like_count3;
   private LinearLayout saudi;
   private LinearLayout main_linear_like3;
   private ImageView image_like4;
   private TextView like_count4;
   private LinearLayout palestine1;
   private LinearLayout main_linear_like4;

   private LinearLayout comment_main;
   private EditText enter_comment;
   private TextView show_comment;
   private LinearLayout click_comment;
   private ImageView comment_send;

   private LinearLayout comment_main2;
   private EditText enter_comment2;
   private TextView show_comment2;
   private LinearLayout click_comment2;
   private ImageView comment_send2;

   private LinearLayout comment_main3;
   private EditText enter_comment3;
   private TextView show_comment3;
   private LinearLayout click_comment3;
   private ImageView comment_send3;

   private LinearLayout comment_main4;
   private EditText enter_comment4;
   private TextView show_comment4;
   private LinearLayout click_comment4;
   private ImageView comment_send4;

    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    int count4 = 0;
    int comment_show = 0;
    int comment_show2 = 0;
    int comment_show3 = 0;
    int comment_show4 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bangladesh = findViewById(R.id.bangladesh);
        main_linear_like = findViewById(R.id.main_linear_like);
        image_like = findViewById(R.id.image_like);
        like_count = findViewById(R.id.like_count);

        united = findViewById(R.id.united);
        main_linear_like2 = findViewById(R.id.main_linear_like2);
        image_like2 = findViewById(R.id.image_like2);
        like_count2 = findViewById(R.id.like_count2);

        saudi = findViewById(R.id.saudi);
        main_linear_like3 = findViewById(R.id.main_linear_like3);
        image_like3 = findViewById(R.id.image_like3);
        like_count3 = findViewById(R.id.like_count3);

        palestine1 = findViewById(R.id.palestine1);
        main_linear_like4 = findViewById(R.id.main_linear_like4);
        image_like4 = findViewById(R.id.image_like4);
        like_count4 = findViewById(R.id.like_count4);

        comment_main = findViewById(R.id.comment_main);
        enter_comment = findViewById(R.id.enter_comment);
        show_comment = findViewById(R.id.show_comment);
        click_comment = findViewById(R.id.click_comment);
        comment_send = findViewById(R.id.comment_send);

        comment_main2 = findViewById(R.id.comment_main2);
        enter_comment2 = findViewById(R.id.enter_comment2);
        show_comment2 = findViewById(R.id.show_comment2);
        click_comment2 = findViewById(R.id.click_comment2);
        comment_send2 = findViewById(R.id.comment_send2);

        comment_main3 = findViewById(R.id.comment_main3);
        enter_comment3 = findViewById(R.id.enter_comment3);
        show_comment3 = findViewById(R.id.show_comment3);
        click_comment3 = findViewById(R.id.click_comment3);
        comment_send3 = findViewById(R.id.comment_send3);

        comment_main4 = findViewById(R.id.comment_main4);
        enter_comment4 = findViewById(R.id.enter_comment4);
        show_comment4 = findViewById(R.id.show_comment4);
        click_comment4 = findViewById(R.id.click_comment4);
        comment_send4 = findViewById(R.id.comment_send4);


        //like section
        bangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        if (count1<=0){
                            count1++;
                            like_count.setText(""+count1);
                            image_like.setVisibility(View.VISIBLE);
                            like_count.setVisibility(View.VISIBLE);
                            main_linear_like.setVisibility(View.VISIBLE);
                            Toast.makeText(MainActivity.this, "Like", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            count1=0;
                            like_count.setText(""+count1);
                            image_like.setVisibility(View.GONE);
                            like_count.setVisibility(View.GONE);
                            main_linear_like.setVisibility(View.GONE);
                            Toast.makeText(MainActivity.this, "Unlike", Toast.LENGTH_SHORT).show();
                        }
            }
        });

        united.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count2<=0){
                    count2++;
                    like_count2.setText(""+count2);
                    image_like2.setVisibility(View.VISIBLE);
                    like_count2.setVisibility(View.VISIBLE);
                    main_linear_like2.setVisibility(View.VISIBLE);
                    Toast.makeText(MainActivity.this, "Like", Toast.LENGTH_SHORT).show();
                }
                else {
                    count2=0;
                    like_count2.setText(""+count2);
                    image_like2.setVisibility(View.GONE);
                    like_count2.setVisibility(View.GONE);
                    main_linear_like2.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Unlike", Toast.LENGTH_SHORT).show();
                }
            }
        });

        saudi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count3<=0){
                    count3++;
                    like_count3.setText(""+count3);
                    image_like3.setVisibility(View.VISIBLE);
                    like_count3.setVisibility(View.VISIBLE);
                    main_linear_like3.setVisibility(View.VISIBLE);
                    Toast.makeText(MainActivity.this, "Like", Toast.LENGTH_SHORT).show();
                }
                else {
                    count3=0;
                    like_count3.setText(""+count3);
                    image_like3.setVisibility(View.GONE);
                    like_count3.setVisibility(View.GONE);
                    main_linear_like3.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Unlike", Toast.LENGTH_SHORT).show();
                }
            }
        });
        palestine1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count4<=0){
                    count4++;
                    like_count4.setText(""+count4);
                    image_like4.setVisibility(View.VISIBLE);
                    like_count4.setVisibility(View.VISIBLE);
                    main_linear_like4.setVisibility(View.VISIBLE);
                    Toast.makeText(MainActivity.this, "Like", Toast.LENGTH_SHORT).show();
                }
                else {
                    count4=0;
                    like_count4.setText(""+count4);
                    image_like4.setVisibility(View.GONE);
                    like_count4.setVisibility(View.GONE);
                    main_linear_like4.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Unlike", Toast.LENGTH_SHORT).show();
                }
            }
        });
        // comment section
        //bangladesh comment
        click_comment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (comment_show<=0){
                    comment_show++;
                    comment_main.setVisibility(View.VISIBLE);
                    Toast.makeText(MainActivity.this, "Enter Your Comment", Toast.LENGTH_SHORT).show();

                }
                else {
                    comment_show=0;
                    comment_main.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Click On Comment Icon", Toast.LENGTH_SHORT).show();

                }

            }
        });
        comment_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Comment = enter_comment.getText().toString();
                Toast.makeText(MainActivity.this, "Comment Successful", Toast.LENGTH_SHORT).show();
                show_comment.setVisibility(View.VISIBLE);
                show_comment.setText(Comment);
            }
        });
//united comment
    click_comment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (comment_show2<=0){
                    comment_show2++;
                    comment_main2.setVisibility(View.VISIBLE);
                    Toast.makeText(MainActivity.this, "Enter Your Comment", Toast.LENGTH_SHORT).show();

                }
                else {
                    comment_show2=0;
                    comment_main2.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Click On Comment Icon", Toast.LENGTH_SHORT).show();

                }

            }
        });
        comment_send2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Comment2 = enter_comment2.getText().toString();
                Toast.makeText(MainActivity.this, "Comment Successful", Toast.LENGTH_SHORT).show();
                show_comment2.setVisibility(View.VISIBLE);
                show_comment2.setText(Comment2);
            }
        });
        //saudi comment
        click_comment3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (comment_show3<=0){
                    comment_show3++;
                    comment_main3.setVisibility(View.VISIBLE);
                    Toast.makeText(MainActivity.this, "Enter Your Comment", Toast.LENGTH_SHORT).show();

                }
                else {
                    comment_show3=0;
                    comment_main3.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Click On Comment Icon", Toast.LENGTH_SHORT).show();

                }
            }
        });
        comment_send3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Comment3 = enter_comment3.getText().toString();
                Toast.makeText(MainActivity.this, "Comment Successful", Toast.LENGTH_SHORT).show();
                show_comment3.setVisibility(View.VISIBLE);
                show_comment3.setText(Comment3);
            }
        });
        //palestine
    click_comment4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (comment_show4<=0){
                    comment_show4++;
                    comment_main4.setVisibility(View.VISIBLE);
                    Toast.makeText(MainActivity.this, "Enter Your Comment", Toast.LENGTH_SHORT).show();

                }
                else {
                    comment_show4=0;
                    comment_main4.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Click On Comment Icon", Toast.LENGTH_SHORT).show();

                }

            }
        });
        comment_send4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Comment4 = enter_comment4.getText().toString();
                Toast.makeText(MainActivity.this, "Comment Successful", Toast.LENGTH_SHORT).show();
                show_comment4.setVisibility(View.VISIBLE);
                show_comment4.setText(Comment4);
            }
        });
    }
}