package me.guillermocalderon.porfaxtfinal.ui.pdf;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import me.guillermocalderon.porfaxtfinal.R;

public class PDFFragment extends Fragment {

    private PDFViewModel PDFViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PDFViewModel =
                ViewModelProviders.of(this).get(PDFViewModel.class);
        View root = inflater.inflate(R.layout.fragment_pdf, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        PDFViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}