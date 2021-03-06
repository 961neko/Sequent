package com.fujiyuu75.sequent.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.fujiyuu75.sequent.Animation;
import com.fujiyuu75.sequent.Sequent;

public class SampleFragment2 extends Fragment {

    private LinearLayout layout;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_sample_2, null);
    }

    @Override
    public void onViewCreated(View v, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(v, savedInstanceState);

        layout = (LinearLayout) v.findViewById(R.id.image_layout);
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        if (isVisibleToUser && layout != null) {
            Sequent.origin(layout).anim(getActivity(), Animation.FADE_IN_UP).start();
        }
    }
}
