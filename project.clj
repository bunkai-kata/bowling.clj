(defproject bowling "0.1.0-SNAPSHOT"
  :description "The bowling kata, done in Clojure"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :test-paths ["spec"]

  :main ^:skip-aot bowling.core
  :target-path "target/%s"

  :dependencies [[org.clojure/clojure "1.6.0"]]

  :profiles {:dev {:dependencies [[speclj "3.2.0"]]
                   :plugins      [[speclj "3.2.0"]]}
             :uberjar {:aot :all}})
