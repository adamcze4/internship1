package org.internship;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StreamTest {

    @Test
    void shouldReturnNamesOfPeopleBornAfter1994() {
        List<String> names = Containers.filterDate(nameToBirthday());

        assertTrue(names.containsAll(Arrays.asList(
            "John", "Susan", "Mike"
        )));
    }

    @Test
    void shouldReturnDatesForPeopleWithNameLongerThan4Letters() {
        List<LocalDate> dates = Containers.filterName(nameToBirthday());

        assertTrue(dates.containsAll(Arrays.asList(
            LocalDate.of(1999, 04, 15),
            LocalDate.of(1989, 01, 21)
        )));
    }

    private Map<String, LocalDate> nameToBirthday() {
        return new HashMap() {{
            put("Susan", LocalDate.of(1999, 04, 15));
            put("John", LocalDate.of(1995, 07, 11));
            put("Clara", LocalDate.of(1989, 01, 21));
            put("Mike", LocalDate.of(2003, 01, 21));
        }};
    }
}