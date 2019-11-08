package com.example.appclass_hw13_imageviewin10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Integer> myList = new ArrayList<Integer>();
    int C = 1;
    ImageView imageView;
    Button button;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        editText.setText("");

        myList.add(R.drawable.image1);
        myList.add(R.drawable.image2);
        myList.add(R.drawable.image3);
        myList.add(R.drawable.image4);
        myList.add(R.drawable.image5);
        myList.add(R.drawable.image6);
        myList.add(R.drawable.image7);
        myList.add(R.drawable.image8);
        myList.add(R.drawable.image9);
        myList.add(R.drawable.image10);

    }
    public void OnClick(View view){
        try{
            if(!editText.getText().toString().equals("")){
                C =  Integer.parseInt(editText.getText().toString());
                if(C < 11 && C > 0){
                    switch (C) {
                        case 1:
                            imageView.setImageResource(myList.get(0));
                            break;
                        case 2:
                            imageView.setImageResource(myList.get(1));
                            break;
                        case 3:
                            imageView.setImageResource(myList.get(2));
                            break;
                        case 4:
                            imageView.setImageResource(myList.get(3));
                            break;
                        case 5:
                            imageView.setImageResource(myList.get(4));
                            break;
                        case 6:
                            imageView.setImageResource(myList.get(5));
                            break;
                        case 7:
                            imageView.setImageResource(myList.get(6));
                            break;
                        case 8:
                            imageView.setImageResource(myList.get(7));
                            break;
                        case 9:
                            imageView.setImageResource(myList.get(8));
                            break;
                        case 10:
                            imageView.setImageResource(myList.get(9));
                            break;
                    }
                }else {
                    Toast.makeText(MainActivity.this, "請輸入１～１０", Toast.LENGTH_SHORT).show();
                }
            }else {
                Toast.makeText(MainActivity.this, "請輸入數字", Toast.LENGTH_SHORT).show();
            }
        }
        catch (Exception e){
            Toast.makeText(MainActivity.this, "請正常輸入", Toast.LENGTH_SHORT).show();
            return;
        }


    }
}
