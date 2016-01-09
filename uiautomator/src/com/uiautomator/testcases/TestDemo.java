package com.uiautomator.testcases;

import java.io.IOException;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class TestDemo extends UiAutomatorTestCase{
		
	public void testResroucIdUseage() throws UiObjectNotFoundException	{
			getUiDevice().pressHome();
			UiObject app=new UiObject(new UiSelector().description("Apps"));
			
			app.clickAndWaitForNewWindow();
			
			UiScrollable appView=new UiScrollable(new UiSelector().scrollable(true));	
			appView.setAsHorizontalList();
			
			
				try {
					Runtime.getRuntime().exec("am start -n com.example.todolist/com.example.todolist.LoginActivity");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
			UiObject toDoLitApp=appView.getChildByText(new UiSelector().className("android.widget.TextView"), "ToDoList");
			toDoLitApp.clickAndWaitForNewWindow();
			
			UiObject usernameObject=new UiObject(new UiSelector().resourceId("com.example.todolist:id/nameET"));
			usernameObject.setText("cndcskjce");
	}
		
}
