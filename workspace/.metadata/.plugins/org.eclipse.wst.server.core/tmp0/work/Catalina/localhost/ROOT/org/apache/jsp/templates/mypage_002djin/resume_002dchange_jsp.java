/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-04-27 09:56:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.templates.mypage_002djin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class resume_002dchange_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/templates/mypage-jin/../mainpageSeo/header.jsp", Long.valueOf(1682584437611L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link href=\"../../static/image/logo/logo.png\" rel=\"shortcut icon\" type=\"image/x-icon\">\r\n");
      out.write("<title>중고신입 이력서 수정 페이지</title>\r\n");
      out.write("<!--폰트 -->\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Noto+Sans+KR&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link href=\"../../static/css/mypage-css-jin/resume-change.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<!-- 로고 -->\r\n");
      out.write("<link href=\"../../static/image/logo/logo.png\" rel=\"shortcut icon\" type=\"image/x-icon\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../../static/css/mainpageSeo/hf.css\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Noto+Sans+KR&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"home\">\r\n");
      out.write("<div class=\"h__cov-progress\" style=\"background-color: rgb(0, 199, 174); opacity: 0; position: fixed; top: 0px; left: 0px; width: 0%; height: 2px; transition: opacity 0.6s ease 0s;\"></div>\r\n");
      out.write("		<header id=\"app-header\" class=\"h_global-header\" data-v-50506024=\"\">\r\n");
      out.write("			<div data-v-5f10666f=\"\" data-v-50506024=\"\"\r\n");
      out.write("				class=\"h-global-navigation-bar\">\r\n");
      out.write("				<!-- 섹션태그때문에 이미지가 나오지 않아서 없애버렸어요 -->\r\n");
      out.write("				<div data-v-5f10666f=\"\" class=\"h-desktop-header\">\r\n");
      out.write("					<div data-v-5f10666f=\"\" class=\"left-section\">\r\n");
      out.write("						<div data-v-5f10666f=\"\" class=\"logo\">\r\n");
      out.write("							<a data-v-5f10666f=\"\" href=\"/?from=logo\" class=\"\"> <img\r\n");
      out.write("								data-v-5f10666f=\"\"\r\n");
      out.write("								src=\"../../static/image/logo/JOONGSHIN.svg\"\r\n");
      out.write("								alt=\"숨고, 숨은고수\">\r\n");
      out.write("							</a>\r\n");
      out.write("						</div>\r\n");
      out.write("						<nav data-v-5f10666f=\"\">\r\n");
      out.write("							<ul data-v-5f10666f=\"\" class=\"nav-list\">\r\n");
      out.write("								<li data-v-5f10666f=\"\" class=\"nav-item left-section-item\"><a\r\n");
      out.write("									data-v-5f10666f=\"\" href=\"/category-home?from=web_gnb\"\r\n");
      out.write("									class=\"gnb-link\"><span data-v-5f10666f=\"\">커뮤니티</span></a></li>\r\n");
      out.write("								<li data-v-5f10666f=\"\" class=\"nav-item left-section-item\"><a\r\n");
      out.write("									data-v-5f10666f=\"\" href=\"/search/pro?from=web_gnb\"\r\n");
      out.write("									class=\"gnb-link\"><span data-v-5f10666f=\"\">문의 게시판</span></a></li>\r\n");
      out.write("						\r\n");
      out.write("							</ul>\r\n");
      out.write("						</nav>\r\n");
      out.write("					</div>\r\n");
      out.write("					<!--  					 로고,문자열 네개까지 ↑ -->\r\n");
      out.write("					<div data-v-5f10666f=\"\" class=\"search-container center-section\">\r\n");
      out.write("						<div data-v-63f85165=\"\" data-v-5f10666f=\"\"\r\n");
      out.write("							class=\"h-service-searcher-desktop\">\r\n");
      out.write("							<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/listOk.board\"\r\n");
      out.write("								class=\"global-search-bar\" name=\"search-form\">\r\n");
      out.write("								<div data-v-668330c4=\"\" role=\"group\" class=\"h-input-group\">\r\n");
      out.write("									<div data-v-668330c4=\"\" class=\"h-input-group-prepend\" style=\"margin: auto;\">\r\n");
      out.write("									<div>\r\n");
      out.write("										<select name=\"type\">\r\n");
      out.write("											<option value=\"board_title&board_content\">전체</option>\r\n");
      out.write("											<option value=\"board_title\">제목</option>\r\n");
      out.write("											<option value=\"board_content\">내용</option>\r\n");
      out.write("										</select>\r\n");
      out.write("									</div>\r\n");
      out.write("										<button type=\"submit\" onclick=\"\" style=\"border: 0px;\">\r\n");
      out.write("											<img src=\"../../static/image/icons/search.png\" style=\"width: 20px;\"/>\r\n");
      out.write("										</button>\r\n");
      out.write("									</div>\r\n");
      out.write("									<input name=\"keyword\" type=\"text\"\r\n");
      out.write("										placeholder=\"어떤 서비스가 필요하세요?\" autocomplete=\"off\"\r\n");
      out.write("										class=\"h-form-control\" id=\"__BVID__142\">\r\n");
      out.write("\r\n");
      out.write("								</div>\r\n");
      out.write("							</form>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<!-- 로그인 회원가입 고수가입 전↑ -->\r\n");
      out.write("					<div data-v-5f10666f=\"\" class=\"right-section\">\r\n");
      out.write("						<nav data-v-5f10666f=\"\">\r\n");
      out.write("							<ul data-v-5f10666f=\"\" class=\"nav-list\">\r\n");
      out.write("								<li data-v-5f10666f=\"\" class=\"nav-item right-section-item\" style=\"margin-right: 10px;\"><a\r\n");
      out.write("									data-v-5f10666f=\"\" href=\"/login.user\" class=\"gnb-link\"><span\r\n");
      out.write("										data-v-5f10666f=\"\">로그인</span></a> <!----></li>\r\n");
      out.write("								<li data-v-5f10666f=\"\" class=\"nav-item right-section-item\" style=\"margin-right: 10px;\"><a\r\n");
      out.write("									href=\"/join.user\"\r\n");
      out.write("									class=\"gnb-link\"><span data-v-5f10666f=\"\">회원가입</span></a> <!----></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</nav>\r\n");
      out.write("						<button data-v-5f10666f=\"\" type=\"button\"\r\n");
      out.write("							class=\"h-btn pro-signup-h-btn right-section-item h-btn-primary h-btn-primary2\">\r\n");
      out.write("							<a data-v-5f10666f=\"\" href=\"/join.juniorUser\" class=\"\">주니어 가입</a>\r\n");
      out.write("						</button>\r\n");
      out.write("						<!---->\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- 헤더 전체 div 닫는부분 -->\r\n");
      out.write("				<!-- 없애버린 세션 태그 닫는자리 -->\r\n");
      out.write("			</div>\r\n");
      out.write("		</header>\r\n");
      out.write("		<!-- 헤더 끝 -->\r\n");
      out.write("		</div>\r\n");
      out.write("		</body>\r\n");
      out.write("</html>\r\n");
      out.write("		\r\n");
      out.write("		");
      out.write("\r\n");
      out.write("<!-- 우람님 글쓰기 페이지 가져옴 -->\r\n");
      out.write("	<div id=\"app-body\">\r\n");
      out.write("		<div class=\"community-container container\">\r\n");
      out.write("			<div class=\"soomgo-life-container\">\r\n");
      out.write("				<section class=\"write-post-container\">\r\n");
      out.write("					<div class=\"attach-file-wrapper\">\r\n");
      out.write("						<div class=\"attach-file-area\">\r\n");
      out.write("							<div class=\"add-image-icon\"></div>\r\n");
      out.write("							<div class=\"custom-file b-form-file file-input\" aria-required=\"false\" aria-invalid=\"false\" id=\"__BVID__95__BV_file_outer_\">\r\n");
      out.write("								<input type=\"file\" name=\"uploadFile\" multiple=\"multiple\" class=\"custom-file-input\" id=\"__BVID__95\" style=\"z-index: -5;\"> \r\n");
      out.write("								<label data-browse=\"Browse\" class=\"custom-file-label\" for=\"__BVID__95\">\r\n");
      out.write("									<span class=\"d-block form-file-text\" style=\"pointer-events: none;\">No file chosen</span>\r\n");
      out.write("								</label>\r\n");
      out.write("							</div>\r\n");
      out.write("							<span class=\"image-count sg-text-body2 sg-font-regular\">0/15</span>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"editor-body-container is-bottom-margin\">\r\n");
      out.write("						<div class=\"editor-body-wrapper\">\r\n");
      out.write("							<div class=\"divider-wrapper\">\r\n");
      out.write("								<hr class=\"hr-divider\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"service-region-wrapper\">\r\n");
      out.write("								<div class=\"category-select-box\">\r\n");
      out.write("									<label for=\"experience\">경력:</label>\r\n");
      out.write("									<select id=\"experience\">\r\n");
      out.write("										<option value=\"0\">0년</option>\r\n");
      out.write("										<option value=\"1\">1년</option>\r\n");
      out.write("										<option value=\"2\">2년</option>\r\n");
      out.write("										<option value=\"3\">3년 이상</option>\r\n");
      out.write("									</select>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"divider-wrapper\">\r\n");
      out.write("								<hr class=\"hr-divider\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"divider-wrapper\">\r\n");
      out.write("								<hr class=\"hr-divider\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"editor-contents\">\r\n");
      out.write("								<span class=\"sg-text-body2 sg-font-regular sg-text-gray-900\">\r\n");
      out.write("									<textarea name=\"post-content\" class=\"editor-contents-textarea\"></textarea>\r\n");
      out.write("								</span>\r\n");
      out.write("								<span class=\"editor-contents-textarea-placeholder sg-text-body2 sg-font-regular sg-text-gray-500\">\r\n");
      out.write("									고객이 궁금해하는 요청 서비스 정보나 고수님의 전문성을 보여주는 글을 작성해 보세요.\r\n");
      out.write("									글을 통해 고수님의 지정요청을 높일 수 있어요!\r\n");
      out.write("									주제에 맞지 않는 글이나 커뮤니티 이용정책에 위배되어 일정 수 이상 신고를 받는 경우 글이 숨김 및 삭제될 수 있습니다.\r\n");
      out.write("								</span>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"submit-btn-wrapper\">\r\n");
      out.write("						<button type=\"button\" class=\"submit-btn\">수정하기</button>	\r\n");
      out.write("					</div>\r\n");
      out.write("				</section>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../mainpageSeo/footer.jsp", out, false);
      out.write("\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.1.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("	const $textArea = $(\"textarea\");\r\n");
      out.write("	const $placeholder = $(\".editor-contents-textarea-placeholder\");\r\n");
      out.write("	\r\n");
      out.write("	$(document).ready(function() {\r\n");
      out.write("		$textArea.on('input', function() {\r\n");
      out.write("			if($textArea.val()) {\r\n");
      out.write("				$placeholder.css('display', 'none');\r\n");
      out.write("			} else {\r\n");
      out.write("				$placeholder.css('display', 'inline-block');\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
