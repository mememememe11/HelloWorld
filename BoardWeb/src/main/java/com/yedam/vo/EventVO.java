package com.yedam.vo;

import java.util.Date;
import lombok.Data;


@Data
public class EventVO {
	public String title;
	public Date startEvent;
	public Date endEvent;
	public String url;
}
