package com.me.java.framework.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 过滤器
 * @author John
 * 2015-4-2上午10:25:32
 */
public class LocalWebContextFilter implements Filter {

	public void destroy() {}

	public void doFilter(ServletRequest request, ServletResponse response,FilterChain chain) throws IOException, ServletException {
		LocalWebContextHolder.setAttributes((HttpServletRequest)request, (HttpServletResponse)response);
		
		chain.doFilter(request, response);
	}

	public void init(FilterConfig config) throws ServletException {}

}
