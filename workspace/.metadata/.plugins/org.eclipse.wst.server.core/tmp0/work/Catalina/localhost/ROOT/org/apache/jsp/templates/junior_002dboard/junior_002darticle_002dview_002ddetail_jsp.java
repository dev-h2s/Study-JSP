/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-04-28 10:55:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.templates.junior_002dboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class junior_002darticle_002dview_002ddetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/templates/junior-board/../mainpageSeo/header.jsp", Long.valueOf(1682651940926L));
    _jspx_dependants.put("/templates/junior-board/../mainpageSeo/footer.jsp", Long.valueOf(1682068001331L));
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
      out.write("<link rel=\"stylesheet\" href=\"../../static/css/junior-board/junior-article-view-detail.css\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Noto+Sans+KR&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<title>글 상세보기</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- \r\n");
      out.write("		제목 보여주는 sticky header입니다. \r\n");
      out.write("		스크롤 내리면서 프로필이 보일 때 잠깐 없어졌다 다시 뿅하고 나옵니다. \r\n");
      out.write("	-->\r\n");
      out.write("	<div id=\"app-sticky-nav\">\r\n");
      out.write("		<section class=\"fixed show\">\r\n");
      out.write("			<section class=\"fixed-wrapper\">\r\n");
      out.write("				<h2 class=\"fixed-title\">이직 면접 이거 놓치면 불합격!</h2>\r\n");
      out.write("				<i class=\"share\"></i>\r\n");
      out.write("			</section>\r\n");
      out.write("		</section>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div id=\"app-body\">\r\n");
      out.write("		<div class=\"community-container container\">\r\n");
      out.write("			<div class=\"pro-knowhow-container\">\r\n");
      out.write("				<section>\r\n");
      out.write("					<section class=\"pro-knowhow-detail\">\r\n");
      out.write("						<article>\r\n");
      out.write("							<section class=\"cover-image-wrapper\">\r\n");
      out.write("								<img alt=\"커버이미지\" class=\"cover-image\"\r\n");
      out.write("									src=\"https://static.cdn.soomgo.com/upload/talkboard/daa7675e-e26d-4a0e-ac1f-ad53dc98a46a.png?webp=1\">\r\n");
      out.write("							</section>\r\n");
      out.write("\r\n");
      out.write("							<h1 class=\"title\">이직 면접 이거 놓치면 불합격!</h1>\r\n");
      out.write("\r\n");
      out.write("							<div class=\"observer-container\">\r\n");
      out.write("								<div class=\"a\">\r\n");
      out.write("									<section class=\"profile\">\r\n");
      out.write("										<div class=\"user-profile-picture profile-picture\">\r\n");
      out.write("											<div class=\"is-square\"\r\n");
      out.write("												style=\"background-image: url(https://static.cdn.soomgo.com/upload/profile/0842b268-652a-40fa-bfdf-914dcd55cbe7.jpg?webp=1&amp;h=320&amp;w=320);\"></div>\r\n");
      out.write("										</div>\r\n");
      out.write("										<section class=\"pro-info\">\r\n");
      out.write("											<p class=\"pro-name\">김주호</p>\r\n");
      out.write("											<span class=\"pro-sub-info\">2023.04.15</span>\r\n");
      out.write("										</section>\r\n");
      out.write("										<i class=\"share\"></i>\r\n");
      out.write("									</section>\r\n");
      out.write("								</div>\r\n");
      out.write("								<!---->\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("							<p class=\"brief-intro\">더 이상 말 못하는 사람이 없게끔! 면접, 보이스, 발표, 키즈스피치\r\n");
      out.write("								내가 달라지는 팁을 알려드리는^^ 전직 강남스피치학원 전임강사 부산지역 스피치/면접 최다리뷰고수 떠버리곰이에요!\r\n");
      out.write("\r\n");
      out.write("								월요일만 되면 암울하고 성장하지 않고 땀나게 뛰는데 월급은 스쳐만 가고! '좋소 좋소 좋좋소'를 떠나는 지금이야말로\r\n");
      out.write("								이직 준비의 시기! 언제까지 잡코리아 사람인 눈팅만 하다 채용공고 마감되고 한탄만 할 건가요. \r\n");
      out.write("								\r\n");
      out.write("								천 리 길도 한 걸음부터 \r\n");
      out.write("								숨고 면접 분야 부산지역 리뷰 1위 \r\n");
      out.write("								면접 합격률 92% 적중률 80% \r\n");
      out.write("								김주호 강사와 함께 이직 체크리스트 해보세요^^​</p>\r\n");
      out.write("\r\n");
      out.write("							<div>\r\n");
      out.write("								<section class=\"detail-subject\">\r\n");
      out.write("									<h3 class=\"section-title\">이직을 실패하는 이유? 경험정리/이직동기/취준감각</h3>\r\n");
      out.write("									<ul class=\"medium-list\">\r\n");
      out.write("										<li class=\"medium-wrapper\"><img alt=\"고수의 노하우 첨부파일 이미지\"\r\n");
      out.write("											class=\"medium\"\r\n");
      out.write("											src=\"https://static.cdn.soomgo.com/upload/talkboard/4ebd7894-ddf3-494e-97c8-54037a799e61.png\">\r\n");
      out.write("										</li>\r\n");
      out.write("									</ul>\r\n");
      out.write("									<p class=\"section-content\">\r\n");
      out.write("										1. 경험 정리가 되지 못하고 있다면 핵심 한방을 잡을 수없습니다! \r\n");
      out.write("										지금이라도 경험을 정리하자! \r\n");
      out.write("										경험은 원인-해결책-성과-마인드셋 순으로! \r\n");
      out.write("										마인드셋은 성과를 만든 내 가치관과 기준! \r\n");
      out.write("										\r\n");
      out.write("										2. 이직 동기는 잊지 말자! \r\n");
      out.write("										이직 동기는 애인이 어디가 마음에 드냐는 말과 동급! \r\n");
      out.write("										네가 돈이 많아서!전 여친과 싸워서!그냥 네가 좋아서!라는 말은 사랑하지 않는다는 말! \r\n");
      out.write("										잊지 말자! 현 여친(이직회사)이 좋은 이유는 전 여친(기존회사)이 마음에 안 들어서가 아니다! \r\n");
      out.write("										\r\n");
      out.write("										3. 취준감각을 모르겠는가? 자소서를 계속 쓰면서 설득 감각을 익혀라! \r\n");
      out.write("										산업분석, 회사 분석, 꾸준한 지원! \r\n");
      out.write("										한 우물만 판다면 손해다!\r\n");
      out.write("									</p>\r\n");
      out.write("								</section>\r\n");
      out.write("								<section class=\"detail-subject\">\r\n");
      out.write("									<h3 class=\"section-title\">합격하는 이직 면접 step 1 합격 자소서 체크리스트</h3>\r\n");
      out.write("									<ul class=\"medium-list\">\r\n");
      out.write("										<li class=\"medium-wrapper\"><img alt=\"고수의 노하우 첨부파일 이미지\"\r\n");
      out.write("											class=\"medium\"\r\n");
      out.write("											src=\"https://static.cdn.soomgo.com/upload/talkboard/ff02aad1-be98-4dff-99de-ff4e4b12e2b5.png\">\r\n");
      out.write("										</li>\r\n");
      out.write("									</ul>\r\n");
      out.write("									<p class=\"section-content\">주말에 꾸역꾸역 만들어낸 자소서 합격하는 자소서일까\r\n");
      out.write("										조마조마 된다면! 따라가봅시다! 1) 의도는 파악했는가? 내가 '갑'일까 면접관이'갑'일까? 면접관이 갑이라면\r\n");
      out.write("										내가 하고픈 말을 해야 할까? 남이 듣고 싶은 말을 해야 할까? 지원 동기는 내가 가진 강점을 말하는 게\r\n");
      out.write("										맞을까? 그 강점이 회사의 신사업과 업무에 어떻게 기여할 수 있는지를 어필하는 게 맞을까? 2) 용어, 트렌드는\r\n");
      out.write("										파악했는가? 동종업계에 일하고 있는 당신! 업무 용어로 간결하게 설명하고 있는가? 동종업계가 아닌 곳에서\r\n");
      out.write("										이직하고픈 당신 업무 용어를 아세요?... V-log를 통해서 직무 이해부터 들어가자! Tip) 답변에서 가장\r\n");
      out.write("										기억에 남는 단어를 반드시 구글링해라! 3) 수치를 통해서 전달했는가? 행동하게 만들기 위해서는 기억하게\r\n");
      out.write("										만들어야 한다! 면접관의 단기기억에서 내용을 빠르게 해독할 수 있는 것은? 문자일까? 숫자일까? 성과를 숫자로\r\n");
      out.write("										만들고! 숫자가 약하다면 반드시 변화율로 표현하라! (3명에서 5명으로 증가 -&gt;66% 고객량 증가)\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("										이직면접 대비가 어렵다고요? 그렇다면 부산면접과외 전문 FUNFUN 한 스피치 김주호 강사가 도와드리겠습니다!\r\n");
      out.write("\r\n");
      out.write("										쉽고 재미있고 빠르게 성장하게 만드는 수업! 숨고에서 '바로' '지금' '여기' \r\n");
      out.write("										김주호 강사의 Interview Class입니다.</p>\r\n");
      out.write("								</section>\r\n");
      out.write("							</div>\r\n");
      out.write("							\r\n");
      out.write("							<!-- 게시글의 footer -->\r\n");
      out.write("							<section class=\"profile-wrapper\">\r\n");
      out.write("								<div class=\"a\">\r\n");
      out.write("									<section class=\"profile border-top\">\r\n");
      out.write("										<div class=\"user-profile-picture profile-picture\">\r\n");
      out.write("											<div class=\"is-square\" style=\"background-image: url(https://static.cdn.soomgo.com/upload/profile/0842b268-652a-40fa-bfdf-914dcd55cbe7.jpg?h=320&amp;w=320);\"></div>\r\n");
      out.write("										</div>\r\n");
      out.write("										<section class=\"pro-info\">\r\n");
      out.write("											<p class=\"pro-name\">김주호</p>\r\n");
      out.write("											<span class=\"pro-sub-info\">면접 컨설팅</span>\r\n");
      out.write("										</section>\r\n");
      out.write("										<button type=\"button\" class=\"btn request-btn btn-primary\">\r\n");
      out.write("											견적 요청\r\n");
      out.write("										</button>\r\n");
      out.write("									</section>\r\n");
      out.write("									<p class=\"profile-desc\">\r\n");
      out.write("										부산 면접/스피치 컨설팅 ''리뷰 1위'' 100% ''오프라인 1:1 코칭'' 오직 ''당신''만을 위한 하나의 기회!\r\n");
      out.write("									</p>\r\n");
      out.write("								</div>\r\n");
      out.write("							</section>\r\n");
      out.write("							<!---->\r\n");
      out.write("						</article>\r\n");
      out.write("						<!---->\r\n");
      out.write("						<!---->\r\n");
      out.write("						\r\n");
      out.write("						<div class=\"v-portal\" style=\"display: none;\"></div>\r\n");
      out.write("					</section>\r\n");
      out.write("				</section>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!---->\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.4.min.js\"></script>\r\n");
      out.write("<script src=\"../../static/js/junior-board/junior-article-view-detail.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../../static/css/mainpageSeo/hf.css\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Noto+Sans+KR&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<footer>\r\n");
      out.write("			<nav id=\"app-footer\" class=\"footer-container\" data-v-4e4965bd=\"\">\r\n");
      out.write("				<div class=\"footer-container-row container\" data-v-4e4965bd=\"\">\r\n");
      out.write("					<div class=\"col-content margin-bottom\" data-v-4e4965bd=\"\">\r\n");
      out.write("						<p class=\"text contact\" data-v-4e4965bd=\"\">1599-5319</p>\r\n");
      out.write("						<p class=\"text-middle\" data-v-4e4965bd=\"\">\r\n");
      out.write("							평일 10:00 - 18:00<br data-v-4e4965bd=\"\">(점심시간 13:00 - 14:00\r\n");
      out.write("							제외 · 주말/공휴일 제외)\r\n");
      out.write("						</p>\r\n");
      out.write("						<a class=\"download\" data-v-4e4965bd=\"\"\r\n");
      out.write("							href=\"https://soomgoapp.onelink.me/6cqv?af_channel=cpc&amp;af_dp=smgo%3A%2F%2Fhome%2F&amp;af_keywords=%EC%88%A8%EA%B3%A0&amp;af_sub2=%EB%A9%94%EC%9D%B8&amp;af_sub4=footer&amp;af_web_dp=https%3A%2F%2Fsoomgo.com%2Fapp-download%2Fsender&amp;c=%EB%A9%94%EC%9D%B8&amp;pid=google\"><img\r\n");
      out.write("							src=\"https://assets.cdn.soomgo.com/icons/icon-download-appstore.svg\"\r\n");
      out.write("							alt=\"앱스토어\" data-v-4e4965bd=\"\">APP STORE </a><a class=\"download\"\r\n");
      out.write("							data-v-4e4965bd=\"\"\r\n");
      out.write("							href=\"https://soomgoapp.onelink.me/6cqv?af_channel=cpc&amp;af_dp=smgo%3A%2F%2Fhome%2F&amp;af_keywords=%EC%88%A8%EA%B3%A0&amp;af_sub2=%EB%A9%94%EC%9D%B8&amp;af_sub4=footer&amp;af_web_dp=https%3A%2F%2Fsoomgo.com%2Fapp-download%2Fsender&amp;c=%EB%A9%94%EC%9D%B8&amp;pid=google\"><img\r\n");
      out.write("							src=\"https://assets.cdn.soomgo.com/icons/icon-download-palystore.svg\"\r\n");
      out.write("							alt=\"구글플레이\" data-v-4e4965bd=\"\">PLAY STORE </a>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-content right\" data-v-4e4965bd=\"\">\r\n");
      out.write("						<ul class=\"content-list\" data-v-4e4965bd=\"\">\r\n");
      out.write("							<li data-v-4e4965bd=\"\" class=\"open-padding\"><span\r\n");
      out.write("								class=\"text-middle title category\" data-v-4e4965bd=\"\">\r\n");
      out.write("									중신소개 <span class=\"new-badge\" style=\"display: none;\"\r\n");
      out.write("									data-v-4e4965bd=\"\">N</span>\r\n");
      out.write("								<!---->\r\n");
      out.write("							</span>\r\n");
      out.write("							<div style=\"\" data-v-4e4965bd=\"\">\r\n");
      out.write("									<a href=\"/about\" class=\"text-middle category\"\r\n");
      out.write("										data-v-4e4965bd=\"\"> 회사소개 <span class=\"new-badge\"\r\n");
      out.write("										style=\"display: none;\" data-v-4e4965bd=\"\">N</span></a><a\r\n");
      out.write("										href=\"https://soomgo.career.greetinghr.com/\"\r\n");
      out.write("										class=\"text-middle category\" data-v-4e4965bd=\"\"> 채용안내 <span\r\n");
      out.write("										class=\"new-badge\" style=\"display: none;\" data-v-4e4965bd=\"\">N</span></a><a\r\n");
      out.write("										href=\"https://blog.soomgo.com\" class=\"text-middle category\"\r\n");
      out.write("										data-v-4e4965bd=\"\"> 팀블로그 <span class=\"new-badge\"\r\n");
      out.write("										style=\"display: none;\" data-v-4e4965bd=\"\">N</span></a>\r\n");
      out.write("								</div></li>\r\n");
      out.write("							<li data-v-4e4965bd=\"\" class=\"open-padding\"><span\r\n");
      out.write("								class=\"text-middle title category\" data-v-4e4965bd=\"\">\r\n");
      out.write("									고객안내 <span class=\"new-badge\" style=\"display: none;\"\r\n");
      out.write("									data-v-4e4965bd=\"\">N</span>\r\n");
      out.write("								<!---->\r\n");
      out.write("							</span>\r\n");
      out.write("							<div style=\"\" data-v-4e4965bd=\"\">\r\n");
      out.write("									<a href=\"/how-it-works\" class=\"text-middle category\"\r\n");
      out.write("										data-v-4e4965bd=\"\"> 이용안내 <span class=\"new-badge\"\r\n");
      out.write("										style=\"display: none;\" data-v-4e4965bd=\"\">N</span></a><a\r\n");
      out.write("										href=\"/safety\" class=\"text-middle category\" data-v-4e4965bd=\"\">\r\n");
      out.write("										안전정책 <span class=\"new-badge\" style=\"display: none;\"\r\n");
      out.write("										data-v-4e4965bd=\"\">N</span>\r\n");
      out.write("									</a><a href=\"/prices\" class=\"text-middle category\"\r\n");
      out.write("										data-v-4e4965bd=\"\"> 예상금액 <span class=\"new-badge\"\r\n");
      out.write("										style=\"display: none;\" data-v-4e4965bd=\"\">N</span></a><a\r\n");
      out.write("										href=\"/search/pro?from=footer\" class=\"text-middle category\"\r\n");
      out.write("										data-v-4e4965bd=\"\"> 주니어찾기 <span class=\"new-badge\"\r\n");
      out.write("										style=\"display: none;\" data-v-4e4965bd=\"\">N</span></a><a\r\n");
      out.write("										href=\"https://help.soomgo.com/hc/ko/articles/360056329911\"\r\n");
      out.write("										class=\"text-middle category\" data-v-4e4965bd=\"\"> 주니어보증 <span\r\n");
      out.write("										class=\"new-badge\" style=\"display: none;\" data-v-4e4965bd=\"\">N</span></a><a\r\n");
      out.write("										href=\"/questions/\" class=\"text-middle category\"\r\n");
      out.write("										data-v-4e4965bd=\"\"> 주니어에게묻다 <span class=\"new-badge\"\r\n");
      out.write("										style=\"display: none;\" data-v-4e4965bd=\"\">N</span></a><a\r\n");
      out.write("										href=\"/community/soomgo-life/all\"\r\n");
      out.write("										class=\"text-middle category sr-only\" data-v-4e4965bd=\"\">\r\n");
      out.write("										커뮤니티 <span class=\"new-badge\" style=\"display: none;\"\r\n");
      out.write("										data-v-4e4965bd=\"\">N</span>\r\n");
      out.write("									</a>\r\n");
      out.write("								</div></li>\r\n");
      out.write("							<li data-v-4e4965bd=\"\" class=\"open-padding\"><span\r\n");
      out.write("								class=\"text-middle title category\" data-v-4e4965bd=\"\">\r\n");
      out.write("									주니어안내 <span class=\"new-badge\" style=\"display: none;\"\r\n");
      out.write("									data-v-4e4965bd=\"\">N</span>\r\n");
      out.write("								<!---->\r\n");
      out.write("							</span>\r\n");
      out.write("							<div style=\"\" data-v-4e4965bd=\"\">\r\n");
      out.write("									<a href=\"/how-soomgo-works\" class=\"text-middle category\"\r\n");
      out.write("										data-v-4e4965bd=\"\"> 이용안내 <span class=\"new-badge\"\r\n");
      out.write("										style=\"display: none;\" data-v-4e4965bd=\"\">N</span></a><a\r\n");
      out.write("										href=\"https://help.soomgo.com/hc/ko/categories/115001218027\"\r\n");
      out.write("										class=\"text-middle category\" data-v-4e4965bd=\"\"> 주니어가이드 <span\r\n");
      out.write("										class=\"new-badge\" style=\"display: none;\" data-v-4e4965bd=\"\">N</span></a><a\r\n");
      out.write("										href=\"/pro\" class=\"text-middle category\" data-v-4e4965bd=\"\">\r\n");
      out.write("										주니어가입 <span class=\"new-badge\" style=\"display: none;\"\r\n");
      out.write("										data-v-4e4965bd=\"\">N</span>\r\n");
      out.write("									</a><a href=\"/pro-center\" class=\"text-middle category\"\r\n");
      out.write("										data-v-4e4965bd=\"\"> 주니어센터 <span class=\"new-badge\"\r\n");
      out.write("										style=\"display: none;\" data-v-4e4965bd=\"\">N</span></a>\r\n");
      out.write("								</div></li>\r\n");
      out.write("							<li data-v-4e4965bd=\"\" class=\"open-padding\"><span\r\n");
      out.write("								class=\"text-middle title category\" data-v-4e4965bd=\"\">\r\n");
      out.write("									고객센터 <span class=\"new-badge\" style=\"display: none;\"\r\n");
      out.write("									data-v-4e4965bd=\"\">N</span>\r\n");
      out.write("								<!---->\r\n");
      out.write("							</span>\r\n");
      out.write("							<div style=\"\" data-v-4e4965bd=\"\">\r\n");
      out.write("									<a\r\n");
      out.write("										href=\"https://help.soomgo.com/hc/ko/categories/360002081551-%EA%B3%B5%EC%A7%80%EC%82%AC%ED%95%AD\"\r\n");
      out.write("										class=\"text-middle category\" data-v-4e4965bd=\"\"> 공지사항 <span\r\n");
      out.write("										class=\"new-badge\" style=\"display: none;\" data-v-4e4965bd=\"\">N</span></a><a\r\n");
      out.write("										href=\"https://help.soomgo.com/hc/ko\"\r\n");
      out.write("										class=\"text-middle category\" data-v-4e4965bd=\"\"> 자주묻는질문 <span\r\n");
      out.write("										class=\"new-badge\" style=\"display: none;\" data-v-4e4965bd=\"\">N</span></a>\r\n");
      out.write("								</div></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"footer-container-row container terms\" data-v-4e4965bd=\"\">\r\n");
      out.write("					<div class=\"term-container\" data-v-4e4965bd=\"\">\r\n");
      out.write("						<div class=\"col-content term-content\" data-v-4e4965bd=\"\">\r\n");
      out.write("							<div class=\"col-content-list-term\" data-v-4e4965bd=\"\">\r\n");
      out.write("								<div class=\"terms-group\" data-v-4e4965bd=\"\">\r\n");
      out.write("									<a href=\"/terms/usage\" class=\"text term\" data-v-4e4965bd=\"\">이용약관</a><a\r\n");
      out.write("										href=\"/terms/privacy\" class=\"text term\" data-v-4e4965bd=\"\">개인정보처리방침</a>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"terms-group\" data-v-4e4965bd=\"\">\r\n");
      out.write("									<a href=\"/terms/location\" class=\"text term\" data-v-4e4965bd=\"\">위치기반\r\n");
      out.write("										서비스 이용약관</a><a target=\"_blank\" rel=\"nofollow\"\r\n");
      out.write("										href=\"https://www.ftc.go.kr/bizCommPop.do?wrkr_no=1208822325\"\r\n");
      out.write("										class=\"text term\" data-v-4e4965bd=\"\"> 사업자 정보확인 </a>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"col-content-list-term\" data-v-4e4965bd=\"\">\r\n");
      out.write("								<span class=\"text term-text\" data-v-4e4965bd=\"\">\r\n");
      out.write("									(주)브레이브모바일은 통신판매중개자로서 통신판매의 당사자가 아니며 개별 판매자가 제공하는 서비스에 대한 이행,\r\n");
      out.write("									계약사항 등과 관련한 의무와 책임은 거래당사자에게 있습니다. </span>\r\n");
      out.write("							</div>\r\n");
      out.write("							<ul class=\"col-content-guide\" data-v-4e4965bd=\"\">\r\n");
      out.write("								<li class=\"text\" data-v-4e4965bd=\"\">상호명:(주)브레이브모바일 ·\r\n");
      out.write("									대표이사:KIM ROBIN H · 개인정보책임관리자:김태우 · 주소:서울특별시 강남구 테헤란로 415, L7\r\n");
      out.write("									강남타워 5층</li>\r\n");
      out.write("								<li class=\"text\" data-v-4e4965bd=\"\">사업자등록번호:120-88-22325 ·\r\n");
      out.write("									통신판매업신고증:제 2021-서울강남-00551 호 · 직업정보제공사업 신고번호:서울청 제 2019-21호</li>\r\n");
      out.write("								<li class=\"text\" data-v-4e4965bd=\"\">고객센터:1599-5319 ·\r\n");
      out.write("									이메일:support@soomgo.com</li>\r\n");
      out.write("								<li class=\"text\" data-v-4e4965bd=\"\">Copyright ©Brave Mobile\r\n");
      out.write("									Inc. All Rights Reserved.</li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"col-content badge-list right\" data-v-4e4965bd=\"\">\r\n");
      out.write("							<a href=\"https://www.facebook.com/SoomgoKorea/\" target=\"_blank\"\r\n");
      out.write("								class=\"footer-badge\" data-v-4e4965bd=\"\"><img\r\n");
      out.write("								src=\"https://assets.cdn.soomgo.com/icons/icon-footer-sns-facebook.svg\"\r\n");
      out.write("								alt=\"주니어 페이스북 계정\" data-v-4e4965bd=\"\"></a><a\r\n");
      out.write("								href=\"https://www.instagram.com/soomgo_official/\"\r\n");
      out.write("								target=\"_blank\" class=\"footer-badge\" data-v-4e4965bd=\"\"><img\r\n");
      out.write("								src=\"https://assets.cdn.soomgo.com/icons/icon-footer-sns-instagram.svg\"\r\n");
      out.write("								alt=\"주니어 인스타그램\" data-v-4e4965bd=\"\"></a><a\r\n");
      out.write("								href=\"https://blog.naver.com/brave_mobile_mkt/\" target=\"_blank\"\r\n");
      out.write("								class=\"footer-badge\" data-v-4e4965bd=\"\"><img\r\n");
      out.write("								src=\"https://assets.cdn.soomgo.com/icons/icon-footer-sns-naverblog.svg\"\r\n");
      out.write("								alt=\"주니어 블로그\" data-v-4e4965bd=\"\"></a><a\r\n");
      out.write("								href=\"https://post.naver.com/brave_mobile_mkt?isHome=1\"\r\n");
      out.write("								target=\"_blank\" class=\"footer-badge\" data-v-4e4965bd=\"\"><img\r\n");
      out.write("								src=\"https://assets.cdn.soomgo.com/icons/icon-footer-sns-naverpost.svg\"\r\n");
      out.write("								alt=\"주니어 포스트\" data-v-4e4965bd=\"\"></a><a\r\n");
      out.write("								href=\"https://news.soomgo.com\" target=\"_blank\"\r\n");
      out.write("								class=\"footer-badge\" data-v-4e4965bd=\"\"><img\r\n");
      out.write("								src=\"https://assets.cdn.soomgo.com/icons/icon-footer-sns-tistory.svg\"\r\n");
      out.write("								alt=\"주니어 스토리\" data-v-4e4965bd=\"\"></a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</nav>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- 전체 div -->\r\n");
      out.write("	</footer>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
