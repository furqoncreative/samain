package com.furqoncreative.samain.events;

import com.furqoncreative.samain.events.engine.FlipDownCardsEvent;
import com.furqoncreative.samain.events.engine.GameWonEvent;
import com.furqoncreative.samain.events.engine.HidePairCardsEvent;
import com.furqoncreative.samain.events.ui.BackGameEvent;
import com.furqoncreative.samain.events.ui.DifficultySelectedEvent;
import com.furqoncreative.samain.events.ui.FlipCardEvent;
import com.furqoncreative.samain.events.ui.NextGameEvent;
import com.furqoncreative.samain.events.ui.ResetBackgroundEvent;
import com.furqoncreative.samain.events.ui.StartEvent;
import com.furqoncreative.samain.events.ui.ThemeSelectedEvent;


public interface EventObserver {

	void onEvent(FlipCardEvent event);

	void onEvent(DifficultySelectedEvent event);

	void onEvent(HidePairCardsEvent event);

	void onEvent(FlipDownCardsEvent event);

	void onEvent(StartEvent event);

	void onEvent(ThemeSelectedEvent event);

	void onEvent(GameWonEvent event);

	void onEvent(BackGameEvent event);

	void onEvent(NextGameEvent event);

	void onEvent(ResetBackgroundEvent event);

}
