package abelpinheiro.github.io.fortalezatourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Essa classe recebe os valores dos atributos do Item pressionado na ArrayList do Fragment e os
 * infla numa activity com melhores detalhes
 */
public class DetailItem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_item);

        // Pega o TextView em activity_detail_item que tem ID description_detail
        // Pega a ImageView em activity_detail_item que tem ID image_detail
        TextView descriptionTextView = findViewById(R.id.description_detail);
        ImageView imageView = findViewById(R.id.image_detail);

        // Recebe a string com chave TITLE da intent
        String title = getIntent().getStringExtra("TITLE");

        // Seta a Label da activity com a string title
        setTitle(title);

        // Recebe a string com chave DESCRIPTION da intent e o seta na TextView descriptionTextView
        String description = getIntent().getStringExtra("DESCRIPTION");
        descriptionTextView.setText(description);

        // Recebe a resource com chave IMAGE da intent e o seta na ImageView
        int image = getIntent().getIntExtra("IMAGE", 0);
        imageView.setImageResource(image);
    }
}