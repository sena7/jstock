/*
 * Copyright (c) 2009 Nanne Baars
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */

package org.yccheok.jstock.internationalization;

import java.util.ResourceBundle;

/**
 * I am responsible for accessing a resource bundle.
 *
 * Note:
 * 
 * In the future I should be able to use the Locale and locate the right
 * property file. At the moment I am not capable of doing this.
 *
 * @author nb
 */
public class MessagesBundle {

    private static final ResourceBundle bundle;

    static {
        bundle = ResourceBundle.getBundle("org.yccheok.jstock.data.messages");
    }

    /**
     * No need to create an instance
     */
    private MessagesBundle() {
    }

    /**
     * Get the string defined in the property file.
     *
     * @param key the key for the desired string
     * @exception NullPointerException if <code>key</code> is <code>null</code>
     * @exception MissingResourceException if no object for the given key can be found
     * @exception ClassCastException if the object found for the given key is not a string
     * @return the string for the given key
     */
    public static String getString(String key) {
        return bundle.getString(key);
    }
}
