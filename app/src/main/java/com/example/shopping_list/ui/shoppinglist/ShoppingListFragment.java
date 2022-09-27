package com.example.shopping_list.ui.shoppinglist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.shopping_list.R;

import java.util.ArrayList;
import java.util.List;

public class ShoppingListFragment extends Fragment {

    // private FragmentShoppingListBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ShoppingListViewModel dashboardViewModel =
                new ViewModelProvider(this).get(ShoppingListViewModel.class);

        List<Item> items = new ArrayList<>(){};
        items.add(new Item("One"));
        items.add(new Item("Two"));
        items.add(new Item("Three"));

        View contentView = inflater.inflate(R.layout.fragment_shoppinglist, container, false);
        // ListView itemListView = getView().findViewById(R.id.itemsList);
        // itemListView.setAdapter(new ShoppingItemAdapter(items));
        return contentView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        // binding = null;
    }
}