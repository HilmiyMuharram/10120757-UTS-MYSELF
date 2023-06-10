package com.example.inipunyahilmiy.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.inipunyahilmiy.Adapter.DailyAdapter;
import com.example.inipunyahilmiy.Model.DailyModel;

import com.example.inipunyahilmiy.R;

import java.util.ArrayList;



/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DailyFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DailyFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DailyFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DailyFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DailyFragment newInstance(String param1, String param2) {
        DailyFragment fragment = new DailyFragment();
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

    // views dailyact
    RecyclerView recyclerViewDaily;
    ArrayList<DailyModel> dailyModel;
    // views friendlist
    RecyclerView recyclerViewFriendlist;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_daily, container, false);

        // daliyact
        recyclerViewDaily = root.findViewById(R.id.recview_daily);
        recyclerViewDaily.setLayoutManager(new LinearLayoutManager(getContext()));

        dailyModel = new ArrayList<>();

        DailyModel daily1 = new DailyModel(R.drawable.bangun, "Bangun Pagi", "bangun tidur maksimal jam 07.00");
        dailyModel.add(daily1);
        DailyModel daily2 = new DailyModel(R.drawable.makan, "Sarapan", "makan makanan sehat & bergizi");
        dailyModel.add(daily2);
        DailyModel daily3 = new DailyModel(R.drawable.olahraga, "Olahraga", "olahraga pagi biar sehat");
        dailyModel.add(daily3);
        DailyModel daily4 = new DailyModel(R.drawable.kuliah, "Kuliah ", "megikuti pembelajaran perkuliahan");
        dailyModel.add(daily4);
        DailyModel daily5 = new DailyModel(R.drawable.nongkrong, "Nongkrong", "kumpul bersama teman teman");
        dailyModel.add(daily5);
        DailyModel daily6 = new DailyModel(R.drawable.istirahat, "Istirahat", "dengar lagu atau nonton santai");
        dailyModel.add(daily6);
        DailyModel daily7 = new DailyModel(R.drawable.bangun, "Bangun Pagi", "bangun tidur maks jam 06.00");
        dailyModel.add(daily7);
        DailyModel daily8 = new DailyModel(R.drawable.makan, "Sarapan", "makan makanan sehat & bergizi");
        dailyModel.add(daily8);
        DailyModel daily9 = new DailyModel(R.drawable.olahraga, "Olahraga", "olahraga pagi biar sehat");
        dailyModel.add(daily9);
        DailyModel daily10 = new DailyModel(R.drawable.kuliah, "Kuliah ", "megikuti pembelajaran perkuliahan");
        dailyModel.add(daily10);
        DailyModel daily11 = new DailyModel(R.drawable.nongkrong, "Nongkrong", "berkumpul bersama teman teman");
        dailyModel.add(daily11);
        DailyModel daily12 = new DailyModel(R.drawable.istirahat, "Istirahat", "Tidur atau istirahat");
        dailyModel.add(daily12);

        recyclerViewDaily.setAdapter(new DailyAdapter(dailyModel));
    return root;
    }
}