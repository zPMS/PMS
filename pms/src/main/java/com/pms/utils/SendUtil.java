package com.pms.utils;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;

import com.pms.modal.ReturnLoginCode;

import java.io.IOException;

import org.apache.commons.httpclient.Header;
public class SendUtil {

	public SendUtil() {
		// TODO 自动生成的构造函数存根
	}
	 
public void sendMess(String userTel,int random,ReturnLoginCode login) throws HttpException, IOException
{
	String message="【众里寻车】尊敬的用户：您的校验码为："+random+",工作人员不会索取，请勿泄露。";
	HttpClient client = new HttpClient();
	PostMethod post = new PostMethod("http://utf8.api.smschinese.cn"); 
	post.addRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=utf8");//在头文件中设置转码
	NameValuePair[] data ={ new NameValuePair("Uid", "众里寻车"),new NameValuePair("Key", "d41d8cd98f00b204e980"),new NameValuePair("smsMob",userTel),new NameValuePair("smsText",message)};
	post.setRequestBody(data);
	client.executeMethod(post);
	Header[] headers = post.getResponseHeaders();
	int statusCode = post.getStatusCode();
	System.out.println("statusCode:"+statusCode);
	for(Header h : headers)
	{
	System.out.println(h.toString());
	}
	String result = new String(post.getResponseBodyAsString().getBytes("utf8")); 
	login.setCode(statusCode);
	login.setMessage(result);
	login.setMsgCode(random);
	System.out.println(result); //打印返回消息状态
	post.releaseConnection();

}
}
