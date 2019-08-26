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
package org.openhab.binding.yald.handler;

import java.io.IOException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.smarthome.core.library.types.OnOffType;
import org.eclipse.smarthome.core.thing.ChannelUID;
import org.eclipse.smarthome.core.thing.Thing;
import org.eclipse.smarthome.core.thing.ThingStatus;
import org.eclipse.smarthome.core.thing.ThingStatusDetail;
import org.eclipse.smarthome.core.thing.binding.BaseThingHandler;
import org.eclipse.smarthome.core.types.Command;
import org.eclipse.smarthome.core.types.RefreshType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The {@link YaldHandler} is responsible for handling commands, which are
 * sent to one of the channels.
 *
 * @author Michael Zapf - Initial contribution
 */
@NonNullByDefault
public class YaldHandler extends BaseThingHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(YaldHandler.class);

    // @TODO Do this in a cleaner way, JUST FOR REFERENCE
    @Nullable
    private ScheduledFuture<?> pollingJob = null;

    /**
     * @param thing The thing
     */
    public YaldHandler(Thing thing) {
        super(thing);
    }

    @Override
    public void handleCommand(ChannelUID channelUID, Command command) {
        LOGGER.debug("command for {}: {}", channelUID.getAsString(), command.toString());

        // @TODO Handle command
    }

    @Override
    public void initialize() {
        LOGGER.debug("Initializing Things");

        // @TODO Read config via this.getConfigAs(SOME_CONFIG_CLASS) or so

        // @TODO Check connectivity and set ->
        // updateStatus(ThingStatus.ONLINE);

        // @TODO Example for scheduled job:
        // final Runnable runnable = () -> handleCommand(getThing().getChannel(YaldBindingConstants.DIMMER1).getUID(),
        //         RefreshType.REFRESH);
        // pollingJob = scheduler.scheduleWithFixedDelay(runnable, 30, 30, TimeUnit.SECONDS);
    }

    @Override
    public void dispose() {
        if (pollingJob != null) {
            pollingJob.cancel(true);
        }
    }

    /**
     * Returns state for device.
     *
     * @return The on/off state of the thing
     * @throws IOException if the communication fails
     */
    private Boolean getState() throws IOException {
        final GetState getS = new GetState();
        return getS.executeCommand(ci);
    }

    /**
     * Switch to.
     *
     * @param newState new state for the thing
     * @return True if device is turned on. Otherwise false.
     * @throws IOException if the communication fails
     */
    public Boolean switchState(Boolean newState) throws IOException {
        final SetState setS = new SetState(newState);
        return setS.executeCommand(ci);
    }
}
