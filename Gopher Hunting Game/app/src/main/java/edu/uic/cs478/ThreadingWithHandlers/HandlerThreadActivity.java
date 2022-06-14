package edu.uic.cs478.ThreadingWithHandlers;


import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;


public class HandlerThreadActivity extends Activity  {

	// makes sure the always get the main looper from the UI thread
	//private final Handler mHandler = new Handler(getApplicationContext().getMainLooper());

	public static final int TASK_A = 1;
	public static final int TASK_B = 2;

	private GameLogic game = new GameLogic();
	private Graph myTable = new Graph();
	private Random rand = new Random();

	private Button startButton;
	private Button stopButton;
	private Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36,b37,b38,b39,b40,b41,b42,b43,b44,b45,b46,b47,b48,b49,b50,b51,b52,b53,b54,b55,b56,b57,b58,b59,b60,b61,b62,b63,b64,b65,b66,b67,b68,b69,b70,b71,b72,b73,b74,b75,b76,b77,b78,b79,b80,b81,b82,b83,b84,b85,b86,b87,b88,b89,b90,b91,b92,b93,b94,b95,b96,b97,b98,b99,b100,b101,b102,b103,b104,b105,b106,b107,b108,b109,b110,b111,b112,b113,b114,b115,b116,b117,b118,b119,b120,b121,b122,b123,b124,b125,b126,b127,b128,b129,b130,b131,b132,b133,b134,b135,b136,b137,b138,b139,b140,b141,b142,b143,b144,b145,b146,b147,b148,b149,b150,b151,b152,b153,b154,b155,b156,b157,b158,b159,b160,b161,b162,b163,b164,b165,b166,b167,b168,b169,b170,b171,b172,b173,b174,b175,b176,b177,b178,b179,b180,b181,b182,b183,b184,b185,b186,b187,b188,b189,b190,b191,b192,b193,b194,b195,b196,b197,b198,b199;
	private final static int[] buttonIDList = {R.id.Button0,R.id.Button1,R.id.Button2,R.id.Button3,R.id.Button4,R.id.Button5,R.id.Button6,R.id.Button7,R.id.Button8,R.id.Button9,R.id.Button10,R.id.Button11,R.id.Button12,R.id.Button13,R.id.Button14,R.id.Button15,R.id.Button16,R.id.Button17,R.id.Button18,R.id.Button19,R.id.Button20,R.id.Button21,R.id.Button22,R.id.Button23,R.id.Button24,R.id.Button25,R.id.Button26,R.id.Button27,R.id.Button28,R.id.Button29,R.id.Button30,R.id.Button31,R.id.Button32,R.id.Button33,R.id.Button34,R.id.Button35,R.id.Button36,R.id.Button37,R.id.Button38,R.id.Button39,R.id.Button40,R.id.Button41,R.id.Button42,R.id.Button43,R.id.Button44,R.id.Button45,R.id.Button46,R.id.Button47,R.id.Button48,R.id.Button49,R.id.Button50,R.id.Button51,R.id.Button52,R.id.Button53,R.id.Button54,R.id.Button55,R.id.Button56,R.id.Button57,R.id.Button58,R.id.Button59,R.id.Button60,R.id.Button61,R.id.Button62,R.id.Button63,R.id.Button64,R.id.Button65,R.id.Button66,R.id.Button67,R.id.Button68,R.id.Button69,R.id.Button70,R.id.Button71,R.id.Button72,R.id.Button73,R.id.Button74,R.id.Button75,R.id.Button76,R.id.Button77,R.id.Button78,R.id.Button79,R.id.Button80,R.id.Button81,R.id.Button82,R.id.Button83,R.id.Button84,R.id.Button85,R.id.Button86,R.id.Button87,R.id.Button88,R.id.Button89,R.id.Button90,R.id.Button91,R.id.Button92,R.id.Button93,R.id.Button94,R.id.Button95,R.id.Button96,R.id.Button97,R.id.Button98,R.id.Button99,R.id.Button100,R.id.Button101,R.id.Button102,R.id.Button103,R.id.Button104,R.id.Button105,R.id.Button106,R.id.Button107,R.id.Button108,R.id.Button109,R.id.Button110,R.id.Button111,R.id.Button112,R.id.Button113,R.id.Button114,R.id.Button115,R.id.Button116,R.id.Button117,R.id.Button118,R.id.Button119,R.id.Button120,R.id.Button121,R.id.Button122,R.id.Button123,R.id.Button124,R.id.Button125,R.id.Button126,R.id.Button127,R.id.Button128,R.id.Button129,R.id.Button130,R.id.Button131,R.id.Button132,R.id.Button133,R.id.Button134,R.id.Button135,R.id.Button136,R.id.Button137,R.id.Button138,R.id.Button139,R.id.Button140,R.id.Button141,R.id.Button142,R.id.Button143,R.id.Button144,R.id.Button145,R.id.Button146,R.id.Button147,R.id.Button148,R.id.Button149,R.id.Button150,R.id.Button151,R.id.Button152,R.id.Button153,R.id.Button154,R.id.Button155,R.id.Button156,R.id.Button157,R.id.Button158,R.id.Button159,R.id.Button160,R.id.Button161,R.id.Button162,R.id.Button163,R.id.Button164,R.id.Button165,R.id.Button166,R.id.Button167,R.id.Button168,R.id.Button169,R.id.Button170,R.id.Button171,R.id.Button172,R.id.Button173,R.id.Button174,R.id.Button175,R.id.Button176,R.id.Button177,R.id.Button178,R.id.Button179,R.id.Button180,R.id.Button181,R.id.Button182,R.id.Button183,R.id.Button184,R.id.Button185,R.id.Button186,R.id.Button187,R.id.Button188,R.id.Button189,R.id.Button190,R.id.Button191,R.id.Button192,R.id.Button193,R.id.Button194,R.id.Button195,R.id.Button196,R.id.Button197,R.id.Button198,R.id.Button199};

