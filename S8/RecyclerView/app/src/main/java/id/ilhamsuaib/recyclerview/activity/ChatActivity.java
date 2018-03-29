package id.ilhamsuaib.recyclerview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import id.ilhamsuaib.recyclerview.R;
import id.ilhamsuaib.recyclerview.pojo.Contact;

public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        Contact contact = getIntent().getParcelableExtra("contact");
        setTitle(contact.getName().toUpperCase());
    }
}
