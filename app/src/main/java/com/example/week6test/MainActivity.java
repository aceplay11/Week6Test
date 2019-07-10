package com.example.week6test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*PigLatin:

a made-up language formed from English by transferring the initial consonant or consonant
cluster of each word to the end of the word and adding a vocalic syllable (usually ˈpiɡ ˌlatn:
so chicken soup would be translated to ickenchay oupsay . Pig Latin is typically spoken
playfully, as if to convey secrecy.
*/

    TextView tvPigLatin;
    EditText etEnglish;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvPigLatin = findViewById(R.id.tvPigLatin);
        etEnglish = findViewById(R.id.etEnglish);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnTranslate:
                String text = etEnglish.getText().toString();
                String newText = translateToPigLatin(text);
                //Log.d("TAG", newText);
                tvPigLatin.setText(newText);
                break;

            case R.id.btnVirtusa:
                Intent intent = new Intent(this, VirtusaActivity.class);
                startActivity(intent);
        }
    }

    public boolean isVowel(char letter) {

        switch (letter) {
            case 'a':
                return true;

            case 'e':
                return true;

            case 'i':
                return true;

            case 'o':
                return true;

            case 'u':
                return true;

//            case 'y':
//                return true;

            case 'A':
                return true;

            case 'E':
                return true;

            case 'I':
                return true;

            case 'O':
                return true;

            case 'U':
                return true;

//            case 'Y':
//                return true;


            default:
                return false;


        }
    }

    public String translateToPigLatin(String string) {
        String[] allStrings = string.split(" ");
        //Log.d("TAG", allStrings[0] +" "+ allStrings[1]);

        StringBuilder stringPig = new StringBuilder();

        for (int i = 0; i < allStrings.length - 1; i++) {
            String temp = allStrings[i];


            for (int j = 0; j < allStrings[j].length() - 1; j++) {


                if (!isVowel(temp.charAt(j))) {


                    String[] newTemp = temp.split(String.valueOf(temp.charAt(i)));
                    stringPig.append(newTemp[1] + newTemp[0] + "ay ");
                }
            }
        }

        return String.valueOf(stringPig);
    }
}
