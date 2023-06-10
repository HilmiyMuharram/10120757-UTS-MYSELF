package com.example.inipunyahilmiy.Fragment;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.inipunyahilmiy.Adapter.MusicAdapter;
import com.example.inipunyahilmiy.Model.MusicModel;
import com.example.inipunyahilmiy.R;


import java.util.ArrayList;


public class MusicVideoFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MusicVideoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MusicVideoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MusicVideoFragment newInstance(String param1, String param2) {
        MusicVideoFragment fragment = new MusicVideoFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    RecyclerView recyclerViewMusic;
    ArrayList<MusicModel> musicModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_music_video, container, false);

        recyclerViewMusic = root.findViewById(R.id.recview_music);
        recyclerViewMusic.setLayoutManager(new LinearLayoutManager(getContext()));

        musicModel = new ArrayList<>();

        MusicModel music1 = new MusicModel(R.drawable.musicplay, "Lantas", "Juicy Luicy");
        musicModel.add(music1);
        MusicModel music2 = new MusicModel(R.drawable.musicplay, "Suicidal Dream", "Silverchair");
        musicModel.add(music2);
        MusicModel music3 = new MusicModel(R.drawable.musicplay, "Nothing Else Matters", "Metallica");
        musicModel.add(music3);
        MusicModel music4 = new MusicModel(R.drawable.musicplay, "One Last Breath", "Creed");
        musicModel.add(music4);
        MusicModel music5 = new MusicModel(R.drawable.musicplay, "Sunflower", "Post Malone");
        musicModel.add(music5);
        MusicModel music6 = new MusicModel(R.drawable.musicplay, "505", "Artic Monkeys");
        musicModel.add(music6);
        MusicModel music7 = new MusicModel(R.drawable.musicplay, "Creep", "Radiohead");
        musicModel.add(music7);
        MusicModel music8 = new MusicModel(R.drawable.musicplay, "don't look back in anger", "Oasis");
        musicModel.add(music8);
        MusicModel music9 = new MusicModel(R.drawable.musicplay, "Reminder", "The Weeknd");
        musicModel.add(music9);
        MusicModel music10 = new MusicModel(R.drawable.musicplay, "Sial", "Mahalini");
        musicModel.add(music10);

        recyclerViewMusic.setAdapter(new MusicAdapter(musicModel));

        VideoView vvVideo = root.findViewById(R.id.vv_video);
        String videoPath = "android.resource://" + getContext().getPackageName() + "/" + R.raw.uhuy;
        Uri uri = Uri.parse(videoPath);
        vvVideo.setVideoURI(uri);

        MediaController mediaController = new MediaController(getContext());
        vvVideo.setMediaController(mediaController);
        mediaController.setAnchorView(vvVideo);

        return root;
    }
}