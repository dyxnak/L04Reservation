package sg.edu.rp.c346.id21035817.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnConfirm;
    EditText etName;
    EditText etPhone;
    CheckBox smoking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnConfirm = findViewById(R.id.btnConfirm);
        etName = findViewById(R.id.etName);
        etPhone = findViewById(R.id.etPhone);
        smoking = findViewById(R.id.cbSmoking);

    }
}