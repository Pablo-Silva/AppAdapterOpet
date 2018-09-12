package com.example.opet.appadapteropet;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Pablo on 12/09/2018.
 */

public class ProdutoAdapter extends ArrayAdapter<Produto>{

    private int rId;

    public ProdutoAdapter( Context context, int resource,  List<Produto> objects) {
        super(context, resource, objects);
        rId = resource;
    }

    @Override
    public View getView(int position, View mView, ViewGroup parent){

        View view = mView;

        if (view == null){

            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(rId, null);

        }

        TextView textNome = view.findViewById(R.id.textNomeProduto);

        TextView texValor = view.findViewById(R.id.textValorProduto);

        TextView textQuantidade = view.findViewById(R.id.textQuantidadeProduto);

        Produto prod = getItem(position);

        textNome.setText(prod.getNome());

        texValor.setText(String.valueOf(prod.getValor()));
        if (prod.getEstoque() <10){
            textQuantidade.setTextColor(Color.RED);
        } else {

            textQuantidade.setTextColor(Color.GREEN);
        }

        textQuantidade.setText(String.valueOf(prod.getEstoque()));

        return view;
    }
}
