(ns tutorial.6Loops)

(defn Loop
  "For"
  []
  (println "\nLoop:")
  (loop [x 0]
    (when (< x 10)
      (do
        (if (= (rem x 2) 0)
          (println x " is Even")
          (println x " is Odd"))
        (recur (inc x))))))
(Loop)

(defn DoTimes
  "For - shorter form"
  []
  (println "\nDoTimes:")
  (dotimes [x 3]
    (println x)))
(DoTimes)

(defn WhileDo
  "While"
  [count]
  (println "\nWhileDo:")
  (def x (atom 0))
  (while (< @x count)
    (do
      (println @x)
      (swap! x inc))))
(WhileDo 8)

(defn DoSeq
  "Foreach"
  [seq]
  (println "\nDoSeq:")
  (doseq [x seq]
    (println (inc x)))
)
(DoSeq [2 3 6])