package com.example.beket.rummyscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String SCORE_PLAYER_ONE_KEY = "SCORE_PLAYER_ONE";
    String SCORE_PLAYER_TWO_KEY = "SCORE_PLAYER_TWO";
    String NAME_PLAYER_ONE_KEY = "NAME_PLAYER_ONE";
    String NAME_PLAYER_TWO_KEY = "NAME_PLAYER_TWO";
    int scorePlayerOne = 0;
    int scorePlayerTwo = 0;
    EditText playerOneEditText;
    EditText playerTwoEditText;
    TextView playerOneTextView;
    TextView playerTwoTextView;
    TextView scorePlayerOneView;
    TextView scorePlayerTwoView;
    Button resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerOneTextView = (TextView) findViewById(R.id.player_one_name_text_view);
        playerTwoTextView = (TextView) findViewById(R.id.player_two_name_text_view);
        scorePlayerOneView = (TextView) findViewById(R.id.score_person_one);
        scorePlayerTwoView = (TextView) findViewById(R.id.score_person_two);
        playerOneTextView.setVisibility(View.GONE);
        playerTwoTextView.setVisibility(View.GONE);
        resetButton = (Button) findViewById(R.id.reset_button);
        resetButton.setText(R.string.done);
        playerOneEditText = (EditText) findViewById(R.id.player_one_name_edit_text);
        playerTwoEditText = (EditText) findViewById(R.id.player_two_name_edit_text);

        if (savedInstanceState != null && !savedInstanceState.getString(NAME_PLAYER_ONE_KEY).isEmpty() && !savedInstanceState.getString(NAME_PLAYER_TWO_KEY).isEmpty()) {
            playerOneEditText.setVisibility(View.GONE);
            playerTwoEditText.setVisibility(View.GONE);
            playerOneTextView.setVisibility(View.VISIBLE);
            playerTwoTextView.setVisibility(View.VISIBLE);
            scorePlayerOne = savedInstanceState.getInt(SCORE_PLAYER_ONE_KEY);
            scorePlayerTwo = savedInstanceState.getInt(SCORE_PLAYER_TWO_KEY);
            playerOneTextView.setText(savedInstanceState.getString(NAME_PLAYER_ONE_KEY));
            playerTwoTextView.setText(savedInstanceState.getString(NAME_PLAYER_TWO_KEY));
            displayPlayerOne(scorePlayerOne);
            displayPlayerTwo(scorePlayerTwo);
            resetButton.setText(R.string.reset);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {

        savedInstanceState.putInt(SCORE_PLAYER_ONE_KEY, scorePlayerOne);
        savedInstanceState.putInt(SCORE_PLAYER_TWO_KEY, scorePlayerTwo);
        savedInstanceState.putString(NAME_PLAYER_ONE_KEY, playerOneTextView.getText().toString());
        savedInstanceState.putString(NAME_PLAYER_TWO_KEY, playerTwoTextView.getText().toString());

        super.onSaveInstanceState(savedInstanceState);
    }

    /*
         * method for displaying the score of player one
         */
    public void displayPlayerOne(int score) {
        scorePlayerOneView.setText(String.valueOf(score));
    }

    /*
     * method for displaying the score of player two
     */
    public void displayPlayerTwo(int score) {
        scorePlayerTwoView.setText(String.valueOf(score));
    }

    /*
     * method for adding 100 to player one score
     */
    public void addHundredPersonOne(View v) {
        scorePlayerOne = scorePlayerOne + 100;
        displayPlayerOne(scorePlayerOne);
    }

    /*
    * method for adding 50 to player one score
    */
    public void addFiftyPersonOne(View v) {
        scorePlayerOne = scorePlayerOne + 50;
        displayPlayerOne(scorePlayerOne);
    }

    /*
     * method for adding 10 to player one score
     */
    public void addTenPersonOne(View v) {
        scorePlayerOne = scorePlayerOne + 10;
        displayPlayerOne(scorePlayerOne);
    }

    /*
     * method for adding 5 to player one score
     */
    public void addFivePersonOne(View v) {
        scorePlayerOne = scorePlayerOne + 5;
        displayPlayerOne(scorePlayerOne);
    }

    /*
     * method for subtracting 100 from player one score
     */
    public void subtractHundredPersonOne(View v) {
        scorePlayerOne = scorePlayerOne - 100;
        displayPlayerOne(scorePlayerOne);
    }

    /*
     * method for subtracting 50 from player one score
     */
    public void subtractFiftyPersonOne(View v) {
        scorePlayerOne = scorePlayerOne - 50;
        displayPlayerOne(scorePlayerOne);
    }

    /*
     * method for subtracting 10 from player one score
     */
    public void subtractTenPersonOne(View v) {
        scorePlayerOne = scorePlayerOne - 10;
        displayPlayerOne(scorePlayerOne);
    }

    /*
     * method for subtracting 5 from player one score
     */
    public void subtractFivePersonOne(View v) {
        scorePlayerOne = scorePlayerOne - 5;
        displayPlayerOne(scorePlayerOne);
    }

    /*
     * method for adding 100 to player one score
     */
    public void addHundredPersonTwo(View v) {
        scorePlayerTwo = scorePlayerTwo + 100;
        displayPlayerTwo(scorePlayerTwo);
    }

    /*
     * method for adding 50 to player two score
     */
    public void addFiftyPersonTwo(View v) {
        scorePlayerTwo = scorePlayerTwo + 50;
        displayPlayerTwo(scorePlayerTwo);
    }

    /*
     * method for adding 10 to player two score
     */
    public void addTenPersonTwo(View v) {
        scorePlayerTwo = scorePlayerTwo + 10;
        displayPlayerTwo(scorePlayerTwo);
    }

    /*
     * method for adding 5 to player two score
     */
    public void addFivePersonTwo(View v) {
        scorePlayerTwo = scorePlayerTwo + 5;
        displayPlayerTwo(scorePlayerTwo);
    }

    /*
     * method for subtracting 100 from player two score
     */
    public void subtractHundredPersonTwo(View v) {
        scorePlayerTwo = scorePlayerTwo - 100;
        displayPlayerTwo(scorePlayerTwo);
    }

    /*
     * method for subtracting 50 from player two score
     */
    public void subtractFiftyPersonTwo(View v) {
        scorePlayerTwo = scorePlayerTwo - 50;
        displayPlayerTwo(scorePlayerTwo);
    }

    /*
     * method for subtracting 10 from player two score
     */
    public void subtractTenPersonTwo(View v) {
        scorePlayerTwo = scorePlayerTwo - 10;
        displayPlayerTwo(scorePlayerTwo);
    }

    /*
     * method for subtracting 5 from player two score
     */
    public void subtractFivePersonTwo(View v) {
        scorePlayerTwo = scorePlayerTwo - 5;
        displayPlayerTwo(scorePlayerTwo);
    }

    /*
     * method for reset the scores of both players
     */
    private void resetScore() {
        scorePlayerOne = 0;
        scorePlayerTwo = 0;
        displayPlayerOne(scorePlayerOne);
        displayPlayerTwo(scorePlayerTwo);
    }

    /*
     * method for name input
     */
    private void doneNameInput() {
        String playerOneName = playerOneEditText.getText().toString().trim();
        String playerTwoName = playerTwoEditText.getText().toString().trim();
        playerOneTextView.setText(playerOneName);
        playerTwoTextView.setText(playerTwoName);
        playerOneEditText.setVisibility(View.GONE);
        playerTwoEditText.setVisibility(View.GONE);
        playerOneTextView.setVisibility(View.VISIBLE);
        playerTwoTextView.setVisibility(View.VISIBLE);
        resetButton.setText(R.string.reset);
    }

    /*
     * method for done or reset button clicked
     */
    public void onButtonClicked(View v) {
        if (resetButton.getText().toString().contains("DONE")) {
            doneNameInput();
        } else {
            resetScore();
        }
    }
}
