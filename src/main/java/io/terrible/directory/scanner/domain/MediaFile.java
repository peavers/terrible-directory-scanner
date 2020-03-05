/* Licensed under Apache-2.0 */
package io.terrible.directory.scanner.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/** @author Chris Turner (chris@forloop.space) */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MediaFile {

  private String absolutePath;

  private String mimeType;
}