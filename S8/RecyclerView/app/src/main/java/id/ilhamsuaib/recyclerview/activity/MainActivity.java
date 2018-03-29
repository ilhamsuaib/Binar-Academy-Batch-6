package id.ilhamsuaib.recyclerview.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import id.ilhamsuaib.recyclerview.R;
import id.ilhamsuaib.recyclerview.adapter.ContactAdapter;
import id.ilhamsuaib.recyclerview.interfaces.ItemClickListener;
import id.ilhamsuaib.recyclerview.pojo.Contact;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recContact;
    private List<Contact> contactList = new ArrayList<>();
    private ContactAdapter contactAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        recContact = findViewById(R.id.rec_contact);

        contactAdapter = new ContactAdapter(contactList, new ItemClickListener() {
            @Override
            public void onItemClick(Contact contact, int position) {
                Intent intent = new Intent(MainActivity.this, ChatActivity.class);
                intent.putExtra("contact", contact);
                startActivity(intent);
            }
        });

        recContact.setLayoutManager(new LinearLayoutManager(this));
        recContact.setAdapter(contactAdapter);

        getContacts();
    }

    private void getContacts() {
        contactList.add(new Contact("ilham", "082256647779", R.mipmap.ic_launcher));
        contactList.add(new Contact("dadang", "082256647778", R.mipmap.ic_launcher));
        contactList.add(new Contact("siti", "082256647710", R.mipmap.ic_launcher));
        contactList.add(new Contact("faisal", "082256647710", R.mipmap.ic_launcher));
        contactList.add(new Contact("ahmad", "082256647710", R.mipmap.ic_launcher));
        contactList.add(new Contact("ahmad", "082256647710", R.mipmap.ic_launcher));
        contactList.add(new Contact("ahmad", "082256647710", R.mipmap.ic_launcher));
        contactList.add(new Contact("ahmad", "082256647710", R.mipmap.ic_launcher));
        contactList.add(new Contact("ahmad", "082256647710", R.mipmap.ic_launcher));
        contactList.add(new Contact("ahmad", "082256647710", R.mipmap.ic_launcher));
        contactList.add(new Contact("ahmad", "082256647710", R.mipmap.ic_launcher));
        contactList.add(new Contact("ahmad", "082256647710", R.mipmap.ic_launcher));

        contactAdapter.notifyDataSetChanged();
    }
}
