package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;


public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,bt;
    TextView  tv;
    int a=0;
    String but1,but2,but3,but5,but4,but6,but7,but8,but9,b11,b22,b33,b44,b55,b66,b77,b88,b99;
    boolean mplayer1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        click();






    }
    void click()
    {
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        bt = findViewById(R.id.bt);
        tv = findViewById(R.id.tv);
        mplayer1 = false;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                but1 = b1.getText().toString();
                    if (!mplayer1 && but1.equals("")) {
                        b1.setText("X");
                        mplayer1 = true;

                        check();

                    } else {
                        if (mplayer1 && but1.equals("")) {
                            b1.setText("O");
                            mplayer1 = false;
                            check();
                        }
                    }
                }


        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                but2 = b2.getText().toString();
                    if (!mplayer1 && but2.equals("")) {
                        b2.setText("X");
                        mplayer1 = true;
                        check();
                    } else {
                        if (mplayer1 && but2.equals("")) {
                            b2.setText("O");
                            mplayer1 = false;
                            check();
                        }
                    }
                }


        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                but3 = b3.getText().toString();

                    if (!mplayer1 && but3.equals("")) {
                        b3.setText("X");
                        mplayer1 = true;
                        check();
                    } else {
                        if (mplayer1 && but3.equals("")) {
                            b3.setText("O");
                            mplayer1 = false;
                            check();
                        }
                    }
                }


        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                but4 = b4.getText().toString();
                    if (!mplayer1 && but4.equals("")) {
                        b4.setText("X");
                        mplayer1 = true;
                        check();
                    } else {
                        if (mplayer1 && but4.equals("")) {
                            b4.setText("O");
                            mplayer1 = false;
                            check();
                        }
                    }
                }

        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                but5 = b5.getText().toString();
                    if (!mplayer1 && but5.equals("")) {
                        b5.setText("X");
                        mplayer1 = true;
                        check();
                    } else {
                        if (mplayer1 && but5.equals("")) {
                            b5.setText("O");
                            mplayer1 = false;
                            check();
                        }
                    }
                }


        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//
                but6 = b6.getText().toString();

                    if (!mplayer1 && but6.equals("")) {
                        b6.setText("X");
                        mplayer1 = true;
                        check();
                    } else {
                        if (mplayer1 && but6.equals("")) {
                            b6.setText("O");
                            mplayer1 = false;
                            check();
                        }
                    }

            }

        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                but7 = b7.getText().toString();

                    if (!mplayer1 && but7.equals("")) {

                        b7.setText("X");
                        mplayer1 = true;
                        check();
                    } else {
                        if (mplayer1 && but7.equals("")) {
                            b7.setText("O");
                            mplayer1 = false;
                            check();
                        }
                    }

            }

        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                but8 = b8.getText().toString();
                    if (!mplayer1 && but8.equals("")) {
                        b8.setText("X");
                        mplayer1 = true;
                        check();
                    } else {
                        if (mplayer1 && but8.equals("")) {
                            b8.setText("O");
                            mplayer1 = false;
                            check();
                        }
                    }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                but9 = b9.getText().toString();
                    if (!mplayer1 && but9.equals("")) {
                        b9.setText("X");
                        mplayer1 = true;
                        check();
                    } else {
                        if (mplayer1 && but9.equals("")) {

                            b9.setText("O");
                            mplayer1 = false;
                            check();
                        }
                    }
            }

        });
    }
    void check(){
        b11 = b1.getText().toString();
        b22 = b2.getText().toString();
        b33 = b3.getText().toString();
        b44 = b4.getText().toString();
        b55 = b5.getText() .toString();
        b66 = b6.getText().toString();
        b77 = b7.getText().toString();
        b88 = b8.getText().toString();
        b99 = b9.getText().toString();
//        for (a=0;a<9;a++) {

            if (Objects.equals(b22, b11)) {
                if (Objects.equals(b11, b33)) {

                    if (b11.equals("X")) {
                        b4.setEnabled(false);
                        b5.setEnabled(false);
                        b6.setEnabled(false);
                        b7.setEnabled(false);
                        b8.setEnabled(false);
                        b9.setEnabled(false);
                        String aa = "Player1 Won";
                        tv.setText(aa);
                        clearer();

                    } else {
                        if (b11.equals("O")) {
                            b4.setEnabled(false);
                            b5.setEnabled(false);
                            b6.setEnabled(false);
                            b7.setEnabled(false);
                            b8.setEnabled(false);
                            b9.setEnabled(false);
                            String bb = "Player2 Won";
                            tv.setText(bb);
                            clearer();
                        }
                    }
                }

            }
            if (Objects.equals(b44, b11)) {
                if (Objects.equals(b11, b77)) {

                    if (b11.equals("X")) {
                        b2.setEnabled(false);
                        b3.setEnabled(false);
                        b6.setEnabled(false);
                        b5.setEnabled(false);
                        b8.setEnabled(false);
                        b9.setEnabled(false);
                        String aa = "Player1 Won";
                        tv.setText(aa);
                        clearer();
                    } else {
                        if (b11.equals("O")) {
                            b2.setEnabled(false);
                            b3.setEnabled(false);
                            b6.setEnabled(false);
                            b5.setEnabled(false);
                            b8.setEnabled(false);
                            b9.setEnabled(false);
                            String bb = "Player2 Won";
                            tv.setText(bb);
                            clearer();
                        }
                    }
                }

            }
            if (Objects.equals(b55, b11)) {
                if (Objects.equals(b11, b99)) {

                    if (b11.equals("X")) {
                        b4.setEnabled(false);
                        b2.setEnabled(false);
                        b6.setEnabled(false);
                        b7.setEnabled(false);
                        b8.setEnabled(false);
                        b3.setEnabled(false);
                        String aa = "Player1 Won";
                        tv.setText(aa);
                        clearer();
                    } else {
                        if (b11.equals("O")) {
                            b4.setEnabled(false);
                            b2.setEnabled(false);
                            b6.setEnabled(false);
                            b7.setEnabled(false);
                            b8.setEnabled(false);
                            b3.setEnabled(false);
                            String bb = "Player2 Won";
                            tv.setText(bb);
                            clearer();
                        }
                    }
                }

            }
            if (Objects.equals(b22, b55)) {
                if (Objects.equals(b22, b88)) {

                    if (b22.equals("X")) {
                        b4.setEnabled(false);
                        b1.setEnabled(false);
                        b6.setEnabled(false);
                        b7.setEnabled(false);
                        b3.setEnabled(false);
                        b9.setEnabled(false);
                        String aa = "Player1 Won";
                        tv.setText(aa);
                        clearer();
                    } else {
                        if (b22.equals("O")) {
                            b4.setEnabled(false);
                            b1.setEnabled(false);
                            b6.setEnabled(false);
                            b7.setEnabled(false);
                            b3.setEnabled(false);
                            b9.setEnabled(false);
                            String bb = "Player2 Won";
                            tv.setText(bb);
                            clearer();
                        }
                    }
                }

            }
            if (Objects.equals(b66, b99)) {
                if (Objects.equals(b99, b33)) {

                    if (b33.equals("X")) {
                        b4.setEnabled(false);
                        b5.setEnabled(false);
                        b2.setEnabled(false);
                        b7.setEnabled(false);
                        b8.setEnabled(false);
                        b1.setEnabled(false);
                        String aa = "Player1 Won";
                        tv.setText(aa);
                        clearer();
                    } else {
                        if (b33.equals("O")) {
                            b4.setEnabled(false);
                            b5.setEnabled(false);
                            b2.setEnabled(false);
                            b7.setEnabled(false);
                            b8.setEnabled(false);
                            b1.setEnabled(false);
                            String bb = "Player2 Won";
                            tv.setText(bb);
                        }
                        clearer();
                    }
                }

            }
            if (Objects.equals(b77, b55)) {
                if (Objects.equals(b55, b33)) {

                    if (b55.equals("X")) {
                        b4.setEnabled(false);
                        b2.setEnabled(false);
                        b6.setEnabled(false);
                        b1.setEnabled(false);
                        b8.setEnabled(false);
                        b9.setEnabled(false);
                        String aa = "Player1 Won";
                        tv.setText(aa);
                        clearer();
                    } else {
                        if (b55.equals("O")) {
                            b4.setEnabled(false);
                            b2.setEnabled(false);
                            b6.setEnabled(false);
                            b1.setEnabled(false);
                            b8.setEnabled(false);
                            b9.setEnabled(false);
                            String bb = "Player2 Won";
                            tv.setText(bb);
                            clearer();
                        }
                    }
                }

            }
            if (Objects.equals(b44, b55)) {
                if (Objects.equals(b55, b66)) {

                    if (b66.equals("X")) {
                        b1.setEnabled(false);
                        b3.setEnabled(false);
                        b2.setEnabled(false);
                        b7.setEnabled(false);
                        b8.setEnabled(false);
                        b9.setEnabled(false);
                        String aa = "Player1 Won";
                        tv.setText(aa);
                        clearer();
                    } else {
                        if (b66.equals("O")) {
                            b1.setEnabled(false);
                            b3.setEnabled(false);
                            b2.setEnabled(false);
                            b7.setEnabled(false);
                            b8.setEnabled(false);
                            b9.setEnabled(false);
                            String bb = "Player2 Won";
                            tv.setText(bb);
                            clearer();
                        }
                    }
                }
            }
            if (Objects.equals(b77, b88)) {
                if (Objects.equals(b88, b99)) {

                    if (b77.equals("X")) {
                        b4.setEnabled(false);
                        b5.setEnabled(false);
                        b6.setEnabled(false);
                        b1.setEnabled(false);
                        b2.setEnabled(false);
                        b3.setEnabled(false);
                        String aa = "Player1 Won";
                        tv.setText(aa);
                        clearer();
                    } else {
                        if (b77.equals("O")) {
                            b4.setEnabled(false);
                            b5.setEnabled(false);
                            b6.setEnabled(false);
                            b1.setEnabled(false);
                            b2.setEnabled(false);
                            b3.setEnabled(false);
                            String bb = "Player2 Won";
                            tv.setText(bb);
                            clearer();
                        }
                    }
                }
            }
//        if(b11.length()!= 1 && b22.length()!= 1 && b33.length()!= 1 && b44.length()!= 1 && b55.length()!= 1 && b66.length()!= 1 && b77.length()!= 1 && b88.length()!= 1 && b99.length()!= 1 && draw){
//            tv.setText("Draw");
//        }

//        }
//        if (a==9){
//            tv.setText("Draw Match");
//        }
    }
    void clearer(){

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
                tv.setText("");
                b1.setEnabled(true);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                b6.setEnabled(true);
                b7.setEnabled(true);
                b8.setEnabled(true);
                b9.setEnabled(true);
                tv.setText("");

            }
        });


    }

}
