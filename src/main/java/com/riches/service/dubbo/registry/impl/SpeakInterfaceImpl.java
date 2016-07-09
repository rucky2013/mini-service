package com.riches.service.dubbo.registry.impl;

import org.springframework.stereotype.Service;

import com.jikexueyuan.rpc.People;
import com.jikexueyuan.rpc.SpeakInterface;
@Service("speakInterface")
public class SpeakInterfaceImpl implements SpeakInterface{

	public String speak(People people) {
		String str = "02�����ǣ�" +people.getAge() + ", �Ա��ǣ�" + people.getSex();
		return str;
	}

}
