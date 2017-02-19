(defproject org.onyxplatform/onyx-peer-http-query "0.10.0.0-SNAPSHOT"
  :description "An Onyx health and query HTTP server"
  :url "https://github.com/onyx-platform/onyx-peer-http-query"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring/ring-core "1.5.1"]
                 [org.clojure/java.jmx "0.3.3"]
                 [ring-jetty-component "0.3.1"]
                 [cheshire "5.7.0"]
                 ^{:voom {:repo "git@github.com:onyx-platform/onyx.git" :branch "master"}}
                 [org.onyxplatform/onyx "0.10.0-20170219_052825-g288db3e"]]
  :repositories {"snapshots" {:url "https://clojars.org/repo"
                              :username :env
                              :password :env
                              :sign-releases false}
                 "releases" {:url "https://clojars.org/repo"
                             :username :env
                             :password :env
                             :sign-releases false}}
  :profiles {:dev {:dependencies [[clj-http "3.4.1"]]
                   :plugins [[lein-set-version "0.4.1"]
                             [lein-update-dependency "0.1.2"]
                             [lein-pprint "1.1.1"]]}})
