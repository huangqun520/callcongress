(defproject callcongress "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.climate/boomhauer "0.1.1" :exclusions [com.amazonaws/aws-java-sdk-dynamodb]] ;alexa
                 [com.taoensso/faraday "1.9.0"] ;dynamo
                 [org.clojure/data.xml "0.1.0-beta1"]
                 [clj-http "2.3.0"]
                 ]
  :aot [callcongress.speechlet-request-handler])