	private int gopherIndex = rand.nextInt(100);

	private TextView displayPlayer;

	private AtomicBoolean alive = new AtomicBoolean(true);

	private Button[] buttonList = {b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36,b37,b38,b39,b40,b41,b42,b43,b44,b45,b46,b47,b48,b49,b50,b51,b52,b53,b54,b55,b56,b57,b58,b59,b60,b61,b62,b63,b64,b65,b66,b67,b68,b69,b70,b71,b72,b73,b74,b75,b76,b77,b78,b79,b80,b81,b82,b83,b84,b85,b86,b87,b88,b89,b90,b91,b92,b93,b94,b95,b96,b97,b98,b99,b100,b101,b102,b103,b104,b105,b106,b107,b108,b109,b110,b111,b112,b113,b114,b115,b116,b117,b118,b119,b120,b121,b122,b123,b124,b125,b126,b127,b128,b129,b130,b131,b132,b133,b134,b135,b136,b137,b138,b139,b140,b141,b142,b143,b144,b145,b146,b147,b148,b149,b150,b151,b152,b153,b154,b155,b156,b157,b158,b159,b160,b161,b162,b163,b164,b165,b166,b167,b168,b169,b170,b171,b172,b173,b174,b175,b176,b177,b178,b179,b180,b181,b182,b183,b184,b185,b186,b187,b188,b189,b190,b191,b192,b193,b194,b195,b196,b197,b198,b199};
;
	// private button array; // array for storing all 100 buttons on the table 0 - 99

	private LooperThread looperThread = new LooperThread();

	private TextView endGameText;
	private TextView results;
	private TextView results2;

	// to stop a thread before its finished
	private volatile boolean stopThread = false;

	// UI Thread handler
	private final Handler mHandler = new Handler(Looper.getMainLooper()) { // Handler is created by UI Thread and associated with it
		public static final int TASK_A = 1;
		public static final int TASK_B = 2;

		@Override
		public void handleMessage(Message msg){
			int playerGuess = msg.arg1;
			Log.d("PlayerGuess", "Guess num: " + playerGuess);

			switch (msg.what) {
				case TASK_A:
					results.setText(checkDistance(playerGuess));
					if (playerGuess == gopherIndex){
						stopThread = true;
						endGameText.setText("Player 1 Wins!");
						break;
					}
					Log.d("MyHandler", "Task A executed");
					// change button to red
					buttonList[playerGuess].setBackgroundColor(Color.RED);
					buttonList[playerGuess].setText("x");
					break;
				case TASK_B:

					int i = playerGuess + 100;
					results2.setText(checkDistance(playerGuess));
					if (playerGuess == gopherIndex){
						stopThread = true;
						endGameText.setText("Player 2 Wins!");
						break;
					}
					Log.d("Task B: Player Guess", "Player Guess: " + playerGuess);
					Log.d("MyHandler", "Task B executed");
					// change button to blue
					Log.d("MyHandler", "Index = " + i);
					buttonList[i].setBackgroundColor(Color.BLUE);
					buttonList[i].setText("x");
					break;

			}
		}
	};


