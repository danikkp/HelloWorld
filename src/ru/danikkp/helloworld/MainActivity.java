package ru.danikkp.helloworld;

import android.os.Bundle;
import android.app.Activity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends Activity {

	public TextView tvInfo;
	public RelativeLayout relativeLay;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tvInfo=(TextView) findViewById(R.id.textView1);
		relativeLay=(RelativeLayout)findViewById(R.id.relativeLayout);
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void but_Click(View v)
	{
		switch(v.getId()) {
		case R.id.butRed:
			tvInfo.setText(R.string.Red);
			relativeLay.setBackgroundResource(R.color.redColor);
			break;
		case R.id.butYellow:
			tvInfo.setText(R.string.Yellow);
			relativeLay.setBackgroundResource(R.color.yellowColor);
			break;
		case R.id.butGreen:
			///tvInfo.setText(R.string.Green);
			///relativeLay.setBackgroundResource(R.color.greenColor);
			Intent intent=new Intent(MainActivity.this,AboutActivity.class);
			startActivity(intent);
			break;
		}


	}


	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId())
		{
		case R.id.action_set1:
			Toast toast1 = Toast.makeText(getApplicationContext(), "�� ������� ����! ���!" , Toast.LENGTH_SHORT);
			toast1.setGravity(Gravity.CENTER, 0, 0);
			toast1.show();
			tvInfo.setText("�� ������� ����!");
			return true;
		case R.id.action_set2:
			tvInfo.setText("�� ������� �����!");
			return true;
		case R.id.action_set3:
			tvInfo.setText("�� ������� ������!");
			return true;
		default:
			return super.onOptionsItemSelected(item);		
		}


	}


}
