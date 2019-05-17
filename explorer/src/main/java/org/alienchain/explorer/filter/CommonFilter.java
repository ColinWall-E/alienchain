package org.alienchain.explorer.filter;

import org.alienchain.explorer.config.WebAppConfig;
import org.jooby.Request;
import org.jooby.Response;
import org.jooby.Route.Chain;
import org.jooby.Route.Filter;

public class CommonFilter implements Filter{



	@Override
	public void handle(Request req, Response rsp, Chain chain) throws Throwable {
		
		WebAppConfig config = req.require(WebAppConfig.class);
		
		req.set("seconfig", config.getSearchEngine());
		req.set("apiConfig", config.getApiConfig());
		
		chain.next(req, rsp);
		
	}
	
}
