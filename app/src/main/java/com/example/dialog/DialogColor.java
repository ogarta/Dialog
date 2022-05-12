package com.example.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.graphics.Color;

public class DialogColor {

    static int mA=0, mR=0, mG=0, mB=0;
    public static void createColorPicker(Context context){
        Dialog dialog = new Dialog(context);

        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_color);
        dialog.setCancelable(false);

        SeekBar mSeekBarA = dialog.findViewById(R.id.seekBarA);
        SeekBar mSeekBarR = dialog.findViewById(R.id.seek_bar_r);
        SeekBar mSeekBarG = dialog.findViewById(R.id.seekBarG);
        SeekBar mSeekBarB = dialog.findViewById(R.id.seekBarB);
        ImageView imageView = dialog.findViewById(R.id.imageView);
        TextView txRGB = dialog.findViewById(R.id.textViewRGB);
        TextView txHex = dialog.findViewById(R.id.textViewHex);

        mSeekBarA.setMax(255);
        mSeekBarR.setMax(255);
        mSeekBarG.setMax(255);
        mSeekBarB.setMax(255);

        mSeekBarA.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                mA = i;
                txHex.setText("HEX "+ Integer.toHexString(mA) +" +" + Integer.toHexString(mR)+" +" + Integer.toHexString(mG)+" +" + Integer.toHexString(mB));
                txRGB.setText(String.format("RGB %d %d %d %d",mA ,mR ,mG ,mB ));
                imageView.setBackgroundColor(Color.argb(mA,mR,mG,mB));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        mSeekBarR.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                mR = i;
                txHex.setText("HEX "+ Integer.toHexString(mA) +" +" + Integer.toHexString(mR)+" +" + Integer.toHexString(mG)+" +" + Integer.toHexString(mB));
                txRGB.setText(String.format("RGB %d %d %d %d",mA ,mR ,mG ,mB ));
                imageView.setBackgroundColor(Color.argb(mA,mR,mG,mB));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        mSeekBarG.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                mG = i;
                txHex.setText("HEX "+ Integer.toHexString(mA) +" +" + Integer.toHexString(mR)+" +" + Integer.toHexString(mG)+" +" + Integer.toHexString(mB));
                txRGB.setText(String.format("RGB %d %d %d %d",mA ,mR ,mG ,mB ));
                imageView.setBackgroundColor(Color.argb(mA,mR,mG,mB));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        mSeekBarB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                mB = i;
                txHex.setText("HEX "+ Integer.toHexString(mA) +" +" + Integer.toHexString(mR)+" +" + Integer.toHexString(mG)+" +" + Integer.toHexString(mB));
                txRGB.setText(String.format("RGB %d %d %d %d",mA ,mR ,mG ,mB ));
                imageView.setBackgroundColor(Color.argb(mA,mR,mG,mB));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        Window window = dialog.getWindow();
        if(window == null){
            return;
        }

        WindowManager.LayoutParams layoutParams = window.getAttributes();
        layoutParams.gravity = Gravity.CENTER;

        window.setLayout(WindowManager.LayoutParams.MATCH_PARENT,WindowManager.LayoutParams.WRAP_CONTENT);

        dialog.show();
    }

}
