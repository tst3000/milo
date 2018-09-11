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

package org.eclipse.milo.opcua.stack.client.config.proxy;

import java.net.SocketAddress;

import com.google.common.base.MoreObjects;

public class UaTcpStackClientProxyConfigBuilder {

    private UaTcpStackClientProxyConfig.ProxyType proxyType = UaTcpStackClientProxyConfig.ProxyType.SOCKS5;

    private SocketAddress proxyAddress;

    private boolean resolveOnProxy = true;

    public UaTcpStackClientProxyConfigBuilder proxyType(UaTcpStackClientProxyConfig.ProxyType proxyType) {
        this.proxyType = proxyType;
        return this;
    }

    public UaTcpStackClientProxyConfigBuilder proxyAddress(SocketAddress proxyAddress) {
        this.proxyAddress = proxyAddress;
        return this;
    }

    public UaTcpStackClientProxyConfigBuilder resolveOnProxy(boolean resolveOnProxy) {
        this.resolveOnProxy = resolveOnProxy;
        return this;
    }

    public UaTcpStackClientProxyConfig build() {
        return new UaTcpStackClientProxyConfigImpl(proxyType, proxyAddress, resolveOnProxy);
    }


    public static class UaTcpStackClientProxyConfigImpl implements UaTcpStackClientProxyConfig {

        private final ProxyType proxyType;

        private final SocketAddress proxyAddress;

        private final boolean resolveOnProxy;

        public UaTcpStackClientProxyConfigImpl(ProxyType proxyType,
                                               SocketAddress proxyAddress,
                                               boolean resolveOnProxy) {
            this.proxyType = proxyType;
            this.proxyAddress = proxyAddress;
            this.resolveOnProxy = resolveOnProxy;
        }

        @Override
        public ProxyType getProxyType() {
            return proxyType;
        }

        @Override
        public SocketAddress getProxyAddress() {
            return proxyAddress;
        }

        @Override
        public boolean isResolveOnProxy() {
            return resolveOnProxy;
        }

        @Override
        public String toString() {
            return MoreObjects.toStringHelper(this)
                    .add("proxyType", proxyType)
                    .add("proxyAddress", proxyAddress)
                    .add("resolveOnProxy", resolveOnProxy)
                    .toString();
        }
    }


}
