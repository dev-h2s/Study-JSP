/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-05-01 08:39:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.templates.request_002dboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class request_002dboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("	href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/css/request-board-jym/request-board.css\">\r\n");
      out.write("<link\r\n");
      out.write("	href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/image/logo/logo.png\"\r\n");
      out.write("	rel=\"shortcut icon\" type=\"image/x-icon\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("	href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/css/mainpageSeo/hf.css\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css2?family=Noto+Sans+KR&display=swap\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("	href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/css/mainpageSeo/hf.css\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css2?family=Noto+Sans+KR&display=swap\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("	\r\n");
      out.write("<title>숨고</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	<form action=\"\">\r\n");
      out.write("		<div id=\"app\" class=\"webp\" data-is-loaded=\"true\">\r\n");
      out.write("			<!-- 헤더 부분 -->\r\n");
      out.write("			<!-- 바디 -->\r\n");
      out.write("			<div id=\"app-body\">\r\n");
      out.write("				<div id=\"container\">\r\n");
      out.write("					<div id=\"joongshin-container\">\r\n");
      out.write("						<section id=\"questions\" class=\"questions\">\r\n");
      out.write("\r\n");
      out.write("							<!-- 바디 페이지 헤더 부분 -->\r\n");
      out.write("							<div class=\"observer-container\">\r\n");
      out.write("								<section class=\"questions-header\" id=\"questions-header\">\r\n");
      out.write("									<h1 class=\"questions-title\">문의 게시판</h1>\r\n");
      out.write("									<div>\r\n");
      out.write("										<div class=\"write-button-desktop\">\r\n");
      out.write("											<div class=\"dropdown b-dropdown btn-group\">\r\n");
      out.write("												<!---->\r\n");
      out.write("												<button type=\"button\"\r\n");
      out.write("													class=\"btn dropdown-toggle btn-primary\"\r\n");
      out.write("													style=\"cursor: pointer;\"\r\n");
      out.write("													onClick=\"location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/reqWrite.board'\">글쓰기</button>\r\n");
      out.write("											</div>\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("\r\n");
      out.write("								</section>\r\n");
      out.write("							</div>\r\n");
      out.write("							<!-- 본문 리스트 -->\r\n");
      out.write("							<div class=\"questions-content-layout\">\r\n");
      out.write("								<!-- 문의 게시판 내부 검색창 -->\r\n");
      out.write("								<!-- <div class=\"search-questions d-none\">\r\n");
      out.write("									<form class=\"search-form\">\r\n");
      out.write("										 <div role=\"group\" class=\"input-group\">\r\n");
      out.write("											<div class=\"input-group-prepend\">\r\n");
      out.write("												<img\r\n");
      out.write("													src=\"data:image/svg+xml;base64,PHN2ZyB3aWR0aD0iMTgiIGhlaWdodD0iMTgiIHZpZXdCb3g9IjAgMCAxOCAxOCIgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIj4KICAgIDxnIHRyYW5zZm9ybT0idHJhbnNsYXRlKDEgMSkiIHN0cm9rZT0iI0M1QzVDNSIgc3Ryb2tlLXdpZHRoPSIxLjUiIGZpbGw9Im5vbmUiIGZpbGwtcnVsZT0iZXZlbm9kZCI+CiAgICAgICAgPGNpcmNsZSBjeD0iNi42MTEiIGN5PSI2LjYxMSIgcj0iNS44NjEiLz4KICAgICAgICA8cGF0aCBzdHJva2UtbGluZWNhcD0icm91bmQiIHN0cm9rZS1saW5lam9pbj0icm91bmQiIGQ9Im0xNS4yNSAxNS4yNS00LjI0My00LjI0MyIvPgogICAgPC9nPgo8L3N2Zz4K\"\r\n");
      out.write("													alt=\"커뮤니티 검색 아이콘\" class=\"search\">\r\n");
      out.write("											</div>\r\n");
      out.write("											<input type=\"text\" placeholder=\"키워드와 #태그 모두 검색할 수 있어요.\"\r\n");
      out.write("												autocomplete=\"off\" class=\"search-input form-control\"\r\n");
      out.write("												maxlength=\"15\" id=\"__BVID__4795\" name=\"searchKeyword\">  \r\n");
      out.write("											<div class=\"input-group-append\">\r\n");
      out.write("												<img\r\n");
      out.write("													src=\"data:image/svg+xml;base64,PHN2ZyB3aWR0aD0iMjQiIGhlaWdodD0iMjQiIHZpZXdCb3g9IjAgMCAyNCAyNCIgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIj4KICAgIDxnIGZpbGw9Im5vbmUiIGZpbGwtcnVsZT0iZXZlbm9kZCI+CiAgICAgICAgPHBhdGggZD0iTTAgMGgyNHYyNEgweiIvPgogICAgICAgIDxnIHRyYW5zZm9ybT0idHJhbnNsYXRlKDMgMykiPgogICAgICAgICAgICA8Y2lyY2xlIGZpbGw9IiNDNUM1QzUiIGN4PSI5IiBjeT0iOSIgcj0iOSIvPgogICAgICAgICAgICA8cGF0aCBzdHJva2U9IiNGRkYiIHN0cm9rZS13aWR0aD0iMS41IiBzdHJva2UtbGluZWNhcD0icm91bmQiIHN0cm9rZS1saW5lam9pbj0icm91bmQiIGQ9Im02IDYgNi4wMDUgNi4wMDZNMTIuMDA1IDYgNiAxMi4wMDYiLz4KICAgICAgICA8L2c+CiAgICA8L2c+Cjwvc3ZnPgo=\"\r\n");
      out.write("													alt=\"검색어 삭제 아이콘\" class=\"reset\" style=\"display: none;\">\r\n");
      out.write("											</div>\r\n");
      out.write("										</div>  \r\n");
      out.write("									</form>\r\n");
      out.write("								</div> -->	\r\n");
      out.write("								<!-- 베너 '지금 가장 뜨거운 숨고픽' -->\r\n");
      out.write("								<!-- <section class=\"curation\">\r\n");
      out.write("									<div class=\"curation-header\">\r\n");
      out.write("										<h2 class=\"sg-text-headline sg-font-bold sg-text-gray-900\">지금\r\n");
      out.write("											가장 뜨거운 숨고픽🔥</h2>\r\n");
      out.write("										<span class=\"curation-page\">1/2</span>\r\n");
      out.write("									</div>\r\n");
      out.write("									배너\r\n");
      out.write("									<div class=\"slick-slider\">\r\n");
      out.write("										<button type=\"button\" data-role=\"none\"\r\n");
      out.write("											class=\"slick-arrow slick-prev slick-disabled\"\r\n");
      out.write("											style=\"display: block;\">Previous</button>\r\n");
      out.write("										<div class=\"slick-list\">\r\n");
      out.write("											<div class=\"slick-track\"\r\n");
      out.write("												style=\"width: 1020px; opacity: 1; transform: translate3d(0px, 0px, 0px);\">\r\n");
      out.write("												<div tabindex=\"-1\" data-index=\"0\"\r\n");
      out.write("													class=\"slick-slide slick-active slick-current\"\r\n");
      out.write("													style=\"outline: none; width: 204px;\">\r\n");
      out.write("													<div>\r\n");
      out.write("														<a\r\n");
      out.write("															href=\"/community/soomgo-life/posts/63db8b3ad1becfebc58891bc-%EC%88%A8%EA%B3%A0%EC%83%9D%ED%99%9C-%EA%B0%80%EC%9D%B4%EB%93%9C%EB%9D%BC%EC%9D%B8---?from=curation\"\r\n");
      out.write("															class=\"\" data-testid=\"curation-item\" tabindex=\"-1\"\r\n");
      out.write("															style=\"width: 100%; display: inline-block;\">\r\n");
      out.write("															<div class=\"curation-item admin-post\">\r\n");
      out.write("																<p\r\n");
      out.write("																	class=\"topic sg-text-subhead7 sg-font-medium sg-text-gray-500\">\r\n");
      out.write("																	공지사항</p>\r\n");
      out.write("																<h3\r\n");
      out.write("																	class=\"sg-text-subhead2 sg-font-bold sg-text-gray-900\">\r\n");
      out.write("																	숨고생활 가이드라인 🤝</h3>\r\n");
      out.write("																<p\r\n");
      out.write("																	class=\"user-name sg-text-description sg-font-regular sg-text-white\">\r\n");
      out.write("																	Soomgo</p>\r\n");
      out.write("															</div>\r\n");
      out.write("														</a>\r\n");
      out.write("													</div>\r\n");
      out.write("												</div>\r\n");
      out.write("												<div tabindex=\"-1\" data-index=\"1\" aria-hidden=\"false\"\r\n");
      out.write("													class=\"slick-slide slick-active\"\r\n");
      out.write("													style=\"outline: none; width: 204px;\">\r\n");
      out.write("													<div>\r\n");
      out.write("														<a\r\n");
      out.write("															href=\"/community/soomgo-life/posts/641a7cbf3696545a889f3bc5-%EC%88%A8%EA%B3%A0-50%EB%A7%8C-%EC%BA%90%EC%8B%9C%EC%99%80-%EC%BF%A0%ED%8F%B0-%EB%B0%9B%EC%9C%BC%EC%84%B8%EC%9A%94--?from=curation\"\r\n");
      out.write("															class=\"\" data-testid=\"curation-item\" tabindex=\"-1\"\r\n");
      out.write("															style=\"width: 100%; display: inline-block;\">\r\n");
      out.write("															<div class=\"curation-item admin-post\">\r\n");
      out.write("																<p\r\n");
      out.write("																	class=\"topic sg-text-subhead7 sg-font-medium sg-text-gray-500\">\r\n");
      out.write("																	공지사항</p>\r\n");
      out.write("																<h3\r\n");
      out.write("																	class=\"sg-text-subhead2 sg-font-bold sg-text-gray-900\">\r\n");
      out.write("																	숨고 50만 캐시와 쿠폰 받으세요🎁</h3>\r\n");
      out.write("																<p\r\n");
      out.write("																	class=\"user-name sg-text-description sg-font-regular sg-text-white\">\r\n");
      out.write("																	Soomgo</p>\r\n");
      out.write("															</div>\r\n");
      out.write("														</a>\r\n");
      out.write("													</div>\r\n");
      out.write("												</div>\r\n");
      out.write("												<div tabindex=\"-1\" data-index=\"2\" aria-hidden=\"false\"\r\n");
      out.write("													class=\"slick-slide slick-active\"\r\n");
      out.write("													style=\"outline: none; width: 204px;\">\r\n");
      out.write("													<div>\r\n");
      out.write("														<a\r\n");
      out.write("															href=\"/community/soomgo-life/posts/643384c0505cb9f47887cdc0---%EC%88%A8%EA%B3%A0-%EC%9D%B8%ED%84%B0%EB%B7%B0-%EC%A3%BC%EC%9D%B8%EA%B3%B5%EC%9D%B4-%EB%90%98%EC%96%B4%EB%B3%B4%EC%84%B8%EC%9A%94-?from=curation\"\r\n");
      out.write("															class=\"\" data-testid=\"curation-item\" tabindex=\"-1\"\r\n");
      out.write("															style=\"width: 100%; display: inline-block;\">\r\n");
      out.write("															<div class=\"curation-item admin-post\">\r\n");
      out.write("																<p\r\n");
      out.write("																	class=\"topic sg-text-subhead7 sg-font-medium sg-text-gray-500\">\r\n");
      out.write("																	공지사항</p>\r\n");
      out.write("																<h3\r\n");
      out.write("																	class=\"sg-text-subhead2 sg-font-bold sg-text-gray-900\">\r\n");
      out.write("																	💌숨고 인터뷰 주인공이 되어보세요!</h3>\r\n");
      out.write("																<p\r\n");
      out.write("																	class=\"user-name sg-text-description sg-font-regular sg-text-white\">\r\n");
      out.write("																	Soomgo</p>\r\n");
      out.write("															</div>\r\n");
      out.write("														</a>\r\n");
      out.write("													</div>\r\n");
      out.write("												</div>\r\n");
      out.write("												<div tabindex=\"-1\" data-index=\"3\" aria-hidden=\"true\"\r\n");
      out.write("													class=\"slick-slide\" style=\"outline: none; width: 204px;\">\r\n");
      out.write("													<div>\r\n");
      out.write("														<a\r\n");
      out.write("															href=\"/community/soomgo-life/posts/643982c1a982a333f790f526-%EC%9A%B4%EC%A0%84%EC%97%B0%EC%88%98-%EA%B3%A0%EC%88%98%EB%8B%98-%EC%B0%BE%EC%95%84%EC%9A%94--?from=curation\"\r\n");
      out.write("															class=\"\" data-testid=\"curation-item\" tabindex=\"-1\"\r\n");
      out.write("															style=\"width: 100%; display: inline-block;\">\r\n");
      out.write("															<div class=\"curation-item\">\r\n");
      out.write("																<p\r\n");
      out.write("																	class=\"topic sg-text-subhead7 sg-font-medium sg-text-gray-500\">\r\n");
      out.write("																	고수찾아요</p>\r\n");
      out.write("																<h3\r\n");
      out.write("																	class=\"sg-text-subhead2 sg-font-bold sg-text-gray-900\">\r\n");
      out.write("																	운전연수 고수님 찾아요😊</h3>\r\n");
      out.write("																<div class=\"react-items\">\r\n");
      out.write("																	<p\r\n");
      out.write("																		class=\"view sg-text-description sg-font-regular sg-text-gray-300\">\r\n");
      out.write("																		297</p>\r\n");
      out.write("																	<p\r\n");
      out.write("																		class=\"comment sg-text-description sg-font-regular sg-text-gray-300\">\r\n");
      out.write("																		8</p>\r\n");
      out.write("																</div>\r\n");
      out.write("															</div>\r\n");
      out.write("														</a>\r\n");
      out.write("													</div>\r\n");
      out.write("												</div>\r\n");
      out.write("												<div tabindex=\"-1\" data-index=\"4\" aria-hidden=\"true\"\r\n");
      out.write("													class=\"slick-slide\" style=\"outline: none; width: 204px;\">\r\n");
      out.write("													<div>\r\n");
      out.write("														<a\r\n");
      out.write("															href=\"/community/soomgo-life/posts/643a44cbf22d78d3e3cce226-%EC%88%A0-%EA%B0%90%EC%A0%95%EA%B0%80%EC%9D%98%EB%A2%B0?from=curation\"\r\n");
      out.write("															class=\"\" data-testid=\"curation-item\" tabindex=\"-1\"\r\n");
      out.write("															style=\"width: 100%; display: inline-block;\">\r\n");
      out.write("															<div class=\"curation-item\">\r\n");
      out.write("																<p\r\n");
      out.write("																	class=\"topic sg-text-subhead7 sg-font-medium sg-text-gray-500\">\r\n");
      out.write("																	얼마예요</p>\r\n");
      out.write("																<h3\r\n");
      out.write("																	class=\"sg-text-subhead2 sg-font-bold sg-text-gray-900\">\r\n");
      out.write("																	술 감정가의뢰</h3>\r\n");
      out.write("																<div class=\"react-items\">\r\n");
      out.write("																	<p\r\n");
      out.write("																		class=\"view sg-text-description sg-font-regular sg-text-gray-300\">\r\n");
      out.write("																		314</p>\r\n");
      out.write("																	<p\r\n");
      out.write("																		class=\"comment sg-text-description sg-font-regular sg-text-gray-300\">\r\n");
      out.write("																		17</p>\r\n");
      out.write("																</div>\r\n");
      out.write("															</div>\r\n");
      out.write("														</a>\r\n");
      out.write("													</div>\r\n");
      out.write("												</div>\r\n");
      out.write("											</div>\r\n");
      out.write("										</div>\r\n");
      out.write("										<button type=\"button\" data-role=\"none\"\r\n");
      out.write("											class=\"slick-arrow slick-next\" style=\"display: block;\">Next</button>\r\n");
      out.write("									</div>\r\n");
      out.write("								</section>\r\n");
      out.write(" -->\r\n");
      out.write("								<!-- 서비스/지역 필터 -->\r\n");
      out.write("								<section class=\"service-area-filter all fixed\">\r\n");
      out.write("									<!---->\r\n");
      out.write("									<button type=\"button\" class=\"btn btn-none chip-btn filter-btn\">\r\n");
      out.write("										<span data-v-130d9011=\"\">서비스</span>\r\n");
      out.write("									</button>\r\n");
      out.write("									<button type=\"button\" class=\"btn btn-none chip-btn filter-btn\"\r\n");
      out.write("										data-v-130d9011=\"\">\r\n");
      out.write("										<span data-v-130d9011=\"\">지역</span>\r\n");
      out.write("									</button>\r\n");
      out.write("								</section>\r\n");
      out.write("								<!-- 피드 (게시글 목록) -->\r\n");
      out.write("								<article class=\"questions-feed-list\">\r\n");
      out.write("									<ul class=\"feed-list\" id=\"content-wrap\">\r\n");
      out.write("										<!-- <li class=\"feed-item\">\r\n");
      out.write("												<a href=\"\" class=\"\" data-testid=\"soomgo-life-feed-item\">\r\n");
      out.write("														<p class=\"topic-name\">태그 들어갈 내용</p>\r\n");
      out.write("														<div class=\"feed-content service-address-info\">\r\n");
      out.write("															<div>\r\n");
      out.write("																<section class=\"item-wrapper\">\r\n");
      out.write("																	<h3>문의 글 제목</h3>\r\n");
      out.write("																	<p class=\"content\">본문 내용</p>\r\n");
      out.write("																</section>\r\n");
      out.write("																<p>지역정보</p>\r\n");
      out.write("															</div>\r\n");
      out.write("															<img alt=\"Resized_temp_1668128590947.1130780476_126927628503406.jpg\" data-src=\"https://static.cdn.soomgo.com/upload/media/aaa72ebc-fa5a-485c-9047-b364d82f4e33.jpg?h=80&amp;w=80&amp;webp=1\" src=\"https://static.cdn.soomgo.com/upload/media/aaa72ebc-fa5a-485c-9047-b364d82f4e33.jpg?h=80&amp;w=80&amp;webp=1\" lazy=\"loaded\">\r\n");
      out.write("															이미지 추가 할 내용\r\n");
      out.write("														</div>\r\n");
      out.write("														<div class=\"feed-footer\">\r\n");
      out.write("															<div class=\"user-interaction\">\r\n");
      out.write("																<span class=\"like sg-text-description sg-font-regular sg-text-gray-300\">추천 수</span>\r\n");
      out.write("																<span class=\"comment sg-text-description sg-font-regular sg-text-gray-300\">댓글 수</span>\r\n");
      out.write("															</div>\r\n");
      out.write("															<span class=\"sg-text-description sg-font-regular sg-text-gray-300\">작성 시간 ex) 00분전</span>\r\n");
      out.write("														</div>\r\n");
      out.write("													</a>\r\n");
      out.write("												</li> -->\r\n");
      out.write("									</ul>\r\n");
      out.write("								</article>\r\n");
      out.write("							</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<a id=\"top-btn\" role=\"button\" aria-label=\"위로 가기 버튼\" class=\"top-btn\"\r\n");
      out.write("						style=\"display: none;\"><img\r\n");
      out.write("						src=\"data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSIyNCIgaGVpZ2h0PSIyNCIgdmlld0JveD0iMCAwIDI0IDI0Ij4KICAgIDxnIGZpbGw9Im5vbmUiIGZpbGwtcnVsZT0iZXZlbm9kZCI+CiAgICAgICAgPGc+CiAgICAgICAgICAgIDxnPgogICAgICAgICAgICAgICAgPGc+CiAgICAgICAgICAgICAgICAgICAgPHBhdGggZD0iTTAgMEgyNFYyNEgweiIgdHJhbnNmb3JtPSJ0cmFuc2xhdGUoLTMyMy4wMDAwMDAsIC02ODAuMDAwMDAwKSB0cmFuc2xhdGUoMzExLjAwMDAwMCwgNjY4LjAwMDAwMCkgdHJhbnNsYXRlKDEyLjAwMDAwMCwgMTIuMDAwMDAwKSIvPgogICAgICAgICAgICAgICAgICAgIDxnIHN0cm9rZT0iI0I1QjVCNSIgc3Ryb2tlLWxpbmVjYXA9InJvdW5kIiBzdHJva2Utd2lkdGg9IjEuNSI+CiAgICAgICAgICAgICAgICAgICAgICAgIDxwYXRoIGQ9Ik03IDBMNyAxNSIgdHJhbnNmb3JtPSJ0cmFuc2xhdGUoLTMyMy4wMDAwMDAsIC02ODAuMDAwMDAwKSB0cmFuc2xhdGUoMzExLjAwMDAwMCwgNjY4LjAwMDAwMCkgdHJhbnNsYXRlKDEyLjAwMDAwMCwgMTIuMDAwMDAwKSB0cmFuc2xhdGUoNS4wMDAwMDAsIDQuNTAwMDAwKSIvPgogICAgICAgICAgICAgICAgICAgICAgICA8cGF0aCBzdHJva2UtbGluZWpvaW49InJvdW5kIiBkPSJNMCA3TDcgMCAxNCA3IiB0cmFuc2Zvcm09InRyYW5zbGF0ZSgtMzIzLjAwMDAwMCwgLTY4MC4wMDAwMDApIHRyYW5zbGF0ZSgzMTEuMDAwMDAwLCA2NjguMDAwMDAwKSB0cmFuc2xhdGUoMTIuMDAwMDAwLCAxMi4wMDAwMDApIHRyYW5zbGF0ZSg1LjAwMDAwMCwgNC41MDAwMDApIi8+CiAgICAgICAgICAgICAgICAgICAgPC9nPgogICAgICAgICAgICAgICAgPC9nPgogICAgICAgICAgICA8L2c+CiAgICAgICAgPC9nPgogICAgPC9nPgo8L3N2Zz4K\"\r\n");
      out.write("						alt=\"위로 가기\"></a>\r\n");
      out.write("					</section>\r\n");
      out.write("\r\n");
      out.write("					<!-- 글 상세보기에서 링크 이동할 부분 -->\r\n");
      out.write("					<div class=\"v-portal\" style=\"display: none;\"></div>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div id=\"app-sticky\" class=\"portal-target\"></div>\r\n");
      out.write("		<div id=\"app-body\"></div>\r\n");
      out.write("		<nav id=\"app-footer\" class=\"footer-container\"></nav>\r\n");
      out.write("		<div class=\"portal-target\"></div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</form>\r\n");
      out.write("</body>\r\n");
      out.write("<!-- <script src=\"/static/js/request-board-js/main-board.js\"></script> -->\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.1.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("	let boards = `");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boards}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("`;\r\n");
      out.write("	console.log(boards);\r\n");
      out.write("</script>\r\n");
      out.write("<script type =\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/js/request-board-jym/timer.js\"></script>\r\n");
      out.write("<script type =\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/js/request-board-jym/addBoard.js\"></script>\r\n");
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