package com.uiautomator.testcases;

import java.io.IOException;






import android.os.RemoteException;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.core.UiWatcher;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class AipaiTestDemo extends UiAutomatorTestCase{
	
	public String jack="com.aipai.android:id/iv_player_tab01_fen";
//	public String back="com.aipai.android:id/rl_container";
//	public String fomn="";
	
	public void testTextUI() throws UiObjectNotFoundException{
	
		try {
			//启动爱拍APP
			Runtime.getRuntime().exec("am start -n com.aipai.android/com.aipai.android.activity.AipaiSplashActivity");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//点击进入搜索页面
		UiObject conuiObject=new UiObject(new UiSelector().resourceId("com.aipai.android:id/iv_search"));
		conuiObject.clickAndWaitForNewWindow();
		//在输入框内输入cf
		UiObject putObject=new UiObject(new UiSelector().resourceId("com.aipai.android:id/et_search"));
		putObject.setText("cf");
		//点击搜素按钮
		UiObject setObject=new UiObject(new UiSelector().resourceId("com.aipai.android:id/tv_search"));
		setObject.clickAndWaitForNewWindow();
		//返回上一级页面
		UiObject backObject=new UiObject(new UiSelector().resourceId("com.aipai.android:id/ibtn_back"));
		backObject.clickAndWaitForNewWindow();				
//		
//		try {
//			getUiDevice().sleep();
//		} catch (RemoteException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
	}
	public void videwTest() throws IOException, UiObjectNotFoundException{
		Runtime.getRuntime().exec("am start -n com.aipai.android/com.aipai.android.activity.AipaiSplashActivity");
		
		VoidDemo vd=new VoidDemo();
		vd.getObjectById("com.aipai.android:id/iv_video_pic").clickAndWaitForNewWindow();
		vd.getObjectById(jack).clickAndWaitForNewWindow();
//		UiObject fr=vd.getObjectById(back);
		switch (jack) {
		case "com.aipai.android:id/rl_container":
			vd.getObjectById("com.aipai.android:id/ibtn_cancel").clickAndWaitForNewWindow();
			break;

		case "android.widget.RelativeLayout":
			vd.getObjectById("com.aipai.android:id/btn_left").clickAndWaitForNewWindow();
			break;
		}
		
		
		
		
//		
//		UiObject con=new UiObject(new UiSelector().resourceId("com.aipai.android:id/ibtn_cancel"));
//		
//		UiObject fomn=new UiObject(new UiSelector().className("android.widget.RelativeLayout"));
		
		
	}
	
	

}
