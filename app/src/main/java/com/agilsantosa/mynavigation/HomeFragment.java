package com.agilsantosa.mynavigation;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {

    private TextInputLayout tvusername;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tvusername  = view.findViewById(R.id.ti_username);
        MaterialButton btnIntent = view.findViewById(R.id.btn_pindah_activity);
        btnIntent.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_pindah_activity){
            String username = tvusername.getEditText().getText().toString();
            if (username.isEmpty()){
                tvusername.setError("Field tidak boleh kosong");
            }else {
                Intent intent = new Intent(getContext(),ResultIntentActivity.class);
                intent.putExtra(MainActivity.MESSAGE, username);
                startActivity(intent);
            }


        }
    }
}
