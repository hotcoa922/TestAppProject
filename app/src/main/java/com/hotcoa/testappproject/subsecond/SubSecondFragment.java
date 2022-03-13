package com.hotcoa.testappproject.subsecond;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hotcoa.testappproject.R;

public class SubSecondFragment extends Fragment {

    private SubSecondFragmentViewModel mViewModel;

    public static SubSecondFragment newInstance() {
        return new SubSecondFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.sub_second_fragmentttttttt_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(SubSecondFragmentViewModel.class);
        // TODO: Use the ViewModel
    }

}