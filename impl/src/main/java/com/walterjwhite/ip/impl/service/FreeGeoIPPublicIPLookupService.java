package com.walterjwhite.ip.impl.service;

import com.walterjwhite.ip.api.service.PublicIPLookupService;
import com.walterjwhite.ip.impl.util.URLStreamUtil;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FreeGeoIPPublicIPLookupService implements PublicIPLookupService {
  private static final Logger LOGGER =
      LoggerFactory.getLogger(FreeGeoIPPublicIPLookupService.class);

  public String getPublicIPAddress() throws Exception {
    final String response = URLStreamUtil.getResponse("http://freegeoip.net/json");
    final JSONObject jsonObject = new JSONObject(response);
    final String ip = jsonObject.getString("ip");

    return (ip);
  }
}
