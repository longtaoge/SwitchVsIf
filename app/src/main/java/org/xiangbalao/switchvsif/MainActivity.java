package org.xiangbalao.switchvsif;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.xiangbalao.common.ProgressDialog;

import java.util.Random;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Integer count = 10000;
    private TextView tv_if;
    private TextView tv_switch;
    private RadioGroup rg1;
    private RadioGroup rg_total;
    private FloatingActionButton fab;

    private int testType = TESTYTPE_IF;
    private TextView mTvTotal;


    private static final int TESTYTPE_IF = 1;
    private static final int TESTYTPE_SWITHC = 2;
    private ProgressDialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        dialog = ProgressDialog.createDialog(this);
        dialog.setMessage("测试中...");


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                dialog.show();


                if (count == null) {
                    Toast.makeText(MainActivity.this, "请选择测试次数", Toast.LENGTH_LONG).show();
                    return;
                }


                switch (testType) {
                    case TESTYTPE_IF:

                        RunTestIf(tv_if);
                        break;
                    case TESTYTPE_SWITHC:

                        RunTestSwich(tv_switch);
                        break;
                }


            }

        });
    }


    public class MyThread extends Thread {
        ThreadListener listener;
        @Override
        public void run() {
            super.run();
            if (listener != null) {
                listener.onThreadRun();
            }


        }



        public void setListener(ThreadListener listener) {
            this.listener = listener;
        }
    }


    interface ThreadListener {

        void onThreadRun();

    }


    private void RunTestSwich(final TextView textview) {





        MyThread thread=new MyThread();


        thread.setListener(new ThreadListener() {
            @Override
            public void onThreadRun() {
                final long start = SystemClock.currentThreadTimeMillis();
                testSwich();
                final long end = SystemClock.currentThreadTimeMillis();

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        getTaskId();

                        long tem = end - start;
                        textview.setText(tem + "ms");
                        dialog.dismiss();
                    }
                });

            }
        });

        thread.start();





    }


    private void RunTestIf(final TextView textview) {



        MyThread thread=new MyThread();


        thread.setListener(new ThreadListener() {
            @Override
            public void onThreadRun() {
                final long start = SystemClock.currentThreadTimeMillis();
                testIf();
                final long end = SystemClock.currentThreadTimeMillis();

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        long tem = end - start;
                        textview.setText(tem + "ms");
                        dialog.dismiss();
                    }
                });

            }
        });

        thread.start();



    }

    private void testSwich() {


        for (int i = 0; i <= count; i++) {


            //   Log.i(MainActivity.class.getSimpleName(),String.valueOf(i));

            switch (getRandom()) {
                case 0:
                    sendMessage(i);

                    break;
                case 1:
                    sendMessage(i);
                    break;

                case 2:
                    sendMessage(i);
                    break;

                case 3:
                    sendMessage(i);
                    break;
                case 4:
                    sendMessage(i);
                    break;

                case 5:
                    sendMessage(i);
                    break;
                case 6:
                    sendMessage(i);
                    break;

                case 7:
                    sendMessage(i);
                    break;
                case 8:
                    sendMessage(i);
                    break;
                case 9:
                    sendMessage(i);
                    break;

                case 10:
                    sendMessage(i);
                    break;
                case 11:
                    sendMessage(i);
                    break;

                case 12:
                    sendMessage(i);
                    break;

                case 13:
                    sendMessage(i);
                    break;
                case 14:
                    sendMessage(i);
                    break;

                case 15:
                    sendMessage(i);
                    break;
                case 16:
                    sendMessage(i);
                    break;

                case 17:
                    sendMessage(i);
                    break;
                case 18:
                    sendMessage(i);
                    break;
                case 19:
                    sendMessage(i);
                    break;
                case 20:
                    sendMessage(i);
                    break;
                case 21:
                    sendMessage(i);
                    break;

                case 22:
                    sendMessage(i);
                    break;

                case 23:
                    sendMessage(i);
                    break;
                case 24:
                    sendMessage(i);
                    break;

                case 25:
                    sendMessage(i);
                    break;
                case 26:
                    sendMessage(i);
                    break;

                case 27:
                    sendMessage(i);
                    break;
                case 28:
                    sendMessage(i);
                    break;
                case 29:
                    sendMessage(i);
                    break;
                case 30:
                    sendMessage(i);
                    break;
                case 31:
                    sendMessage(i);
                    break;

                case 32:
                    sendMessage(i);
                    break;

                case 33:
                    sendMessage(i);
                    break;
                case 34:
                    sendMessage(i);
                    break;

                case 35:
                    sendMessage(i);
                    break;
                case 36:
                    sendMessage(i);
                    break;

                case 37:
                    sendMessage(i);
                    break;
                case 38:
                    sendMessage(i);
                    break;
                case 39:
                    sendMessage(i);
                    break;


                case 40:
                    sendMessage(i);
                    break;
                case 41:
                    sendMessage(i);
                    break;

                case 42:
                    sendMessage(i);
                    break;

                case 43:
                    sendMessage(i);
                    break;
                case 44:
                    sendMessage(i);
                    break;

                case 45:
                    sendMessage(i);
                    break;
                case 46:
                    sendMessage(i);
                    break;

                case 47:
                    sendMessage(i);
                    break;
                case 48:
                    sendMessage(i);
                    break;
                case 49:
                    sendMessage(i);
                    break;


                case 50:
                    sendMessage(i);
                    break;
                case 51:
                    sendMessage(i);
                    break;

                case 52:
                    sendMessage(i);
                    break;

                case 53:
                    sendMessage(i);
                    break;
                case 54:
                    sendMessage(i);
                    break;

                case 55:
                    sendMessage(i);
                    break;
                case 56:
                    sendMessage(i);
                    break;

                case 57:
                    sendMessage(i);
                    break;
                case 58:
                    sendMessage(i);
                    break;
                case 59:
                    sendMessage(i);
                    break;

                case 70:
                    sendMessage(i);
                    break;
                case 71:
                    sendMessage(i);
                    break;

                case 72:
                    sendMessage(i);
                    break;

                case 73:
                    sendMessage(i);
                    break;
                case 74:
                    sendMessage(i);
                    break;

                case 75:
                    sendMessage(i);
                    break;
                case 76:
                    sendMessage(i);
                    break;

                case 77:
                    sendMessage(i);
                    break;
                case 78:
                    sendMessage(i);
                    break;
                case 79:
                    sendMessage(i);
                    break;

                case 80:
                    sendMessage(i);
                    break;
                case 81:
                    sendMessage(i);
                    break;

                case 82:
                    sendMessage(i);
                    break;

                case 83:
                    sendMessage(i);
                    break;
                case 84:
                    sendMessage(i);
                    break;

                case 85:
                    sendMessage(i);
                    break;
                case 86:
                    sendMessage(i);
                    break;

                case 87:
                    sendMessage(i);
                    break;
                case 88:
                    sendMessage(i);
                    break;
                case 89:
                    sendMessage(i);
                    break;


                case 90:
                    sendMessage(i);
                    break;
                case 91:
                    sendMessage(i);
                    break;

                case 92:
                    sendMessage(i);
                    break;

                case 93:
                    sendMessage(i);
                    break;
                case 94:
                    sendMessage(i);
                    break;

                case 95:
                    sendMessage(i);
                    break;
                case 96:
                    sendMessage(i);
                    break;

                case 97:
                    sendMessage(i);
                    break;
                case 98:
                    sendMessage(i);
                    break;
                case 99:
                    sendMessage(i);
                    break;

                default:
                    sendMessage(i);

                    break;


            }


        }


    }

    private void testIf() {


        for (int i = 0; i <= count; i++) {


            //   Log.i(MainActivity.class.getSimpleName(),String.valueOf(i));

            int i1 = getRandom();
            if (i1 == 0) {
                sendMessage(i);


            } else if (i1 == 1) {
                sendMessage(i);

            } else if (i1 == 2) {
                sendMessage(i);

            } else if (i1 == 3) {
                sendMessage(i);

            } else if (i1 == 4) {
                sendMessage(i);

            } else if (i1 == 5) {
                sendMessage(i);

            } else if (i1 == 6) {
                sendMessage(i);

            } else if (i1 == 7) {
                sendMessage(i);

            } else if (i1 == 8) {
                sendMessage(i);

            } else if (i1 == 9) {
                sendMessage(i);

            } else if (i1 == 10) {
                sendMessage(i);

            } else if (i1 == 11) {
                sendMessage(i);

            } else if (i1 == 12) {
                sendMessage(i);

            } else if (i1 == 13) {
                sendMessage(i);

            } else if (i1 == 14) {
                sendMessage(i);

            } else if (i1 == 15) {
                sendMessage(i);

            } else if (i1 == 16) {
                sendMessage(i);

            } else if (i1 == 17) {
                sendMessage(i);

            } else if (i1 == 18) {
                sendMessage(i);

            } else if (i1 == 19) {
                sendMessage(i);

            } else if (i1 == 20) {
                sendMessage(i);

            } else if (i1 == 21) {
                sendMessage(i);

            } else if (i1 == 22) {
                sendMessage(i);

            } else if (i1 == 23) {
                sendMessage(i);

            } else if (i1 == 24) {
                sendMessage(i);

            } else if (i1 == 25) {
                sendMessage(i);

            } else if (i1 == 26) {
                sendMessage(i);

            } else if (i1 == 27) {
                sendMessage(i);

            } else if (i1 == 28) {
                sendMessage(i);

            } else if (i1 == 29) {
                sendMessage(i);

            } else if (i1 == 30) {
                sendMessage(i);

            } else if (i1 == 31) {
                sendMessage(i);

            } else if (i1 == 32) {
                sendMessage(i);

            } else if (i1 == 33) {
                sendMessage(i);

            } else if (i1 == 34) {
                sendMessage(i);

            } else if (i1 == 35) {
                sendMessage(i);

            } else if (i1 == 36) {
                sendMessage(i);

            } else if (i1 == 37) {
                sendMessage(i);

            } else if (i1 == 38) {
                sendMessage(i);

            } else if (i1 == 39) {
                sendMessage(i);

            } else if (i1 == 40) {
                sendMessage(i);

            } else if (i1 == 41) {
                sendMessage(i);

            } else if (i1 == 42) {
                sendMessage(i);

            } else if (i1 == 43) {
                sendMessage(i);

            } else if (i1 == 44) {
                sendMessage(i);

            } else if (i1 == 45) {
                sendMessage(i);

            } else if (i1 == 46) {
                sendMessage(i);

            } else if (i1 == 47) {
                sendMessage(i);

            } else if (i1 == 48) {
                sendMessage(i);

            } else if (i1 == 49) {
                sendMessage(i);

            } else if (i1 == 50) {
                sendMessage(i);

            } else if (i1 == 51) {
                sendMessage(i);

            } else if (i1 == 52) {
                sendMessage(i);

            } else if (i1 == 53) {
                sendMessage(i);

            } else if (i1 == 54) {
                sendMessage(i);

            } else if (i1 == 55) {
                sendMessage(i);

            } else if (i1 == 56) {
                sendMessage(i);

            } else if (i1 == 57) {
                sendMessage(i);

            } else if (i1 == 58) {
                sendMessage(i);

            } else if (i1 == 59) {
                sendMessage(i);

            } else if (i1 == 70) {
                sendMessage(i);

            } else if (i1 == 71) {
                sendMessage(i);

            } else if (i1 == 72) {
                sendMessage(i);

            } else if (i1 == 73) {
                sendMessage(i);

            } else if (i1 == 74) {
                sendMessage(i);

            } else if (i1 == 75) {
                sendMessage(i);

            } else if (i1 == 76) {
                sendMessage(i);

            } else if (i1 == 77) {
                sendMessage(i);

            } else if (i1 == 78) {
                sendMessage(i);

            } else if (i1 == 79) {
                sendMessage(i);

            } else if (i1 == 80) {
                sendMessage(i);

            } else if (i1 == 81) {
                sendMessage(i);

            } else if (i1 == 82) {
                sendMessage(i);

            } else if (i1 == 83) {
                sendMessage(i);

            } else if (i1 == 84) {
                sendMessage(i);

            } else if (i1 == 85) {
                sendMessage(i);

            } else if (i1 == 86) {
                sendMessage(i);

            } else if (i1 == 87) {
                sendMessage(i);

            } else if (i1 == 88) {
                sendMessage(i);

            } else if (i1 == 89) {
                sendMessage(i);

            } else if (i1 == 90) {
                sendMessage(i);

            } else if (i1 == 91) {
                sendMessage(i);

            } else if (i1 == 92) {
                sendMessage(i);

            } else if (i1 == 93) {
                sendMessage(i);

            } else if (i1 == 94) {
                sendMessage(i);

            } else if (i1 == 95) {
                sendMessage(i);

            } else if (i1 == 96) {
                sendMessage(i);

            } else if (i1 == 97) {
                sendMessage(i);

            } else if (i1 == 98) {
                sendMessage(i);

            } else if (i1 == 99) {
                sendMessage(i);

            } else {
                sendMessage(i);


            }


        }


    }


    private void sendMessage(final int i) {

        if ((i % 1000) == 0) {

            Log.i(MainActivity.class.getSimpleName(), String.valueOf(i));
            runOnUiThread(new Runnable() {
                @Override
                public void run() {

                    mTvTotal.setText(String.valueOf(i / 1000) + "k");

                }
            });


        }


    }


    /**
     * 随机数
     *
     * @return
     */
    private int getRandom() {
        Random random = new Random();
        int result = random.nextInt(100);
        Log.i("RandomS", String.valueOf(result));
        return result;

    }


    private void initView() {
        tv_if = (TextView) findViewById(R.id.tv_if);
        tv_switch = (TextView) findViewById(R.id.tv_switch);
        rg1 = (RadioGroup) findViewById(R.id.rg1);


        rg_total = (RadioGroup) findViewById(R.id.rg_total);
        fab = (FloatingActionButton) findViewById(R.id.fab);
        rg_total.check(R.id.radioButton);
        fab.setOnClickListener(this);


        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_if:
                        testType = TESTYTPE_IF;
                        break;
                    case R.id.rb_sw:
                        testType = TESTYTPE_SWITHC;
                        break;
                }
            }
        });


        rg_total.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButton:
                        count = 1 * 10000;
                        break;
                    case R.id.radioButton1:
                        count = 10 * 10000;
                        break;
                    case R.id.radioButton2:
                        count = 100 * 10000;
                        break;
                    case R.id.radioButton3:
                        count = 500 * 10000;
                        break;
                    case R.id.radioButton4:
                        count = 1000 * 10000;
                        break;


                }
            }
        });

        mTvTotal = (TextView) findViewById(R.id.tv_total);
        mTvTotal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fab:

                break;
        }
    }
}
