package com.example.panzq.simpleandroid_15_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText et_valueA, et_valueB, et_option;
    private Button btn_calculate;
    private TextView result;
    private CalculateUtil mCalculateUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCalculateUtil = new CalculateUtil();
        findViews();
        initListener();
    }

    private void findViews() {
        et_option = findViewById(R.id.et_opt);
        et_valueA = findViewById(R.id.et_value_a);
        et_valueB = findViewById(R.id.et_value_b);
        btn_calculate = findViewById(R.id.btn_calculate);
        result = findViewById(R.id.tv_result);
    }
    private void initListener()
    {
        btn_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueA = et_valueA.getText().toString();
                String valueB = et_valueB.getText().toString();
                String option = et_option.getText().toString();
                double a,b;
                if (TextUtils.isEmpty(valueA))
                {
                    Toast.makeText(MainActivity.this,"valueA不能为空！",Toast.LENGTH_SHORT).show();
                    return;
                }else{
                    a = Double.valueOf(valueA);
                }
                if (TextUtils.isEmpty(option))
                {
                    Toast.makeText(MainActivity.this,"运算符不能为空！",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(valueB))
                {
                    Toast.makeText(MainActivity.this,"valueB不能为空！",Toast.LENGTH_SHORT).show();
                    return;
                }else{
                    b = Double.valueOf(valueB);
                }
                if (option.equals("+"))
                {
                    result.setText(a+" "+option+" "+b+" = "+mCalculateUtil.add(a,b));
                }else if (option.equals("-"))
                {
                    result.setText(a+" "+option+" "+b+" = "+mCalculateUtil.sub(a,b));
                }else if (option.equals("*"))
                {
                    result.setText(a+" "+option+" "+b+" = "+mCalculateUtil.mul(a,b));
                }else if (option.equals("/"))
                {
                    result.setText(a+" "+option+" "+b+" = "+mCalculateUtil.div(a,b));
                }else{
                    Toast.makeText(MainActivity.this,"运算符无效！",Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        });
    }
}
