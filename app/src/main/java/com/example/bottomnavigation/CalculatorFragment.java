package com.example.bottomnavigation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class CalculatorFragment extends Fragment {

    TextView result;
    EditText Num1,Num2;
    Button mul,div,add,c,sub;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_calculator, container, false);

        result=view.findViewById(R.id.tv_output);
        Num1=view.findViewById(R.id.et_num1);
        Num2=view.findViewById(R.id.et_num2);
        mul=view.findViewById(R.id.bt_mul);
        div=view.findViewById(R.id.bt_div);
        add=view.findViewById(R.id.bt_add);
        sub=view.findViewById(R.id.bt_sub);
        c=view.findViewById(R.id.bt_clear);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float addd;
                float a1=0, b1=0,z=0;
                try {
                    a1 = Float.parseFloat(Num1.getText().toString());
                    b1 = Float.parseFloat(Num2.getText().toString());
                }
                catch (NumberFormatException e)
                {
                    z=1;
                }
                if(z==0)
                {
                    addd = a1 + b1;
                    result.setText(Float.toString(addd));}
                else {
                    result.setText("Invalid");
                }


            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float addd;
                float a1=0, b1=0,z=0;
                try {
                    a1 = Float.parseFloat(Num1.getText().toString());
                    b1 = Float.parseFloat(Num2.getText().toString());
                }
                catch (NumberFormatException e)
                {
                    z=1;
                }
                if(z==0)
                {
                    addd = a1 - b1;
                    result.setText(Float.toString(addd));}
                else {
                    result.setText("Invalid");
                }



            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float addd;
                float a1=0, b1=0,z=0;
                try {
                    a1 = Float.parseFloat(Num1.getText().toString());
                    b1 = Float.parseFloat(Num2.getText().toString());
                }
                catch (NumberFormatException e)
                {
                    z=1;
                }
                if(z==0)
                {
                    addd = a1 * b1;
                    result.setText(Float.toString(addd));}
                else {
                    result.setText("Invalid Input");
                }


            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float addd=0;
                float a1=0, b1=0,z=0;
                try {
                    a1 = Float.parseFloat(Num1.getText().toString());
                    b1 = Float.parseFloat(Num2.getText().toString());
                }
                catch (NumberFormatException e)
                {
                    z=1;
                }

                if(z==0)
                {
                    try {
                        addd = a1 / b1;
                    }
                    catch (ArithmeticException e)
                    {
                        z=1;
                    }
                    if(z==0){
                        result.setText(Float.toString(addd));
                    }
                    else {
                        result.setText("Number divided by 0, Re-enter number");
                    }

                }
                else {
                    result.setText("Invalid");
                }


            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Num1.setText(" ");
                Num2.setText(" ");
                result.setText(" ");
            }
        });

        return view;


    }
}