package ru.samsung.itschool.mdev.myapplication;


import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 *
 * Таким образом при инструментальном тестировании возникают следующие задачи:
 *
 * поиск элементов пользовательского интерфейса в приложении;
 *
 * проверка действий над элементами UI;
 *
 * проверка результатов действий над элементами пользовательского интерфейса.
 *
 * Для решения этих задач в Espresso есть три типа методов :
 *
 * ViewMatchers — позволяют найти объект в текущей иерархии представлений
 *
 * ViewAssertions — позволяют проверить состояние объекта и подтвердить, что состояние соответствует критериям
 *
 * ViewActions — эти методы позволяют выполнять различные действия с объектами.
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

}