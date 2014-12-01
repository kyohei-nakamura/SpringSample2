<%@ page language="java" contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>core:out</h1>

<c:out value="${mBean.message}" />

<c:out value="${dummyObj.dummyProp}" />