<%@ page language="java" contentType="text/html;charset=utf-8"%>

<h1>jsp:getProperty</h1>

<jsp:useBean id="mBean" scope="request"
	class="sample.springmvc.MessageBean" />
<jsp:getProperty property="message" name="mBean" />

<jsp:getProperty property="dummyProp" name="dummyObj" />
