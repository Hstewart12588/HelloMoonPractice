package project.hmsoly.hellomoon;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import project.hmsoly.hellomoon.R;

/**
 * Created by HarMachine on 6/16/2015.
 */
public class HelloMoonFragment extends android.support.v4.app.Fragment {
    private AudioPlayer mPlayer = new AudioPlayer();
    private Button mPlayButton;
    private Button mStopButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent,
                             Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_hello_moon, parent, false);
        mPlayButton = (Button)v.findViewById(R.id.hellomoon_playButton);
        mPlayButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mPlayer.play(getActivity());
            }
        });
        mStopButton = (Button)v.findViewById(R.id.hellomoon_stopButton);
        mStopButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mPlayer.stop();
            }
        });
        return v;
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        mPlayer.stop();
    }
}
