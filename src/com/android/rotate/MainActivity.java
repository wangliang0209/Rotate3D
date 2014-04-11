/**
 * 
 */
package com.android.rotate;

import com.android.rotate.apidemo.Transition3d;
import com.android.rotate.cubeview.CubeViewActivity;
import com.android.rotate.gridview.GridActivity;
import com.tekle.oss.android.animation.Flip3DViewTransitionActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 *
 *
 */
public class MainActivity extends Activity implements OnClickListener{

	private Button mButton_apidemo;
	private Button mButton_gridview;
	private Button mButton_cubeview;
	private Button mButton_flipview;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mButton_apidemo=(Button) this.findViewById(R.id.API_DEMO);
		mButton_gridview=(Button) this.findViewById(R.id.GridView_DEMO);
		mButton_cubeview=(Button) this.findViewById(R.id.CubeView_DEMO);
		mButton_flipview=(Button) this.findViewById(R.id.FlipView_DEMO);
		mButton_apidemo.setOnClickListener(this);
		mButton_gridview.setOnClickListener(this);
		mButton_cubeview.setOnClickListener(this);
		mButton_flipview.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		Intent intent;
		switch (v.getId()) {
		case R.id.API_DEMO:
			intent=new Intent(this,Transition3d.class);
			startActivity(intent);
			break;

		case R.id.GridView_DEMO:
			intent=new Intent(this,GridActivity.class);
			startActivity(intent);
			break;
			
		case R.id.CubeView_DEMO:
			intent=new Intent(this,CubeViewActivity.class);
			startActivity(intent);
			break;
		case R.id.FlipView_DEMO:
			intent=new Intent(this,Flip3DViewTransitionActivity.class);
			startActivity(intent);
			break;
		default:
			break;
		}
	}

	
}
