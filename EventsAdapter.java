package com.example.monikagarg.okay;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by monikagarg on 6/26/2016.
 */
public class EventsAdapter extends RecyclerView.Adapter<EventsAdapter.MyViewHolder> {

    private List<Event> eventsList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView day,venue, description, attendees;

        public MyViewHolder(View view) {
            super(view);
            day = (TextView) view.findViewById(R.id.day);
            venue = (TextView) view.findViewById(R.id.venue);
            description = (TextView) view.findViewById(R.id.description);
            attendees = (TextView) view.findViewById(R.id.attendees);
        }
    }

    public EventsAdapter(List<Event> eventsList) {
        this.eventsList = eventsList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.event_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Event event = eventsList.get(position);
        holder.day.setText(event.getDay());
        holder.venue.setText(event.getVenue());
        holder.description.setText(event.getDescription());
        holder.attendees.setText(event.getAttendees());}

    @Override
    public int getItemCount() {
        return eventsList.size();
    }}


