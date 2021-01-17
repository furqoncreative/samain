package com.furqoncreative.samain.events.ui;

import com.furqoncreative.samain.events.AbstractEvent;
import com.furqoncreative.samain.events.EventObserver;
import com.furqoncreative.samain.themes.Theme;

public class ThemeSelectedEvent extends AbstractEvent {

	public static final String TYPE = ThemeSelectedEvent.class.getName();
	public final Theme theme;

	public ThemeSelectedEvent(Theme theme) {
		this.theme = theme;
	}

	@Override
	protected void fire(EventObserver eventObserver) {
		eventObserver.onEvent(this);
	}

	@Override
	public String getType() {
		return TYPE;
	}

}
