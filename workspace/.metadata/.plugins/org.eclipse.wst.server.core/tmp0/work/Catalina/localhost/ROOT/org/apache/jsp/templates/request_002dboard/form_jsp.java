/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-05-01 08:38:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.templates.request_002dboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class form_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/css/request-board-jym/form.css\">\r\n");
      out.write("    <title>문의</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div></div>\r\n");
      out.write("    <header class=\"header\">\r\n");
      out.write("        <!-- 홈화면으로 돌아가는 로고 버튼 -->\r\n");
      out.write("        <div class=\"logo\">\r\n");
      out.write("            <a href=\"https://soomgo.com/\">\r\n");
      out.write("                <img src='new_logo.svg'\r\n");
      out.write("                    alt=\"로고\">\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 게시글 목록으로 돌아가는 링크-->\r\n");
      out.write("        <div class=\"nav-wrapper\">\r\n");
      out.write("            <span class=\"icon-menu\"></span>\r\n");
      out.write("            <nav class=\"user-nav\" id=\"user-nav\">\r\n");
      out.write("                <a title=\"홈\" href=\"/hc/ko\">자주묻는질문</a>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <main role=\"main\">\r\n");
      out.write("        <div class=\"container-divider\"></div>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <nav class=\"sub-nav\">\r\n");
      out.write("                <ol class=\"breadcrumbs\">\r\n");
      out.write("                    <li title=\"자주묻는질문 - 숨고 : 숨은고수\"><a href=\"/hc/ko\">자주묻는질문 - 숨고 : 숨은고수</a></li>\r\n");
      out.write("                    <li title=\"문의 등록\">문의 등록</li>\r\n");
      out.write("                </ol>\r\n");
      out.write("                <form role=\"search\" class=\"search\" data-search=\"\" action=\"/hc/ko/search\" accept-charset=\"UTF-8\"\r\n");
      out.write("                    method=\"get\">\r\n");
      out.write("                    <img src=\"data:image/svg+xml;base64,PHN2ZyB3aWR0aD0iMTgiIGhlaWdodD0iMTgiIHZpZXdCb3g9IjAgMCAxOCAxOCIgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIj4KICAgIDxnIHRyYW5zZm9ybT0idHJhbnNsYXRlKDEgMSkiIHN0cm9rZT0iI0M1QzVDNSIgc3Ryb2tlLXdpZHRoPSIxLjUiIGZpbGw9Im5vbmUiIGZpbGwtcnVsZT0iZXZlbm9kZCI+CiAgICAgICAgPGNpcmNsZSBjeD0iNi42MTEiIGN5PSI2LjYxMSIgcj0iNS44NjEiLz4KICAgICAgICA8cGF0aCBzdHJva2UtbGluZWNhcD0icm91bmQiIHN0cm9rZS1saW5lam9pbj0icm91bmQiIGQ9Im0xNS4yNSAxNS4yNS00LjI0My00LjI0MyIvPgogICAgPC9nPgo8L3N2Zz4K\" alt=\"커뮤니티 검색 아이콘\" class=\"search\" id=\"mag\">\r\n");
      out.write("                    <input name=\"utf8\" type=\"hidden\" value=\"✓\" autocomplete=\"off\">\r\n");
      out.write("                    <input type=\"search\" name=\"query\" id=\"query\" placeholder=\"검색\" aria-label=\"검색\">\r\n");
      out.write("                </form>\r\n");
      out.write("            </nav>\r\n");
      out.write("\r\n");
      out.write("            <h1>문의 등록</h1>\r\n");
      out.write("            <div class=\"form\">\r\n");
      out.write("                <form id=\"reqWrite\" class=\"request-form\" name=\"reqWritePage\" data-form-type=\"request\"\r\n");
      out.write("                    action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/reqWriteOk.board\" accept-charset=\"UTF-8\" method=\"post\">\r\n");
      out.write("                    <input name=\"utf8\" type=\"hidden\" value=\"✓\" autocomplete=\"off\">\r\n");
      out.write("                    <!-- <input type=\"hidden\" name=\"authenticity_token\" value=\"hc:requests:client:x4NRfJjWvQZrLaWzqGxUx2akyeWMEdeNqQFX7JVHy6flsg_HUW8VUPyTwxQH_LmdGvkA_fizxIqNaV2L2IQxtA\" data-hc-status=\"ready\"> -->\r\n");
      out.write("<!--                     이메일 주소 입력 창 -->\r\n");
      out.write("                    <div class=\"form-field string required request_email\">\r\n");
      out.write("                        <label for=\"request_email\">문의 태그</label>\r\n");
      out.write("                        <input type=\"text\" name=\"reqType\" id=\"request_email\"\r\n");
      out.write("                            aria-required=\"true\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <!-- 제목 입력  -->\r\n");
      out.write("                    <div class=\"form-field string  required  request_subject\">\r\n");
      out.write("                        <label id=\"request_subject_label\" for=\"request_subject\">제목</label>\r\n");
      out.write("                        <input type=\"text\" name=\"reqTitle\" id=\"request_subject\" maxlength=\"150\" size=\"150\"\r\n");
      out.write("                            aria-required=\"true\" aria-labelledby=\"request_subject_label\">\r\n");
      out.write("                        <div id=\"request_subject_error\" class=\"notification notification-error notification-inline\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"suggestion-list\" data-hc-class=\"searchbox\" data-hc-suggestion-list=\"true\"></div>\r\n");
      out.write("                    <!-- 설명 -->\r\n");
      out.write("                    <div class=\"form-field required  request_description\">\r\n");
      out.write("                        <label id=\"request_description_label\" for=\"request_description\">설명</label>\r\n");
      out.write("                        \r\n");
      out.write("                        <textarea type=\"text\" name=\"reqContent\" id=\"request_description\" class=\"request_description\" style=\"border-radius: 4px;\"></textarea>\r\n");
      out.write("                        \r\n");
      out.write("                        <div id=\"request_description_error\" class=\"notification notification-error notification-inline\"></div>\r\n");
      out.write("                        <p id=\"request_description_hint\">요청에 관한 세부 정보를 입력하세요.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("\r\n");
      out.write("                    <!-- 첨부파일 -->\r\n");
      out.write("                    <!-- <div class=\"form-field\">\r\n");
      out.write("                        <label for=\"request-attachments\">첨부 파일</label>\r\n");
      out.write("                        <div id=\"upload-dropzone\" class=\"upload-dropzone\">\r\n");
      out.write("                            <input type=\"file\" multiple=\"true\" id=\"request-attachments\" data-fileupload=\"true\"\r\n");
      out.write("                                data-dropzone=\"upload-dropzone\" data-error=\"upload-error\"\r\n");
      out.write("                                data-create-url=\"/hc/ko/request_uploads\" data-name=\"request[attachments][]\"\r\n");
      out.write("                                data-pool=\"request-attachments-pool\" data-delete-confirm-msg=\"\"\r\n");
      out.write("                                aria-describedby=\"upload-error\">\r\n");
      out.write("                            <span>\r\n");
      out.write("                                <a>파일 추가</a> 또는 파일을 여기로 드래그\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div id=\"upload-error\" class=\"notification notification-error notification-inline\"\r\n");
      out.write("                            style=\"display: none;\">\r\n");
      out.write("                            <span data-upload-error-message=\"\"></span>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <ul id=\"request-attachments-pool\" class=\"upload-pool\" data-template=\"upload-template\"></ul>\r\n");
      out.write("\r\n");
      out.write("                        <script type=\"text/html\" id=\"upload-template\">\r\n");
      out.write("\r\n");
      out.write("                                  <li class=\"upload-item\" data-upload-item>\r\n");
      out.write("                                    <a class=\"upload-link\" target=\"_blank\" data-upload-link></a>\r\n");
      out.write("                                    <p class=\"upload-path\" data-upload-path></p>\r\n");
      out.write("                                    <p class=\"upload-path\" data-upload-size></p>\r\n");
      out.write("                                    <p data-upload-issue class=\"notification notification-alert notification-inline\" aria-hidden=\"true\"></p>\r\n");
      out.write("                                    <span class=\"upload-remove\" data-upload-remove></span>\r\n");
      out.write("                                    <div class=\"upload-progress\" data-upload-progress></div>\r\n");
      out.write("                                    <input type=\"hidden\">\r\n");
      out.write("                                  </li>\r\n");
      out.write("                                  </script>\r\n");
      out.write("                    </div> -->\r\n");
      out.write("                    <footer><input type=\"submit\" name=\"commit\" value=\"제출\" onclick=\"goJoin()\"></footer>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </main>\r\n");
      out.write("\r\n");
      out.write("    <!-- / -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.6.4.min.js\"></script>\r\n");
      out.write("    <script src=\"//static.zdassets.com/hc/assets/ko.29849816fa1a05db5228.js\"></script>\r\n");
      out.write("    <script src=\"https://soomgohelp.zendesk.com/auth/v2/host/without_iframe.js\"\r\n");
      out.write("        data-return-to=\"https://help.soomgo.com/hc/ko/requests/new\" data-locale=\"ko\"></script>\r\n");
      out.write("	<script src=\"../../static/js/request-board-jym/form.js\"></script>\r\n");
      out.write("  \r\n");
      out.write("    <script src=\"//static.zdassets.com/hc/assets/moment-4ef0d82f9fc65c8a28f659aa3430955f.js\"></script>\r\n");
      out.write("    <script src=\"//static.zdassets.com/hc/assets/hc_enduser-72ea9c8e0185dd6c21008a1e827304ff.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- <iframe id=\"_hjSafeContext_74772397\" title=\"_hjSafeContext\" tabindex=\"-1\" aria-hidden=\"true\" src=\"about:blank\"\r\n");
      out.write("        style=\"display: none !important; width: 1px !important; height: 1px !important; opacity: 0 !important; pointer-events: none !important;\"></iframe> -->\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
