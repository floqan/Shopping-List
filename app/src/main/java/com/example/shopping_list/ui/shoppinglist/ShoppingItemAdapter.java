package com.example.shopping_list.ui.shoppinglist;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ShoppingItemAdapter extends BaseAdapter {

    private final List<Item> m_items;

    public ShoppingItemAdapter(List<Item> items){
        this.m_items = items;
    }

    @Override
    public int getCount() {
        return m_items.size();
    }

    @Override
    public Object getItem(int i) {
        return m_items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return m_items.get(i).hashCode();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = new TextView(view.getContext());
        textView.setText(m_items.get(i).getText());
        return textView;
    }
}
