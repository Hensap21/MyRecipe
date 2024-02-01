package com.melky.myapplication;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class Register extends BottomSheetDialogFragment {

    private DataBaseHelperLogin db;

    public static final String TAG = "Register";

    public static Register newInstance(){
        return new Register();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.register, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        EditText username = view.findViewById(R.id.etUsername);
        EditText password = view.findViewById(R.id.etPassword);
        EditText repassword = view.findViewById(R.id.etRepeatPassword);

        Button daftar = view.findViewById(R.id.btnRegister);

        db = new DataBaseHelperLogin(getActivity());

        daftar.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void  onClick(View view){
                String inUsername = username.getText().toString();
                String inPassword = password.getText().toString();
                String inrePassword = repassword.getText().toString();


                if (inUsername.length() < 5) {
                    username.setError("Username harus memiliki minimal 5 karakter");
                }else if (inPassword.length() < 5) {
                    password.setError("Password harus memiliki minimal 5 karakter");
                } else if (!inrePassword.equals(inPassword)) {
                    repassword.setError("Password tidak sama");
                } else {
                    Boolean daftar = db.simpanUser(inUsername, inPassword);
                    if (daftar) {
                        Toast.makeText(getActivity(), "Daftar Berhasil", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getActivity(), "Daftar Gagal", Toast.LENGTH_LONG).show();
                    }
                    dismiss();
                }
            }
        });
    }

    @Override
    public void onDismiss(@NonNull DialogInterface dialog) {
        super.onDismiss(dialog);
        Activity activity = getActivity();
        if (activity instanceof OnDialogCloseListener){
            ((OnDialogCloseListener) activity).onDialogClose(dialog);
        }
    }


}
