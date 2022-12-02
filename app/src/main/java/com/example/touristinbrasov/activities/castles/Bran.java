package com.example.touristinbrasov.activities.castles;

import android.animation.LayoutTransition;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.touristinbrasov.R;
import com.ms.square.android.expandabletextview.ExpandableTextView;

import org.w3c.dom.Text;

import java.net.URISyntaxException;


public class Bran extends Fragment {

    //Details
    TextView detailsText;
    LinearLayout layout;
    private CardView expand;

    //Prices
    TextView detailsText2;
    LinearLayout layout2;
    private CardView expand2;

    //Program
    TextView detailsText3;
    LinearLayout layout3;
    private CardView expand3;

    //Google Maps
    private CardView map;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_bran, container, false);

        //Details
        detailsText = v.findViewById(R.id.details);
        layout = v.findViewById(R.id.layout);
        layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        expand = v.findViewById(R.id.expand);
        expand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int v = (detailsText.getVisibility()==View.GONE)? View.VISIBLE: View.GONE;
                TransitionManager.beginDelayedTransition(layout, new AutoTransition());
                detailsText.setVisibility(v);
            }
        });

        //Prices
        detailsText2 = v.findViewById(R.id.details2);
        layout2 = v.findViewById(R.id.layout2);
        layout2.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        expand2 = v.findViewById(R.id.expand2);
        expand2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int v = (detailsText2.getVisibility()==View.GONE)? View.VISIBLE: View.GONE;
                TransitionManager.beginDelayedTransition(layout2, new AutoTransition());
                detailsText2.setVisibility(v);
            }
        });

        //Program
        detailsText3 = v.findViewById(R.id.details3);
        layout3 = v.findViewById(R.id.layout3);
        layout3.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        expand3 = v.findViewById(R.id.expand3);
        expand3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int v = (detailsText3.getVisibility()==View.GONE)? View.VISIBLE: View.GONE;
                TransitionManager.beginDelayedTransition(layout3, new AutoTransition());
                detailsText3.setVisibility(v);
            }
        });

        //Maps
        map = v.findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://g.page/BranDraculasCastle?share");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

        return v;

    }

}