package com.example.studentcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btnThem;
    private Button btnSua;
    private Button btnXoa;
    private EditText etID;
    private EditText etName;
    private EditText etToan;
    private EditText etLy;
    private EditText etHoa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btnThem=(Button) findViewById(R.id.btn_them);
        btnSua=(Button) findViewById(R.id.btn_sua);
        btnXoa=(Button) findViewById(R.id.btn_xoa);
        etID=(EditText) findViewById(R.id.et_id);
        etName=(EditText) findViewById(R.id.et_name);
        etToan=(EditText) findViewById(R.id.et_toan);
        etLy=(EditText) findViewById(R.id.et_ly);
        etHoa=(EditText) findViewById(R.id.et_hoa);
    }

}