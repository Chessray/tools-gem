/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.tools.gem;

import org.mapstruct.tools.gem.test.SomeAnnotation;

@SomeAnnotation(
    myClass = Object.class,
    myBoolean = true,
    myChar = 'a',
    myByte = 0x22,
    myShort = 1,
    myInt = 2,
    myLong = 3,
    myFloat = 99.3f,
    myDouble = 5033.19d,
    myString = "some",
    myEnum = SomeAnnotation.TEST.B
)
public class Tester {
}
