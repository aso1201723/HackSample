package st.ac.jp.hacksample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class ListActivity extends Activity implements OnClickListener{

	TextView txt1,txt2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list_layout);
	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();

		TextView txt1 = (TextView)findViewById(R.id.textView1);
		txt1.setOnClickListener(this);
		//txt1.setVisibility(View.GONE);

		TextView txt2 = (TextView)findViewById(R.id.textView2);
		txt2.setOnClickListener(this);
		txt2.setVisibility(View.GONE);

	}

	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ
		switch(v.getId()){
		case R.id.textView1:
			txt1.setVisibility(View.GONE);
			txt2.setVisibility(View.VISIBLE);
			break;
		case R.id.textView2:
			txt1.setVisibility(View.VISIBLE);
			txt2.setVisibility(View.GONE);
		}
	}

}
