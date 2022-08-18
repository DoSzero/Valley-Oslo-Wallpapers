package com.voslowall.valleyoslowallpapers.view;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatDialogFragment;

public class ShowDialog extends AppCompatDialogFragment {
    private ExampleDialogListener listener;

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder
                .setTitle("Внимание!")
                .setMessage("Вы поменяли обои, на выбирание !")
                .setPositiveButton("Да", (dialogInterface, i) -> listener.onYesClicked());
        return builder.create();
    }

    public interface ExampleDialogListener {
        void onYesClicked();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            listener = (ExampleDialogListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context + "must implement ExampleDialogListener");
        }
    }
}
