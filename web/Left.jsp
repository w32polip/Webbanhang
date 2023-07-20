

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="col-sm-3">
    <div class="card bg-light mb-3">
        <div class="card-header bg-primary text-white text-uppercase"><i class="fa fa-list p-3 mb-2 bg-primary text-white" style=""></i> Categories</div>
        <ul class="list-group category_block">
            
            <c:forEach items="${listCC}" var="o">
                <div class="btn-group" role="group" aria-label="Basic example">
                    <button type="button" class="btn btn-primary   p-3 mb-3 bg-light text-dark ${tag == o.cid ? "active":""}" ><a href="category?cid=${o.cid} " style="color: #d389c2">${o.cname}</a></button>
                </div>
            </c:forEach>

        </ul>
    </div>
   
    
            <div class="" style="width: 16.4rem;">
                <div class="p-3 mb-2 bg-success text-white">New product</div>
                <img src="${p.image}" class="card-img-top" alt="...">
                <div class="card text-center">
                <div class="card-body">
                    <h5 class="card-title">${p.title}</h5>
                    <p class="card-text">${p.price} $</p>
                </div>
                <ul class="list-group list-group-flush">
                    <li class="list-group-item"> ${p.description}</li>
                </ul>    
                </div>
                
            </div>
</div>