	public HandlerThreadActivity() {
	}

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        endGameText = findViewById(R.id.textView);
        results = findViewById(R.id.resultText);
        results2 = findViewById(R.id.resultText2);

		startButton = findViewById(R.id.start);
		stopButton = findViewById(R.id.stop);
		//tempButton = findViewById(R.id.);
		b0= findViewById(R.id.Button0);b1= findViewById(R.id.Button1);b2= findViewById(R.id.Button2);b3= findViewById(R.id.Button3);b4= findViewById(R.id.Button4);b5= findViewById(R.id.Button5);b6= findViewById(R.id.Button6);b7= findViewById(R.id.Button7);b8= findViewById(R.id.Button8);b9= findViewById(R.id.Button9);b10= findViewById(R.id.Button10);b11= findViewById(R.id.Button11);b12= findViewById(R.id.Button12);b13= findViewById(R.id.Button13);b14= findViewById(R.id.Button14);b15= findViewById(R.id.Button15);b16= findViewById(R.id.Button16);b17= findViewById(R.id.Button17);b18= findViewById(R.id.Button18);b19= findViewById(R.id.Button19);b20= findViewById(R.id.Button20);b21= findViewById(R.id.Button21);b22= findViewById(R.id.Button22);b23= findViewById(R.id.Button23);b24= findViewById(R.id.Button24);b25= findViewById(R.id.Button25);b26= findViewById(R.id.Button26);b27= findViewById(R.id.Button27);b28= findViewById(R.id.Button28);b29= findViewById(R.id.Button29);b30= findViewById(R.id.Button30);b31= findViewById(R.id.Button31);b32= findViewById(R.id.Button32);b33= findViewById(R.id.Button33);b34= findViewById(R.id.Button34);b35= findViewById(R.id.Button35);b36= findViewById(R.id.Button36);b37= findViewById(R.id.Button37);b38= findViewById(R.id.Button38);b39= findViewById(R.id.Button39);b40= findViewById(R.id.Button40);b41= findViewById(R.id.Button41);b42= findViewById(R.id.Button42);b43= findViewById(R.id.Button43);b44= findViewById(R.id.Button44);b45= findViewById(R.id.Button45);b46= findViewById(R.id.Button46);b47= findViewById(R.id.Button47);b48= findViewById(R.id.Button48);b49= findViewById(R.id.Button49);b50= findViewById(R.id.Button50);b51= findViewById(R.id.Button51);b52= findViewById(R.id.Button52);b53= findViewById(R.id.Button53);b54= findViewById(R.id.Button54);b55= findViewById(R.id.Button55);b56= findViewById(R.id.Button56);b57= findViewById(R.id.Button57);b58= findViewById(R.id.Button58);b59= findViewById(R.id.Button59);b60= findViewById(R.id.Button60);b61= findViewById(R.id.Button61);b62= findViewById(R.id.Button62);b63= findViewById(R.id.Button63);b64= findViewById(R.id.Button64);b65= findViewById(R.id.Button65);b66= findViewById(R.id.Button66);b67= findViewById(R.id.Button67);b68= findViewById(R.id.Button68);b69= findViewById(R.id.Button69);b70= findViewById(R.id.Button70);b71= findViewById(R.id.Button71);b72= findViewById(R.id.Button72);b73= findViewById(R.id.Button73);b74= findViewById(R.id.Button74);b75= findViewById(R.id.Button75);b76= findViewById(R.id.Button76);b77= findViewById(R.id.Button77);b78= findViewById(R.id.Button78);b79= findViewById(R.id.Button79);b80= findViewById(R.id.Button80);b81= findViewById(R.id.Button81);b82= findViewById(R.id.Button82);b83= findViewById(R.id.Button83);b84= findViewById(R.id.Button84);b85= findViewById(R.id.Button85);b86= findViewById(R.id.Button86);b87= findViewById(R.id.Button87);b88= findViewById(R.id.Button88);b89= findViewById(R.id.Button89);b90= findViewById(R.id.Button90);b91= findViewById(R.id.Button91);b92= findViewById(R.id.Button92);b93= findViewById(R.id.Button93);b94= findViewById(R.id.Button94);b95= findViewById(R.id.Button95);b96= findViewById(R.id.Button96);b97= findViewById(R.id.Button97);b98= findViewById(R.id.Button98);b99= findViewById(R.id.Button99);b100= findViewById(R.id.Button100);b101= findViewById(R.id.Button101);b102= findViewById(R.id.Button102);b103= findViewById(R.id.Button103);b104= findViewById(R.id.Button104);b105= findViewById(R.id.Button105);b106= findViewById(R.id.Button106);b107= findViewById(R.id.Button107);b108= findViewById(R.id.Button108);b109= findViewById(R.id.Button109);b110= findViewById(R.id.Button110);b111= findViewById(R.id.Button111);b112= findViewById(R.id.Button112);b113= findViewById(R.id.Button113);b114= findViewById(R.id.Button114);b115= findViewById(R.id.Button115);b116= findViewById(R.id.Button116);b117= findViewById(R.id.Button117);b118= findViewById(R.id.Button118);b119= findViewById(R.id.Button119);b120= findViewById(R.id.Button120);b121= findViewById(R.id.Button121);b122= findViewById(R.id.Button122);b123= findViewById(R.id.Button123);b124= findViewById(R.id.Button124);b125= findViewById(R.id.Button125);b126= findViewById(R.id.Button126);b127= findViewById(R.id.Button127);b128= findViewById(R.id.Button128);b129= findViewById(R.id.Button129);b130= findViewById(R.id.Button130);b131= findViewById(R.id.Button131);b132= findViewById(R.id.Button132);b133= findViewById(R.id.Button133);b134= findViewById(R.id.Button134);b135= findViewById(R.id.Button135);b136= findViewById(R.id.Button136);b137= findViewById(R.id.Button137);b138= findViewById(R.id.Button138);b139= findViewById(R.id.Button139);b140= findViewById(R.id.Button140);b141= findViewById(R.id.Button141);b142= findViewById(R.id.Button142);b143= findViewById(R.id.Button143);b144= findViewById(R.id.Button144);b145= findViewById(R.id.Button145);b146= findViewById(R.id.Button146);b147= findViewById(R.id.Button147);b148= findViewById(R.id.Button148);b149= findViewById(R.id.Button149);b150= findViewById(R.id.Button150);b151= findViewById(R.id.Button151);b152= findViewById(R.id.Button152);b153= findViewById(R.id.Button153);b154= findViewById(R.id.Button154);b155= findViewById(R.id.Button155);b156= findViewById(R.id.Button156);b157= findViewById(R.id.Button157);b158= findViewById(R.id.Button158);b159= findViewById(R.id.Button159);b160= findViewById(R.id.Button160);b161= findViewById(R.id.Button161);b162= findViewById(R.id.Button162);b163= findViewById(R.id.Button163);b164= findViewById(R.id.Button164);b165= findViewById(R.id.Button165);b166= findViewById(R.id.Button166);b167= findViewById(R.id.Button167);b168= findViewById(R.id.Button168);b169= findViewById(R.id.Button169);b170= findViewById(R.id.Button170);b171= findViewById(R.id.Button171);b172= findViewById(R.id.Button172);b173= findViewById(R.id.Button173);b174= findViewById(R.id.Button174);b175= findViewById(R.id.Button175);b176= findViewById(R.id.Button176);b177= findViewById(R.id.Button177);b178= findViewById(R.id.Button178);b179= findViewById(R.id.Button179);b180= findViewById(R.id.Button180);b181= findViewById(R.id.Button181);b182= findViewById(R.id.Button182);b183= findViewById(R.id.Button183);b184= findViewById(R.id.Button184);b185= findViewById(R.id.Button185);b186= findViewById(R.id.Button186);b187= findViewById(R.id.Button187);b188= findViewById(R.id.Button188);b189= findViewById(R.id.Button189);b190= findViewById(R.id.Button190);b191= findViewById(R.id.Button191);b192= findViewById(R.id.Button192);b193= findViewById(R.id.Button193);b194= findViewById(R.id.Button194);b195= findViewById(R.id.Button195);b196= findViewById(R.id.Button196);b197= findViewById(R.id.Button197);b198= findViewById(R.id.Button198);b199= findViewById(R.id.Button199);

