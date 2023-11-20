package com.example.trendyolui.fragment;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.TextView;


import com.example.trendyolui.adapter.RvAdapter;
import com.example.trendyolui.databinding.FragmentAnasayfaBinding;
import com.example.trendyolui.entity.Kategoriler;

import java.util.ArrayList;


public class AnasayfaFragment extends Fragment {

  private FragmentAnasayfaBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentAnasayfaBinding.inflate(inflater, container, false);


        SearchView searchView = (SearchView) binding.searchView;


        int id = searchView.getContext().getResources().getIdentifier("android:id/search_src_text", null, null);
        TextView textView = (TextView) searchView.findViewById(id);


        textView.setTextColor(Color.BLACK);

        textView.setHintTextColor(Color.rgb(100, 100, 100));
        textView.setTextSize(14);


        //------------------------------------------------------------------------------------------

        ArrayList<Kategoriler> kategorilerListesi2 = new ArrayList<>();
        Kategoriler s1 = new Kategoriler("like_resim", "sanaozel1", "Samsung Galaxy Watch 4", "3500 TL");
        Kategoriler s2 = new Kategoriler("like_resim", "sanaozel2", "Samsung Galaxy S20+", "21499 TL");
        Kategoriler s3 = new Kategoriler("like_resim", "sanaozel3", "Msi GE63 7RD Raider", "45999 TL");

        kategorilerListesi2.add(s1);
        kategorilerListesi2.add(s2);
        kategorilerListesi2.add(s3);

        binding.sanaOzelRv.setLayoutManager(new LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false));

        RvAdapter kategorilerAdapter2 = new RvAdapter(kategorilerListesi2, requireActivity());
        binding.sanaOzelRv.setAdapter(kategorilerAdapter2);



        return binding.getRoot();
    }
}