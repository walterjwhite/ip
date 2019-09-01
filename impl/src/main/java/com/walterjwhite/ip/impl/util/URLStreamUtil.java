package com.walterjwhite.ip.impl.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/** Created by walterjwhite on 11/24/16. */
public class URLStreamUtil {
  public static String getResponse(final String uri) throws Exception {
    try {
      final URLConnection urlConnection = new URL(uri).openConnection();
      urlConnection.setDoOutput(true);
      urlConnection.setAllowUserInteraction(false);

      // get result
      final StringBuilder buffer = new StringBuilder();
      try (final BufferedReader br =
          new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))) {
        String l = null;
        while ((l = br.readLine()) != null) {
          buffer.append(l);
        }

        return (buffer.toString());
      }
    } catch (IOException e) {
      throw (e);
    }
  }
}
