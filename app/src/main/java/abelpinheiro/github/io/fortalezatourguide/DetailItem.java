package abelpinheiro.github.io.fortalezatourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class DetailItem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_item);

        TextView descriptionTextView = findViewById(R.id.description_detail);
        ImageView imageView = findViewById(R.id.image_detail);

        String title = getIntent().getStringExtra("TITLE");
        setTitle(title);

        String description = getIntent().getStringExtra("DESCRIPTION");
        descriptionTextView.setText(description);

        int image = getIntent().getIntExtra("IMAGE", 0);
        imageView.setImageResource(image);
    }
}
