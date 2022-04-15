package com.example.contacts;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface contactDAO {
    // allowing the insert of the same word multiple times by passing a
    // conflict resolution strategy
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Contact contact);

    @Query("DELETE FROM Contact")
    void deleteAll();

    @Query("SELECT * FROM Contact ORDER BY name ASC")
    LiveData<List<Contact>> getAlphabetizedWords();
}
