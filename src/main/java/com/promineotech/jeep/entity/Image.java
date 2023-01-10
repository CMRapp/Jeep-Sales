package com.promineotech.jeep.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Image {
	private Long imagePk;
	private Long modelFk;
	private String imageId;
	private int width;
	private int height;
	private ImageMimeType mimeType;
	private String name;
	private byte[] data;
}
