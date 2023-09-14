package com.example.hacktestappone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.firebase.auth.FirebaseAuth


class Handler : AppCompatActivity() {
    private  val Home=Home()
    private  val feedFragment=Feed();
    private  val locFragment=Location()

    lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
replaceFrament(Home)
    }

    private fun replaceFrament(fragment: Fragment){
        if(fragment!=null){
            val trasaction = supportFragmentManager.beginTransaction()
            trasaction.replace(R.id.frame_layout,fragment);
            trasaction.commit();
        }
    }
}

//   auth=FirebaseAuth.getInstance()
//        val setText = findViewById<TextView>(R.id.userDetails);
//        val logout = findViewById<Button>(R.id.logout);
//        val user = auth.currentUser
//        if (user != null) {
//            setText.setText(user?.email)
//        };
//        logout.setOnClickListener {
//            FirebaseAuth.getInstance().signOut();
//            val intent = Intent(this,SignIn::class.java);
//            startActivity(intent);
//        }