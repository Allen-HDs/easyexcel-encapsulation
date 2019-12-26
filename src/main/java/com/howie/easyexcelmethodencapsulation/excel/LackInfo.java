package com.howie.easyexcelmethodencapsulation.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;

/**
 * @ClassName LackInfo
 * @Description TODO
 * @Author yuxiang
 * @Date 2019/12/26 11:09
 **/
@Data
public class LackInfo extends BaseRowModel {
    @ExcelProperty(value = "类型",index = 0)
    private String typeName;
    @ExcelProperty(value = "物料号",index = 1)
    private String equipmentCode;
    @ExcelProperty(value = "物料名称",index = 2)
    private String equipmentName;
    @ExcelProperty(value = "型号规格",index = 3)
    private String pattern;
    @ExcelProperty(value = "库存",index = 6)
    private String inventory;
    @ExcelProperty(value = "到货情况",index = 8)
    private String lackNum;
    @ExcelProperty(value = "日期和收料单",index = 9)
    private String dataAndForm;

}
