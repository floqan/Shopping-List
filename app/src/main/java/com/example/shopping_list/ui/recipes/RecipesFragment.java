package com.example.shopping_list.ui.recipes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.shopping_list.R;

import java.util.ArrayList;
import java.util.List;

public class RecipesFragment extends Fragment {

    public RecipesFragment() {
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        List<Recipe> recipes = new ArrayList<>();
        recipes.add(new Recipe().withTitle("Rezept 1").withLink("www.google.com").withIngredients("2 Zwiebeln \n 3 Karotten").withDescription("Alles mischen"));
        recipes.add(new Recipe().withTitle("Rezept 2").withLink("www.9gag.com").withIngredients("5 Memes \n 9 Gag").withDescription("Anschauen"));

        View contentView = inflater.inflate(R.layout.fragment_recipes, container, false);
        ExpandableListView listView = contentView.findViewById(R.id.recipeListView);
        listView.setAdapter(new RecipesListAdapter(getContext(), recipes));

        // binding = FragmentRecipesBinding.inflate(inflater, container, false);
        // View root = binding.getRoot();

        // final TextView textView = binding.textNotifications;
        // notificationsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return contentView;
    }
}