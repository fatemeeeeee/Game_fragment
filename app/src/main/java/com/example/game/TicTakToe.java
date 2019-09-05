package com.example.game;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.android.material.snackbar.Snackbar;


public class TicTakToe extends Fragment {

    public static final String KEY1 = "1";
    public static final String KEY2 = "2";
    public static final String KEY3 = "3";
    public static final String KEY4 = "4";
    public static final String KEY5 = "5";
    public static final String KEY6 = "6";
    public static final String KEY7 = "7";
    public static final String KEY8 = "8";
    public static final String KEY9 = "9";
    public static final String INDEX = "index";
    public static final String STATE_1 = "state1";
    public static final String STATE_2 = "state2";
    public static final String STATE_3 = "state3";
    public static final String STATE_4 = "state4";
    public static final String STATE_5 = "state5";
    public static final String STATE_6 = "state6";
    public static final String STATE_7 = "state7";
    public static final String STATE_8 = "state8";
    public static final String STATE_9 = "state9";
    private Button mButton1, mButton2, mButton3, mButton4, mButton5, mButton6, mButton7, mButton8, mButton9;
    int index = 0;

    public TicTakToe() {
        // Required empty public constructor
    }


    @Override
    public View
    onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tic_tak_toe, container, false);
        // Inflate the layout for this fragment
        mButton1 = view.findViewById(R.id.button_1);
        mButton2 = view.findViewById(R.id.button_2);
        mButton3 = view.findViewById(R.id.button_3);
        mButton4 = view.findViewById(R.id.button_4);
        mButton5 = view.findViewById(R.id.button_5);
        mButton6 = view.findViewById(R.id.button_6);
        mButton7 = view.findViewById(R.id.button_7);
        mButton8 = view.findViewById(R.id.button_8);
        mButton9 = view.findViewById(R.id.button_9);
        if(savedInstanceState !=null) {
            mButton1.setText(savedInstanceState.getString(KEY1));
            mButton2.setText( savedInstanceState.getString(KEY2));
            mButton3.setText(savedInstanceState.getString(KEY3));
            mButton4.setText(savedInstanceState.getString(KEY4));
            mButton5.setText(savedInstanceState.getString(KEY5));
            mButton6.setText(savedInstanceState.getString(KEY6));
            mButton7.setText( savedInstanceState.getString(KEY7));
            mButton8.setText(savedInstanceState.getString(KEY8));
            mButton9.setText(savedInstanceState.getString(KEY9));
            mButton1.setEnabled(savedInstanceState.getBoolean(STATE_1));
            mButton2.setEnabled(savedInstanceState.getBoolean(STATE_2));
            mButton3.setEnabled(savedInstanceState.getBoolean(STATE_3));
            mButton4.setEnabled(savedInstanceState.getBoolean(STATE_4));
            mButton5.setEnabled(savedInstanceState.getBoolean(STATE_5));
            mButton6.setEnabled(savedInstanceState.getBoolean(STATE_6));
            mButton7.setEnabled(savedInstanceState.getBoolean(STATE_7));
            mButton8.setEnabled(savedInstanceState.getBoolean(STATE_8));
            mButton9.setEnabled(savedInstanceState.getBoolean(STATE_9));
            index=savedInstanceState.getInt(INDEX);
        }


        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyClick(mButton1);
                if(mButton1.getText().toString().equals("X")){
                      if((mButton2.getText().toString().equals("X") && mButton3.getText().toString().equals("X"))    ||   ( mButton4.getText().toString().equals("X") && mButton7.getText().toString().equals("X"))  || ( mButton5.getText().toString().equals("X") && mButton9.getText().toString().equals("X"))){
                        Snackbar.make(getActivity().findViewById(R.id.fragment_container) , "Fatabarakallah you are winner" ,Snackbar.LENGTH_LONG).show();
                          DesableAllButton();
                        }
                }
               else  if(mButton1.getText().toString().equals("O")){
                    if((mButton2.getText().toString().equals("O") && mButton3.getText().toString().equals("O"))    ||   ( mButton4.getText().toString().equals("O") && mButton7.getText().toString().equals("O"))  || ( mButton5.getText().toString().equals("O") && mButton9.getText().toString().equals("O"))){
                        Snackbar.make(getActivity().findViewById(R.id.fragment_container) , "Fatabarakallah you are winner" ,Snackbar.LENGTH_LONG).show();
                        DesableAllButton();
                    }
               }
                            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyClick(mButton2);
                if(mButton2.getText().toString().equals("X")){
                    if(((mButton5.getText().toString().equals("X"))   &&  (mButton8.getText().toString().equals("X"))) || ((mButton1.getText().toString().equals("X"))   &&  (mButton3.getText().toString().equals("X"))))
                    {
                        Snackbar.make(getActivity().findViewById(R.id.fragment_container), "Fatabarakallah you are winner", Snackbar.LENGTH_LONG).show();
                        DesableAllButton();
                    }

                }
              else if(mButton2.getText().toString().equals("O")){
                    if(((mButton5.getText().toString().equals("O"))   &&  (mButton8.getText().toString().equals("O"))) || ((mButton1.getText().toString().equals("O"))   &&  (mButton3.getText().toString().equals("O"))))
                    {
                        Snackbar.make(getActivity().findViewById(R.id.fragment_container), "Fatabarakallah you are winner", Snackbar.LENGTH_LONG).show();
                        DesableAllButton();
                    }

                }

            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyClick(mButton3);
                if(mButton3.getText().toString().equals("X")){
                    if((mButton1.getText().toString().equals("X") && mButton2.getText().toString().equals("X"))    ||   ( mButton6.getText().toString().equals("X") && mButton9.getText().toString().equals("X"))  || ( mButton5.getText().toString().equals("X") && mButton7.getText().toString().equals("X"))){
                        Snackbar.make(getActivity().findViewById(R.id.fragment_container) , "Fatabarakallah you are winner" ,Snackbar.LENGTH_LONG).show();
                        DesableAllButton();
                    }


                }
                else  if(mButton3.getText().toString().equals("O")){
                    if((mButton1.getText().toString().equals("O") && mButton2.getText().toString().equals("O"))    ||   ( mButton6.getText().toString().equals("O") && mButton9.getText().toString().equals("O"))  || ( mButton5.getText().toString().equals("O") && mButton7.getText().toString().equals("O"))){
                        Snackbar.make(getActivity().findViewById(R.id.fragment_container) , "Fatabarakallah you are winner" ,Snackbar.LENGTH_LONG).show();
                        DesableAllButton();
                    }
                }
            }
        });

        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyClick(mButton4);
                if(mButton4.getText().toString().equals("X")){
                    if(((mButton1.getText().toString().equals("X"))   &&  (mButton7.getText().toString().equals("X"))) || ((mButton5.getText().toString().equals("X"))   &&  (mButton6.getText().toString().equals("X"))))
                    {
                        Snackbar.make(getActivity().findViewById(R.id.fragment_container), "Fatabarakallah you are winner", Snackbar.LENGTH_LONG).show();
                        DesableAllButton();
                    }

                }
                else if(mButton4.getText().toString().equals("O")){
                    if(((mButton1.getText().toString().equals("O"))   &&  (mButton7.getText().toString().equals("O"))) || ((mButton5.getText().toString().equals("O"))   &&  (mButton6.getText().toString().equals("O"))))
                    {
                        Snackbar.make(getActivity().findViewById(R.id.fragment_container), "Fatabarakallah you are winner", Snackbar.LENGTH_LONG).show();
                        DesableAllButton();
                    }

                }

            }
        });

        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyClick(mButton5);
                if(mButton5.getText().toString().equals("X")){
                    if(((mButton2.getText().toString().equals("X"))   &&  (mButton8.getText().toString().equals("X"))) || ((mButton4.getText().toString().equals("X"))   &&  (mButton6.getText().toString().equals("X")))  || ((mButton1.getText().toString().equals("X"))   &&  (mButton9.getText().toString().equals("X")))  ||((mButton3.getText().toString().equals("X"))   &&  (mButton7.getText().toString().equals("X"))) )
                    {
                        Snackbar.make(getActivity().findViewById(R.id.fragment_container), "Fatabarakallah you are winner", Snackbar.LENGTH_LONG).show();
                        DesableAllButton();
                    }

                }
                else if(mButton5.getText().toString().equals("O")){
                    if(((mButton2.getText().toString().equals("O"))   &&  (mButton8.getText().toString().equals("O"))) || ((mButton4.getText().toString().equals("O"))   &&  (mButton6.getText().toString().equals("O")))  || ((mButton1.getText().toString().equals("O"))   &&  (mButton9.getText().toString().equals("O")))  ||((mButton3.getText().toString().equals("O"))   &&  (mButton7.getText().toString().equals("O"))) )
                    {
                        Snackbar.make(getActivity().findViewById(R.id.fragment_container), "Fatabarakallah you are winner", Snackbar.LENGTH_LONG).show();
                        DesableAllButton();
                    }

                }

            }
        });

        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyClick(mButton6);
                if(mButton6.getText().toString().equals("X")){
                    if(((mButton3.getText().toString().equals("X"))   &&  (mButton9.getText().toString().equals("X"))) || ((mButton4.getText().toString().equals("X"))   &&  (mButton5.getText().toString().equals("X"))))
                    {
                        Snackbar.make(getActivity().findViewById(R.id.fragment_container), "Fatabarakallah you are winner", Snackbar.LENGTH_LONG).show();
                        DesableAllButton();
                    }

                }
                else if(mButton6.getText().toString().equals("O")){
                    if(((mButton3.getText().toString().equals("O"))   &&  (mButton9.getText().toString().equals("O"))) || ((mButton4.getText().toString().equals("O"))   &&  (mButton5.getText().toString().equals("O"))))
                    {
                        Snackbar.make(getActivity().findViewById(R.id.fragment_container), "Fatabarakallah you are winner", Snackbar.LENGTH_LONG).show();
                        DesableAllButton();
                    }

                }

            }
        });
        mButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyClick(mButton7);
                if(mButton7.getText().toString().equals("X")){
                    if((mButton1.getText().toString().equals("X") && mButton4.getText().toString().equals("X"))    ||   ( mButton8.getText().toString().equals("X") && mButton9.getText().toString().equals("X"))  || ( mButton5.getText().toString().equals("X") && mButton3.getText().toString().equals("X"))){
                        Snackbar.make(getActivity().findViewById(R.id.fragment_container) , "Fatabarakallah you are winner" ,Snackbar.LENGTH_LONG).show();
                        DesableAllButton();
                    }
                }
                else  if(mButton7.getText().toString().equals("O")){
                    if((mButton1.getText().toString().equals("O") && mButton4.getText().toString().equals("O"))    ||   ( mButton8.getText().toString().equals("O") && mButton9.getText().toString().equals("O"))  || ( mButton5.getText().toString().equals("O") && mButton3.getText().toString().equals("O"))){
                        Snackbar.make(getActivity().findViewById(R.id.fragment_container) , "Fatabarakallah you are winner" ,Snackbar.LENGTH_LONG).show();
                        DesableAllButton();
                    }
                }
            }
        });

        mButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyClick(mButton8);
                if(mButton8.getText().toString().equals("X")){
                    if(((mButton5.getText().toString().equals("X"))   &&  (mButton2.getText().toString().equals("X"))) || ((mButton7.getText().toString().equals("X"))   &&  (mButton9.getText().toString().equals("X"))))
                    {
                        Snackbar.make(getActivity().findViewById(R.id.fragment_container), "Fatabarakallah you are winner", Snackbar.LENGTH_LONG).show();
                        DesableAllButton();
                    }

                }
                else if(mButton8.getText().toString().equals("O")){
                    if(((mButton5.getText().toString().equals("O"))   &&  (mButton2.getText().toString().equals("O"))) || ((mButton7.getText().toString().equals("O"))   &&  (mButton9.getText().toString().equals("O"))))
                    {
                        Snackbar.make(getActivity().findViewById(R.id.fragment_container), "Fatabarakallah you are winner", Snackbar.LENGTH_LONG).show();
                        DesableAllButton();
                    }

                }

            }
        });

        mButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyClick(mButton9);
                if(mButton9.getText().toString().equals("X")){
                    if((mButton7.getText().toString().equals("X") && mButton8.getText().toString().equals("X"))    ||   ( mButton3.getText().toString().equals("X") && mButton6.getText().toString().equals("X"))  || ( mButton5.getText().toString().equals("X") && mButton1.getText().toString().equals("X"))){
                        Snackbar.make(getActivity().findViewById(R.id.fragment_container) , "Fatabarakallah you are winner" ,Snackbar.LENGTH_LONG).show();
                        DesableAllButton();
                    }
                }
                else  if(mButton9.getText().toString().equals("O")){
                    if((mButton7.getText().toString().equals("O") && mButton8.getText().toString().equals("O"))    ||   ( mButton3.getText().toString().equals("O") && mButton6.getText().toString().equals("O"))  || ( mButton5.getText().toString().equals("O") && mButton1.getText().toString().equals("O"))){
                        Snackbar.make(getActivity().findViewById(R.id.fragment_container) , "Fatabarakallah you are winner" ,Snackbar.LENGTH_LONG).show();
                        DesableAllButton();
                    }
                }
            }
        });

        return view;

    }

    //////////////////////////////////////////////////////////////////////
    public void MyClick(Button mButton) {
        if (index % 2 == 0) {
            mButton.setText("X");
            mButton.setEnabled(false);
        } else {
            mButton.setText("O");
            mButton.setEnabled(false);
        }
        index++;

    }

    public void DesableAllButton(){
        mButton1.setEnabled(false);
        mButton2.setEnabled(false);
        mButton3.setEnabled(false);
        mButton4.setEnabled(false);
        mButton5.setEnabled(false);
        mButton6.setEnabled(false);
        mButton7.setEnabled(false);
        mButton8.setEnabled(false);
        mButton9.setEnabled(false);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(KEY1,mButton1.getText().toString());
        outState.putString(KEY2,mButton2.getText().toString());
        outState.putString(KEY3,mButton3.getText().toString());
        outState.putString(KEY4,mButton4.getText().toString());
        outState.putString(KEY5,mButton5.getText().toString());
        outState.putString(KEY6,mButton6.getText().toString());
        outState.putString(KEY7,mButton7.getText().toString());
        outState.putString(KEY8,mButton8.getText().toString());
        outState.putString(KEY9,mButton9.getText().toString());
        outState.putBoolean(STATE_1,mButton1.isEnabled());
        outState.putBoolean(STATE_2,mButton2.isEnabled());
        outState.putBoolean(STATE_3,mButton3.isEnabled());
        outState.putBoolean(STATE_4,mButton4.isEnabled());
        outState.putBoolean(STATE_5,mButton5.isEnabled());
        outState.putBoolean(STATE_6,mButton6.isEnabled());
        outState.putBoolean(STATE_7,mButton7.isEnabled());
        outState.putBoolean(STATE_8,mButton8.isEnabled());
        outState.putBoolean(STATE_9,mButton9.isEnabled());
        outState.putInt(INDEX, index);
    }


}
