package com.pantz.metals_and_alloys.util;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class LangUtils {
    public static boolean isEmpty(final CharSequence cs) {
        return cs == null || cs.isEmpty();
    }

    private static boolean isDelimiter(final char ch, final char[] delimiters) {
        return delimiters == null ? Character.isWhitespace(ch) : ArrayUtils.contains(delimiters, ch);
    }

    public static String capitalizeFully(final String str, final char... delimiters) {
        final int delimLen = delimiters == null ? -1 : delimiters.length;
        if (StringUtils.isEmpty(str) || delimLen == 0) {
            return str;
        }
        return capitalize(str.toLowerCase(), delimiters);
    }

    public static String capitalizeFully(final String str) {
        return capitalizeFully(str, null);
    }

    public static String capitalize(final String str, final char... delimiters) {
        final int delimLen = delimiters == null ? -1 : delimiters.length;
        if (isEmpty(str) || delimLen == 0) {
            return str;
        }
        final char[] buffer = str.toCharArray();
        boolean capitalizeNext = true;
        for (int i = 0; i < buffer.length; i++) {
            final char ch = buffer[i];
            if (isDelimiter(ch, delimiters)) {
                capitalizeNext = true;
            } else if (capitalizeNext) {
                buffer[i] = Character.toTitleCase(ch);
                capitalizeNext = false;
            }
        }
        return new String(buffer);
    }
}
