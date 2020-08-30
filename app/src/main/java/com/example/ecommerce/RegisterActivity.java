package com.example.ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterActivity extends AppCompatActivity {

    private Button CreateAccountButton;
    private EditText InputName, InputPhoneNumber, InputPassword;
    private ProgressDialog LoadingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        CreateAccountButton= (Button) findViewById(R.id.register_btn);
        InputName= (EditText) findViewById(R.id.register_username_input);
        InputPhoneNumber= (EditText) findViewById(R.id.register_phone_number_input);
        InputPassword= (EditText) findViewById(R.id.register_password_input);



        CreateAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                CreateAccoun();

            }
        });

    }


    public void CreateAccoun()
    {
        String name = InputName.getText().toString();
        String phone = InputPhoneNumber.getText().toString();
        String password = InputPassword.getText().toString();
        LoadingBar=new ProgressDialog(this);

        if (TextUtils.isEmpty(name))
        {
            Toast.makeText(this, "Please make your name",Toast.LENGTH_SHORT).show();
        }

        else if (TextUtils.isEmpty(phone))
        {
            Toast.makeText(this, "Please make your phone number",Toast.LENGTH_SHORT).show();
        }

        else if (TextUtils.isEmpty(password))
        {
            Toast.makeText(this, "Please make your password",Toast.LENGTH_SHORT).show();
        }
        else
        {
            LoadingBar.setTitle("Create Account");
            LoadingBar.setMessage("Please wait");
            LoadingBar.setCanceledOnTouchOutside(false);
            LoadingBar.show();



            ValidatephoneNumber(name,phone,password);


        }
    }

    private void ValidatephoneNumber(String name, String phone, String password)
    {
        final DatabaseReference RootRef;
//        RootRef= FirebaseDatabase


    }
}