//package com.atguigu.demo.test3;
//
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//public class Controller {
//    @PostMapping("/search/globalSearch")
//    @ApiOperation(value = "高级搜索", notes = "高级搜索")
//    @ApiResponse(code = 100009, message = "查询失败")
//    public Rest globalSearch(@RequestBody JSONObject jsonObject) {
//        String libType;
//        String rqrType;
//        String content;
//        String titles;
//
//        String[] mod = new String[0];
//        String[] stage = new String[0];
//        String[] category = new String[0];
//        String[] state = new String[0];
//        String[] essential = new String[0];
//        String[] customer = new String[0];
//        String[] creator = new String[0];
//        String[] currentHandler = new String[0];
//        String[] owner = new String[0];
//        String[] createTimeRange = new String[0];
//        String [] expectTimeRange = new String [0];
//        Integer[] libId = new Integer[0];
//        Integer[] prodId = new Integer[0];
//        String[] cpuBrand = new String[0];
//        String[] importVersion = new String[0];
//        String[] sorting = new String[0];
//
//
//        String startTime = null;
//        String endTime = null;
//
//        String startExpTime = " ";
//        String endExpTime = " ";
//
//        IPage<ListVO> listVOS;
//        try {
//            //分页
//            Page<ListVO> page = new Page<>(jsonObject.getInteger("pageNumber"), jsonObject.getInteger("pageSize"));
//            libType = jsonObject.getString("libType");
//            rqrType = jsonObject.getString("rqrType");
//            content = jsonObject.getString("content");
//            mod = jsonObject.getJSONArray("mod").toArray(mod);
//            stage = jsonObject.getJSONArray("stage").toArray(stage);
//            category = jsonObject.getJSONArray("category").toArray(category);
//            state = jsonObject.getJSONArray("state").toArray(state);
//            essential = jsonObject.getJSONArray("essential").toArray(essential);
//            customer = jsonObject.getJSONArray("customer").toArray(customer);
//            creator = jsonObject.getJSONArray("creator").toArray(creator);
//            currentHandler = jsonObject.getJSONArray("currentHandler").toArray(currentHandler);
//            owner = jsonObject.getJSONArray("owner").toArray(owner);
//            createTimeRange = jsonObject.getJSONArray("createTimeRan
//
//
//}
