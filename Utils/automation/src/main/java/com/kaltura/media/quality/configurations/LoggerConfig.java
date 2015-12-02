package com.kaltura.media.quality.configurations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kaltura.media.quality.validator.logger.ResultsLogger;

public class LoggerConfig extends TypedConfig<ResultsLogger> {

    @JsonProperty("name")
	private String name;

    @JsonProperty("deffered")
	private boolean deffered;

	public String getName() {
		return name;
	}

	public boolean getDeffered() {
		return deffered;
	}

}