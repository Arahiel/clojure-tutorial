(ns tutorial.18Challenge)

(defstruct Buyer :AccountValue :BoughtItems)
(defstruct Merchant :Items)
(def buyer1 (struct Buyer (ref 100) (ref [])))
(def merchant1 (struct Merchant {'pen 1 'notebook 5 'backpack 100}))

(defn PrintBuyerInfo
  [buyer]
  (println "Account value:" @(:AccountValue buyer))
  (println "Bought items:" @(:BoughtItems buyer))
  (println))

(defn Buy
  [buyer itemName merchant]

  (dosync
   (def wishedItemValue (get (:Items merchant) itemName))
   (PrintBuyerInfo buyer)
   (if (<= wishedItemValue @(:AccountValue buyer))
     (do
       (alter (:AccountValue buyer) #(- % wishedItemValue))
       ;SAME AS ABOVE: (ref-set (:AccountValue buyer) (- @(:AccountValue buyer) wishedItemValue))
       (alter (:BoughtItems buyer) #(conj % itemName)))
     (println "Insufficient funds!"))))


(Buy buyer1 'pen merchant1)
(Buy buyer1 'notebook merchant1)
(Buy buyer1 'notebook merchant1)
(Buy buyer1 'backpack merchant1)
(Buy buyer1 'pen merchant1)
