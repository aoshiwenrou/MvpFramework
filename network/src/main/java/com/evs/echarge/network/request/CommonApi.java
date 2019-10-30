package com.evs.echarge.network.request;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

/**
 * 通用api接口，与RxJava配合使用
 *
 * @author Jcking
 * @time 2019/3/9 22:44
 */
interface CommonApi {

    //-------------------------------------- GET -----------------------------------------

    @GET("{path}")
    Observable<String> get(
            @Path("path") String path,
            @QueryMap Map<String, String> pamars);

    @GET("{path}/{path2}")
    Observable<String> get(
            @Path("path") String path,
            @Path("path2") String path2,
            @QueryMap Map<String, String> pamars);

    @GET("{path}/{path2}/{path3}")
    Observable<String> get(
            @Path("path") String path,
            @Path("path2") String path2,
            @Path("path3") String path3,
            @QueryMap Map<String, String> pamars);

    @GET("{path}/{path2}/{path3}/{path4}")
    Observable<String> get(
            @Path("path") String path,
            @Path("path2") String path2,
            @Path("path3") String path3,
            @Path("path4") String path4,
            @QueryMap Map<String, String> pamars);

    @GET("{path}/{path2}/{path3}/{path4}/{path5}")
    Observable<String> get(
            @Path("path") String path,
            @Path("path2") String path2,
            @Path("path3") String path3,
            @Path("path4") String path4,
            @Path("path5") String path5,
            @QueryMap Map<String, String> pamars);

    @GET("{path}/{path2}/{path3}/{path4}/{path5}/{path6}")
    Observable<String> get(
            @Path("path") String path,
            @Path("path2") String path2,
            @Path("path3") String path3,
            @Path("path4") String path4,
            @Path("path5") String path5,
            @Path("path6") String path6,
            @QueryMap Map<String, String> pamars);

    @GET("{path}/{path2}/{path3}/{path4}/{path5}/{path6}/{path7}")
    Observable<String> get(
            @Path("path") String path,
            @Path("path2") String path2,
            @Path("path3") String path3,
            @Path("path4") String path4,
            @Path("path5") String path5,
            @Path("path6") String path6,
            @Path("path7") String path7,
            @QueryMap Map<String, String> pamars);

    @GET("{path}/{path2}/{path3}/{path4}/{path5}/{path6}/{path7}/{path8}")
    Observable<String> get(
            @Path("path") String path,
            @Path("path2") String path2,
            @Path("path3") String path3,
            @Path("path4") String path4,
            @Path("path5") String path5,
            @Path("path6") String path6,
            @Path("path7") String path7,
            @Path("path8") String path8,
            @QueryMap Map<String, String> pamars);

    @GET("{path}/{path2}/{path3}/{path4}/{path5}/{path6}/{path7}/{path8}/{path9}")
    Observable<String> get(
            @Path("path") String path,
            @Path("path2") String path2,
            @Path("path3") String path3,
            @Path("path4") String path4,
            @Path("path5") String path5,
            @Path("path6") String path6,
            @Path("path7") String path7,
            @Path("path8") String path8,
            @Path("path9") String path9,
            @QueryMap Map<String, String> pamars);


    //-------------------------------------- POST FORM -----------------------------------------

    @FormUrlEncoded
    @POST("{path}")
    Observable<String> postForm(
            @Path("path") String path,
            @FieldMap Map<String, String> pamars);

    @FormUrlEncoded
    @POST("{path}/{path2}")
    Observable<String> postForm(
            @Path("path") String path,
            @Path("path2") String path2,
            @FieldMap Map<String, String> pamars);

    @FormUrlEncoded
    @POST("{path}/{path2}/{path3}")
    Observable<String> postForm(
            @Path("path") String path,
            @Path("path2") String path2,
            @Path("path3") String path3,
            @FieldMap Map<String, String> pamars);

    @FormUrlEncoded
    @POST("{path}/{path2}/{path3}/{path4}")
    Observable<String> postForm(
            @Path("path") String path,
            @Path("path2") String path2,
            @Path("path3") String path3,
            @Path("path4") String path4,
            @FieldMap Map<String, String> pamars);

    @FormUrlEncoded
    @POST("{path}/{path2}/{path3}/{path4}/{path5}")
    Observable<String> postForm(
            @Path("path") String path,
            @Path("path2") String path2,
            @Path("path3") String path3,
            @Path("path4") String path4,
            @Path("path5") String path5,
            @FieldMap Map<String, String> pamars);

