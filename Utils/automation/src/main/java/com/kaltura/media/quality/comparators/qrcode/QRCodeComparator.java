package com.kaltura.media.quality.comparators.qrcode;


import java.io.File;

import com.kaltura.media.quality.comparators.ImageComparator;

/**
 * Created by asher.saban on 6/8/2015.
 */
public class QRCodeComparator implements ImageComparator {

	@Override
	public boolean isSimilar(File image1, File image2) {
		return false;
	}
}