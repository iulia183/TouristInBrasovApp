package com.example.touristinbrasov.scan;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.touristinbrasov.R;


public class Scanner extends Fragment {

    public static TextView resultTExtView;
    Button btn_scan;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_scanner, container, false);

        resultTExtView = v.findViewById(R.id.result_Text);
        btn_scan = v.findViewById(R.id.btn_scan);

        btn_scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ScannerView.class);
                startActivity(intent);
            }
        });

        return v;
    }
}