		myTable.addAllButtons();
		for (int i = 0; i < 200; i++){
			//Log.d("table", "button ID: " + myTable.getIndex(i));
			buttonList[i] = findViewById(buttonIDList[i]);
		}


		startButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startThread(v);
			}
		});

		stopButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				stopThread(v);
			}
		});

    }

//--------------------------------------------------------
	public String checkDistance(int index){
    	// check 1... same hole
    	if (index == gopherIndex) {
    		return "Success";
		}
    	// check 2... 2 holes away
		else if ((index-1 == gopherIndex) || (index+1 == gopherIndex) ||
				(index-10 == gopherIndex) || (index+10 == gopherIndex )||
				(index-11 == gopherIndex) || (index+11 == gopherIndex) ||
				(index-9 == gopherIndex) || (index+9 == gopherIndex)) {
			return "Close Guess";
		}
		// check 3... 8 holes away
		else if ((index-8 == gopherIndex) || (index+8 == gopherIndex) ||
				(index-18 == gopherIndex) || (index+18 == gopherIndex )||
				(index-19 == gopherIndex) || (index+19 == gopherIndex) ||
				(index-17 == gopherIndex) || (index+17 == gopherIndex)) {
			return "Near Miss";
		}
		else {
			return "Complete Miss";
		}
	}

