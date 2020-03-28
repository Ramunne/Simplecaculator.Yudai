package jp.ac.seiko.nara.simplecaculatoryudai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonC, buttonEqual;
    TextView shikiEditText;
    TextView answer;
    TextView shisoku;

    boolean zerostop;
    boolean zerogo;

    float mValueOne, mValueTwo;

    boolean Addition, Subtract, Multiplication, Division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.Tenkey0);
        button1 = (Button) findViewById(R.id.Tenkey1);
        button2 = (Button) findViewById(R.id.Tenkey2);
        button3 = (Button) findViewById(R.id.Tenkey3);
        button4 = (Button) findViewById(R.id.Tenkey4);
        button5 = (Button) findViewById(R.id.Tenkey5);
        button6 = (Button) findViewById(R.id.Tenkey6);
        button7 = (Button) findViewById(R.id.Tenkey7);
        button8 = (Button) findViewById(R.id.Tenkey8);
        button9 = (Button) findViewById(R.id.Tenkey9);
        buttonAdd = (Button) findViewById(R.id.TenkeyPlus);
        buttonSub = (Button) findViewById(R.id.TenkeyMinus);
        buttonMul = (Button) findViewById(R.id.TenkeyMultiply);
        buttonDivision = (Button) findViewById(R.id.Tenkeywaru);
        buttonC = (Button) findViewById(R.id.TenkeyClear);
        buttonEqual = (Button) findViewById(R.id.TenkeyEqual);
        shikiEditText = (TextView) findViewById(R.id.Display);
        answer = (TextView) findViewById(R.id.Total);
        shisoku = (TextView) findViewById(R.id.PlusMinusMultiDivideText);

        zerostop = true;
        zerogo = true;

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (zerostop == false) {
                    shikiEditText.setText("");
                    zerostop = true;

                }
                shikiEditText.setText(shikiEditText.getText() + "1");
                zerogo = false;
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (zerostop == false) {
                    shikiEditText.setText("");
                    zerostop = true;

                }
                shikiEditText.setText(shikiEditText.getText() + "2");
                zerogo = false;
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (zerostop == false) {
                    shikiEditText.setText("");
                    zerostop = true;

                }
                shikiEditText.setText(shikiEditText.getText() + "3");
                zerogo = false;
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (zerostop == false) {
                    shikiEditText.setText("");
                    zerostop = true;

                }
                shikiEditText.setText(shikiEditText.getText() + "4");
                zerogo = false;
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (zerostop == false) {
                    shikiEditText.setText("");
                    zerostop = true;

                }
                shikiEditText.setText(shikiEditText.getText() + "5");
                zerogo = false;
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (zerostop == false) {
                    shikiEditText.setText("");
                    zerostop = true;

                }
                shikiEditText.setText(shikiEditText.getText() + "6");
                zerogo = false;
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (zerostop == false) {
                    shikiEditText.setText("");
                    zerostop = true;

                }
                shikiEditText.setText(shikiEditText.getText() + "7");
                zerogo = false;
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (zerostop == false) {
                    shikiEditText.setText("");
                    zerostop = true;

                }
                shikiEditText.setText(shikiEditText.getText() + "8");
                zerogo = false;
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (zerostop == false) {
                    shikiEditText.setText("");
                    zerostop = true;

                }
                shikiEditText.setText(shikiEditText.getText() + "9");
                zerogo = false;
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shikiEditText.setText(shikiEditText.getText() + "0");
                if (zerostop == false) {
                    shikiEditText.setText("");
                    zerostop = true;

                }
                if (zerogo == false){

                } else  {
                    zerostop = false;
                }


            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (shikiEditText == null) {
                    shikiEditText.setText("");
                } else {
                    mValueOne = Float.parseFloat(shikiEditText.getText() + "");
                    Addition = true;
                    shikiEditText.setText(null);
                }
                zerostop = true;
                zerogo = true;
                shisoku.setText("＋");
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(shikiEditText.getText() + "");
                Subtract = true;
                shikiEditText.setText(null);
                zerostop = true;
                zerogo = true;
                shisoku.setText("－");
            }

        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(shikiEditText.getText() + "");
                Multiplication = true;
                shikiEditText.setText(null);
                zerostop = true;
                zerogo = true;
                shisoku.setText("×");
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(shikiEditText.getText() + "");
                Division = true;
                shikiEditText.setText(null);
                zerostop = true;
                zerogo = true;
                shisoku.setText("÷");
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(shikiEditText.getText() + "");

                if (Addition == true) {
                    answer.setText(mValueOne + mValueTwo + "");
                    Addition = false;
                }

                if (Subtract == true) {
                    answer.setText(mValueOne - mValueTwo + "");
                    Subtract = false;
                }

                if (Multiplication == true) {
                    answer.setText(mValueOne * mValueTwo + "");
                    Multiplication = false;
                }

                if (Division == true) {
                    answer.setText(mValueOne / mValueTwo + "");
                    Division = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                shikiEditText.setText("");
                answer.setText("");
                zerostop = true;
                zerogo = true;
                shisoku.setText("");
            }
        });


    }
}

