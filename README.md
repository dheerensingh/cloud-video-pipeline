# cloud-video-pipeline
A cloud-native pipeline to transcode and analyze videos using AWS

## Initial Architecture

```mermaid
graph TD
    A["S3 Bucket <br/> video-input-bucket"]
    B["Lambda Function <br/> S3-Trigger-Function"]

    A -- "On: Video Upload" --> B