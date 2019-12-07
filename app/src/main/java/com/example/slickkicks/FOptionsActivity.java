package com.example.slickkicks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class FOptionsActivity extends AppCompatActivity {
    private CheckBox nike, adidas, ua;
    private Button select;
    SeekBar seekBar1;
    SeekBar seekBar2;
    private TextView sbarprogress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foptions);

        seekBar1=(SeekBar)findViewById(R.id.size);
        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                Toast.makeText(getApplicationContext(),"Shoe Size: "+progress, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"", Toast.LENGTH_SHORT).show();
            }
        });
        seekBar2=(SeekBar)findViewById(R.id.price);
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                Toast.makeText(getApplicationContext(),"price: "+progress, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"", Toast.LENGTH_SHORT).show();
            }
        });
    }
//    public void seeBar( ) {
//        seekBar1 = (SeekBar)findViewById(R.id.price);
//        sbarprogress = (TextView)findViewById(R.id.price);
//        sbarprogress.setText("Price is: " + seekBar1.getProgress());
//
//        seekBar1.setOnSeekBarChangeListener(
//                new SeekBar.OnSeekBarChangeListener() {
//                    int progress;
//                    @Override
//                    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
//                        progress = i;
//                        sbarprogress.setText(i);
//                        Toast.makeText(FOptionsActivity.this, "pricing in progress",Toast.LENGTH_LONG).show();
//                    }
//
//                    @Override
//                    public void onStartTrackingTouch(SeekBar seekBar) {
//                        Toast.makeText(FOptionsActivity.this, "pricing in progress",Toast.LENGTH_LONG).show();
//                    }
//
//                    @Override
//                    public void onStopTrackingTouch(SeekBar seekBar) {
//                        sbarprogress.setText(progress);
//                        Toast.makeText(FOptionsActivity.this, "pricing in progress",Toast.LENGTH_LONG).show();
//                    }
//                }
//        );
//    }
//    public void selectItem(View view) {
//        nike = (CheckBox)findViewById(R.id.Nike);
//        adidas = (CheckBox)findViewById(R.id.Adidas);
//        ua = (CheckBox)findViewById(R.id.UnderArmour);
//
//        if (nike.isChecked()) {
////            WebApi.connectWebSocket(WebApi.WEBSOCKET_BASE + "/games/" + gameId + "/play",
////                    // When an update is received from the server, use the receivedData function to act on it
////                    data -> runOnUiThread(() -> receivedData(data)),
////                    // When the websocket is first created, store it in an instance variable (analogous to getMapAsync)
////                    ws -> webSocket = ws,
////                    // When an existing connection is lost, try to reconnect
////                    () -> runOnUiThread(this::connectWebSocket),
////                    // When a new connection fails, display an error
////                    error -> runOnUiThread(() -> gameStateLabel.setText("Connection lost")));
//
//        } else {
//
//        }
//        if (adidas.isChecked()) {
//
//        } else {
//
//        }
//        if (ua.isChecked()) {
//
//        } else {
//
//        }
//    }
}
