/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.xiaonei.mirage.web.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.xiaonei.mirage.service.TestService;

/** 
 * MyEclipse Struts
 * Creation date: 12-26-2016
 * 
 * XDoclet definition:
 * @struts.action parameter="flag" validate="true"
 */

public class TestAction extends DispatchAction {
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	@Resource
	private TestService testService;
	public void setTestService(TestService testService) {
		this.testService = testService;
	}
	public ActionForward test(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		//WebApplicationContext ctx=WebApplicationContextUtils.getWebApplicationContext(this.getServlet().getServletContext());
		//TestService ts=(TestService) ctx.getBean("testService");
		
		List list = testService.showCountry();
		request.setAttribute("list", list);
		//System.out.print("hhg2");
		return mapping.findForward("show");
	}
}