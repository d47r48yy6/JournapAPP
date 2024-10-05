package com.strap.journalApp.controller;

import com.strap.journalApp.controller.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController
{
    private Map<Long , JournalEntry> journalEntries = new HashMap<>();

    @GetMapping
    public List<JournalEntry> getAldeed()
    {
        return  new ArrayList<>(journalEntries.values());
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry ){
        journalEntries.put(myEntry.getId() ,myEntry);
        return true ;
    }

    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable Long myId){
        return journalEntries.get(myId);
    }
    @DeleteMapping("id/{myId}")
    public JournalEntry deleteJournalEntryById(@PathVariable Long myId)
    {
     return journalEntries.remove(myId);
    }

    @PutMapping("/id{id}")
    public JournalEntry updateJournalById(@PathVariable Long id , @RequestBody JournalEntry myEntry)
    {
        return journalEntries.put(id , myEntry);
    }




}
