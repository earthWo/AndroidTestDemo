package win.whitelife.androidtestdemo;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.AllOf.allOf;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {


    @Rule
    public ActivityTestRule<MainActivity>mActivityTestRule=new ActivityTestRule<>(MainActivity.class);

    @Test
    public void test() throws Exception {
        //测试输入
        onView(withId(R.id.tv_main)).perform(typeText("test input"));

//        //测试点击
//        onView(withId(R.id.bt_click)).perform(click());
        //判断是否在屏幕上，不在报错
        onView(withId(R.id.bt_click)).check(matches(isDisplayed()));
        onView(withText("按钮1")).check(matches(withId(R.id.bt_click)));

        //多种条件混合，如果找到的view被其他view覆盖，会点到其他的view上，点击的位置大概是view的中心点
        onView(allOf(withId(R.id.bt_click),withText("按钮1"))).perform(click());
        //添加取非
//        onView(allOf(withId(R.id.bt_click),not(withText("按钮3")))).perform(click());


    }

}
