package com.example.shopping_list.ui.recipes;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseExpandableListAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.shopping_list.R;

import java.util.List;

public class RecipesListAdapter extends BaseExpandableListAdapter implements AdapterView.OnItemLongClickListener {

    private Context context;
    private List<Recipe> listItems;

    public RecipesListAdapter(Context context, List<Recipe> listItems) {
        this.context = context;
        this.listItems = listItems;
    }

    @Override
    public int getGroupCount() {
        return listItems.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return 1;
    }

    @Override
    public Recipe getGroup(int i) {
        return listItems.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {
        return getGroup(i);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int listPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        Recipe recipe = getGroup(listPosition);
        if (convertView == null) {
            convertView = LayoutInflater.from(this.context).inflate(R.layout.recipe_list_group, null);
        }
        TextView listTitle = convertView.findViewById(R.id.recipeListGroupTitle);
        listTitle.setText(recipe.getTitle());
        return convertView;
    }

    @Override
    public View getChildView(int listPosition, int i1, boolean isExpanded, View convertView, ViewGroup parent) {
        Recipe recipe = getGroup(listPosition);
        if (convertView == null) {
            convertView = LayoutInflater.from(this.context).inflate(R.layout.recipe_list_item, null);
        }
        TextView linkText = convertView.findViewById(R.id.linkTextView);
        linkText.setText(recipe.getLink());
        linkText.setOnClickListener(view -> {
            String url = recipe.getLink();
            Uri uri = Uri.parse(url);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            try {
                context.startActivity(intent);
            } catch (ActivityNotFoundException e) {
                Toast.makeText(this.context, R.string.app_not_found, Toast.LENGTH_SHORT).show();
            }
        });
        Button addButton = convertView.findViewById(R.id.addToShoppingListButton);
        addButton.setOnClickListener(view ->
                Toast.makeText(parent.getContext(), "Add to cart", Toast.LENGTH_SHORT).show()
        );

        TextView ingredientText = convertView.findViewById(R.id.ingredientTextView);
        ingredientText.setText(recipe.getIngredients());
        ingredientText.setEnabled(false);

        TextView descriptionText = convertView.findViewById(R.id.descriptionTextView);
        descriptionText.setText(recipe.getDescription());
        descriptionText.setEnabled(false);

        ImageView image = convertView.findViewById(R.id.imageView);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return false;
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(adapterView.getContext(), "Long Click", Toast.LENGTH_SHORT).show();
        return false;
    }
}
