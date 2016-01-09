package com.uiautomator.testcases;


import java.io.IOException;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class TestDemo1 extends UiAutomatorTestCase{
	public void testText() throws UiObjectNotFoundException{
		openToDoListAPP();
		//定位输入框
		UiObject usernameObject=new UiObject(new UiSelector().text("输入用户名"));
		//在输入框内输入hello word
		usernameObject.setText("hello word");
		//恢复为初始值
		usernameObject=new UiObject(new UiSelector().text("hello word"));
		//清空文本输入框
		usernameObject.clearTextField(); 
	}
	
	public void testTextStartsWith() throws UiObjectNotFoundException{
		openToDoListAPP();
		//定位输入框
		UiObject usernameObject=new UiObject(new UiSelector().textStartsWith("输入"));
		usernameObject.setText("hello man");
		usernameObject =new UiObject(new UiSelector().text("hello man"));
		usernameObject.clearTextField();
	}
	public void testStartsContains() throws UiObjectNotFoundException{
		openToDoListAPP();
		
		UiObject usernameObject=new UiObject(new UiSelector().textContains("用户"));
		
		usernameObject.setText("hello woman");
		
		usernameObject=new UiObject(new UiSelector().text("hello woman"));
		usernameObject.clearTextField();
		}
	

	private void openToDoListAPP(){
		// TODO Auto-generated method stub
		/*try {
			Runtime.getRuntime().exec("am start -n com.example.todolist/com.example.todolist.LoginActivity");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		try {
			Runtime.getRuntime().exec("am start -n com.example.todolist/com.example.todolist.LoginActivity");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
