// © 2016 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html#License
/*
 *******************************************************************************
 * Copyright (C) 1996-2014, International Business Machines Corporation and    *
 * others. All Rights Reserved.                                                *
 *******************************************************************************
 */

package com.ibm.icu.util;

import java.util.Date;

/**
 * <b>Note:</b> The Holiday framework is a technology preview.
 * Despite its age, is still draft API, and clients should treat it as such.
 *
 * A Holiday subclass which represents holidays that occur
 * a fixed number of days before or after Easter.  Supports both the
 * Western and Orthodox methods for calculating Easter.
 * @draft ICU 2.8 (retainAll)
 * @provisional This API might change or be removed in a future release.
 */
public class EasterHoliday extends Holiday
{
    /**
     * Construct a holiday that falls on Easter Sunday every year
     *
     * @param name The name of the holiday
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    public EasterHoliday(String name)
    {
        super(name, new EasterRule(0, false));
    }

    /**
     * Construct a holiday that falls a specified number of days before
     * or after Easter Sunday each year.
     *
     * @param daysAfter The number of days before (-) or after (+) Easter
     * @param name      The name of the holiday
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    public EasterHoliday(int daysAfter, String name)
    {
        super(name, new EasterRule(daysAfter, false));
    }

    /**
     * Construct a holiday that falls a specified number of days before
     * or after Easter Sunday each year, using either the Western
     * or Orthodox calendar.
     *
     * @param daysAfter The number of days before (-) or after (+) Easter
     * @param orthodox  Use the Orthodox Computus?
     * @param name      The name of the holiday
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    public EasterHoliday(int daysAfter, boolean orthodox, String name)
    {
        super(name, new EasterRule(daysAfter, orthodox));
    }

    /**
     * Septuagesima Sunday, literally 70 days but actually 9 weeks before Easter
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    static public final EasterHoliday SEPTUAGESIMA_SUNDAY  = new EasterHoliday(-63,    "Septuagesima");

    /**
     * Sexagesima Sunday, literally 60 days but actually 8 weeks before Easter
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    static public final EasterHoliday SEXAGESIMA_SUNDAY    = new EasterHoliday(-56,    "Sexagesima");

    /**
     * Shrove or Fat Thursday (Carnival start), 52 days before Easter
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    static public final EasterHoliday SHROVE_THURSDAY      = new EasterHoliday(-52,    "Shrove Thursday");

    /**
     * Quinquagesima or Shrove Sunday, aka Estomihi, literally 50 days but actually 7 weeks before Easter
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    static public final EasterHoliday QUINQUAGESIMA_SUNDAY = new EasterHoliday(-49,    "Quinquagesima");

    /**
     * Rose or Shrove Monday, 49 days before Easter
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    static public final EasterHoliday SHROVE_MONDAY        = new EasterHoliday(-48,    "Rose Monday");

    /**
     * Shrove Tuesday, aka Mardi Gras, Carnival or Pancake Day, 48 days before Easter
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    static public final EasterHoliday SHROVE_TUESDAY       = new EasterHoliday(-47,    "Shrove Tuesday");

    /**
     * Ash Wednesday, start of Lent, 47 days before Easter
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    static public final EasterHoliday ASH_WEDNESDAY        = new EasterHoliday(-46,    "Ash Wednesday");

    /**
     * Invocabit Sunday, 6 weeks before Easter
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    static public final EasterHoliday INVOCABIT_SUNDAY     = new EasterHoliday(-42,    "Invocabit");

    /**
     * Reminiscere Sunday, 5 weeks before Easter
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    static public final EasterHoliday REMINISCERE_SUNDAY   = new EasterHoliday(-35,    "Reminiscere");

    /**
     * Oculi Sunday, 28 days before Easter
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    static public final EasterHoliday OCULI_SUNDAY         = new EasterHoliday(-28,    "Oculi");

    /**
     * Motering Sunday, 3 weeks before Easter
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    static public final EasterHoliday MOTHERING_SUNDAY     = new EasterHoliday(-21,    "Mothering Sunday");

    /**
     * Passion or Laetare Sunday, aka Christian Passa, 2 weeks before Easter
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    static public final EasterHoliday PASSION_SUNDAY       = new EasterHoliday(-14,    "Passion Sunday");

    /**
     * Palm Sunday, 1 week before Easter
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    static public final EasterHoliday PALM_SUNDAY          = new EasterHoliday( -7,    "Palm Sunday");

    /**
     * Holy Monday, 6 days before Easter
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    static public final EasterHoliday HOLY_MONDAY          = new EasterHoliday( -6,    "Holy Monday");

    /**
     * Holy Tuesday, 5 days before Easter
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    static public final EasterHoliday HOLY_TUESDAY         = new EasterHoliday( -5,    "Holy Tuesday");

    /**
     * Holy or Spy Wednesday, 4 days before Easter
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    static public final EasterHoliday HOLY_WEDNESDAY       = new EasterHoliday( -4,    "Holy Wednesday");

    /**
     * Maundy Thursday, aka Last Supper, 3 days before Easter
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    static public final EasterHoliday MAUNDY_THURSDAY      = new EasterHoliday( -3,    "Maundy Thursday");

    /**
     * Good Friday, aka Crucifixion, 2 days before Easter
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    static public final EasterHoliday GOOD_FRIDAY          = new EasterHoliday( -2,    "Good Friday");

    /**
     * Holy Saturday, 1 day before Easter
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    static public final EasterHoliday HOLY_SATURDAY        = new EasterHoliday( -1,    "Holy Saturday");

    /**
     * Easter Sunday, aka Resurrection
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    static public final EasterHoliday EASTER_SUNDAY        = new EasterHoliday(  0,    "Easter Sunday");

    /**
     * Easter Monday, 1 day after Easter
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    static public final EasterHoliday EASTER_MONDAY        = new EasterHoliday(  1,    "Easter Monday");

    /**
     * Divine Mercy Sunday, 1 week after Easter
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    static public final EasterHoliday DIVINE_MERCY_SUNDAY  = new EasterHoliday(  7,    "Divine Mercy");

    /**
     * Misericordias Domini Sunday, 2 weeks after Easter
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    static public final EasterHoliday MISERICORDIAS_SUNDAY = new EasterHoliday( 14,    "Misericordias Domini");

    /**
     * Jubilate Sunday, 3 weeks after Easter
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    static public final EasterHoliday JUBILATE_SUNDAY      = new EasterHoliday( 21,    "Jubilate");

    /**
     * Cantate Sunday, 4 weeks after Easter
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    static public final EasterHoliday CANTATE_SUNDAY       = new EasterHoliday( 28,    "Cantate");

    /**
     * Vocem Jucunditatis Sunday, 5 weeks after Easter
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    static public final EasterHoliday VOCEM_SUNDAY         = new EasterHoliday( 35,    "Vocem jucunditatis");

    /**
     * Ascension Thursday, 39 days after Easter
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    static public final EasterHoliday ASCENSION            = new EasterHoliday( 39,    "Ascension");

    /**
     * Pentecost, aka Whit or Exaudi Sunday, 7 weeks after Easter
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    static public final EasterHoliday PENTECOST            = new EasterHoliday( 49,    "Pentecost");

    /**
     * Whit Sunday, aka Pentecost, 7 weeks after Easter
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    static public final EasterHoliday WHIT_SUNDAY          = new EasterHoliday( 49,    "Whit Sunday");

    /**
     * Whit Monday, 50 days after Easter
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    static public final EasterHoliday WHIT_MONDAY          = new EasterHoliday( 50,    "Whit Monday");

    /**
     * Trinity Sunday, 8 weeks after Easter
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    static public final EasterHoliday TRINITY_SUNDAY       = new EasterHoliday( 28,    "Trinity Sunday");

    /**
     * Corpus Christi, aka Body and Blood, 60 days after Easter
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    static public final EasterHoliday CORPUS_CHRISTI       = new EasterHoliday( 60,    "Corpus Christi");

    /**
     * Sacred Heart Friday, 68 days after Easter
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    static public final EasterHoliday SACRED_HEART         = new EasterHoliday( 68,    "Sacred Heart");

    /**
     * Immaculate Heart Saturday, 69 days after Easter
     * @draft ICU 2.8
     * @provisional This API might change or be removed in a future release.
     */
    static public final EasterHoliday IMMACULATE_HEART     = new EasterHoliday( 69,    "Immaculate Heart");
}

