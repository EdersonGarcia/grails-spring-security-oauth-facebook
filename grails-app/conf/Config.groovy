// configuration for plugin testing - will not be included in the plugin zip

log4j = {
    error  'org.codehaus.groovy.grails.web.servlet',  //  controllers
           'org.codehaus.groovy.grails.web.pages', //  GSP
           'org.codehaus.groovy.grails.web.sitemesh', //  layouts
           'org.codehaus.groovy.grails.web.mapping.filter', // URL mapping
           'org.codehaus.groovy.grails.web.mapping', // URL mapping
           'org.codehaus.groovy.grails.commons', // core / classloading
           'org.codehaus.groovy.grails.plugins', // plugins
           'org.codehaus.groovy.grails.orm.hibernate', // hibernate integration
           'org.springframework',
           'org.hibernate',
           'net.sf.ehcache.hibernate'
}

// just for test, to avoid oauthService BeanCreationException "No oauth configuration found"
environments {
  test {
    oauth {
      providers {
        facebook {
            api = org.scribe.builder.api.FacebookApi
            key = 'oauth_facebook_key'
            secret = 'oauth_facebook_secret'
            successUri = '/oauth/facebook/success'
            failureUri = '/oauth/facebook/failure'
            callback = "/oauth/facebook/callback"
        }
      }
    }
  }
}
