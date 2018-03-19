/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.example.demo.util;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * ReadExcel
 *
 * @author lilu
 * @since 2018-03-19
 */
public class ReadExcel {
    public static void main(String[] args) throws Exception {
        InputStream stream = new FileInputStream("D:/abc.xlsx");

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(stream);
        XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);

        int rowstart = xssfSheet.getFirstRowNum();
        int rowEnd = xssfSheet.getLastRowNum();
        for(int i=rowstart;i<=rowEnd;i++)
        {
            XSSFRow row = xssfSheet.getRow(i);
            if(null == row) {
                continue;
            }
            int cellStart = row.getFirstCellNum();
            int cellEnd = row.getLastCellNum();

            for(int k=cellStart;k<=cellEnd;k++)
            {
                XSSFCell cell = row.getCell(k);
                if(null==cell) {
                    continue;
                }
                System.out.print(cell+"\n");
            }
        }
    }
}