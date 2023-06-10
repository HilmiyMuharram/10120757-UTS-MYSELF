package com.example.inipunyahilmiy.Fragment;



import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.inipunyahilmiy.R;



/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfileFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfileFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ProfileFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProfileFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ProfileFragment newInstance(String param1, String param2) {
        ProfileFragment fragment = new ProfileFragment();
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

    ImageView  ivInstagram, ivTwitter, ivGmail, ivMap;
    TextView tvPhone, tvAbout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_profile, container, false);

        ivInstagram = root.findViewById(R.id.iv_instagram);
        ivTwitter = root.findViewById(R.id.iv_twitter);
        ivGmail = root.findViewById(R.id.iv_gmail);
        ivMap = root.findViewById(R.id.iv_map);



        ivInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ig = new Intent();
                ig.setAction(Intent.ACTION_VIEW);
                ig.addCategory(Intent.CATEGORY_BROWSABLE);
                ig.setData(Uri.parse("https://www.instagram.com/hilmiy_10/"));
                startActivity(ig);
            }
        });

        ivTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tw = new Intent();
                tw.setAction(Intent.ACTION_VIEW);
                tw.addCategory(Intent.CATEGORY_BROWSABLE);
                tw.setData(Uri.parse("https://twitter.com/"));
                startActivity(tw);
            }
        });

        ivGmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gm = new Intent();
                gm.setAction(Intent.ACTION_VIEW);
                gm.addCategory(Intent.CATEGORY_BROWSABLE);
                gm.setData(Uri.parse("mailto:mhilmiy02@gmail.com"));
                startActivity(gm);
            }
        });

        ivMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent map = new Intent();
                map.setAction(Intent.ACTION_VIEW);
                map.addCategory(Intent.CATEGORY_BROWSABLE);
                map.setData(Uri.parse("https://www.google.com/maps/place/6%C2%B057'04.1%22S+107%C2%B036'17.5%22E/@-6.9511984,107.6047627,20z/data=!4m4!3m3!8m2!3d-6.951139!4d107.604855"));
                startActivity(map);
            }
        });




        return root;
    }
}