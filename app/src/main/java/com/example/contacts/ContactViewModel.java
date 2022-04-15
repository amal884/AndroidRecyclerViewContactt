package com.example.contacts;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class ContactViewModel extends AndroidViewModel {

    private ContactRepository mRepository;

    private final LiveData<List<Contact>> mAllWords;

    public ContactViewModel (Application application) {
        super(application);
        mRepository = new ContactRepository(application);
        mAllWords = mRepository.getAllWords();
    }

    LiveData<List<Contact>> getAllWords() { return mAllWords; }

    public void insert(Contact contact) { mRepository.insert(contact); }
}
