package br.com.rodrigo.bean.filter;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rodrigo.model.Usuario;

public class LoginFilter implements Filter {
	
	
	//injecao de dependencia usando o @inject do cdi
	@Inject
	private Usuario usuario;

	@Override
	public void doFilter(ServletRequest servletReq, ServletResponse servletRes, FilterChain filterChain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) servletReq;
		HttpServletResponse res = (HttpServletResponse) servletRes;
		
		String url = req.getRequestURL().toString();
		System.out.println("filter to: "+url);
		if(url.contains("/restricted") && usuario.getEstudante() == null) {
			res.sendRedirect(req.getServletContext().getContextPath()+"/login.xhtml");
		} else {
			filterChain.doFilter(servletReq, servletRes);
		}
		
	}

}
