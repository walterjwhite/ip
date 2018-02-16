package com.walterjwhite.ip.impl.service;

public class PublicIPLookupServiceConfiguration {
  // TODO: make this an enum?
  protected String provider;

  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }
}
