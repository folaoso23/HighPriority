package com.randomtech.highpriority;


import android.os.AsyncTask;
import android.widget.TextView;


public class FetchTaskInfo extends AsyncTask<String, Void, String>{

	TextView outTxt;
	public FetchTaskInfo(TextView outputTxt){
		super();
		outTxt = outputTxt;
	}


	/*@Override
    protected String doInBackground(FetchTaskInfo) {
       
    }*/

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
        outTxt.setText(result);
        
    }


	@Override
	protected String doInBackground(String... arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}