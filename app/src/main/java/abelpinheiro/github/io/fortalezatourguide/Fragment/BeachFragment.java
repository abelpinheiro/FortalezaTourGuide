package abelpinheiro.github.io.fortalezatourguide.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import abelpinheiro.github.io.fortalezatourguide.DetailItem;
import abelpinheiro.github.io.fortalezatourguide.Item;
import abelpinheiro.github.io.fortalezatourguide.Adapter.ItemAdapter;
import abelpinheiro.github.io.fortalezatourguide.R;

/**
 * Fragmento para a ListView de Praias
 */
public class BeachFragment extends Fragment {

    // Variavéis estáticas para guardar a string que será colocada nos putExtra
    private static String TITLE_LOCAL = "TITLE";
    private static String IMAGE_LOCAL = "IMAGE";
    private static String DESCRIPTION_LOCAL = "DESCRIPTION";

    public BeachFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Infla em rootView o layout event_list e obtém a referência da ListView contida no layout
        final View rootView = inflater.inflate(R.layout.event_list, container, false);
        ListView listView = rootView.findViewById(R.id.list);

        /*
            Instanciação de uma ArrayList de Item, depois é populado na arraylist os beachList desejados.
            instanciação de um adapter para para inflar na listView os elementos da arraylist
         */
        final ArrayList<Item> beachList = new ArrayList<>();
        beachList.add(new Item(getString(R.string.morro_branco_title), R.drawable.morro_branco_01, getString(R.string.morro_branco_description)));
        beachList.add(new Item(getString(R.string.cumbuco_title), R.drawable.cumbuco_01, getString(R.string.cumbuco_description)));
        beachList.add(new Item(getString(R.string.canoa_quebrada_title), R.drawable.canoa_quebrada_02, getString(R.string.canoa_quebrada_description)));
        beachList.add(new Item(getString(R.string.jericoacoara_title), R.drawable.jericoacoara_04, getString(R.string.jericoacoara_description)));
        ItemAdapter adapter = new ItemAdapter(getActivity(), beachList);
        listView.setAdapter(adapter);

        /* Listener que recebe o item da ListView pressionado. Irá receber todos os os valores
           do objeto desta posição e enviá-los por meio de Intent para a classe DetailItem
         */
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Obter o item da posição pressionada e seus respectivos atributos
                Item currentItem = beachList.get(position);
                String title = currentItem.getmTitle();
                int image = currentItem.getmImage();
                String description = currentItem.getmDescription();

                // Enviar os valores dos atributos por Intent para DetailItem
                Intent intent = new Intent(rootView.getContext(), DetailItem.class);
                intent.putExtra(TITLE_LOCAL, title);
                intent.putExtra(IMAGE_LOCAL, image);
                intent.putExtra(DESCRIPTION_LOCAL, description);
                startActivity(intent);
            }
        });

        return rootView;
    }

}