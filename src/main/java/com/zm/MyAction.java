package com.zm;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zm.pojo.User;
import org.apache.struts2.ServletActionContext;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/9/12.
 */
public class MyAction extends ActionSupport implements ModelDriven<User>{

    //3丶属性封装
    /*private String name;
    private String phone;
    public void setName(String name) {
        this.name = name;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }*/


    //4丶使用模型驱动
    private User user = new User();
    public User getModel() {
        return user;
    }

    /**
     * 执行add方法
     * @return
     */
    public String list() {
        //获取表单数据的三种方式
        //1丶使用ActionContext对象
        /*ActionContext actionContext = ActionContext.getContext();
        HttpParameters parameters = actionContext.getParameters();
        Map<String, String[]> stringMap = parameters.toMap();
        for (String key:stringMap.keySet()) {
            System.out.print(key+": "+stringMap.get(key).toString());
        }*/

        //2丶使用ServletActionContext对象获取
        /*HttpServletRequest request = ServletActionContext.getRequest();
        Map<String, String[]> parameterMap = request.getParameterMap();
        for (String key:parameterMap.keySet()) {
            System.out.println(key+": "+parameterMap.get(key));
        }
        System.out.println("执行list方法...");
        request.setAttribute("msg" , "这是转发");*/

        //3丶使用属性封装
        /*System.out.println(name+" : "+phone);
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("msg" , name+" : "+phone);*/

        //4丶使用模型驱动
        System.out.println(user);
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("msg" , user);
        return "my";
    }



}
