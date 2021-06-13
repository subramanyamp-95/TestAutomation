package com.sgtesting.testscript;

public class ExecuteAutoITScript1 {

	public static void main(String[] args) {
		executeAutoITScript();
	}
	
	static void executeAutoITScript()
	{
		try
		{
			Runtime.getRuntime().exec("E:/AutoIT/Testscript1.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
