package id.ilhamsuaib.recyclerview.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import id.ilhamsuaib.recyclerview.R;
import id.ilhamsuaib.recyclerview.interfaces.ItemClickListener;
import id.ilhamsuaib.recyclerview.pojo.Contact;

/**
 * Created by ilham on 3/27/18.
 */

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {

    private List<Contact> contactList;
    private ItemClickListener itemClickListener;

    public ContactAdapter(List<Contact> contactList, ItemClickListener itemClickListener) {
        this.contactList = contactList;
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_contact, parent, false);
        return new ViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        final Contact dataContact = contactList.get(position);

        holder.tvName.setText(dataContact.getName());
        holder.tvPhone.setText(dataContact.getPhone());
        holder.imgProfile.setImageResource(dataContact.getPhotoProfile());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClick(dataContact, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvName, tvPhone;
        CircleImageView imgProfile;

        public ViewHolder(View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_name);
            tvPhone = itemView.findViewById(R.id.tv_phone);
            imgProfile = itemView.findViewById(R.id.img_profile);
        }
    }
}
