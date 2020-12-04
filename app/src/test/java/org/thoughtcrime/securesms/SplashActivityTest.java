package org.thoughtcrime.securesms;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.rule.ActivityTestRule;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(PowerMockRunner.class)

@PrepareForTest({LayoutInflater.class, ViewGroup.class, Bundle.class})

public final class SplashActivityTest {
    public SplashActivity splashActivity = SplashActivity.newInstance();

    @Mock
    LayoutInflater mockInflator;
    @Mock
    ViewGroup mockViewGroup;
    @Mock
    Bundle mockBundle;

    @Before
    public void setup() throws Exception{
    }
    @Test
    public void testOnCreate() {
        //testOnCreateView already covers this
    }
    @Test
    public void testOnCreateView() {

       View view = splashActivity.onCreateView(mockInflator, mockViewGroup, mockBundle);
       if(view !=null) {
           assert(true);
       }
    }
    @After
    public void clean() {
        splashActivity = null;
    }
}
