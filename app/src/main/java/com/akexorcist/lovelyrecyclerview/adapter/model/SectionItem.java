package com.akexorcist.lovelyrecyclerview.adapter.model;

import com.akexorcist.lovelyrecyclerview.adapter.OrderDetailType;

/**
 * Created by Akexorcist on 10/28/2016 AD.
 */

public class SectionItem extends BaseOrderDetailItem {
    private String section;
    private int backgroundColor;

    public SectionItem() {
        super(OrderDetailType.TYPE_SECTION);
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(int backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
}
