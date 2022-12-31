(ns tutorial.15Watchers)

(defn Watch
  []
  (def x (atom 5))
  (add-watch x :xWatcher
             (fn [key atom old-state new-state]
               (println key atom old-state new-state)
               ))
  (reset! x 10)
  (remove-watch x :xWatcher)
  (reset! x 11)
  )
(Watch)