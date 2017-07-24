package com.zhen.www.bean;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "travel_notes", schema = "travel")
public class TravelNotes {
    private int notesId;
    private String notesSummary;
    private String notesPicpath;
    private Date notesPubtime;

    @Id
    @Column(name = "notes_id")
    public int getNotesId() {
        return notesId;
    }

    public void setNotesId(int notesId) {
        this.notesId = notesId;
    }

    @Basic
    @Column(name = "notes_summary")
    public String getNotesSummary() {
        return notesSummary;
    }

    public void setNotesSummary(String notesSummary) {
        this.notesSummary = notesSummary;
    }

    @Basic
    @Column(name = "notes_picpath")
    public String getNotesPicpath() {
        return notesPicpath;
    }

    public void setNotesPicpath(String notesPicpath) {
        this.notesPicpath = notesPicpath;
    }

    @Basic
    @Column(name = "notes_pubtime")
    public Date getNotesPubtime() {
        return notesPubtime;
    }

    public void setNotesPubtime(Date notesPubtime) {
        this.notesPubtime = notesPubtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TravelNotes that = (TravelNotes) o;

        if (notesId != that.notesId) return false;
        if (notesSummary != null ? !notesSummary.equals(that.notesSummary) : that.notesSummary != null) return false;
        if (notesPicpath != null ? !notesPicpath.equals(that.notesPicpath) : that.notesPicpath != null) return false;
        if (notesPubtime != null ? !notesPubtime.equals(that.notesPubtime) : that.notesPubtime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = notesId;
        result = 31 * result + (notesSummary != null ? notesSummary.hashCode() : 0);
        result = 31 * result + (notesPicpath != null ? notesPicpath.hashCode() : 0);
        result = 31 * result + (notesPubtime != null ? notesPubtime.hashCode() : 0);
        return result;
    }
}
