package org.thoughtcrime.securesms;
import android.app.Instrumentation;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import org.junit.Rule;
import org.junit.Test;

import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.IdlingResource;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.robolectric.RobolectricTestRunner;
import org.signal.glide.Log;
import org.thoughtcrime.securesms.recipients.Recipient;
import org.thoughtcrime.securesms.recipients.RecipientId;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

import static org.junit.Assert.assertNotNull;

@RunWith(PowerMockRunner.class)
@PrepareForTest({RecipientId.class, ViewGroup.class, Bundle.class})

public class MainNavigatorText {
    private final MainActivity activity = new MainActivity();

    MainNavigator mainNavigator = new MainNavigator(activity);

    @Mock
    RecipientId mockRecipientId;

    @Test
    public void testGet() {
    }

    @Test
    public void testOnCreate() {
    }

    @Test
    public void testOnBackPressed() {
        mainNavigator.onBackPressed();
    }

    @Test
    public void testGoToConversation() {
    }

    @Test
    public void testGoToAppSettings() {
    }

    @Test
    public void testGoToArchiveList() {
    }

    @Test
    public void testGoToGroupCreation() {
    }

    @Test
    public void testGoToInvite() {
    }

    @Test
    public void testGoToInsights() {
    }
    
}
