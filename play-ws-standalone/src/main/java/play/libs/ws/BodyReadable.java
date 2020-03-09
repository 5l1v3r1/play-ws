/*
 * Copyright (C) 2009-2020 Lightbend Inc. <https://www.lightbend.com>
 */

package play.libs.ws;

import java.util.function.Function;

/**
 * Converts a response body into type R
 */
public interface BodyReadable<R> extends Function<StandaloneWSResponse, R> {

}
