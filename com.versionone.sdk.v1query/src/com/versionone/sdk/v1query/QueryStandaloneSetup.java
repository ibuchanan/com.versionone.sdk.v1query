
package com.versionone.sdk.v1query;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class QueryStandaloneSetup extends QueryStandaloneSetupGenerated{

	public static void doSetup() {
		new QueryStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

