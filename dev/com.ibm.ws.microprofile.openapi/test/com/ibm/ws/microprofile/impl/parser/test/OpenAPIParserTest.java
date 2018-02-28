/*******************************************************************************
 * Copyright (c) 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.microprofile.impl.parser.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.ibm.ws.microprofile.openapi.impl.parser.OpenAPIParser;
import com.ibm.ws.microprofile.openapi.impl.parser.core.models.SwaggerParseResult;

/**
 *
 */
public class OpenAPIParserTest {
    @Test
    public void testOpenAPI() {
        SwaggerParseResult result = new OpenAPIParser().readLocation("airlines_openapi.yaml", null, null);

        assertNotNull(result);
        assertNotNull(result.getOpenAPI());
        assertEquals(result.getOpenAPI().getOpenapi(), "3.0.0");
    }
}
