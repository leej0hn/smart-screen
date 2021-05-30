package com.redscarf.smart.util;

import com.google.common.base.Throwables;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import net.sf.cglib.beans.BeanCopier;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @description: bean 复制
 * @author: LeeJohn
 * @date: 2019/1/7 17:58
 */
@Slf4j
public class BeanCopyUtil {

    public static void copy(Object source, Object target) {
        BeanCopier copier = BeanCopier.create(source.getClass(), target.getClass(), false);
        copier.copy(source, target, null);
    }

    public static <T> List<T> copyList(Collection sourceList, Class sourceClass, Class<T> destinationClass) {
        try {
            BeanCopier copier = BeanCopier.create(sourceClass, destinationClass, false);
            List destinationList = Lists.newArrayList();
            for (Iterator i$ = sourceList.iterator(); i$.hasNext(); ) {
                Object sourceObject = i$.next();
                Object destinationObject = destinationClass.newInstance();
                copier.copy(sourceObject, destinationObject, null);
                destinationList.add(destinationObject);
            }
            return destinationList;
        } catch (Exception e) {
            log.error(Throwables.getStackTraceAsString(e));
        }
        return Collections.emptyList();
    }
}
