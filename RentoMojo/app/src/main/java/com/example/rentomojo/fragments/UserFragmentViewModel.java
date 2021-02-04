package com.example.rentomojo.fragments;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class UserFragmentViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public UserFragmentViewModel(){
        mText= new MutableLiveData<>();
        mText.setValue("this is UserData Fragment");

    }
    public LiveData<String > getText(){
        return mText;
    }


}
