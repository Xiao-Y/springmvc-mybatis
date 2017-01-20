package org.apache.jsp.WEB_002dINF.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class findUserList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/static/taglib.jsp");
    _jspx_dependants.add("/WEB-INF/pageTag.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_x_pager_url_recordCount_pageSize_pageNo_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_x_pager_url_recordCount_pageSize_pageNo_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_x_pager_url_recordCount_pageSize_pageNo_nobody.release();
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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

      out.write("<!doctype html>\n");
      out.write("\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- åé¡µæ ç­¾ -->\r\n");
      out.write(" \n");
      out.write("<html>\n");
      out.write("<head>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/static/public.jsp", out, false);
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("    <div id=\"search_bar\" class=\"mt10\">\n");
      out.write("       <div class=\"box\">\n");
      out.write("       \t<!-- 页面头区start -->\n");
      out.write("          <div class=\"box_border\">\n");
      out.write("            <div class=\"box_top\"><b class=\"pl15\">功能区</b></div>\n");
      out.write("            <div class=\"box_center pt10 pb10\">\n");
      out.write("              <table class=\"form_table\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("                <tr>\n");
      out.write("\t\t\t\t\t<form id=\"search_form\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/question/index\"  method=\"post\">\n");
      out.write("\t                  <td>用户名：</td>\n");
      out.write("\t                  <td>\n");
      out.write("\t                  \t<input type=\"text\" id=\"userName\" class=\"input-text lh25\" name=\"userName\" id=\"tags\">\n");
      out.write("\t\t\t\t\t  </td>\n");
      out.write("\t                  <td>\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" name=\"button\" class=\"btn btn82 btn_search\" value=\"查询\">   \n");
      out.write("\t\t\t\t\t\t<input type=\"button\" id=\"reset\" name=\"button\" class=\"btn btn82 btn_res\" value=\"清除\">   \n");
      out.write("                \t </td>\n");
      out.write("\t               </form>\n");
      out.write("                </tr>\n");
      out.write("              </table>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- 页面头区end -->\n");
      out.write("    </br>\n");
      out.write("    <!-- 页面table start -->\n");
      out.write("\t   <div id=\"table\" class=\"mt10\">\n");
      out.write("\t\t<div class=\"box span10 oh\">\n");
      out.write("\t  \t\t<div class=\"search_bar_btn\" style=\"text-align:left;\">\n");
      out.write("\t  \t\t\t<input type=\"button\" name=\"addButton\" class=\"btn btn82 btn_add\" value=\"添加\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t    <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"list_table\">\n");
      out.write("\t\t        <tr>\n");
      out.write("\t\t           \t<th width=\"10%\">#</th>\n");
      out.write("\t\t           \t<th width=\"20%\">序号</th>\n");
      out.write("\t\t\t\t\t<th width=\"20%\">用户名</th>\n");
      out.write("\t\t\t\t\t<th width=\"20%\">年龄</th>\n");
      out.write("\t\t\t\t\t<th width=\"30%\">联系方式</th>\n");
      out.write("\t\t        </tr>\n");
      out.write("\t               ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t             </table>\n");
      out.write("\t            <!-- 页面table end -->\n");
      out.write("\t            <!-- 分页start -->\n");
      out.write("\t            ");
      if (_jspx_meth_x_pager_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t           \t<!-- 分页end -->\n");
      out.write("\t       </div>\n");
      out.write("\t    </div>\n");
      out.write("   </div>\n");
      out.write("</body>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(function(){\n");
      out.write("\t/* $(\"#userName\").on(\"keyup\",function(){\n");
      out.write("\t\tvar userName = $(\"#userName\").val();\n");
      out.write("\t\tvar user = {\"userName\" : userName};\n");
      out.write("\t\t$.ajax({\n");
      out.write("\t\t\ttype : \"POST\",\n");
      out.write("\t\t\tcontentType : \"application/json\",\n");
      out.write("\t\t\turl : \"/user/searchUser\",\n");
      out.write("\t\t\tdata : JSON.stringify(user),\n");
      out.write("\t\t\tdataType : \"json\",\n");
      out.write("\t\t\tsuccess : function(data) {\n");
      out.write("\t\t\t\tif(data != ''){\n");
      out.write("\t\t\t\t\t//console.info(data);\n");
      out.write("\t\t\t\t\t//var datas = eval('(' + data + ')');\n");
      out.write("\t\t\t\t\t//console.info(datas);\n");
      out.write("\t\t\t\t\t$(\"#userName\").autocomplete(data, {\n");
      out.write("\t\t\t\t\t\tformatItem: function (data, i, max) {\n");
      out.write("\t\t\t\t\t\t\tconsole.info(\"formatItem---\" + data);\n");
      out.write("\t\t\t\t\t\t\treturn \"<table width='400px'><tr><td align='left'>\" + data[0] + \"</td></tr></table>\";\n");
      out.write("\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\tformatMatch: function(data, i, max){\n");
      out.write("\t\t\t\t\t\t\treturn data[0];\n");
      out.write("\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\tformatResult: function(data) {     \n");
      out.write("\t\t\t            \treturn data[0];     \n");
      out.write("\t\t\t            } \n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t}); */\n");
      out.write("\t\n");
      out.write("\t$(\"#userName\").autocomplete({\n");
      out.write("\t\tminLength: 0,\n");
      out.write("\t    source: function(request, response) {\n");
      out.write("\t    \tvar userName = $(\"#userName\").val();\n");
      out.write("\t\t\tvar user = {\"userName\" : userName};\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\ttype : \"POST\",\n");
      out.write("\t\t\t\tcontentType : \"application/json\",\n");
      out.write("\t\t\t\turl : \"/user/searchUser\",\n");
      out.write("\t\t\t\tdata : JSON.stringify(user),\n");
      out.write("\t\t\t\tdataType : \"json\",\n");
      out.write("\t\t\t\tsuccess : function(data) {\n");
      out.write("\t\t\t\t\t/* var result = \"\";\n");
      out.write("\t\t\t\t\t$.each(data,function(index,item){\n");
      out.write("\t\t\t\t\t\tresult = \"<table width='400px'><tr><td align='left'>\" + item + \"</td></tr></table>\";\n");
      out.write("\t\t\t\t\t}); */\n");
      out.write("\t\t\t\t\tresponse(data);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t    },\n");
      out.write("\t    /* open: function(event, ui) {\n");
      out.write("\t        console.info(\"ui=-->\" + ui.item);\n");
      out.write("\t    },\n");
      out.write("\t    close: function(event, ui) {\n");
      out.write("\t    \tconsole.info(\"ui=-->\" + ui.item);\n");
      out.write("\t    }, */\n");
      out.write("\t\tselect: function(event, ui) {\n");
      out.write("\t\t\t//选中以后执行\n");
      out.write("\t\t\tconsole.info( ui.item ?\n");
      out.write("                \"Selected: \" + ui.item.label :\n");
      out.write("                \"Nothing selected, input was \" + this.value);\n");
      out.write("        }\n");
      out.write("\t});\n");
      out.write("\t//添加\n");
      out.write("\t$(\"input[name='addButton']\").bind(\"click\", function() {\n");
      out.write("\t\twindow.location.href = '/user/prepareForUserAdd';\n");
      out.write("\t});\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty users }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t<tr class=\"tr\">\n");
        out.write("\t\t\t\t\t\t\t<td colspan=\"6\" style=\"text-align: right;\">没有更多数据....</td>\n");
        out.write("\t\t\t\t\t\t</tr>\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty users }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_forEach_0.setVar("user");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${users }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t<tr class=\"tr\">\n");
          out.write("\t\t\t\t\t\t\t\t<td class=\"td_center\"><input type=\"checkbox\" name=\"single\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.userId }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.userId }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t<td><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/user/prepareForUserUpdate/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.userId }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.userName }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.age }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.phoneNumber }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_x_pager_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  x:pager
    plug.PageResult _jspx_th_x_pager_0 = (plug.PageResult) _jspx_tagPool_x_pager_url_recordCount_pageSize_pageNo_nobody.get(plug.PageResult.class);
    _jspx_th_x_pager_0.setPageContext(_jspx_page_context);
    _jspx_th_x_pager_0.setParent(null);
    _jspx_th_x_pager_0.setPageSize(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userModel.pageSize }", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_x_pager_0.setPageNo(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userModel.pageNo }", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_x_pager_0.setRecordCount(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userModel.recordCount }", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_x_pager_0.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }/user/findUserList", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_x_pager_0 = _jspx_th_x_pager_0.doStartTag();
    if (_jspx_th_x_pager_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_x_pager_url_recordCount_pageSize_pageNo_nobody.reuse(_jspx_th_x_pager_0);
      return true;
    }
    _jspx_tagPool_x_pager_url_recordCount_pageSize_pageNo_nobody.reuse(_jspx_th_x_pager_0);
    return false;
  }
}
