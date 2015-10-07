package net.thucydides.core.matchers.dates;

import ch.lambdaj.function.convert.Converter;
import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;
import org.joda.time.DateTime;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import static ch.lambdaj.Lambda.convert;
import static ch.lambdaj.Lambda.join;

public class DateCollectionContainsSameDatesMatcher extends TypeSafeMatcher<Collection<Date>> {
    private final Collection<Date> expectedDates;

    public DateCollectionContainsSameDatesMatcher(final Collection<Date> expectedDates) {
        this.expectedDates = expectedDates;
    }

    @Override
    public boolean matchesSafely(Collection<Date> dates) {
        if (dates.size() != expectedDates.size()) {
            return false;
        }
        for (Date expectedDate : expectedDates) {
            if (!hasIdenticalDate(expectedDate, dates)) {
                return false;
            }
        }
        return true;
    }

    private boolean hasIdenticalDate(Date expectedDate, Collection<Date> dates) {
        for (Date date : dates) {
            if ((DateComparator.sameDate(date, expectedDate))) {
                return true;
            }
        }
        return false; 
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("a collection of dates containing ");
        List<String> dates = convert(expectedDates, toReadableForm());
        description.appendText("[" + join(dates) + "]");
    }

    private Converter<Date, String> toReadableForm() {
        return new Converter<Date, String>() {
            @Override
            public String convert(Date from) {
                return new DateTime(from).toString("d MMM yyyy HH:mm:ss", Locale.ENGLISH);
            }
        };
    }

}