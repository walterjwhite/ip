package com.walterjwhite.ip.impl.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestFreeGeoIPPublicIPLookupService {
  private static final Logger LOGGER =
      LoggerFactory.getLogger(TestFreeGeoIPPublicIPLookupService.class);

  public static void main(final String[] arguments) throws Exception {
    final FreeGeoIPPublicIPLookupService lookupService = new FreeGeoIPPublicIPLookupService();

    LOGGER.debug("IP:" + lookupService.getPublicIPAddress());
  }
}
