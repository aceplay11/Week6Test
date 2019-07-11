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
                String[] allStrings = text.split(" ");
                String fullString = "";
                for (int i = 0; i < allStrings.length; i++) {
                    String temp = translateToPigLatin(allStrings[i]);
                    fullString += temp;
                }

                tvPigLatin.setText(fullString);
                etEnglish.getText().clear();
                break;

            case R.id.btnVirtusa:
                Intent intent = new Intent(this, VirtusaActivity.class);
                startActivity(intent);
                break;
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

        int index = -1;
        for (int j = 0; j < string.length(); j++) {
            if (isVowel(string.charAt(j))) {
                index = j;
                break;
            }
        }


        String end = string.substring(index);
        String beginning = string.substring(0, index);
        String stringPig = end + beginning + "ay ";
        Log.d("TAG", stringPig);

        return stringPig;
    }
}
