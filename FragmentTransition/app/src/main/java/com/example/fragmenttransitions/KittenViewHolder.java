package com.example.fragmenttransitions;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

/**
 * ViewHolder for kitten cells in our grid
 *
 * @author bherbst
 */
public class KittenViewHolder extends RecyclerView.ViewHolder {
    ImageView image;
CardView cv;
    public KittenViewHolder(View itemView) {
        super(itemView);
        //image = (ImageView) itemView.findViewById(R.id.image);

        image = (ImageView) itemView.findViewById(R.id.person_photo);
        cv = (CardView)itemView.findViewById(R.id.cv);

    }
}
