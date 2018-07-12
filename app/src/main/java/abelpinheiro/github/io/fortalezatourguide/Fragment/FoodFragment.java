package abelpinheiro.github.io.fortalezatourguide.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import abelpinheiro.github.io.fortalezatourguide.Item;
import abelpinheiro.github.io.fortalezatourguide.ItemAdapter;
import abelpinheiro.github.io.fortalezatourguide.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.event_list, container, false);
        ListView listView = rootView.findViewById(R.id.list);
        ArrayList<Item> itens = new ArrayList<>();
        itens.add(new Item(getString(R.string.tapioqueira_title), R.drawable.tapioqueira_04, getString(R.string.tapioqueira_description)));
        itens.add(new Item(getString(R.string.sabores_title), R.drawable.sabores_02, getString(R.string.sabores_description)));
        itens.add(new Item(getString(R.string.bambu_title), R.drawable.coco_bambu_01, getString(R.string.bambu_description)));
        itens.add(new Item(getString(R.string.merc_peixes_title), R.drawable.mercado_peixes_01, getString(R.string.merc_peixes_description)));
        ItemAdapter adapter = new ItemAdapter(rootView.getContext(), itens);
        listView.setAdapter(adapter);
        return listView;
    }

}
