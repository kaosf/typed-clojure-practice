(defproject typed "0.1.0-SNAPSHOT"
  :description "Typed Clojure Practice"
  :url "http://github.com/kaosf/typed-clojure-practice"
  :license {:name "MIT"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/core.typed "0.2.34"]]
  :main ^:skip-aot typed.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
