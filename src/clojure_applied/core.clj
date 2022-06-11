(ns clojure-applied.core
  (:gen-class)
  (:require [clojure-applied.chapter1.apollo :as apollo]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (apollo/make-mission "Apollo 4"
                       "Saturn 5"
                       #inst "1967-11-09T12:00:01-00:00"
                       false
                       {:orbit 3
                        :random-param "Nothing"}))
