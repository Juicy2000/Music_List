package com.swufe.music_list;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

public class frag2 extends Fragment{
    private View zxx;

    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        zxx = inflater.inflate(R.layout.frag2_layout, null);
        ImageView listView = zxx.findViewById(R.id.lv);
        return zxx;

    }
}
