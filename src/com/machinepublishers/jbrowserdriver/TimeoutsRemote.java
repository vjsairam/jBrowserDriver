/* 
 * jBrowserDriver (TM)
 * Copyright (C) 2014-2016 Machine Publishers, LLC
 * 
 * Sales and support: ops@machinepublishers.com
 * Updates: https://github.com/MachinePublishers/jBrowserDriver
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.machinepublishers.jbrowserdriver;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

interface TimeoutsRemote extends Remote {
  TimeoutsRemote implicitlyWait(long duration, TimeUnit unit)
      throws RemoteException;

  TimeoutsRemote pageLoadTimeout(long duration, TimeUnit unit)
      throws RemoteException;

  TimeoutsRemote setScriptTimeout(long duration, TimeUnit unit)
      throws RemoteException;

  long getImplicitlyWaitMS() throws RemoteException;

  long getPageLoadTimeoutMS() throws RemoteException;

  long getScriptTimeoutMS() throws RemoteException;

  AtomicLong getImplicitlyWaitObjMS() throws RemoteException;

  AtomicLong getPageLoadTimeoutObjMS() throws RemoteException;

  AtomicLong getScriptTimeoutObjMS() throws RemoteException;

}
