package com.qf.j1902.controller;

import com.qf.j1902.vo.Dept;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jeffrey on 2019/5/24.
 */
@Controller
public class DeptController {
    /*@RequestMapping(value="/depts",method= RequestMethod.GET)
    @ResponseBody //表示此方法不返回虚拟试图，而是返回json格式的数据
    public List<Dept> findAll(){
        List<Dept>  all = new ArrayList<>();
        all.add(new Dept(10,"zhangsan1","xi'an"));
        all.add(new Dept(20,"zhangsan2","xi'an"));
        all.add(new Dept(30,"zhangsan3","xi'an"));
        return all;
    }*/
//    @RequestMapping(value="/depts",method= RequestMethod.GET)
//    @ResponseBody //表示此方法不返回虚拟试图，而是返回json格式的数据
    public ResponseEntity<List<Dept>> findAll(){
        List<Dept>  all = null;
//        List<Dept>  all = new ArrayList<>();
//        all.add(new Dept(10,"zhangsan1","xi'an"));
//        all.add(new Dept(20,"zhangsan2","xi'an"));
//        all.add(new Dept(30,"zhangsan3","xi'an"));
//        声明一个完整的Http响应对象
        ResponseEntity<List<Dept>> listResponseEntity = null;
        if(all != null){
//            创建一个携带all集合，响应码（状态码）为200 的相应体
           listResponseEntity = new ResponseEntity<List<Dept>>(all, HttpStatus.OK);
        }else{
            listResponseEntity = new ResponseEntity<List<Dept>>(HttpStatus.NOT_FOUND);
        }
        return listResponseEntity;
    }
//    @RequestMapping(value="/dept/{id}" ,method = RequestMethod.GET)
//    @ResponseBody
    public ResponseEntity<Dept> findOne(@PathVariable("id") int deptno){
//        根据id查询
        Dept dept = null;
          dept = new Dept(10,"abcd","mmm");

        if(dept != null){//查询成功
            return new ResponseEntity<Dept>(dept,HttpStatus.OK);
        }else{//查无数据
            return new ResponseEntity<Dept>(HttpStatus.NOT_FOUND);
        }
    }
//    @RequestMapping(value="/dept/{id}" ,method = RequestMethod.POST)
//    @ResponseBody
    public ResponseEntity<Dept> addDept(@PathVariable("id") int deptno,@RequestBody Dept dept){
//        根据id的查询需要添加数据是否存在
          Dept dept1  = null ;// Dept dept1 = deptService.findOne(deptno);
          if(dept1 != null ){
              return new ResponseEntity<Dept>(HttpStatus.CONFLICT);//表示数据已存在，添加失败
          }else{ //需要添加数据不存在可以添加
//              执行添加业务逻辑
//               Dept dept2=  deptService.addDept(dept);//dept2已经含有资源标识
              Dept dept2 = dept;
              return new ResponseEntity<Dept>(dept2,HttpStatus.CREATED);//表示数据已存在，添加失败

          }

    }
//    @RequestMapping(value="/dept/{id}" ,method = RequestMethod.PUT)
//    @ResponseBody
    public ResponseEntity<Dept> updateDept(@PathVariable("id") int deptno,@RequestBody Dept dept){
//        根据id的查询需要添加数据是否存在
        Dept dept1  = null ;// Dept dept1 = deptService.findOne(deptno);
        if(dept1 != null ){
            //需要修改数据是否存在 （已存在，可修改）
//              执行修改业务逻辑
//               Dept dept2=  deptService.updateDept(dept);//dept2已经含有资源标识
            Dept dept2 = new Dept(10,"abcd","mmm");
            return new ResponseEntity<Dept>(dept2,HttpStatus.CREATED);//表示数据已存在，修改成功
        }else{  //需要修改的数据不存在
            return new ResponseEntity<Dept>(HttpStatus.NOT_FOUND);//表示数据不存在，无法修改

        }

    }
//    @RequestMapping(value="/dept/{id}" ,method = RequestMethod.DELETE)
//    @ResponseBody
    public ResponseEntity<Dept> Dept(@PathVariable("id") int deptno){
//        根据id的查询需要删除的数据是否存在
        Dept dept1  = null ;// Dept dept1 = deptService.findOne(deptno);
        dept1 = new Dept();
        if(dept1 != null ){
            //需要删除数据是否存在 （已存在，可修改）
//              执行删除业务逻辑
//               Boolean bl=  deptService.deleteDept(dept);//dept2已经含有资源标识
            return new ResponseEntity<Dept>(HttpStatus.NO_CONTENT);//表示数据已删除，成功
        }else{  //需要删除的数据不存在
            return new ResponseEntity<Dept>(HttpStatus.NOT_FOUND);//表示数据不存在，无法修改

        }

    }

}
