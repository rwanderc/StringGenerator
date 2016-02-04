/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 Wander Costa (www.wandercosta.com)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.wandercosta.stringgenerator;

import java.util.Random;

/**
 * Simple class to generate random {@link String}s.
 *
 * @author Wander Costa (www.wandercosta.com)
 */
public class StringGenerator {

    private static final String ABC = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private final Random random;

    public StringGenerator() {

        this.random = new Random();

    }

    public String generate(int length) {

        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {

            sb.append(ABC.charAt(random.nextInt(ABC.length())));

        }

        return sb.toString();

    }

}
