package br.com.senaigo.mobile.os2.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.com.senaigo.mobile.os2.R;
import br.com.senaigo.mobile.os2.adapter.ExpandableListAdapter;

public class ListaOSActivity extends AppCompatActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_os);

        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        expListView.setAdapter(listAdapter);
    }

    protected void exibirOS(View view) {
        Intent intent = new Intent(ListaOSActivity.this, DadosOSActivity.class);
        startActivity(intent);
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Rota 01");
        listDataHeader.add("Rota 02");
        listDataHeader.add("Rota 03");

        // Adding child data
        List<String> rota01 = new ArrayList<String>();
        rota01.add("863275-6 - Recadastro BCC");
        rota01.add("863276-1 - Recadastro BCC");
        rota01.add("863435-6 - Vistoria Esgoto");
        rota01.add("871049-1 - Recadastro BCC");

        List<String> rota02 = new ArrayList<String>();
        rota02.add("863275-6 - Recadastro BCC");
        rota02.add("863276-1 - Recadastro BCC");
        rota02.add("863435-6 - Vistoria Esgoto");
        rota02.add("871049-1 - Recadastro BCC");

        List<String> rota03 = new ArrayList<String>();
        rota03.add("863275-6 - Recadastro BCC");
        rota03.add("863276-1 - Recadastro BCC");
        rota03.add("863435-6 - Vistoria Esgoto");
        rota03.add("871049-1 - Recadastro BCC");

        listDataChild.put(listDataHeader.get(0), rota01); // Header, Child data
        listDataChild.put(listDataHeader.get(1), rota02);
        listDataChild.put(listDataHeader.get(2), rota03);
    }
}
