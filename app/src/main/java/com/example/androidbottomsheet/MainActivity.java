package com.example.androidbottomsheet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_bottom_sheet_dialog)
    public void showBottomSheetDialog() {
        View view = getLayoutInflater().inflate(R.layout.fragment_bottom_sheet_dialog, null);

        BottomSheetDialog dialog = new BottomSheetDialog(this);
        dialog.setContentView(view);


        // This for transparent bottom sheet background
        /*
        ((View) view.getParent()).setBackgroundColor(MainActivity.this.getResources().getColor(android.R.color.transparent));
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) ((View) view.getParent())
                .getLayoutParams();
        ((View) view.getParent()).setLayoutParams(layoutParams); */
        dialog.show();
    }
}
