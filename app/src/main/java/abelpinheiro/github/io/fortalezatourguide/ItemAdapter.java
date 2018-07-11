package abelpinheiro.github.io.fortalezatourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {


    public ItemAdapter(@NonNull Context context, ArrayList<Item> itens) {
        super(context, 0, itens);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.event_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Item currentItem = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView titleTextView = listItemView.findViewById(R.id.title_item);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        titleTextView.setText(currentItem.getmTitle());

        ImageView imageImageView = listItemView.findViewById(R.id.image_item);

        imageImageView.setImageResource(currentItem.getmImage());

        TextView descriptionTextView = listItemView.findViewById(R.id.description_item);
        descriptionTextView.setText(currentItem.getmDescription());

        return listItemView;
    }
}
