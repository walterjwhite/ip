package com.walterjwhite.ip.impl.service;

import com.walterjwhite.google.guice.GuiceHelper;
import com.walterjwhite.ip.api.service.PublicIPLookupService;
import com.walterjwhite.ip.impl.PublicIPLookupModule;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaultPublicIPLookupServiceTest {
  private static final Logger LOGGER =
      LoggerFactory.getLogger(DefaultPublicIPLookupServiceTest.class);

  protected PublicIPLookupService publicIPLookupService;

  @Before
  public void before() throws Exception {
    GuiceHelper.addModules(new PublicIPLookupModule());
    GuiceHelper.setup();

    publicIPLookupService = GuiceHelper.getGuiceInjector().getInstance(PublicIPLookupService.class);
  }

  @Test
  public void testLookup() throws Exception {
    LOGGER.info("public IP:" + publicIPLookupService.getPublicIPAddress());
  }
}
