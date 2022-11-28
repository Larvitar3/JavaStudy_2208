package com.boot.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter  implements Filter{
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("필터 초기화");
		Filter.super.init(filterConfig);
	}
	
	// 보통 실제 동작을 구현하는 부분
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("필터 동작 1");
		request.setCharacterEncoding("UTF-8");
		System.out.println("웹 컨테이너 이전.");
		System.out.println("필터를 web.xml에 설정 후 req, res가 웹 컨테이너로 잘 넘어 오는지 확인.");
		chain.doFilter(request, response);
		System.out.println("필터 동작 2");
		response.setContentType("text/plain; charset=UTF-8");
	}
	
	// 필터 종료시
	@Override
	public void destroy() {
		System.out.println("필터 종료");
		Filter.super.destroy();
	}

}


















