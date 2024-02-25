package com.example.transitplus.ui.tripplanner;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TripPlannerViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public TripPlannerViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is tripplanner fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}