/*
 * Copyright (c) 1996, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package org.glassfish.rmic.tools.javac;

/**
 * Allows for easier parsing of errors and warnings from the compiler
 *
 * WARNING: The contents of this source file are not part of any
 * supported API.  Code that depends on them does so at its own risk:
 * they are subject to change or removal without notice.
 */
@Deprecated
public
interface ErrorConsumer {
        public void pushError(String errorFileName,
                                                        int line,
                                                        String message,
                                                        String referenceText, String referenceTextPointer);
};
