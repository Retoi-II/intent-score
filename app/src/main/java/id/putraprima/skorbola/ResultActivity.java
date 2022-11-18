package id.putraprima.skorbola;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView tvTextView3;
    private ImageView ivWinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        getSupportActionBar().hide();

        ivWinner = findViewById(R.id.imgWinner);
        tvTextView3 = findViewById(R.id.textView3);

        tvTextView3.setText(getIntent().getExtras().getString("winner"));
        ivWinner.setImageURI(Uri.parse(getIntent().getExtras().getString("image")));

    }
}
