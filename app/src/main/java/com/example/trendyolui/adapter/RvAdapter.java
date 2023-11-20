package com.example.trendyolui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.trendyolui.databinding.SanaozelCardtasarimBinding;
import com.example.trendyolui.entity.Kategoriler;

import java.util.List;


public class RvAdapter extends RecyclerView.Adapter<RvAdapter.CardTasarimTutucu> {

    private List<Kategoriler> kategorilerListesi;
    private Context mContext;

    public RvAdapter(List<Kategoriler> kategorilerListesi, Context mContext) {
        this.kategorilerListesi = kategorilerListesi;
        this.mContext = mContext;
    }


    public class CardTasarimTutucu extends RecyclerView.ViewHolder {

        private SanaozelCardtasarimBinding tasarim;

        public CardTasarimTutucu(SanaozelCardtasarimBinding tasarim) {
            super(tasarim.getRoot());
            this.tasarim = tasarim;
        }
    }


    @NonNull
    @Override
    public CardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        SanaozelCardtasarimBinding binding = SanaozelCardtasarimBinding.inflate(LayoutInflater.from(mContext), parent, false);

        return new CardTasarimTutucu(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardTasarimTutucu holder, int position) {

        Kategoriler kategori = kategorilerListesi.get(position);
        SanaozelCardtasarimBinding t = holder.tasarim;

        t.imageSanaOzel.setImageResource(mContext.getResources().getIdentifier(kategori.getBigImage(), "drawable", mContext.getPackageName()));
        t.imageView13.setImageResource(mContext.getResources().getIdentifier(kategori.getSmallImage(), "drawable", mContext.getPackageName()));
        t.textViewSanaOzel.setText(kategori.getDescription());
        t.textViewSanaOzelFiyat.setText(kategori.getPrice());
    }

    @Override
    public int getItemCount() {
        return kategorilerListesi.size();
    }
}