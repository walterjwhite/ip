package com.walterjwhite.ip.impl.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestHttpBinPublicIPLookupService {
  private static final Logger LOGGER =
      LoggerFactory.getLogger(TestHttpBinPublicIPLookupService.class);

  public static void main(final String[] arguments) throws Exception {
    final HttpBinPublicIPLookupService lookupService = new HttpBinPublicIPLookupService();

    LOGGER.debug("IP:" + lookupService.getPublicIPAddress());
  }
}
