package com.ryanch741.logger;

interface ILogService {
	boolean path(in String path,in String prefix);
	boolean append(in String line);
	boolean flush();
	boolean clear(in int beforeDay);
}