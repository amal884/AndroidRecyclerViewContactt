package com.example.contacts;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

public class ContactListAdapter extends ListAdapter<Contact, ContactViewHolder> {

    public ContactListAdapter(@NonNull DiffUtil.ItemCallback<Contact> diffCallback) {
        super(diffCallback);
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return ContactViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
        Contact current = getItem(position);
        holder.bind(current.getName(),current.getEmail(),current.getNumber(),current.getNumber(),current.getPicture());
    }

    static class ContactDiff extends DiffUtil.ItemCallback<Contact> {

        @Override
        public boolean areItemsTheSame(@NonNull Contact oldItem, @NonNull Contact newItem) {
            return oldItem == newItem;
        }

        @Override
        public boolean areContentsTheSame(@NonNull Contact oldItem, @NonNull Contact newItem) {
            return (oldItem.getName().equals(newItem.getName()) & oldItem.getEmail().equals(newItem.getEmail()) & oldItem.getNumber().equals(newItem.getNumber()) & oldItem.getPicture().equals(newItem.getPicture()));
        }
    }
}
