package com.anonimodiabo.alertdialogbox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtInput;
    Button btnAlertDg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtInput = findViewById(R.id.edt_input);
        btnAlertDg = findViewById(R.id.btn_alert_dg);

        btnAlertDg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = edtInput.getText().toString();
                if (text.isEmpty()) {
                alert("Please Insert Data !!!");
                }else {
                    alert(text);
                }
            }
        });

    }

    private void alert(String message) {
        AlertDialog alertdg = new AlertDialog.Builder(MainActivity.this)
                .setTitle("Title Message")
                .setMessage(message)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create();
        alertdg.show();
    }
}
