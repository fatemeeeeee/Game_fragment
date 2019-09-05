package com.example.game;


import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class Rawin4 extends Fragment {

    public Button[][] mButton;
    private int counter = 0;
    final static int color_blue = R.color.myColorBlue;
    final static int color_red = R.color.myColorred;
    final static int color_gray  = R.color.myColorgray;
    private String BUNDLE_KEY_Button = "Our Array Button ";
    private String BUNDLE_KEY_CUNTER="counter";
    public Rawin4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_rawin4, container, false);
        // Inflate the layout for this fragment
        mButton = new Button[5][5];
        mButton[0][0] = view.findViewById(R.id.button0);
        mButton[0][1] = view.findViewById(R.id.button1);
        mButton[0][2] = view.findViewById(R.id.button2);
        mButton[0][3] = view.findViewById(R.id.button3);
        mButton[0][4] = view.findViewById(R.id.button4);
        mButton[1][0] = view.findViewById(R.id.button5);
        mButton[1][1] = view.findViewById(R.id.button6);
        mButton[1][2] = view.findViewById(R.id.button7);
        mButton[1][3] = view.findViewById(R.id.button8);
        mButton[1][4] = view.findViewById(R.id.button9);
        mButton[2][0] = view.findViewById(R.id.button10);
        mButton[2][1] = view.findViewById(R.id.button11);
        mButton[2][2] = view.findViewById(R.id.button12);
        mButton[2][3] = view.findViewById(R.id.button13);
        mButton[2][4] = view.findViewById(R.id.button14);
        mButton[3][0] = view.findViewById(R.id.button15);
        mButton[3][1] = view.findViewById(R.id.button16);
        mButton[3][2] = view.findViewById(R.id.button17);
        mButton[3][3] = view.findViewById(R.id.button18);
        mButton[3][4] = view.findViewById(R.id.button19);
        mButton[4][0] = view.findViewById(R.id.button20);
        mButton[4][1] = view.findViewById(R.id.button21);
        mButton[4][2] = view.findViewById(R.id.button22);
        mButton[4][3] = view.findViewById(R.id.button23);
        mButton[4][4] = view.findViewById(R.id.button24);



        if (savedInstanceState != null) {
            int[] ourButton2=new int[25];
            ourButton2=savedInstanceState.getIntArray(BUNDLE_KEY_Button);
            counter=savedInstanceState.getInt(BUNDLE_KEY_CUNTER);
            int k=0;
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    mButton[i][j].setBackgroundColor(ourButton2[k]) ;
                    k++;
                }
            }
        }
        if (savedInstanceState==null)

        {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {

                    final int finalJ = j;
                    final int finalI = i;
                    mButton[finalI][finalJ].setBackgroundColor(getResources().getColor(color_gray));
                }
            }
            disableallfirst(mButton);
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                final int finalJ = j;
                final int finalI = i;
                disableallfirst(mButton);
                mButton[i][j].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (counter % 2 == 0) {
                            mButton[finalI][finalJ].setBackgroundColor(getResources().getColor(color_blue));
                        }
                        if (counter % 2 != 0) {
                            mButton[finalI][finalJ].setBackgroundColor(getResources().getColor(color_red));
                        }


                        if (finalI != 4)
                            mButton[finalI + 1][finalJ].setEnabled(true);
                        counter++;
                        mButton[finalI][finalJ].setEnabled(false);
                        checkColum(mButton, mButton[finalI][finalJ], finalI, finalJ);
                       // checkRow(mButton, mButton[finalI][finalJ], finalI, finalJ);
                      //  checkdiagonal(mButton, mButton[finalI][finalJ], finalI, finalJ);
                    }
                });
            }
        }
        return view;
    }




    public void checkColum(Button[][] button, Button bt, int i, int j) {

        int color = ((ColorDrawable) bt.getBackground()).getColor();
        if (i == 3 || i == 4) {



            if (((ColorDrawable) button[i - 1][j].getBackground()).getColor() == color && ((ColorDrawable) button[i - 2][j].getBackground()).getColor() == color && ((ColorDrawable) button[i - 3][j].getBackground()).getColor() == color) {
                Toast.makeText(getActivity(), "you are a winner person", Toast.LENGTH_SHORT).show();
                disableall(button);
            }

        }


       else  if ((((ColorDrawable) button[i][0].getBackground()).getColor() == color && ((ColorDrawable) button[i][1].getBackground()).getColor() == color && ((ColorDrawable) button[i ][2].getBackground()).getColor() == color&&((ColorDrawable) button[i ][3].getBackground()).getColor() == color )||(((ColorDrawable) button[i ][1].getBackground()).getColor() == color && ((ColorDrawable) button[i ][2].getBackground()).getColor() == color && ((ColorDrawable) button[i][3].getBackground()).getColor() == color&&((ColorDrawable) button[i][4].getBackground()).getColor() == color)){

            Toast.makeText(getActivity(), "you are a winner person", Toast.LENGTH_SHORT).show();
            disableall(button);


        }





    }

    public void checkRow(Button[][] button, Button bt, int i, int j){

        int color = ((ColorDrawable) bt.getBackground()).getColor();

        if ((((ColorDrawable) button[i][0].getBackground()).getColor() == color && ((ColorDrawable) button[i][1].getBackground()).getColor() == color && ((ColorDrawable) button[i ][2].getBackground()).getColor() == color&&((ColorDrawable) button[i ][3].getBackground()).getColor() == color )||(((ColorDrawable) button[i ][1].getBackground()).getColor() == color && ((ColorDrawable) button[i ][2].getBackground()).getColor() == color && ((ColorDrawable) button[i][3].getBackground()).getColor() == color&&((ColorDrawable) button[i][4].getBackground()).getColor() == color)){

            Toast.makeText(getActivity(), "you are a winner person", Toast.LENGTH_SHORT).show();
            disableall(button);


}

    }
    public void checkdiagonal(Button[][] button, Button bt, int i, int j) {

        int color = ((ColorDrawable) bt.getBackground()).getColor();
        int x=0;
        int d=0;
        int u=0;
        for (int k=i,l=j,a=i,b=j;(k<5&&l<5)||(a>=0&&b>=0);k++,l++,a--,b--) {

           if ((((ColorDrawable) button[k][l].getBackground()).getColor()==color)||(((ColorDrawable) button[a][b].getBackground()).getColor()==color)) {

               d++;

           }
           if (d==4){
               Toast.makeText(getActivity(), "you are a winner person", Toast.LENGTH_SHORT).show();
               disableall(button);
               u=1;

           }
            x++;
            if (x == 4) {
                break;
            }

        }

        int z=0;
        int y=0;
if (u==0) {
    for (int k = i, l = j, a = i, b = j; (k < 5 && l >= 0) || (a >= 0 && b < 5); k++, l--, a--, b++) {


        if ((((ColorDrawable) button[k][l].getBackground()).getColor() == color) || (((ColorDrawable) button[a][b].getBackground()).getColor() == color)) {

            y++;

        }
        if (y == 4) {
            Toast.makeText(getActivity(), "you are a winner person", Toast.LENGTH_SHORT).show();
            disableall(button);

        }
        z++;
        if (z == 4) {
            break;
        }

    }

}
    }

    public void disableallfirst(Button[][] buttons) {
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                buttons[i][j].setEnabled(false);

            }

        }
    }

    public void disableall(Button[][] buttons) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                buttons[i][j].setEnabled(false);

            }

        }

    }



    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        int[] ourButton=new int[25];
        int k=0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                ourButton[k]=((ColorDrawable) mButton[i][j].getBackground()).getColor();
                k++;
            }
        }

        // outState.putIntArray();
        outState.putIntArray(BUNDLE_KEY_Button,ourButton);
        outState.putInt(BUNDLE_KEY_CUNTER,counter);
    }





}