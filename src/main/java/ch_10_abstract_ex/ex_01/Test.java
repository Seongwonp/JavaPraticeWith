package ch_10_abstract_ex.ex_01;

abstract class HttpServlet {
    public abstract void service();
}




public class Test {
    public static void main(String[] args) {
        method(new LoginServlet());
        method(new FileDownloadServlet());
    }
    public static void method(HttpServlet servlet){
        servlet.service();
    }
}



