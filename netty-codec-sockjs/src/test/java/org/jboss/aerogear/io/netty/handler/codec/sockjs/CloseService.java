/*
 * Copyright 2013 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.jboss.aerogear.io.netty.handler.codec.sockjs;

import org.jboss.aerogear.io.netty.handler.codec.sockjs.SockJsConfig;
import org.jboss.aerogear.io.netty.handler.codec.sockjs.SockJsService;
import org.jboss.aerogear.io.netty.handler.codec.sockjs.SockJsSessionContext;

/**
 * Test service required by
 * <a href="http://sockjs.github.io/sockjs-protocol/sockjs-protocol-0.3.3.html">sockjs-protocol</a>
 * which will close the session as soon as a message is received.
 */
public final class CloseService implements SockJsService {

    private final SockJsConfig config;

    public CloseService(final SockJsConfig config) {
        this.config = config;
    }

    @Override
    public SockJsConfig config() {
        return config;
    }

    @Override
    public void onMessage(final String message) throws Exception {
    }

    @Override
    public void onOpen(final SockJsSessionContext session) {
        session.close();
    }

    @Override
    public void onClose() {
    }

}
