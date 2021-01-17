package com.furqoncreative.samain;

import android.app.Application;

import com.furqoncreative.samain.utils.FontLoader;

public class GameApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		FontLoader.loadFonts(this);

	}
}