class EasterRule implements DateRule {
    public EasterRule(int daysAfterEaster, boolean isOrthodox) {
        this.daysAfterEaster = daysAfterEaster;
        if (isOrthodox) {
            calendar.setGregorianChange(new Date(Long.MAX_VALUE));
        }
    }

    /**
     * Return the first occurrence of this rule on or after the given date
     */
    @Override
    public Date firstAfter(Date start)
    {
        return doFirstBetween(start, null);
    }

    /**
     * Return the first occurrence of this rule on or after
     * the given start date and before the given end date.
     */
    @Override
    public Date firstBetween(Date start, Date end)
    {
        return doFirstBetween(start, end);
    }

    /**
     * Return true if the given Date is on the same day as Easter
     */
    @Override
    public boolean isOn(Date date)
    {
        synchronized(calendar) {
            calendar.setTime(date);
            int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);

            calendar.setTime(computeInYear(calendar.getTime(), calendar));

            return calendar.get(Calendar.DAY_OF_YEAR) == dayOfYear;
        }
    }

    /**
     * Return true if Easter occurs between the two dates given
     */
    @Override
    public boolean isBetween(Date start, Date end)
    {
        return firstBetween(start, end) != null; // TODO: optimize?
    }

    private Date doFirstBetween(Date start, Date end)
    {
        //System.out.println("doFirstBetween: start   = " + start.toString());
        //System.out.println("doFirstBetween: end     = " + end.toString());

        synchronized(calendar) {
            // Figure out when this holiday lands in the given year
            Date result = computeInYear(start, calendar);

         //System.out.println("                result  = " + result.toString());

            // We might have gotten a date that's in the same year as "start", but
            // earlier in the year.  If so, go to next year
            if (result.before(start))
            {
                calendar.setTime(start);
                calendar.get(Calendar.YEAR);    // JDK 1.1.2 bug workaround
                calendar.add(Calendar.YEAR, 1);

                //System.out.println("                Result before start, going to next year: "
                //                        + calendar.getTime().toString());

                result = computeInYear(calendar.getTime(), calendar);
                //System.out.println("                result  = " + result.toString());
            }

            if (end != null && !result.before(end)) {
                //System.out.println("Result after end, returning null");
                return null;
            }
            return result;
        }
    }

    /**
     * Compute the month and date on which this holiday falls in the year
     * containing the date "date".  First figure out which date Easter
     * lands on in this year, and then add the offset for this holiday to get
     * the right date.
     * <p>
     * The algorithm here is taken from the
     * <a href="http://www.faqs.org/faqs/calendars/faq/">Calendar FAQ</a>.
     */
    private Date computeInYear(Date date, GregorianCalendar cal)
    {
        if (cal == null) cal = calendar;

        synchronized(cal) {
            cal.setTime(date);

            int year = cal.get(Calendar.YEAR);
            int g = year % 19;  // "Golden Number" of year minus 1 (Metonic cycle)
            int i = 0;          // # of days from 21 March to the Paschal full moon
            int j = 0;          // Weekday (0 = Sunday) of Paschal full moon

            if (cal.getTime().after( cal.getGregorianChange()))
            {
                // We're past the Gregorian switchover, so use the Gregorian rules.
                int c = year / 100; // century
                int h = (c - c/4 - (8*c+13)/25 + 19*g + 15) % 30;
                i = h - (h/28)*(1 - (h/28)*(29/(h+1))*((21-g)/11));
                j = (year + year/4 + i + 2 - c + c/4) % 7;
            }
            else
            {
                // Use the orthodox rules with the Julian leap rule.
                i = (19*g + 15) % 30;
                j = (year + year/4 + i) % 7;
            }
            int l = i - j;
            int m = 3 + (l+40)/44;              // 1-based month in which Easter falls
            int d = l + 28 - 31*(m/4);          // Date of Easter within that month

            cal.clear();
            cal.set(Calendar.ERA, GregorianCalendar.AD);
            cal.set(Calendar.YEAR, year);
            cal.set(Calendar.MONTH, m-1);       // 0-based
            cal.set(Calendar.DATE, d);
            cal.getTime();                      // JDK 1.1.2 bug workaround
            cal.add(Calendar.DATE, daysAfterEaster);

            return cal.getTime();
        }
    }

    private int               daysAfterEaster;
    private GregorianCalendar calendar = new GregorianCalendar();
}
