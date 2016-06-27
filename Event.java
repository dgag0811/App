package com.example.monikagarg.okay;

/**
 * Created by monikagarg on 6/26/2016.
 */

public class Event {
    private String day,venue,description,attendees;

    public Event() {
    }

    public Event(String day, String venue, String description, String attendees) {
        this.day = day;
        this.venue = venue;
        this.description = description;
        this.attendees = attendees;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAttendees() {
        return attendees;
    }

    public void setAttendees(String attendees) {
        this.attendees = attendees;
    }
}
