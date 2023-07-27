/*
 * Copyright (C) 2012 The Guava Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

/**
 * Interfaces, utilities, and simple implementations of escapers and encoders. The primary type is
 * {@link dev.mccue.guava.escape.Escaper}.
 *
 * <p>Additional escapers implementations are found in the applicable packages: {@code
 * dev.mccue.guava.html.HtmlEscapers} in {@code dev.mccue.guava.html}, {@code
 * dev.mccue.guava.xml.XmlEscapers} in {@code dev.mccue.guava.xml}, and {@code
 * dev.mccue.guava.net.UrlEscapers} in {@code dev.mccue.guava.net}.
 *
 * <p>This package is a part of the open-source <a href="https://github.com/google/guava">Guava</a>
 * library.
 */
@CheckReturnValue
@ParametersAreNonnullByDefault
package dev.mccue.guava.escape;

import com.google.errorprone.annotations.CheckReturnValue;
import dev.mccue.jsr305.ParametersAreNonnullByDefault;
