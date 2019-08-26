/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.yald;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.smarthome.core.thing.ThingTypeUID;

/**
 * The {@link YaldBindingConstants} class defines common constants, which are
 * used across the whole binding.
 *
 * @author Michael Zapf - Initial contribution
 */
@NonNullByDefault
public class YaldBindingConstants {

    public static final String BINDING_ID = "yald";

    // List of all Thing Type UIDs
    public final static ThingTypeUID THING_TYPE_YALD = new ThingTypeUID(BINDING_ID, "yald");

    // List of all Channel ids
    // @TODO Really??!!
    public final static String DIMMER1 = "dimmer1";
    public final static String DIMMER2 = "dimmer2";
    public final static String DIMMER3 = "dimmer3";
    public final static String DIMMER4 = "dimmer4";
    public final static String DIMMER5 = "dimmer5";
    public final static String DIMMER6 = "dimmer6";
    public final static String DIMMER7 = "dimmer7";
    public final static String DIMMER8 = "dimmer8";
    public final static String DIMMER9 = "dimmer9";
    public final static String DIMMER10 = "dimmer10";
    public final static String DIMMER11 = "dimmer11";
    public final static String DIMMER12 = "dimmer12";
    public final static String DIMMER13 = "dimmer13";
    public final static String DIMMER14 = "dimmer14";
    public final static String DIMMER15 = "dimmer15";
    public final static String DIMMER16 = "dimmer16";
}
