package com.example.shopping_list.ui.shoppinglist;

public class Item {

    private String m_text;
    private boolean m_checked;

    public Item(String text) {
        new Item(text, false);
    }

    public Item(String text, boolean checked){
        this.m_text = text;
        this.m_checked = checked;
    }

    public String getText() {
        return m_text;
    }

    public void setText(String text) {
        this.m_text = text;
    }

    public boolean isChecked() {
        return m_checked;
    }

    public void setChecked(boolean checked) {
        this.m_checked = checked;
    }
}
