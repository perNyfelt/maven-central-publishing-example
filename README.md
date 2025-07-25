# maven-central-publishing-example

This is a multimodule example showing deployment to maven central 
using the new central publishing rest api.

The maven-deploy-plugin used is a [modified fork](https://github.com/perNyfelt/maven-deploy-plugin/tree/add_central_support) of the apache maven deploy plugin.

The project consist of 
- an aggregator
- a common sub module
- two sub modules that each depends on the common submodule

Each module (including the main aggregator) will be deployed separately.
I.e. when deploying the whole project, 4 zip files will be created and uploaded to central:
1. The aggregator pom (+ asc, md5 and sha1 files)
2. common, contains the pom, jar, javadoc and sources (all signed and with md5 and sha1 files)
3. subA, contains the pom, jar, javadoc and sources (all signed and with md5 and sha1 files)  
4. subB, contains the pom, jar, javadoc and sources (all signed and with md5 and sha1 files)  