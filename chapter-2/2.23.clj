;; Exercise 2.23
;; Page 146

(defn for-each
    [f seq]
    (println seq)
    (if (not (empty? seq))
        (do 
            (f (first seq)))
            (recur f (rest seq))))