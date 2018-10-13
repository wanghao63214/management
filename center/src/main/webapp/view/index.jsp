<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"><!-- IE8兼容向下版本 -->
  	<meta name="viewport" content="width=device-width, initial-scale=2.0, maximum-scale=1.0"><!-- 用于开发移动端设置满屏 -->
	<meta http-equiv="pragma" content="no-cache"><!-- 不能缓存页面，不能脱机访问 -->
	<meta http-equiv="cache-control" content="no-cache"><!-- 请求和响应不能缓存 -->
	<meta http-equiv="expires" content="0">   <!-- 请求立即过期 -->
	<title>山东威海</title>
  	<%@include  file="/view/common/common.jsp"%>
  	<%@include  file="/view/common/popWindow.jsp"%>
  	<base href="<%=basePath%>"><!-- 规定页面中所有相对链接的基准 URL -->
	</head>
	<body>
		<!-- 全局js -->
		<script src="${ctxPath}/js/plugins/layer/layer.min.js"></script>
		<!-- Preloader 页面加载前的小遮挡-->
		<div id="preloader"><!-- brakcet自带common.jsp style.default.css，350毫秒之后消失 -->
				<div id="status">
					<!-- 旋转小icon -->
					<i class="fa fa-spinner fa-spin"></i>
				</div>
		</div>
		<section>
			   <!---------------------------------------------- leftpanel ------------------------------------------>
		       <div class="leftpanel">
		       		<!---------------------------------------------- leftpanel -----top ------------------------------------->
		            <div class="logopanel text-c">
		               <img src="<%=basePath%>images/logo/logo.png" >
		            </div>
		            <!---------------------------------------------- leftpanel -----menu ------------------------------------->
		            <div class="leftpanelinner" >
		              <ul class="nav nav-pills nav-stacked nav-bracket" id="nav-ul">
		              </ul>
		            </div>
		       </div>
		       <!---------------------------------------------- rightPanel ------------------------------------------>
		      <div class="mainpanel">
		      	  <!------------------------------------------- rightpanel---- headerBar ------------------------------------------>
		          <div class="headerbar cl">
		              <!-- <a class="menutoggle"><i class="fa fa-bars"></i></a>菜单摇摆 -->
		              <!--------------------------------------- rightpanel---- headerBar ----left-------------------------------------->
					  <div class="fl"><span class="main-title"  style="color:white" >家家悦</span></div>
					  <!--------------------------------------- rightpanel---- headerBar ----right-------------------------------------->
		              <div class="header-right" >
							<ul class="headermenu">
								<li>
									<div class="btn-group">
										<button type="button" class="btn btn-default dropdown-toggle"
											data-toggle="dropdown" style="width:200px;background:#2F496C">
											<!-- <span class="glyphicon glyphicon-user"></span> -->
											<span  style="color:white" >你好 </span><span
												class="caret"></span>
										</button>
										<ul class="dropdown-menu dropdown-menu-usermenu pull-right">
											<li>
												<a href="javascript:void(0)" onclick="updatePassword()" ><i class="glyphicon glyphicon-user"></i>修改密码</a>
												<a href="logout.do"><i class="glyphicon glyphicon-log-out"></i>退&nbsp;&nbsp;&nbsp;&nbsp;出</a>
											</li>
										</ul>
									</div>
								</li>
							</ul>
						<!-- <a id="go" name="go" href="javascript:void(0)" onclick="go()"><span style="color:white">点击</span></a> -->
					  </div><!-- header-right -->
		          </div>
		          <!---------------------------------------------- rightpanel----middle ------------------------------------------>
				  <div id="content-box" style="margin:20px"></div>
		      </div>
		</section>
		<!-- staying -->
		<div class="modal fade" id="confirmalert" tabindex="-1" role="dialog" aria-labelledby="confirmalertModalLabel">
  			<div class="modal-dialog" role="document">
    			<div class="modal-content">
				    <div class="modal-header">
				        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				        <h5 class="modal-title" id="confirmalertModalLabel"></h5>
				    </div>
					<div class="modal-body" id='modalContent' style="font-size: 30px;height: 70px;">
					</div>
    			</div>
  			</div>
		</div>
	</body>
</html>
<script type="text/javascript">
	var updatePasswordUrl = "view/sysManage/userManage/userPasswordUpdate.jsp";
    function updatePassword() {
        _window._showPopup('密码修改', updatePasswordUrl, function () {
        });
    }
</script>