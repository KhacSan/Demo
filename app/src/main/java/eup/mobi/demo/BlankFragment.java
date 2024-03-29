package eup.mobi.demo;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle bundle = getArguments();
        if(bundle.containsKey("NAME")){
            ((TextView) view.findViewById(R.id.textView)).setText(bundle.getString("NAME"));
        }
    }

    public static BlankFragment newInstance(String name) {

        Bundle args = new Bundle();
        args.putString("NAME",name);
        BlankFragment fragment = new BlankFragment();
        fragment.setArguments(args);
        return fragment;
    }


}
