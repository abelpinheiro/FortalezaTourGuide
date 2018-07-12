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
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.event_list, container, false);
        ListView listView = rootView.findViewById(R.id.list);
        ArrayList<Item> itens = new ArrayList<>();
        itens.add(new Item(getString(R.string.mall_title), R.drawable.open_mall_01, getString(R.string.mall_description)));
        itens.add(new Item(getString(R.string.mercado_title), R.drawable.mercado_03, getString(R.string.mercado_description)));
        itens.add(new Item(getString(R.string.iguatemi_title), R.drawable.iguatemi_01, getString(R.string.iguatemi_description)));
        itens.add(new Item(getString(R.string.monsenhor_tabosa_title), R.drawable.mons_tabosa_02, getString(R.string.monsenhor_tabosa_description)));
        ItemAdapter adapter = new ItemAdapter(rootView.getContext(), itens);
        listView.setAdapter(adapter);
        return listView;
    }

}
