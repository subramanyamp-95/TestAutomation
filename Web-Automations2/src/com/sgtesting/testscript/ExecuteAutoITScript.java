package com.sgtesting.testscript;

public class ExecuteAutoITScript {

	public static void main(String[] args) {
		executeAutoITScript();
	}
	
	static void executeAutoITScript()
	{
		try
		{
			Runtime.getRuntime().exec("E:/AutoIT/Testscript.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
