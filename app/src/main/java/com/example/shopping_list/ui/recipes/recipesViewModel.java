package com.example.shopping_list.ui.recipes;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class recipesViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public recipesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is recipes fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}