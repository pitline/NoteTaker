package com.example.note.notetaker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListNoteActivity extends AppCompatActivity {

    private List<Note> notes = new ArrayList<Note>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_notes);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        notes.add(new Note("First note", "1111", new Date()));
        notes.add(new Note("Second note", "2222", new Date()));
        notes.add(new Note("Third note", "3333", new Date()));
        notes.add(new Note("4 note", "4444", new Date()));
        notes.add(new Note("5 note", "5555", new Date()));


        ListView notesListView = (ListView) findViewById(R.id.noteListView);

        List<String> values = new ArrayList<String>();

        for(Note note : notes){
            values.add(note.getTitle());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                values
        );

        notesListView.setAdapter(adapter);
    }

}
