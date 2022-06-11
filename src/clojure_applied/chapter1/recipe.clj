(ns clojure-applied.chapter1.recipe)

(defrecord Recipe [name
                   author
                   description
                   ingredients
                   steps
                   servings])

(defrecord Person [first-name
                   last-name])

; Nested
(def toast
  (->Recipe
    "Toast"
    (->Person "Julio" "Dias")
    "Crispy bread"
    ["Slice of bread"]
    ["Toast bread in toaster"]
    1))

; Independents
(def people
  {"p1" (->Person "Julio" "Dias")})

(def recipes
  {"r1" (->Recipe
          "Toast"
          "p1"
          "Crispy bread"
          ["Slice of Bread"]
          ["Toast bread and toaster"]
          1)})