/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.program.center.core.entity;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.program.center.core.entity.UnexpectedErrorLog.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Sat Aug 25 23:19:26 CST 2018")
public class UnexpectedErrorLog_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<UnexpectedErrorLog,Boolean> collected;
    public static volatile SingularAttribute<UnexpectedErrorLog,String> exceptionClass;
    public static volatile SingularAttribute<UnexpectedErrorLog,String> id;
    public static volatile SingularAttribute<UnexpectedErrorLog,String> loggerName;
    public static volatile SingularAttribute<UnexpectedErrorLog,String> message;
    public static volatile SingularAttribute<UnexpectedErrorLog,Date> occurTime;
    public static volatile SingularAttribute<UnexpectedErrorLog,String> person;
    public static volatile SingularAttribute<UnexpectedErrorLog,String> requestBody;
    public static volatile SingularAttribute<UnexpectedErrorLog,Long> requestBodyLength;
    public static volatile SingularAttribute<UnexpectedErrorLog,String> requestHead;
    public static volatile SingularAttribute<UnexpectedErrorLog,String> requestMethod;
    public static volatile SingularAttribute<UnexpectedErrorLog,String> requestRemoteAddr;
    public static volatile SingularAttribute<UnexpectedErrorLog,String> requestRemoteHost;
    public static volatile SingularAttribute<UnexpectedErrorLog,String> requestUrl;
    public static volatile SingularAttribute<UnexpectedErrorLog,String> stackTrace;
    public static volatile SingularAttribute<UnexpectedErrorLog,String> version;
}