    @FormUrlEncoded
    @POST("{path}/{path2}/{path3}/{path4}/{path5}/{path6}")
    Observable<String> postForm(
            @Path("path") String path,
            @Path("path2") String path2,
            @Path("path3") String path3,
            @Path("path4") String path4,
            @Path("path5") String path5,
            @Path("path6") String path6,
            @FieldMap Map<String, String> pamars);

    @FormUrlEncoded
    @POST("{path}/{path2}/{path3}/{path4}/{path5}/{path6}/{path7}")
    Observable<String> postForm(
            @Path("path") String path,
            @Path("path2") String path2,
            @Path("path3") String path3,
            @Path("path4") String path4,
            @Path("path5") String path5,
            @Path("path6") String path6,
            @Path("path7") String path7,
            @FieldMap Map<String, String> pamars);

    @FormUrlEncoded
    @POST("{path}/{path2}/{path3}/{path4}/{path5}/{path6}/{path7}/{path8}")
    Observable<String> postForm(
            @Path("path") String path,
            @Path("path2") String path2,
            @Path("path3") String path3,
            @Path("path4") String path4,
            @Path("path5") String path5,
            @Path("path6") String path6,
            @Path("path7") String path7,
            @Path("path8") String path8,
            @FieldMap Map<String, String> pamars);

    @FormUrlEncoded
    @POST("{path}/{path2}/{path3}/{path4}/{path5}/{path6}/{path7}/{path8}/{path9}")
    Observable<String> postForm(
            @Path("path") String path,
            @Path("path2") String path2,
            @Path("path3") String path3,
            @Path("path4") String path4,
            @Path("path5") String path5,
            @Path("path6") String path6,
            @Path("path7") String path7,
            @Path("path8") String path8,
            @Path("path9") String path9,
            @FieldMap Map<String, String> pamars);


    //-------------------------------------- POST JSON -----------------------------------------

    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST("{path}")
    Observable<String> postJson(
            @Path("path") String path,
            @Body RequestBody pamars);

    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST("{path}/{path2}")
    Observable<String> postJson(
            @Path("path") String path,
            @Path("path2") String path2,
            @Body RequestBody pamars);

    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST("{path}/{path2}/{path3}")
    Observable<String> postJson(
            @Path("path") String path,
            @Path("path2") String path2,
            @Path("path3") String path3,
            @Body RequestBody pamars);

    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST("{path}/{path2}/{path3}/{path4}")
    Observable<String> postJson(
            @Path("path") String path,
            @Path("path2") String path2,
            @Path("path3") String path3,
            @Path("path4") String path4,
            @Body RequestBody pamars);

    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST("{path}/{path2}/{path3}/{path4}/{path5}")
    Observable<String> postJson(
            @Path("path") String path,
            @Path("path2") String path2,
            @Path("path3") String path3,
            @Path("path4") String path4,
            @Path("path5") String path5,
            @Body RequestBody pamars);

    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST("{path}/{path2}/{path3}/{path4}/{path5}/{path6}")
    Observable<String> postJson(
            @Path("path") String path,
            @Path("path2") String path2,
            @Path("path3") String path3,
            @Path("path4") String path4,
            @Path("path5") String path5,
            @Path("path6") String path6,
            @Body RequestBody pamars);

    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST("{path}/{path2}/{path3}/{path4}/{path5}/{path6}/{path7}")
    Observable<String> postJson(
            @Path("path") String path,
            @Path("path2") String path2,
            @Path("path3") String path3,
            @Path("path4") String path4,
            @Path("path5") String path5,
            @Path("path6") String path6,
            @Path("path7") String path7,
            @Body RequestBody pamars);

    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST("{path}/{path2}/{path3}/{path4}/{path5}/{path6}/{path7}/{path8}")
    Observable<String> postJson(
            @Path("path") String path,
            @Path("path2") String path2,
            @Path("path3") String path3,
            @Path("path4") String path4,
            @Path("path5") String path5,
            @Path("path6") String path6,
            @Path("path7") String path7,
            @Path("path8") String path8,
            @Body RequestBody pamars);

    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST("{path}/{path2}/{path3}/{path4}/{path5}/{path6}/{path7}/{path8}/{path9}")
    Observable<String> postJson(
            @Path("path") String path,
            @Path("path2") String path2,
            @Path("path3") String path3,
            @Path("path4") String path4,
            @Path("path5") String path5,
            @Path("path6") String path6,
            @Path("path7") String path7,
            @Path("path8") String path8,
            @Path("path9") String path9,
            @Body RequestBody pamars);
}
