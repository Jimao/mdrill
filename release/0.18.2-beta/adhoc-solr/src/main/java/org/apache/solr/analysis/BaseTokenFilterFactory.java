/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.solr.analysis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Simple abstract implementation that handles init arg processing.
 * 
 * @version $Id: BaseTokenFilterFactory.java 923109 2010-03-15 08:09:34Z uschindler $
 */
public abstract class BaseTokenFilterFactory extends BaseTokenStreamFactory implements TokenFilterFactory {
  public static final Logger log = LoggerFactory.getLogger(BaseTokenFilterFactory.class);
}
