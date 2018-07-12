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
public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.event_list, container, false);
        ListView listView = rootView.findViewById(R.id.list);
        ArrayList<Item> itens = new ArrayList<>();
        itens.add(new Item(getString(R.string.beach_park_title), R.drawable.beach_park_01, getString(R.string.beach_park_description)));
        itens.add(new Item(getString(R.string.museu_cachaca_title), R.drawable.cachaca_02, getString(R.string.museu_cachaca_description)));
        itens.add(new Item(getString(R.string.dragao_mar_title), R.drawable.dragao_mar_03, getString(R.string.dragao_mar_description)));
        itens.add(new Item(getString(R.string.coco_title), R.drawable.coco_03, getString(R.string.coco_description)));
        ItemAdapter adapter = new ItemAdapter(rootView.getContext(), itens);
        listView.setAdapter(adapter);
        return rootView;
    }

}
