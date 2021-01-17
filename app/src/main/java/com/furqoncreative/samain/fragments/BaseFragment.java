package com.furqoncreative.samain.fragments;

import android.support.v4.app.Fragment;

import com.furqoncreative.samain.events.EventObserver;
import com.furqoncreative.samain.events.engine.FlipDownCardsEvent;
import com.furqoncreative.samain.events.engine.GameWonEvent;
import com.furqoncreative.samain.events.engine.HidePairCardsEvent;
import com.furqoncreative.samain.events.ui.BackGameEvent;
import com.furqoncreative.samain.events.ui.FlipCardEvent;
import com.furqoncreative.samain.events.ui.NextGameEvent;
import com.furqoncreative.samain.events.ui.ResetBackgroundEvent;
import com.furqoncreative.samain.events.ui.ThemeSelectedEvent;
import com.furqoncreative.samain.events.ui.DifficultySelectedEvent;
import com.furqoncreative.samain.events.ui.StartEvent;

public class BaseFragment extends Fragment implements EventObserver {

	@Override
	public void onEvent(FlipCardEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(DifficultySelectedEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(HidePairCardsEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(FlipDownCardsEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(StartEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(ThemeSelectedEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(GameWonEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(BackGameEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(NextGameEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(ResetBackgroundEvent event) {
		throw new UnsupportedOperationException();
	}

}
