package com.owen.zookeeper.watcher;

import org.apache.zookeeper.WatchedEvent;

/**
 * 
 * @author OwenWilliam
 *
 */
public interface Watcher {
	void process(WatchedEvent event);
}