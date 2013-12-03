package com.damageReport.endpoint;


import javax.xml.ws.Endpoint;
import com.damageReport.ws.DamageReportImpl;

 
//Endpoint publisher
public class DamageReportPublisher{
 
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:8080/ws/DamageReport", new DamageReportImpl());
    }
 
}
