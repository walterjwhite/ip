package com.walterjwhite.ip.impl.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestJSONIPPublicIPLookupService {
  private static final Logger LOGGER =
      LoggerFactory.getLogger(TestJSONIPPublicIPLookupService.class);

  public static void main(final String[] arguments) throws Exception {
    final JSONIPPublicIPLookupService lookupService = new JSONIPPublicIPLookupService();

    LOGGER.debug("IP:" + lookupService.getPublicIPAddress());
  }
}
