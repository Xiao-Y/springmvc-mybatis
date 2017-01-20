package org.apache.jsp.WEB_002dINF.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class prepareForUserAdd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/static/taglib.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sf_errors_path_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sf_form_modelAttribute_method_id_class_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_sf_errors_path_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sf_form_modelAttribute_method_id_class_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_sf_errors_path_nobody.release();
    _jspx_tagPool_sf_form_modelAttribute_method_id_class_action.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!doctype html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- åé¡µæ ç­¾ -->\r\n");
      out.write(" \r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/static/public.jsp", out, false);
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"forms\" class=\"mt10\">\r\n");
      out.write("        <div class=\"box\">\r\n");
      out.write("          <div class=\"box_border\">\r\n");
      out.write("            <div class=\"box_top\"><b class=\"pl15\"><span style=\"cursor:pointer\" onclick=\"history.go(-1)\">&lt;&nbsp;返回&nbsp;&nbsp;</span>编辑问题信息</b></div>\r\n");
      out.write("            <div class=\"box_center\">\r\n");
      out.write("            \t");
      //  sf:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_sf_form_0 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_sf_form_modelAttribute_method_id_class_action.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_sf_form_0.setPageContext(_jspx_page_context);
      _jspx_th_sf_form_0.setParent(null);
      _jspx_th_sf_form_0.setId("userForm");
      _jspx_th_sf_form_0.setDynamicAttribute(null, "class", new String("jqtransform"));
      _jspx_th_sf_form_0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }/user/updateUserInfo", java.lang.String.class, (PageContext)_jspx_page_context, null));
      _jspx_th_sf_form_0.setMethod("post");
      _jspx_th_sf_form_0.setModelAttribute("user");
      int[] _jspx_push_body_count_sf_form_0 = new int[] { 0 };
      try {
        int _jspx_eval_sf_form_0 = _jspx_th_sf_form_0.doStartTag();
        if (_jspx_eval_sf_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t\t<input type=\"hidden\" id=\"userId\" name=\"userId\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.userId }", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\"> \r\n");
            out.write("\t               \t<table class=\"form_table pt15 pb15\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
            out.write("\t                 \t<tr>\r\n");
            out.write("\t                  \t\t<td class=\"td_right\">用户名：</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>\r\n");
            out.write("\t\t\t\t\t\t\t\t<input class=\"input-text lh30\" type=\"text\" name=\"userName\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.userName }", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">\r\n");
            out.write("\t\t\t\t\t\t\t\t<span id=\"questionEx\"><span style=\"color: red;\">*必填项</span>");
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_errors_0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_sf_errors_path_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_errors_0.setPageContext(_jspx_page_context);
            _jspx_th_sf_errors_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
            _jspx_th_sf_errors_0.setPath("userName");
            int[] _jspx_push_body_count_sf_errors_0 = new int[] { 0 };
            try {
              int _jspx_eval_sf_errors_0 = _jspx_th_sf_errors_0.doStartTag();
              if (_jspx_th_sf_errors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_sf_errors_0[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_sf_errors_0.doCatch(_jspx_exception);
            } finally {
              _jspx_th_sf_errors_0.doFinally();
              _jspx_tagPool_sf_errors_path_nobody.reuse(_jspx_th_sf_errors_0);
            }
            out.write("</span>\r\n");
            out.write("\t\t\t\t\t\t\t</td>\r\n");
            out.write("\t                \t</tr>\r\n");
            out.write("\t                 \t<tr>\r\n");
            out.write("\t                  \t\t<td class=\"td_right\">年龄：</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>\r\n");
            out.write("\t\t\t\t\t\t\t\t<input class=\"input-text lh30\" type=\"text\" name=\"age\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.age }", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">\r\n");
            out.write("\t\t\t\t\t\t\t\t<span id=\"questionEx\"><span style=\"color: red;\">*必填项</span>");
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_errors_1 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_sf_errors_path_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_errors_1.setPageContext(_jspx_page_context);
            _jspx_th_sf_errors_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
            _jspx_th_sf_errors_1.setPath("age");
            int[] _jspx_push_body_count_sf_errors_1 = new int[] { 0 };
            try {
              int _jspx_eval_sf_errors_1 = _jspx_th_sf_errors_1.doStartTag();
              if (_jspx_th_sf_errors_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_sf_errors_1[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_sf_errors_1.doCatch(_jspx_exception);
            } finally {
              _jspx_th_sf_errors_1.doFinally();
              _jspx_tagPool_sf_errors_path_nobody.reuse(_jspx_th_sf_errors_1);
            }
            out.write("</span>\r\n");
            out.write("\t\t\t\t\t\t\t</td>\r\n");
            out.write("\t                \t</tr>\r\n");
            out.write("\t                 \t<tr>\r\n");
            out.write("\t                  \t\t<td class=\"td_right\">联系方式：</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>\r\n");
            out.write("\t\t\t\t\t\t\t\t<input class=\"input-text lh30\" type=\"text\" name=\"phoneNumber\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.phoneNumber }", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">\r\n");
            out.write("\t\t\t\t\t\t\t\t<span id=\"questionEx\"><span style=\"color: red;\">*必填项</span>");
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_errors_2 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_sf_errors_path_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_errors_2.setPageContext(_jspx_page_context);
            _jspx_th_sf_errors_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
            _jspx_th_sf_errors_2.setPath("phoneNumber");
            int[] _jspx_push_body_count_sf_errors_2 = new int[] { 0 };
            try {
              int _jspx_eval_sf_errors_2 = _jspx_th_sf_errors_2.doStartTag();
              if (_jspx_th_sf_errors_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_sf_errors_2[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_sf_errors_2.doCatch(_jspx_exception);
            } finally {
              _jspx_th_sf_errors_2.doFinally();
              _jspx_tagPool_sf_errors_path_nobody.reuse(_jspx_th_sf_errors_2);
            }
            out.write("</span>\r\n");
            out.write("\t\t\t\t\t\t\t</td>\r\n");
            out.write("\t                \t</tr>\r\n");
            out.write("\t                 \t<tr>\r\n");
            out.write("\t                   \t\t<td class=\"td_right\">&nbsp;</td>\r\n");
            out.write("\t                   \t\t<td class=\"\">\r\n");
            out.write("\t\t                    \t<input type=\"button\" id=\"saveButton\" name=\"button\" class=\"btn btn82 btn_save2\" value=\"保存\"> \r\n");
            out.write("\t\t                     \t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
            out.write("\t\t                    \t<input type=\"reset\" name=\"button\" class=\"btn btn82 btn_res\" value=\"重置\"> \r\n");
            out.write("\t                   \t\t</td>\r\n");
            out.write("\t                 \t</tr>\r\n");
            out.write("\t               </table>\r\n");
            out.write("               ");
            int evalDoAfterBody = _jspx_th_sf_form_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_sf_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_sf_form_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_sf_form_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_sf_form_0.doFinally();
        _jspx_tagPool_sf_form_modelAttribute_method_id_class_action.reuse(_jspx_th_sf_form_0);
      }
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("     </div>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(\"#saveButton\").click(function(){\r\n");
      out.write("\tvar url;\r\n");
      out.write("\tvar userId = $(\"#userId\").val();\r\n");
      out.write("\tif(userId != ''){\r\n");
      out.write("\t\turl = \"/user/updateUserInfo\";\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\turl = \"/user/submitUserInfo\";\r\n");
      out.write("\t}\r\n");
      out.write("\t$(\"#userForm\").attr(\"action\",url);\r\n");
      out.write("\t$(\"#userForm\").submit();\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
