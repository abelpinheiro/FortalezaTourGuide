package abelpinheiro.github.io.fortalezatourguide.Adapter;

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

import abelpinheiro.github.io.fortalezatourguide.Item;
import abelpinheiro.github.io.fortalezatourguide.R;

public class ItemAdapter extends ArrayAdapter<Item> {


    public ItemAdapter(@NonNull Context context, ArrayList<Item> itens) {
        super(context, 0, itens);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Checa se uma View está sendo reusada, caso contrário inflar a view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.event_item, parent, false);
        }

        // obter o objeto Item localizado nesta posição da lista
        Item currentItem = getItem(position);

        // Pega o TextView no layout que tem a ID title_item
        TextView titleTextView = listItemView.findViewById(R.id.title_item);

        // Recebe o Title do Item atual e o seta na TextView
        titleTextView.setText(currentItem.getmTitle());

        // Pega a ImageView no layout que tem a ID image_item
        ImageView imageImageView = listItemView.findViewById(R.id.image_item);

        // Pega a resource do Item atual e o seta na ImageView
        imageImageView.setImageResource(currentItem.getmImage());

        // Pega o TextView no layout que tem a ID description_item
        TextView descriptionTextView = listItemView.findViewById(R.id.description_item);

        // Recebe o description do Item atual e o seta na TextView
        descriptionTextView.setText(currentItem.getmDescription());

        return listItemView;
    }
}