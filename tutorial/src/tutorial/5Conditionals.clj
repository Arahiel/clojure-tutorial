(ns tutorial.5Conditionals)

(defn CondIf
  "If  - single action"
  []
  (println "\nCondIf:")
  (if (= 5 5)
    (println "Equal")
    (println "Not equal")))
(CondIf)

(defn CondIfDo
  "If - multiple actions"
  []
  (println "\nCondIfDo:")
  (if (= 5 4)
    (do
      (println "Equal 1st statement")
      (println "Equal 2nd statement"))
    (do
      (println "Not equal 1st statement")
      (println "Not equal 2nd statement"))))
(CondIfDo)

(defn CondNestedIf
  "If - many statements"
  []
  (println "\nCondNestedIf:")
  (if (and (= 5 5) (or (= 2 2) (not true)))
    (println "True")
    (println "False")))
(CondNestedIf)

(defn CondCase
  "Switch case"
  [pet]
  (println "\nCondCase:")
  (case pet
    "cat" (println "I have a cat")
    "dog" (println "I have a dog")
    "fish" (println "I have a fish")))
(CondCase "cat")

(defn CondCond
  "If - break on first found (sequential)"
  [amount]
  (println "\nCondCond:")
  (cond
    (<= amount 2) (println "Few")
    (<= amount 10) (println "Several")
    (<= amount 100) (println "Many")
    :else (println "ELSE")))
(CondCond 101)