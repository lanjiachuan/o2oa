package com.x.program.center.jaxrs.collect;

import com.x.base.core.project.exception.PromptException;

class ExceptionInvalidPassword extends PromptException {

	private static final long serialVersionUID = 1859164370743532895L;

	ExceptionInvalidPassword() {
		super("密码过于简单.");
	}
}