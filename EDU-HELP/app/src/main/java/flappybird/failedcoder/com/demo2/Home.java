package flappybird.failedcoder.com.demo2;

import android.content.Intent;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Home extends AppCompatActivity {
    private FirebaseAuth mAuth;
    public String username;
//    private FirebaseAuth.AuthStateListener mAuthListeneer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
//        mAuth = FirebaseAuth.getInstance();
//        username = "";
//        mAuthListeneer = new FirebaseAuth.AuthStateListener() {
//            @Override
//            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
//                if(firebaseAuth.getCurrentUser() == null){
//                    startActivity(new Intent(Home.this,LoginActivity.class));
//                }else {
//                    username = firebaseAuth.getCurrentUser().getDisplayName();
//                }
//            }
//        };

    }
    @Override
    public void onBackPressed(){
        Intent a = new Intent(Intent.ACTION_MAIN);
        a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);
    }
    public void onButtonClick(View v) {
        if (v.getId() == R.id.webs) {
            Intent i = new Intent(Home.this, ListVie.class);
            startActivity(i);
        }
//        if(v.getId() == R.id.ffoorruumm){
//            Intent i = new Intent(Home.this, forum.class);
//            i.putExtra("NAME",username);
//            startActivity(i);
//        }
        if(v.getId() == R.id.nnootteess){
            Intent i = new Intent(Home.this, Simple_Notes.class);
            startActivity(i);
        }
        if(v.getId() == R.id.gguuuuoo){
            Intent i = new Intent(Home.this,Camera.class);
            startActivity(i);
        }
        if(v.getId() == R.id.aabboouutt){
            Intent i = new Intent(Home.this,About.class);
            startActivity(i);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

//        switch (id){
//            case R.id.logout:
//                mAuth.signOut();
//                break;
//            case R.id.about:
//                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
//                if (user != null) {
//                    user.delete()
//                            .addOnCompleteListener(new OnCompleteListener<Void>() {
//                                @Override
//                                public void onComplete(@NonNull Task<Void> task) {
//                                    if (task.isSuccessful()) {
//                                        Toast.makeText(Home.this, "Your profile is deleted:( Create a account now!", Toast.LENGTH_SHORT).show();
//                                    } else {
//                                        Toast.makeText(Home.this, "Failed to delete your account!", Toast.LENGTH_SHORT).show();
//                                    }
//                                }
//                            });
//                    break;
//                }
//        }

        return true;
    }
//    @Override
//    protected void onStart() {
//        super.onStart();
//        mAuth.addAuthStateListener(mAuthListeneer);
//    }
}
