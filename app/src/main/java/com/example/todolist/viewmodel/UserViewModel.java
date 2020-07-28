package com.example.todolist.viewmodel;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.todolist.TodoActivity;
import com.example.todolist.model.User;
import com.google.firebase.auth.FirebaseAuth;

public class UserViewModel extends ViewModel {
    public MutableLiveData<String> email=new MutableLiveData<>();
    public MutableLiveData<String> password=new MutableLiveData<>();

    private FirebaseAuth mAuth;


    public User user;
    private Context context;


    public UserViewModel(User user, Context context) {
        this.user = user;
        this.context = context;
    }

    public void onSubmitClick(){
        user.setEmail(email.getValue());
        user.setPassword(password.getValue());

        if(user.isValid()) {
            Toast.makeText(context, user.getEmail()+": Email format is not correct", Toast.LENGTH_SHORT).show();

            Intent i = new Intent(context, TodoActivity.class);
            context.startActivity(i);
           /* mAuth = FirebaseAuth.getInstance();

            mAuth.createUserWithEmailAndPassword(user.getEmail(), user.getPassword())
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                // Sign in success, update UI with the signed-in user's information
                                Log.d(TAG, "createUserWithEmail:success");
                                FirebaseUser user = mAuth.getCurrentUser();
                                updateUI(user);
                            } else {
                                // If sign in fails, display a message to the user.
                                Log.w(TAG, "createUserWithEmail:failure", task.getException());
                                Toast.makeText(EmailPasswordActivity.this, "Authentication failed.",
                                        Toast.LENGTH_SHORT).show();
                                updateUI(null);
                            }

                            // ...
                        }
                    });*/
        }
        else{
            Toast.makeText(context,"Plese enter valid Email", Toast.LENGTH_SHORT).show();
        }
    }
}
