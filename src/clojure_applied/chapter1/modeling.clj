(ns clojure-applied.chapter1.modeling)

(def earth-map {:name "Earth"
                :moons 1
                :volume
                :mass
                :aphelion 152098232
                :perihelion 147098290})

(defrecord Planet [name
                   moons
                   volume
                   mass
                   aphelion
                   perihelion])

(defn make-entity [e1 e2 {:keys [f3 f3] :as opts}])