package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * This app is a quiz with 8 questions on human brain.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the Submit button is clicked.
     */
    public void Submit(View view) {
        int score = 0;

        //Finds if the user checked the 5 minutes CheckBox.
        CheckBox minutes5CheckBox = (CheckBox) findViewById(R.id.minutes5);
        boolean minutes5 = minutes5CheckBox.isChecked();
        //Finds if the user checked the 10 minutes CheckBox.
        CheckBox minutes10CheckBox = (CheckBox) findViewById(R.id.minutes10);
        boolean minutes10 = minutes10CheckBox.isChecked();
        //Finds if the user checked the 15 minutes CheckBox.
        CheckBox minutes15CheckBox = (CheckBox) findViewById(R.id.minutes15);
        boolean minutes15 = minutes15CheckBox.isChecked();
        //Adds points to score if the user pick the answer 5 and/or 10 minutes.
        if (minutes5 && minutes10 && !minutes15) {
            score += 2;
        } else if (minutes5 && !minutes10 && !minutes15) {
            score += 1;
        } else if (!minutes5 && minutes10 && !minutes15) {
            score += 1;
        } else {
            score += 0;
        }

        //Finds if the user checked the 20% RadioButton.
        RadioButton percent20RadioButton = (RadioButton) findViewById(R.id.percent20);
        boolean percent20 = percent20RadioButton.isChecked();
        //Adds one point to score if the user pick the answer 20%.
        if (percent20) {
            score += 1;
        }

        //Finds what the user typed in the brain freeze question.
        EditText question3 = (EditText) findViewById(R.id.brain_freeze_editText);
        String brainFreezeAnswer = question3.getText().toString();
        //Adds one point to score if the user enter the words Sphenopalatine Ganglioneuralgia.
        if (brainFreezeAnswer.equals(getString(R.string.Sphenopalatine_Ganglioneuralgia))) {
            score += 1;
        }

        //Finds if the user checked the True RadioButton at 4rth question.
        RadioButton question4TrueRadioButton = (RadioButton) findViewById(R.id.question4True);
        boolean answer4T = question4TrueRadioButton.isChecked();
        //Adds one point to score if the user pick the answer True.
        if (answer4T) {
            score += 1;
        }

        //Finds if the user checked the 8-10% CheckBox.
        CheckBox percent810CheckBox = (CheckBox) findViewById(R.id.percent810);
        boolean answer5A = percent810CheckBox.isChecked();
        //Finds if the user checked the 10-13% CheckBox.
        CheckBox percent1013CheckBox = (CheckBox) findViewById(R.id.percent1013);
        boolean answer5B = percent1013CheckBox.isChecked();
        //Finds if the user checked the 14-16% CheckBox.
        CheckBox percent1416CheckBox = (CheckBox) findViewById(R.id.percent1416);
        boolean answer5C = percent1416CheckBox.isChecked();
        //Adds points to score if the user pick the answer 8 - 10% and/or 10-13%.
        if (answer5A && answer5B && !answer5C) {
            score += 2;
        } else if (answer5A && !answer5B && !answer5C) {
            score += 1;
        } else if (!answer5A && answer5B && !answer5C) {
            score += 1;
        } else {
            score += 0;
        }

        //Finds if the user checked the True RadioButton at 6th question.
        RadioButton question6TrueRadioButton = (RadioButton) findViewById(R.id.question6True);
        boolean answer6T = question6TrueRadioButton.isChecked();
        //Adds one point to score if the user pick the answer True.
        if (answer6T) {
            score += 1;
        }

        //Finds what the user typed in the 7th question.
        EditText question7 = (EditText) findViewById(R.id.hemisphere_editText);
        String question7Answer = question7.getText().toString();
        //Adds one point to score if the user enter the word Hemispherectomy.
        if (question7Answer.equals(getString(R.string.Hemispherectomy))) {
            score += 1;
        }

        //Finds if the user checked the 2,71 pounds RadioButton.
        RadioButton pounds271RadioButton = (RadioButton) findViewById(R.id.pounds271);
        boolean answer7A = pounds271RadioButton.isChecked();
        //Adds one point to score if the user pick the answer 2,71 pounds.
        if (answer7A) {
            score += 1;
        }

        //If the user scores 0 points, show a message as a Toast with the user's total score with a comment.
        if (score == 0) {
            Toast toast = Toast.makeText(this, getString(R.string.No_brain_found) + System.lineSeparator() + getString(R.string.Your_score_is_) + score, Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        } else if (score > 0 && score <= 2) {
            //If the user scores 1 or 2 points, show a message as a Toast with the user's total score with a comment.
            Toast toast = Toast.makeText(this, getString(R.string.Not_so_Good_) + System.lineSeparator() + getString(R.string.Your_score_is_) + score, Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        } else if (score > 2 && score <= 4) {
            //If the user scores 3 or 4 points, show a message as a Toast with the user's total score with a comment.
            Toast toast = Toast.makeText(this, getString(R.string.Good_) + System.lineSeparator() + getString(R.string.Your_score_is_) + score, Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        } else if (score >= 5 && score < 8) {
            //If the user scores 5, 6 or 7 points, show a message as a Toast with the user's total score with a comment.
            Toast toast = Toast.makeText(this, getString(R.string.Great_) + System.lineSeparator() + getString(R.string.Your_score_is_) + score, Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        } else if (score == 8) {
            //If the user scores 8 points, show a message as a Toast with the user's total score with a comment.
            Toast toast = Toast.makeText(this, getString(R.string.Excellent_) + System.lineSeparator() + getString(R.string.Your_score_is_) + score, Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        } else {
            //If the user scores 9 or 10 points, show a message as a Toast with the user's total score with a comment.
            Toast toast = Toast.makeText(this, getString(R.string.Wow_You_are_a_genius_) + System.lineSeparator() + getString(R.string.Congratulations_) + System.lineSeparator() + getString(R.string.Your_score_is_) + score, Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
    }
}
