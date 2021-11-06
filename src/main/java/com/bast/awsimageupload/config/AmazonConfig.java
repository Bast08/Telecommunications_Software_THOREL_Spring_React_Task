package com.bast.awsimageupload.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonConfig {
    @Bean
    public AmazonS3 s3(){
        //Give credentials to be able to create my AmazonS3 client.
        AWSCredentials awsCredentials = new BasicAWSCredentials(
                "Fake",
                "Credentials"
        );
        return AmazonS3ClientBuilder
                .standard()
                .withRegion("eu-north-1")
                .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
                .build();
    }
}
