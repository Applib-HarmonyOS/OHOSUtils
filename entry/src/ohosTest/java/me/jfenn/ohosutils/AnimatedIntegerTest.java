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
import me.jfenn.ohosutils.anim.AnimatedInteger;
import org.junit.Test;

public class AnimatedIntegerTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
        //this method is empty
    }

    @Test
    public void testNextVal() {
        AnimatedInteger animatedInteger;
        animatedInteger = new AnimatedInteger(9);
        float val = animatedInteger.nextVal(2, 4);
        assertEquals(String.valueOf(9.0),String.valueOf(val));
    }
}