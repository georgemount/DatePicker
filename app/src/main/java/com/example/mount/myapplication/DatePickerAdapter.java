package com.example.mount.myapplication;

import android.databinding.BindingAdapter;
import android.widget.DatePicker;

public class DatePickerAdapter {
    @BindingAdapter({"android:year", "android:month", "android:day", "android:onDateChanged"})
    public static void setDate(DatePicker view, int year, int month, int day,
                               DatePicker.OnDateChangedListener listener) {
        view.init(year, month, day, listener);
    }

    @BindingAdapter({"android:year", "android:month", "android:day"})
    public static void setDate(DatePicker view, int year, int month, int day) {
        view.updateDate(year, month, day);
    }

    @BindingAdapter({"android:year", "android:month"})
    public static void setYearMonth(DatePicker view, int year, int month) {
        setDate(view, year, month, view.getDayOfMonth());
    }

    @BindingAdapter({"android:month", "android:day"})
    public static void setMonthDay(DatePicker view, int month, int day) {
        setDate(view, view.getYear(), month, day);
    }

    @BindingAdapter(value = {"android:year", "android:day", "android:onDateChanged"},
            requireAll = false)
    public static void setYearDay(DatePicker view, int year, int day,
                                   DatePicker.OnDateChangedListener listener) {
        setDate(view, year, view.getMonth(), day, listener);
    }

    @BindingAdapter({"android:year", "android:month", "android:onDateChanged"})
    public static void setYearMonth(DatePicker view, int year, int month,
                                    DatePicker.OnDateChangedListener listener) {
        setDate(view, year, month, view.getDayOfMonth(), listener);
    }

    @BindingAdapter({"android:month", "android:day", "android:onDateChanged"})
    public static void setMonthDay(DatePicker view, int month, int day,
                                   DatePicker.OnDateChangedListener listener) {
        setDate(view, view.getYear(), month, day, listener);
    }

}
