package com.example.android.cairotourguide;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AttractionListAdapter extends RecyclerView.Adapter<AttractionListAdapter.AttractionViewHolder> {

    private final Attraction[] mAttractionList;

    public AttractionListAdapter(Attraction[] attractionList) {
        mAttractionList = attractionList;
    }

    @NonNull
    @Override
    public AttractionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AttractionViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.attraction_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AttractionViewHolder holder, int position) {
        Attraction attraction = mAttractionList[position];
        holder.attractionTitleView.setText(attraction.getTitle());
        if (attraction.getTelephone() == null)
            ((ViewGroup) holder.attractionTelephoneGroupView.getParent())
                    .removeView(holder.attractionTelephoneGroupView);
        else
            ((TextView) holder.attractionTelephoneGroupView.findViewById(R.id.telephone))
                    .setText(attraction.getTelephone());
        if (attraction.getAddress() == null)
            ((ViewGroup) holder.attractionAddressGroupView.getParent())
                    .removeView(holder.attractionAddressGroupView);
        else
            ((TextView) holder.attractionAddressGroupView.findViewById(R.id.address))
                    .setText(attraction.getAddress());
        if (attraction.getImageResourceId() == 0)
            ((ViewGroup) holder.attractionImageView.getParent())
                    .removeView(holder.attractionImageView);
        else
            ((ImageView) holder.attractionImageView.findViewById(R.id.image))
                    .setImageResource(attraction.getImageResourceId());
    }

    @Override
    public int getItemCount() {
        return mAttractionList.length;
    }

    static class AttractionViewHolder extends RecyclerView.ViewHolder {

        TextView attractionTitleView;
        LinearLayout attractionAddressGroupView;
        LinearLayout attractionTelephoneGroupView;
        ImageView attractionImageView;

        public AttractionViewHolder(@NonNull View itemView) {
            super(itemView);
            attractionTitleView = itemView.findViewById(R.id.title);
            attractionAddressGroupView = itemView.findViewById(R.id.address_group);
            attractionTelephoneGroupView = itemView.findViewById(R.id.telephone_group);
            attractionImageView = itemView.findViewById(R.id.image);
        }
    }
}
