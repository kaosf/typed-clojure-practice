(ns typed.core
  (:require [clojure.core.typed :refer (ann ann-form cf check-ns)])
  (:gen-class))

(ann my-fn [Any -> Any])
(defn my-fn [x] x)

;(ann-form (fn [x] (* x 2)) [Number -> Number])
(ann f [Number -> Number])
(defn f [x]
  (* x 2))

(ann -main [String -> nil])
(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
