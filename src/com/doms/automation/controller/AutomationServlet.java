package com.doms.automation.controller;
//test commit from eclipse
import java.io.*;
import java.util.Map;

import javax.servlet.*;
import javax.servlet.http.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

import com.doms.automation.helper.impl.LoadExcelHelperImpl;
import com.doms.automation.utils.ApplicationException;
import com.doms.automation.utils.HockDOMSApplicationUtils;
import com.doms.automation.utils.HockDOMSConstants;
import com.doms.automation.utils.HockDOMSLogger;

public class AutomationServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
		 BasicConfigurator.configure();
    	try{
    		System.setProperty("user.dir", HockDOMSConstants.PATH);
    		initLogProperties();
        	String[] selectedTestCases = request.getParameterValues("testCase");
        	String environment = request.getParameter("environment");
        	
        	TestExecuteProcessor processor = new TestExecuteProcessor(environment);
        	HockDOMSLogger.writeLog("NIKEDOMS_LOGGER_NAME",
					"AutomationServlet", HockDOMSLogger.LEVEL_INFO, "doGet",
					"Started running the test cases");
        	String responseData = processor.runTestCase(selectedTestCases, environment);
        	
        	response.setContentType( "text/html" );
            PrintWriter out = response.getWriter();
            out.println( responseData );
            out.close();
    	}catch(Exception e){
    		e.printStackTrace();
    		HockDOMSLogger.writeLog("NIKEDOMS_LOGGER_NAME",
					"AutomationServlet", HockDOMSLogger.LEVEL_ERROR, "main",
					"Exception in Application:" + e.getMessage());
    	}       
    }
	
	
	private void initLogProperties() throws ApplicationException {

        try {
        	String logFileName = "";
            final String methodName = "initLogProperties";
            //NikeDOMSApplicationUtils applicationUtils = new NikeDOMSApplicationUtils(); 
            BasicConfigurator.configure();
            String logXmlPath = System.getProperty("user.dir")+File.separator+"resources"+File.separator+"properties"+File.separator+"log4j.xml";          


            DOMConfigurator.configure(logXmlPath);       
           
        } catch (Exception e) {
            e.printStackTrace();
            throw new ApplicationException(e.getMessage());
        }
    }
}