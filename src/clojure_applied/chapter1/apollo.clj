(ns clojure-applied.chapter1.apollo
  (:require [clojure.pprint :as p]))

(def mission-defaults {:orbit 0 :evas 0})

(defn make-mission
  [name system launched manned? opts]
  (let [{:keys [command-name
                lunar-module
                orbit
                evas]} (merge mission-defaults opts)]
    (p/pprint (str "Name: " name))
    (p/pprint (str "System: " system))
    (p/pprint (str "Launched: " launched))
    (p/pprint (str "Manned? : " manned?))
    (p/pprint (str "Command Name: " command-name))
    (p/pprint (str "Name: " lunar-module))
    (p/pprint (str "Orbit: " orbit))
    (p/pprint (str "Evas: " evas))
    (p/pprint (str "Opts: " opts))))