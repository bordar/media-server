package com.kaltura.media.quality.event;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;



import com.kaltura.media.quality.event.IListener;

public class EventTrigger {
	private static Map<Class<? extends IListener>, Set<? extends IListener>> listeners = new ConcurrentHashMap<Class<? extends IListener>, Set<? extends IListener>>();

	@SuppressWarnings("unchecked")
	public <T extends IListener> void addListener(Class<T> clazz, T listener) {
		Set<T> set;
		if(!listeners.containsKey(clazz)){
			set = new ConcurrentSkipListSet<T>();
			listeners.put(clazz, set);
		}
		else{
			set = (Set<T>) listeners.get(clazz);
		}
		set.add(listener);
	}

	public <T extends IListener> void removeListener(Class<T> clazz, IListener listener) {
		if(listeners.containsKey(clazz)){
			@SuppressWarnings("unchecked")
			Set<T> set = (Set<T>) listeners.get(clazz);
			if(set.contains(listener)){
				set.remove(listener);
			}
		}
	}

	@SuppressWarnings("unchecked")
	protected <T extends IListener> Set<T> getListeners(Class<T> clazz) {
		if(listeners.containsKey(clazz)){
			return (Set<T>) listeners.get(clazz);
		}
		
		return new ConcurrentSkipListSet<T>();
	}
}