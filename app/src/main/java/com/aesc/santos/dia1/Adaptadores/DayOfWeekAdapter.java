package com.aesc.santos.dia1.Adaptadores;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.aesc.santos.dia1.R;

import java.util.ArrayList;

/**
 * Created by Android on 3/5/2018.
 */

public class DayOfWeekAdapter extends RecyclerView.Adapter<DayOfWeekAdapter.ViewHolder> {

    private ArrayList<String> mDiasDeLaSemana = new ArrayList<>();
    private Context mContext;


    public DayOfWeekAdapter(Context mContext, ArrayList<String> mDiasDeLaSemana) {
        this.mDiasDeLaSemana = mDiasDeLaSemana;
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dias_de_la_semana,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.titulo.setText(mDiasDeLaSemana.get(position));

        holder.mRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "El dias es: " + mDiasDeLaSemana.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mDiasDeLaSemana.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView titulo;
        RelativeLayout mRelativeLayout;

        public ViewHolder(View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.txtTitutlo);
            mRelativeLayout = itemView.findViewById(R.id.relLayout1);
        }
    }
}
