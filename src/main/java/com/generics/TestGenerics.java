package com.generics;

import java.util.ArrayList;

public class TestGenerics {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		
		list.add("Satish");
		list.add("Ravi");
		list.add(10);		
		
		String key = (String) list.get(0);
		int i = (Integer) list.get(2);
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("Satish");
		list1.add("Ravi");
		
    	ArrayList<Integer> list2 = new ArrayList<Integer>();
		
    	list2.add(10);
    	list2.add(14);
		//list1.add(10);
		
		String gen = list1.get(0);
		
		//  class ArrayList <T>{
		
	/*	Test<String> testString = new Test<String>("Ravi");
		testString.show();*/
		
		Test<Integer> testInteger = new Test<Integer>(12);
		testInteger.show();
		
		TestGenerics obj = new TestGenerics();
		obj.verify(list2);
		
		list1.forEach(abc -> System.out.println(abc));
		
		String s = "{\"related\":[{\"title\":\"Acidentes e lesões da primeira semana das Olimpíadas\",\"thumbnail\":\"professional_assets/medscape/images/thumbnail_library/6500442-thumb.jpg\",\"contentType\":\"article\",\"contentId\":\"6500442\",\"contentUrlFromDB\":null,\"widgetType\":\"related\",\"postedDate\":\"2016-08-15\",\"authorByine\":null,\"pubName\":\"Medscape Notícias Médicas\",\"siteOn\":650010},{\"title\":\"Lesões esportivas: o alto preço da performance\",\"thumbnail\":\"professional_assets/medscape/images/thumbnail_library/65000022-thumb.jpg\",\"contentType\":\"other_page\",\"contentId\":\"65000022\",\"contentUrlFromDB\":\"/features/slides/65000022\",\"widgetType\":\"related\",\"postedDate\":\"2016-08-12\",\"authorByine\":null,\"pubName\":\"Medscape Notícias Médicas\",\"siteOn\":650010}]}" ;
		
		RelatedLinksResponse str =  new RelatedLinksResponse(s);
		System.out.println(str);
		
	}
	
	void verify(ArrayList<? extends Number> al){
		
	/*	al.add("one");
		al.add("Two");*/
		//al.set(0, "Mahesh");
	//	al.add(15);
		al.add(null);
		
	}

}


class RelatedLinksResponse {
	
	private String status = "success";
	private String responseBody;
	
	public RelatedLinksResponse(String responseBody) {
		this.responseBody = responseBody;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getResponseBody() {
		return responseBody;
	}
	public void setResponseBody(String responseBody) {
		this.responseBody = responseBody;
	}
	
	@Override
	public String toString() {
		StringBuffer buff = new StringBuffer();
		buff.append("status : " + getStatus() + ",");
		buff.append("responseBody : " + getResponseBody());
		return "{\"status\":\"success\",\"responseBody\":"+getResponseBody()+"}";
	}
}

class Test<T extends Number>{
  
 private T obj ;
 
      Test(T obj){
    	  this.obj = obj;
      }
      
      void show(){
    	  System.out.println("class Name "+ obj.getClass().getName());
      }
      
        <T> Integer  get(){
    	  return 56;
      }
        
        <T extends Number> Integer test(){
        	return 55;
        }
      
      

}
