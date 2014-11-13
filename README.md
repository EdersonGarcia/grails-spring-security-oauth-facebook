[![Build Status](https://travis-ci.org/EdersonGarcia/grails-spring-security-oauth-facebook.svg)](https://travis-ci.org/EdersonGarcia/grails-spring-security-oauth-facebook)
====================================

Facebook extension for [Grails Spring Security OAuth][spring-security-oauth-plugin] plugin

Installation
------------

Add the following plugin definition to your BuildConfig:
```groovy
// ...
plugins {
  // ...
  compile ':spring-security-oauth:2.0.2'
  compile ':spring-security-oauth-facebook:0.1'
  // ...
}
```

Usage
-----

Add to your Config:
```groovy
oauth {
  // ...
  providers {
    // ...
    facebook {
      api = org.scribe.builder.api.FacebookApi
      key = 'oauth_facebook_key'
      secret = 'oauth_facebook_secret'
      successUri = '/oauth/facebook/success'
      failureUri = '/oauth/facebook/error'
      callback = "${baseURL}/oauth/facebook/callback"
    }
    // ...
  }
}
```

In your view you can use the taglib exposed from this plugin and from OAuth plugin to create links and to know if the user is authenticated with a given provider:
```xml
<oauth:connect provider="facebook" id="facebook-connect-link">Facebook</oauth:connect>

Logged with facebook?
<s2o:ifLoggedInWith provider="facebook">yes</s2o:ifLoggedInWith>
<s2o:ifNotLoggedInWith provider="facebook">no</s2o:ifNotLoggedInWith>
```

Copyright and license
---------------------

Copyright 2012-2014 Mihai Cazacu, Enrico Comiti and Alexey Zhokhov under the [Apache License, Version 2.0](LICENSE). Supported by [Polusharie][polusharie].

[polusharie]: http://www.polusharie.com
[spring-security-oauth-plugin]: https://github.com/enr/grails-spring-security-oauth
