/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.22
 * Generated at: 2019-10-07 09:28:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.xava;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.openxava.util.XavaPreferences;
import org.openxava.util.Is;
import org.openxava.controller.meta.MetaControllers;
import org.openxava.controller.meta.MetaAction;

public final class barButton_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/xava/imports.jsp", Long.valueOf(1570181256036L));
    _jspx_dependants.put("/WEB-INF/lib/standard-jstlel.jar", Long.valueOf(1570181256367L));
    _jspx_dependants.put("jar:file:/C:/Users/javi/git/openxava/OpenXavaTest/web/WEB-INF/lib/standard-jstlel.jar!/META-INF/fmt-1_0.tld", Long.valueOf(1425975068000L));
    _jspx_dependants.put("jar:file:/C:/Users/javi/git/openxava/OpenXavaTest/web/WEB-INF/lib/standard-jstlel.jar!/META-INF/c-1_0.tld", Long.valueOf(1425975068000L));
    _jspx_dependants.put("/WEB-INF/openxava.tld", Long.valueOf(1570181256371L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.openxava.controller.meta.MetaAction");
    _jspx_imports_classes.add("org.openxava.util.XavaPreferences");
    _jspx_imports_classes.add("org.openxava.controller.meta.MetaControllers");
    _jspx_imports_classes.add("org.openxava.util.Is");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005fimage_0026_005fcssClass_005fargv_005faction_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005flink_0026_005fargv_005faction;

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
    _005fjspx_005ftagPool_005fxava_005fimage_0026_005fcssClass_005fargv_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fxava_005flink_0026_005fargv_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fxava_005fimage_0026_005fcssClass_005fargv_005faction_005fnobody.release();
    _005fjspx_005ftagPool_005fxava_005flink_0026_005fargv_005faction.release();
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.openxava.web.style.Style style = null;
      style = (org.openxava.web.style.Style) _jspx_page_context.getAttribute("style", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (style == null){
        style = new org.openxava.web.style.Style();
        _jspx_page_context.setAttribute("style", style, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\n');
      out.write('\n');

boolean showImages = style.isShowImageInButtonBarButton();
boolean showIcons = style.isUseIconsInsteadOfImages(); 
boolean showLabels = !showImages?true:XavaPreferences.getInstance().isShowLabelsForToolBarActions();
String actionName = request.getParameter("action");
String addSpaceWithoutImage = request.getParameter("addSpaceWithoutImage");
boolean addSpace = "true".equals(addSpaceWithoutImage);
if (!Is.emptyString(actionName)) {
	MetaAction action = MetaControllers.getMetaAction(request.getParameter("action"));
	String argv = request.getParameter("argv");
	String label = action.getLabel(request); 

      out.write('\n');
      out.write('\n');
      out.write('	');
 if (style.isUseStandardImageActionForOnlyImageActionOnButtonBar() && action.hasImage() && Is.emptyString(label)) { 
      out.write('\n');
      //  xava:image
      org.openxava.web.taglib.ImageTag _jspx_th_xava_005fimage_005f0 = (org.openxava.web.taglib.ImageTag) _005fjspx_005ftagPool_005fxava_005fimage_0026_005fcssClass_005fargv_005faction_005fnobody.get(org.openxava.web.taglib.ImageTag.class);
      boolean _jspx_th_xava_005fimage_005f0_reused = false;
      try {
        _jspx_th_xava_005fimage_005f0.setPageContext(_jspx_page_context);
        _jspx_th_xava_005fimage_005f0.setParent(null);
        // /xava/barButton.jsp(24,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005fimage_005f0.setAction(action.getQualifiedName());
        // /xava/barButton.jsp(24,0) name = argv type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005fimage_005f0.setArgv(argv );
        // /xava/barButton.jsp(24,0) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005fimage_005f0.setCssClass(style.getButtonBarImage());
        int _jspx_eval_xava_005fimage_005f0 = _jspx_th_xava_005fimage_005f0.doStartTag();
        if (_jspx_th_xava_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005fimage_0026_005fcssClass_005fargv_005faction_005fnobody.reuse(_jspx_th_xava_005fimage_005f0);
        _jspx_th_xava_005fimage_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fimage_005f0, _jsp_getInstanceManager(), _jspx_th_xava_005fimage_005f0_reused);
      }
      out.write('	');
      out.write('\n');
      out.write('	');
 } else {  
      out.write("\t\t\n");
      out.write("<span class=\"");
      out.print(style.getButtonBarButton());
      out.write("\">\t\n");
      //  xava:link
      org.openxava.web.taglib.LinkTag _jspx_th_xava_005flink_005f0 = (org.openxava.web.taglib.LinkTag) _005fjspx_005ftagPool_005fxava_005flink_0026_005fargv_005faction.get(org.openxava.web.taglib.LinkTag.class);
      boolean _jspx_th_xava_005flink_005f0_reused = false;
      try {
        _jspx_th_xava_005flink_005f0.setPageContext(_jspx_page_context);
        _jspx_th_xava_005flink_005f0.setParent(null);
        // /xava/barButton.jsp(27,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005flink_005f0.setAction(action.getQualifiedName());
        // /xava/barButton.jsp(27,0) name = argv type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005flink_005f0.setArgv(argv );
        int _jspx_eval_xava_005flink_005f0 = _jspx_th_xava_005flink_005f0.doStartTag();
        if (_jspx_eval_xava_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write('\n');
            out.write('	');
            out.write('	');
 
		boolean showLabel = (showLabels || !action.hasImage()) && !Is.emptyString(label);  
		boolean showImage = showImages && action.hasImage() || action.hasImage() && Is.emptyString(label);
		boolean showIcon = action.hasIcon() && (showImages && (showIcons || !action.hasImage()) || Is.emptyString(label) && (showIcons || !action.hasImage())); 
		
            out.write('\n');
            out.write('	');
            out.write('	');
 if (showIcon) { 
            out.write("\n");
            out.write("\t\t<i class=\"mdi mdi-");
            out.print(action.getIcon());
            out.write("\"></i>\n");
            out.write("\t\t");
 } else if (showImage) { 
            out.write("\n");
            out.write("\t\t<span style=\"background: url(");
            out.print(request.getContextPath());
            out.write('/');
            out.print(style.getImagesFolder());
            out.write('/');
            out.print(action.getImage());
            out.write(") no-repeat 5px 50%;\">\n");
            out.write("\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
            out.write("\t\t</span>\t\t\n");
            out.write("\t\t");
 } else if(addSpace) {
            out.write("\n");
            out.write("\t\t<span>\n");
            out.write("\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
            out.write("\t\t</span>\n");
            out.write("\t\t");

		}
		if (showLabel) { 
            out.write("\t\t\t \t\t\t\t \t\t\t\n");
            out.write("\t\t");
            out.print(label);
            out.write('\n');
            out.write('	');
            out.write('	');
 } 
            out.write("\t\t\n");
            out.write("\t");
            int evalDoAfterBody = _jspx_th_xava_005flink_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_xava_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005flink_0026_005fargv_005faction.reuse(_jspx_th_xava_005flink_005f0);
        _jspx_th_xava_005flink_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005flink_005f0, _jsp_getInstanceManager(), _jspx_th_xava_005flink_005f0_reused);
      }
      out.write('\n');
      out.write('	');
 } 
      out.write("\t\n");
      out.write("</span>\n");

}

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
