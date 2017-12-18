/*
 * Minio Java SDK for Amazon S3 Compatible Cloud Storage, (C) 2015 Minio, Inc.
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

package io.minio;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


/**
 * Global constants for various date formats.  They are used to convert string to DateTime object and vise verse.
 */
public class DateFormat {
  public static final DateTimeFormatter AMZ_DATE_FORMAT =
      DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmss'Z'")
          .withZone(ZoneId.of("UTC")).withLocale(Locale.US);

  public static final DateTimeFormatter EXPIRATION_DATE_FORMAT =
      DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH':'mm':'ss'.'SSS'Z'")
          .withZone(ZoneId.of("UTC")).withLocale(Locale.US);

  public static final DateTimeFormatter RESPONSE_DATE_FORMAT = EXPIRATION_DATE_FORMAT;

  public static final DateTimeFormatter SIGNER_DATE_FORMAT =
      DateTimeFormatter.ofPattern("yyyyMMdd")
          .withZone(ZoneId.of("UTC")).withLocale(Locale.US);

  public static final DateTimeFormatter HTTP_HEADER_DATE_FORMAT =
      DateTimeFormatter.ofPattern("EEE',' dd MMM yyyy HH':'mm':'ss 'GMT'")
          .withZone(ZoneId.of("UTC")).withLocale(Locale.US);

  private DateFormat() {
  }
}
