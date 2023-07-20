package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"/profile.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container rounded bg-white mt-5 mb-5\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3 border-right\">\n");
      out.write("                      <div   class=\"mt-5 text-center\"><a class=\"btn btn-primary profile-button\" type=\"button\" href=\"/Project_banhang/\">Back</a></div>\n");
      out.write("\n");
      out.write("                    <div class=\"d-flex flex-column align-items-center text-center p-3 py-5\"><img class=\"rounded-circle mt-5\" width=\"150px\" src=\"https://st3.depositphotos.com/15648834/17930/v/600/depositphotos_179308454-stock-illustration-unknown-person-silhouette-glasses-profile.jpg\"><span class=\"font-weight-bold\">Edogaru</span><span class=\"text-black-50\">edogaru@mail.com.my</span><span> </span></div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-5 border-right\">\n");
      out.write("                   \n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"p-3 py-5\">\n");
      out.write("                            <div class=\"d-flex justify-content-between align-items-center mb-3\">\n");
      out.write("                                <h4 class=\"text-right\">Profile Settings</h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row mt-2\">\n");
      out.write("                                <div class=\"col-md-12\"><label class=\"labels\">Name</label><input type=\"text\" class=\"form-control\" placeholder=\"first name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listP.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row mt-3\">\n");
      out.write("                                <div class=\"col-md-12\"><label class=\"labels\">Mobile Number</label><input type=\"text\" class=\"form-control\" placeholder=\"enter phone number\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listP.mobile}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> </div>\n");
      out.write("                                <div class=\"col-md-12\"><label class=\"labels\">Gmail</label><input type=\"text\" class=\"form-control\" placeholder=\"enter gmail\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listP.gmail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></div>\n");
      out.write("                                <div class=\"col-md-12\"><label class=\"labels\">State</label><input type=\"text\" class=\"form-control\" placeholder=\"enter address line 2\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listP.State}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row mt-3\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mt-5 text-center\"><button class=\"btn btn-primary profile-button\" type=\"button\">Save Profile</button></div>\n");
      out.write("                        </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
}