//--------------------------------------------------------

	// start game thread
	public void startThread(View view) {
		stopThread = false;
		WorkerRunnable runnable = new WorkerRunnable(100);
		new Thread(runnable).start();

		WorkerRunnable2 runnable2 = new WorkerRunnable2(100);
		new Thread(runnable2).start();

		looperThread.start();
	}

//--------------------------------------------------------

	// stop game thread
	public void stopThread(View view){
		stopThread = true;
		alive.set(false);

		looperThread.looper.quit();
	}

//--------------------------------------------------------
	// this is task executed by first worker thread
	public void taskA(int counter, int newGuess){
		//Message msg = Message.obtain(mHandler.obtainMessage());
		Log.d("MyHandler", "Call task A");

		Message msg = mHandler.obtainMessage(HandlerThreadActivity.TASK_A) ;

		msg.what = TASK_A;
		msg.arg1 = newGuess;

		mHandler.sendMessage(msg);

	}
//--------------------------------------------------------

	// this is the task executed by seconds worker thread
	public void taskB(int counter, int newGuess){
		Log.d("MyHandler", "Call task B");

		Message msg = mHandler.obtainMessage(HandlerThreadActivity.TASK_B) ;

		msg.what = TASK_B;
		msg.arg1 = newGuess;

		mHandler.sendMessage(msg);
	}
//--------------------------------------------------------

    // This code runs in background thread in parallel with UI thread
    public class WorkerRunnable implements Runnable  {

		int seconds;
		int counter = 1;
		int random = 0;

		// test for set amount of seconds
		WorkerRunnable(int seconds) {
			this.seconds = seconds;
		}

		public void run() {
			int i = 0;
			while (alive.get()) {
				i++;
				// kills thread
				if (stopThread)
					return;

				// assign random val here
				mHandler.post(new Runnable() {
					@Override
					public void run() {
						random = rand.nextInt(100);
						//tempButton = findViewById(buttonIDList.get(random));
						taskA(counter, random);
						counter++;
					}
				});


				Log.d("GameActivity", "startThreadA: " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			} // end of while loop
		} // end of run
	} // end of worker runnable class

// ----------------------------------------------------------------------------

	public class WorkerRunnable2 implements Runnable  {

		int seconds;
		int counter = 1;
		int random = 0;

		// test for set amount of seconds
		WorkerRunnable2(int seconds) {
			this.seconds = seconds;
		}

		public void run() {
			int i = 0;
			while (alive.get()) {
				i++;
				// kills thread
				if (stopThread)
					return;

				// assign random val here
				mHandler.post(new Runnable() {
					@Override
					public void run() {
						random = rand.nextInt(100);
						//tempButton = findViewById(buttonIDList.get(random));
						taskB(counter, random);
						counter++;
					}
				});


				Log.d("GameActivity", "startThreadB: " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			} // end of while loop
		} // end of run
	} // end of worker runnable class


	public class LooperThread extends Thread {


		public Looper looper;
		public Handler handler;

		@Override
		public void run(){
			Looper.prepare();

			looper = Looper.myLooper();

			handler = new Handler();

			Looper.loop();

			Log.d("LooperThread", "End of run()");
		}
	}

} // end of HandlerThreadActivity class


