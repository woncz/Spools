/*
 * Copyright [2016]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netpet.spools.javacore.log4j;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Log4jModel {

	private static final Log LOG = LogFactory.getLog(Log4jModel.class);

	public static void main(String[] args) {
		if (LOG.isErrorEnabled()) {
			LOG.error("error......");
		}
		if (LOG.isInfoEnabled()) {
			LOG.info("info......");
		}
		if (LOG.isDebugEnabled()) {
			LOG.debug("debug......");
		}
	}

}