/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.config.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author wramirez
 */
public class CORSFilter implements Filter {

    String AccessControlAllowOrigin = "*";

    /**
     * SimpleCORSFilter
     *
     * @param AccessControlAllowOrigin AccessControlAllowOrigin
     */
    public CORSFilter(String AccessControlAllowOrigin) {
        if (AccessControlAllowOrigin != null) {
            this.AccessControlAllowOrigin = AccessControlAllowOrigin;
        }
    }

    /**
     * init
     *
     * @param filterConfig FilterConfig
     * @throws ServletException ServletException
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    /**
     * doFilter
     *
     * @param req ServletRequest
     * @param res ServletResponse
     * @param chain FilterChain
     * @throws IOException IOException
     * @throws ServletException ServletException
     */
    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) res;
        response.setHeader("Access-Control-Allow-Origin", this.AccessControlAllowOrigin);
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, user, authorization");
        chain.doFilter(req, res);
    }

    /**
     * destroy
     */
    @Override
    public void destroy() {
    }
}
