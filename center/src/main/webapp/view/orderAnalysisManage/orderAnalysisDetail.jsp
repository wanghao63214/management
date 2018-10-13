<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
    b{
        color: red;
    }
</style>
<div class="container-fluid" style="margin-top: 120px;">
    <div id="jsonDataDetailContent" style="width:500px;">

    </div>
    <div class="form-group" style="margin-top: 70px;">
        <div class="col-xs-offset-2 col-sm-7" style="margin-left:22%;">
            <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
        </div>
    </div>
</div>
<script type="text/javascript">
    $(function () {

        $('#jsonDataDetailContent').html(Trim(data, 'g'));

    });

    function Trim(str, is_global) {
        var result;
        result = str.replace(/(^\s+)|(\s+$)/g, "");
        if (is_global.toLowerCase() == "g") {
            result = result.replace(/\s/g, "");
        }
        return result;

    }
</script>