package ch_10_abstract_ex.ex_01;


public class FileDownloadServlet extends HttpServlet {
    @Override
    public void service(){
        System.out.println("File being downloaded");
    }

}
