package com.hotcoa.testappproject.subthird;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hotcoa.testappproject.MainActivity;
import com.hotcoa.testappproject.R;

public class SubThirdFragment extends Fragment {


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        ((MainActivity)requireActivity()).toolbar.setVisibility(View.GONE); //툴바를 보이지 않게 해주는 코드

        return inflater.inflate(R.layout.sub_third_fragment, container, false);
    }

    @Override
    public void onDestroyView() {
        //dfasdf
        super.onDestroyView();
        ((MainActivity)requireActivity()).toolbar.setVisibility(View.VISIBLE);
    }

}

