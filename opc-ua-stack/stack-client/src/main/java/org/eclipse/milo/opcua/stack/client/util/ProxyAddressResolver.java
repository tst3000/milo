/*
 * Copyright (c) 2016 Kevin Herron
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 *
 * The Eclipse Public License is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 *   http://www.eclipse.org/org/documents/edl-v10.html.
 */

package org.eclipse.milo.opcua.stack.client.util;

import java.net.SocketAddress;
import java.util.List;

import io.netty.resolver.AddressResolver;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.Promise;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProxyAddressResolver implements AddressResolver<SocketAddress> {

    private static final Logger logger = LoggerFactory.getLogger(ProxyAddressResolver.class);

    @Override
    public boolean isSupported(SocketAddress socketAddress) {
        return true;
    }

    @Override
    public boolean isResolved(SocketAddress socketAddress) {
        return true;
    }

    @Override
    public Future<SocketAddress> resolve(SocketAddress socketAddress) {
        return null;
    }

    @Override
    public Future<SocketAddress> resolve(SocketAddress socketAddress,
                                         Promise<SocketAddress> promise) {
        return null;
    }

    @Override
    public Future<List<SocketAddress>> resolveAll(SocketAddress socketAddress) {
        return null;
    }

    @Override
    public Future<List<SocketAddress>> resolveAll(SocketAddress socketAddress,
                                                  Promise<List<SocketAddress>> promise) {
        return null;
    }

    @Override
    public void close() {
    }

}
