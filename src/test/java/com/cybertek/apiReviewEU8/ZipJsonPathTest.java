package com.cybertek.apiReviewEU8;

public class ZipJsonPathTest extends ZipBase{
        /*
    Exercise with JsonPath Method
Given Accept application/json
And "city" path is ma/belmont
When I send a GET request to /us endpoint
Then status code must be 200
And content type must be application/json
And Server header is cloudflare
And Report-To header exists
And body should contains following information
   post codes are existing : "02178","02478"
   country  is United States
   state abbreviation is MA
   place name is Belmont
   state is Massachusetts
   latitudes are 42.4464,42.4128

    */
}
