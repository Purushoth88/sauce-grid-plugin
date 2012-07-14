package org.openqa.services;

import org.openqa.SauceOnDemandCapabilities;

import java.util.List;

/**
 * @author Fran�ois Reynaud - Initial version of plugin
 * @author Ross Rowe - Additional functionality
 */
public interface SauceOnDemandService {

  boolean isSauceLabUp() throws SauceOnDemandRestAPIException;
  List<SauceOnDemandCapabilities> getBrowsers() throws SauceOnDemandRestAPIException;
    
}
