package com.example.contacts;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ContactViewHolder extends RecyclerView.ViewHolder{


    TextView nameView, numberView, emailView, typeofContactView;
    ImageView mContactImageView;

    private ContactViewHolder(View itemView) {
        super(itemView);

        nameView = itemView.findViewById(R.id.textName);
        emailView = itemView.findViewById(R.id.textEmail);
        numberView = itemView.findViewById(R.id.textNumber);
        typeofContactView = itemView.findViewById(R.id.textTypeofContact);
        mContactImageView = itemView.findViewById(R.id.imageContact);


    }

    public void bind(String name , String email , String number , String type ,String picture) {
        nameView.setText(name);
        emailView.setText(email);
        numberView.setText(number);
        typeofContactView.setText(type);
        Uri imageUri = Uri.parse(picture);
        mContactImageView.setImageURI(imageUri);

    }

    static ContactViewHolder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listitem, parent, false);
        return new ContactViewHolder(view);
    }


}
