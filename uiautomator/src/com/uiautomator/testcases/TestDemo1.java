package com.uiautomator.testcases;


import java.io.IOException;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class TestDemo1 extends UiAutomatorTestCase{
	public void testText() throws UiObjectNotFoundException{
		openToDoListAPP();
		//��λ�����
		UiObject usernameObject=new UiObject(new UiSelector().text("�����û���"));
		//�������������hello word
		usernameObject.setText("hello word");
		//�ָ�Ϊ��ʼֵ
		usernameObject=new UiObject(new UiSelector().text("hello word"));
		//����ı������
		usernameObject.clearTextField(); 
	}
	
	public void testTextStartsWith() throws UiObjectNotFoundException{
		openToDoListAPP();
		//��λ�����
		UiObject usernameObject=new UiObject(new UiSelector().textStartsWith("����"));
		usernameObject.setText("hello man");
		usernameObject =new UiObject(new UiSelector().text("hello man"));
		usernameObject.clearTextField();
	}
	public void testStartsContains() throws UiObjectNotFoundException{
		openToDoListAPP();
		
		UiObject usernameObject=new UiObject(new UiSelector().textContains("�û�"));
		
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
