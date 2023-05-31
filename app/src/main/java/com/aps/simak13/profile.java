package com.aps.simak13;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupWindow;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link profile#newInstance} factory method to
 * create an instance of this fragment.
 */
public class profile extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public profile() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment profile.
     */
    // TODO: Rename and change types and number of parameters
    public static profile newInstance(String param1, String param2) {
        profile fragment = new profile();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        ImageButton logoutBtn = view.findViewById(R.id.logoutBtn);
        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = getActivity().getSharedPreferences("MY_PREFS_NAME", Context.MODE_PRIVATE).edit();
                editor.putBoolean("is_logged_in", false);
                editor.apply();

                // Redirect to login activity
                Intent intent = new Intent(getActivity(), login.class);
                startActivity(intent);
                getActivity().finish();
            }
        });
        ImageButton feedbackMenu;
        feedbackMenu = view.findViewById(R.id.feedbackMenu);
        feedbackMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), feedback.class);
                startActivity(intent);
            }
        });


        ImageButton lihatKTMbtn = view.findViewById(R.id.lihatKTM);
        lihatKTMbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a PopupWindow instance
                PopupWindow popupWindow = new PopupWindow(requireContext());

                // Inflate the layout file
                View popupView = getLayoutInflater().inflate(R.layout.activity_lihatktm, null);

                // Set the content view of the PopupWindow
                popupWindow.setContentView(popupView);

                // Set the width and height of the PopupWindow
                popupWindow.setWidth(ViewGroup.LayoutParams.WRAP_CONTENT);
                popupWindow.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);

                // Set the background drawable of the PopupWindow
                popupWindow.setBackgroundDrawable(getResources().getDrawable(R.drawable.popup));

                // Set the focusable state of the PopupWindow
                popupWindow.setFocusable(true);

                // Get the ImageView from the pop-up layout
                ImageView ktmImageView = popupView.findViewById(R.id.showKTM);

                // Set the image for the ImageView
                ktmImageView.setImageResource(R.drawable.fotoktm);

                // Show the pop-up window at a specific position
                popupWindow.showAtLocation(v, Gravity.CENTER, 0, 0);
            }
        });

        ImageButton insta;
        insta = view.findViewById(R.id.instagramBtn);
        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), instagram.class);
                startActivity(intent);
            }
        });

        return view;
    }
}