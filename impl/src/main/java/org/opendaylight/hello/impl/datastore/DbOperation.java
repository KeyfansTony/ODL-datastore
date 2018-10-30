/*
 * Copyright © 2017 bupt.dtj and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.hello.impl.datastore;

import org.opendaylight.controller.md.sal.common.api.data.AsyncReadWriteTransaction;

public interface DbOperation {
    void applyOperation(AsyncReadWriteTransaction tx);
}
