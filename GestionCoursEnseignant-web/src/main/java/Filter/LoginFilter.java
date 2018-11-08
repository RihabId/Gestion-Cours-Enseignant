//package Filter;
//
//import java.io.IOException;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import beans.Loginbean;
//import entities.UserType;
//
//@WebFilter("/pages/*")
//public class LoginFilter implements Filter{
//
//	@Override
//	public void init(FilterConfig filterConfig) throws ServletException {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//			throws IOException, ServletException {
//		// TODO Auto-generated method stub
//		HttpServletRequest servletRequest = (HttpServletRequest) request;
//		HttpServletResponse servletResponse = (HttpServletResponse) response;
//		
//		Loginbean logbean = (Loginbean) servletRequest.getSession().getAttribute("loginBean");
//		
//		if(logbean != null && (logbean.getE().getUsertyp()==UserType.agent ||  logbean.getE().getUsertyp()==UserType.student  || logbean.getE().getUsertyp()==UserType.teacher)){
//			
//			chain.doFilter(servletRequest, servletResponse);
//		
//		} else {
//			servletResponse.sendRedirect(servletRequest.getContextPath() + "/login.jsf");
//			
//		}
//	}
//
//	@Override
//	public void destroy() {
//		// TODO Auto-generated method stub
//		
//	}
//
//}
