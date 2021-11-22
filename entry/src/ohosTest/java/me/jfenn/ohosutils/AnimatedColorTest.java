/*
 * Copyright (C) 2020-21 Application Library Engineering Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.jfenn.ohosutils;

import junit.framework.TestCase;
import me.jfenn.ohosutils.anim.AnimatedColor;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class AnimatedColorTest extends TestCase {
    private AnimatedColor animatedColor ;

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown()  {
        //this method is empty
    }

    @Test
    public void testNextVal() {
        animatedColor = new AnimatedColor(5);
        assertEquals(5,animatedColor.nextVal(2));
    }

    @Test
    public void testnextVal1() {
        animatedColor = new AnimatedColor(8);
        assertNotEquals(5, animatedColor.nextVal(5));
    }

    @Test
    public void testNextVal2() {
        animatedColor = new AnimatedColor(5);
        assertEquals(5,animatedColor.nextVal(2, 4));
    }

    @Test
    public void testNextVal3() {
        animatedColor = new AnimatedColor(6);
        assertNotEquals(4,animatedColor.nextVal(2, 4));
    }
}