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
public class BeachFragment extends Fragment {


    public BeachFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.event_list, container, false);
        ListView listView = rootView.findViewById(R.id.list);
        ArrayList<Item> itens = new ArrayList<>();
        itens.add(new Item(getString(R.string.morro_branco_title), R.drawable.morro_branco_01, getString(R.string.morro_branco_description)));
        itens.add(new Item(getString(R.string.cumbuco_title), R.drawable.cumbuco_01, getString(R.string.cumbuco_description)));
        itens.add(new Item(getString(R.string.canoa_quebrada_title), R.drawable.canoa_quebrada_02, getString(R.string.canoa_quebrada_description)));
        itens.add(new Item(getString(R.string.jericoacoara_title), R.drawable.jericoacoara_04, getString(R.string.jericoacoara_description)));
        ItemAdapter adapter = new ItemAdapter(rootView.getContext(), itens);
        listView.setAdapter(adapter);
        return listView;
    }

}
