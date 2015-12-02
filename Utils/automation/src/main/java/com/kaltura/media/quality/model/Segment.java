package com.kaltura.media.quality.model;

import java.io.File;
import java.io.Serializable;
import java.security.NoSuchAlgorithmException;

public class Segment implements Serializable {
	private static final long serialVersionUID = -320621756591515403L;
	private int number;
	private double duration;
	private Rendition rendition;
	private File file;

	public Segment(int number, double duration, Rendition rendition) throws NoSuchAlgorithmException {
		this.number = number;
		this.duration = duration;
		this.rendition = rendition;
	}

	public File getFile() {
		return file;
	}

	public int getNumber() {
		return number;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public double getDuration() {
		return duration;
	}

	public Rendition getRendition() {
		return rendition;
	}

	public String getEntryId() {
		return rendition.getEntryId();
	}
}