package com.example.demogradle.common;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataMap extends HashMap<String,Object> {

    public DataMap(){
        super();
    }

    public DataMap(HashMap<String, Object> data)
    {
        super();

        if(data != null)
        {
            for (Map.Entry<String, Object> entry : data.entrySet())
            {

                Object value = entry.getValue();

                if(value.getClass() == java.util.HashMap.class)
                {
                    this.put(entry.getKey(), new ObjectMapper().convertValue(value, DataMap.class));
                }
                else if(value.getClass() == java.util.ArrayList.class)
                {
                    try
                    {
                        this.put(entry.getKey(), new ObjectMapper().convertValue(value, new TypeReference<List<DataMap>>()
                        {
                        }));
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                        this.put(entry.getKey(), entry.getValue());
                    }

                }
                else
                {
                    this.put(entry.getKey(), entry.getValue());
                }

            }
        }

    }

    public String getString(Object key){

        String res = "";
        Object obj = super.get(key);

        if(obj == null){
            res = null;
        }else{
            res = obj.toString();
        }

        return res;
    }

    public String getString(Object key, String defaultValue){

        String res = "";
        String obj = getString(key);
        if(obj == null){
            res = defaultValue;
        }else{
            res = obj.toString();
        }

        return res;
    }

    public byte getByte(Object key){

        byte res = 0;
        String obj = getString(key);

        if(obj == null){
            res = 0;
        }else{
            res = Byte.parseByte(obj);
        }

        return res;


    }

    public byte getByte(Object key, byte defaultValue){

        byte res = 0;
        byte obj = getByte(key);

        if(obj == 0){
            res = defaultValue;
        }else{
            res = obj;
        }

        return res;
    }

    public short getShort(Object key){

        short res = 0;
        String obj = getString(key);

        if(obj == null){
            res = 0;
        }else{
            res = Short.parseShort(obj);
        }

        return res;
    }

    public short getShort(Object key, short defaultValue){

        short res = 0;
        short obj = getShort(key);

        if(obj == 0){
            res = defaultValue;
        }else{
            res = obj;
        }

        return res;
    }

    public int getInt(Object key){

        int res = 0;
        String obj = getString(key);

        if(obj == null){
            res = 0;
        }else{
            res = Integer.parseInt(obj);
        }

        return res;
    }

    public int getInt(Object key, int defaultValue){

        int res = 0;
        int obj = getInt(key);

        if(obj == 0){
            res = defaultValue;
        }else{
            res = obj;
        }

        return res;
    }

    public long getLong(Object key){

        long res = 0;
        String obj = getString(key);

        if(obj == null){
            res = 0;
        }else{
            res = Integer.parseInt(obj);
        }

        return res;
    }

    public long getLong(Object key, long defaultValue){

        long res = 0;
        long obj = getLong(key);

        if(obj == 0){
            res = defaultValue;
        }else{
            res = obj;
        }

        return res;
    }

    public double getDouble(Object key){

        double res = 0;
        String obj = getString(key);

        if(obj == null){
            res = 0;
        }else{
            res = Double.parseDouble(obj);
        }

        return res;
    }

    public double getDouble(Object key, double defaultValue){

        double res = 0;
        double obj = getDouble(key);

        if(obj == 0){
            res = defaultValue;
        }else{
            res = obj;
        }

        return res;
    }

}

