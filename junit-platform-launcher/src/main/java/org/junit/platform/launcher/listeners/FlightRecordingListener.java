/*
 * Copyright 2015-2020 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */

package org.junit.platform.launcher.listeners;

import static org.apiguardian.api.API.Status.EXPERIMENTAL;

import org.apiguardian.api.API;
import org.junit.platform.launcher.TestExecutionListener;

/**
 * A {@link TestExecutionListener} that generates Java Flight Recorder
 * events.
 *
 * @see <a href="https://openjdk.java.net/jeps/328">JEP 328: Flight Recorder</a>
 * @since 1.7
 */
@API(status = EXPERIMENTAL, since = "1.7")
public class FlightRecordingListener implements TestExecutionListener {
}