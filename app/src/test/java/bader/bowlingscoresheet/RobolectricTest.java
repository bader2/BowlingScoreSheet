package bader.bowlingscoresheet;

import android.content.Intent;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import static org.robolectric.Shadows.shadowOf;

@RunWith(RobolectricTestRunner.class)
@Config(
        constants = BuildConfig.class,
        sdk = 24
)

public class RobolectricTest {
    //RepoListView view;

    @Before
    public void before() {
        // This method is run before each test.
        //LayoutInflater inflater = LayoutInflater.from(RuntimeEnvironment.application);
        //view = inflater.inflate(R.layout.inflatable_activity_main.class);

        // Set up mocks here. Remember that you want to test ONLY RepoListView
        // functionality here, not any dependency code. You might do something
        // like:
        //view.adapter = mock(MyAdapter.class);
        // etc
    }

    @Test
    public void updateViewState_correctForLoaded() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        activity.findViewById(R.id.my_recycler_view).performClick();

        Intent expectedIntent = new Intent(activity, MainActivity.class);
        assertEquals(shadowOf(activity).getNextStartedActivity(), expectedIntent);
    }

    @Test
    public void updateViewState_correctForLoading() {

    }

    @Test
    public void updateViewState_correctForError() {

    }

    @Test
    public void updateViewState_correctForEmpty() {

    }
}
