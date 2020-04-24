package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Custom onClickListener used to avoid having to repeat code in MainActivity for the category
 * TextViews.
 *
 */
public class CategoryClickListener implements View.OnClickListener {
    private AppCompatActivity activity;
    private Class<?> cls;

    /**
     *
     * @param activity  Activity for retrieving context from
     * @param cls   .class of the activity to open in onClick
     *
     */
    public CategoryClickListener(AppCompatActivity activity, Class<?> cls) {
        this.activity = activity;
        this.cls = cls;
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this.activity.getApplicationContext(), cls);
        activity.startActivity(intent);
    }
}
