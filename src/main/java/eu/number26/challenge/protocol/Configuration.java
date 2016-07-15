package eu.number26.challenge.protocol;

import java.util.HashMap;
import java.util.Map;

import eu.number26.challenge.protocol.transaction.PutTransactionHandler;

public class Configuration {

	private static final Map<Link, ProtocolHandler> HANDLERS = new HashMap<Link, ProtocolHandler>();
	
	static {
		ProtocolHandler handler = new GetHandler();
		HANDLERS.put(handler.getLink(), handler);
		handler = new GetTransactionServiceHandler();
		HANDLERS.put(handler.getLink(), handler);
		handler = new PutTransactionHandler();
		HANDLERS.put(handler.getLink(), handler);
	}
	
	public static ProtocolHandler getHandler(Link link) {
		return HANDLERS.get(link);
	}
}